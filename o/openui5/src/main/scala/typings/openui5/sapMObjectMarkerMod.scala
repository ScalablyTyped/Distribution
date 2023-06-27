package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ObjectMarkerType
import typings.openui5.sapMLibraryMod.ObjectMarkerVisibility
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectMarkerMod {
  
  @JSImport("sap/m/ObjectMarker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ObjectMarker.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-display-elements/#-object-status Object Marker}
    */
  open class default () extends ObjectMarker {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectMarkerSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectMarkerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectMarkerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectMarker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectMarker with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectMarker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectMarker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectMarker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectMarker
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ObjectMarker$PressEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalInfo additionalInfo}.
      *
      * Sets additional information to the displayed `type`.
      *
      * **Note:** If no type is set, the additional information will not be displayed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `additionalInfo`
      */
    def getAdditionalInfo(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Sets one of the predefined types.
      *
      * **Note**: If the `visibility` property is not specified explicitly, every `type` comes with predefined
      * one as follows:
      * 	 - For `Flagged` and `Favorite` the icon is visible and the text is not displayed
      * 	 - For `Draft` the text is visible and the icon is not displayed
      * 	 - For `Locked`, `LockedBy`, `Unsaved` and `UnsavedBy` - on screens larger than 600px both icon and
      *     text are visible, otherwise only the icon
      *
      *
      *
      * @returns Value of property `type`
      */
    def getType(): ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVisibility visibility}.
      *
      * Sets one of the visibility states. Visibility states are as follows:
      * 	 - `IconOnly` - displays only icon, regardless of the screen size
      * 	 - `TextOnly` - displays only text, regardless of the screen size
      * 	 - `IconAndText` - displays both icon and text, regardless of the screen size
      *
      * @returns Value of property `visibility`
      */
    def getVisibility(): ObjectMarkerVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerVisibility * / any */ String) = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalInfo additionalInfo}.
      *
      * Sets additional information to the displayed `type`.
      *
      * **Note:** If no type is set, the additional information will not be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalInfo(): this.type = js.native
    def setAdditionalInfo(/**
      * New value for property `additionalInfo`
      */
    sAdditionalInfo: String): this.type = js.native
    
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Sets one of the predefined types.
      *
      * **Note**: If the `visibility` property is not specified explicitly, every `type` comes with predefined
      * one as follows:
      * 	 - For `Flagged` and `Favorite` the icon is visible and the text is not displayed
      * 	 - For `Draft` the text is visible and the icon is not displayed
      * 	 - For `Locked`, `LockedBy`, `Unsaved` and `UnsavedBy` - on screens larger than 600px both icon and
      *     text are visible, otherwise only the icon
      *
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(/**
      * New value for property `type`
      */
    sType: ObjectMarkerType): this.type = js.native
    
    def setVisibility(
      /**
      * New value for property `visibility`
      */
    sVisibility: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerVisibility * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getVisibility visibility}.
      *
      * Sets one of the visibility states. Visibility states are as follows:
      * 	 - `IconOnly` - displays only icon, regardless of the screen size
      * 	 - `TextOnly` - displays only text, regardless of the screen size
      * 	 - `IconAndText` - displays both icon and text, regardless of the screen size
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibility(/**
      * New value for property `visibility`
      */
    sVisibility: ObjectMarkerVisibility): this.type = js.native
  }
  
  trait ObjectMarker$PressEventParameters extends StObject {
    
    /**
      * Type of the `ObjectMarker`.
      */
    var `type`: js.UndefOr[
        ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String)
      ] = js.undefined
  }
  object ObjectMarker$PressEventParameters {
    
    inline def apply(): ObjectMarker$PressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectMarker$PressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectMarker$PressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setType(
        value: ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ObjectMarkerPressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectMarker$PressEventParameters]
  
  type ObjectMarkerPressEventParameters = ObjectMarker$PressEventParameters
  
  trait ObjectMarkerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Sets additional information to the displayed `type`.
      *
      * **Note:** If no type is set, the additional information will not be displayed.
      */
    var additionalInfo: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Event is fired when the `ObjectMarker` is interactive and the user taps/clicks on it.
      */
    var press: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectMarker$PressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Sets one of the predefined types.
      *
      * **Note**: If the `visibility` property is not specified explicitly, every `type` comes with predefined
      * one as follows:
      * 	 - For `Flagged` and `Favorite` the icon is visible and the text is not displayed
      * 	 - For `Draft` the text is visible and the icon is not displayed
      * 	 - For `Locked`, `LockedBy`, `Unsaved` and `UnsavedBy` - on screens larger than 600px both icon and
      *     text are visible, otherwise only the icon
      */
    var `type`: js.UndefOr[
        ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets one of the visibility states. Visibility states are as follows:
      * 	 - `IconOnly` - displays only icon, regardless of the screen size
      * 	 - `TextOnly` - displays only text, regardless of the screen size
      * 	 - `IconAndText` - displays both icon and text, regardless of the screen size
      */
    var visibility: js.UndefOr[
        ObjectMarkerVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerVisibility * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectMarkerSettings {
    
    inline def apply(): ObjectMarkerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectMarkerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectMarkerSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalInfo(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
      
      inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectMarker$PressEventParameters] => Unit
      ): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setType(
        value: ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibility(
        value: ObjectMarkerVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerVisibility * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
}
