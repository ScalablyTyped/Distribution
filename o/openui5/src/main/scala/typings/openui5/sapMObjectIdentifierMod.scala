package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.EmptyIndicatorMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectIdentifierMod {
  
  @JSImport("sap/m/ObjectIdentifier", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ObjectIdentifier.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-display-elements/#-object-status Object Identifier}
    */
  open class default () extends ObjectIdentifier {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectIdentifierSettings) = this()
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
    mSettings: ObjectIdentifierSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectIdentifierSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectIdentifier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectIdentifier with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ObjectIdentifier]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectIdentifier],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectIdentifier.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectIdentifier
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * @since 1.26
      *
      * Attaches event handler `fnFunction` to the {@link #event:titlePress titlePress} event of this `sap.m.ObjectIdentifier`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectIdentifier` itself.
      *
      * Fires when the title is active and the user taps/clicks on it.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitlePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectIdentifierTitlePressEvent, Unit]
    ): this.type = js.native
    def attachTitlePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectIdentifierTitlePressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectIdentifier` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.26
      *
      * Attaches event handler `fnFunction` to the {@link #event:titlePress titlePress} event of this `sap.m.ObjectIdentifier`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectIdentifier` itself.
      *
      * Fires when the title is active and the user taps/clicks on it.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitlePress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectIdentifierTitlePressEvent, Unit]
    ): this.type = js.native
    def attachTitlePress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectIdentifierTitlePressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectIdentifier` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.26
      *
      * Detaches event handler `fnFunction` from the {@link #event:titlePress titlePress} event of this `sap.m.ObjectIdentifier`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTitlePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectIdentifierTitlePressEvent, Unit]
    ): this.type = js.native
    def detachTitlePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectIdentifierTitlePressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.26
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:titlePress titlePress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTitlePress(): this.type = js.native
    def fireTitlePress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ObjectIdentifier$TitlePressEventParameters
    ): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Gets current value of property {@link #getBadgeAttachments badgeAttachments}.
      *
      * Indicates whether or not the attachments icon is displayed.
      *
      * @returns Value of property `badgeAttachments`
      */
    def getBadgeAttachments(): Boolean = js.native
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Gets current value of property {@link #getBadgeNotes badgeNotes}.
      *
      * Indicates whether or not the notes icon is displayed.
      *
      * @returns Value of property `badgeNotes`
      */
    def getBadgeNotes(): Boolean = js.native
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Gets current value of property {@link #getBadgePeople badgePeople}.
      *
      * Indicates whether or not the address book icon is displayed.
      *
      * @returns Value of property `badgePeople`
      */
    def getBadgePeople(): Boolean = js.native
    
    /**
      * @since 1.89
      *
      * Gets current value of property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * Default value is `Off`.
      *
      * @returns Value of property `emptyIndicatorMode`
      */
    def getEmptyIndicatorMode(): EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the object text.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @since 1.28.0
      *
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the object title.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @since 1.26
      *
      * Gets current value of property {@link #getTitleActive titleActive}.
      *
      * Indicates if the ObjectIdentifier's title is clickable.
      *
      * Default value is `false`.
      *
      * @returns Value of property `titleActive`
      */
    def getTitleActive(): Boolean = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Sets a new value for property {@link #getBadgeAttachments badgeAttachments}.
      *
      * Indicates whether or not the attachments icon is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBadgeAttachments(): this.type = js.native
    def setBadgeAttachments(/**
      * New value for property `badgeAttachments`
      */
    bBadgeAttachments: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Sets a new value for property {@link #getBadgeNotes badgeNotes}.
      *
      * Indicates whether or not the notes icon is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBadgeNotes(): this.type = js.native
    def setBadgeNotes(/**
      * New value for property `badgeNotes`
      */
    bBadgeNotes: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Sets a new value for property {@link #getBadgePeople badgePeople}.
      *
      * Indicates whether or not the address book icon is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBadgePeople(): this.type = js.native
    def setBadgePeople(/**
      * New value for property `badgePeople`
      */
    bBadgePeople: Boolean): this.type = js.native
    
    /**
      * @since 1.89
      *
      * Sets a new value for property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Off`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptyIndicatorMode(): this.type = js.native
    def setEmptyIndicatorMode(
      /**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String
    ): this.type = js.native
    def setEmptyIndicatorMode(/**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: EmptyIndicatorMode): this.type = js.native
    
    /**
      * Sets text. Default value is empty/undefined.
      *
      * @returns this to allow method chaining
      */
    def setText(/**
      * New value for property text
      */
    sText: String): this.type = js.native
    
    /**
      * @since 1.28.0
      *
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets the title. Default value is empty/undefined.
      *
      * @returns this to allow method chaining
      */
    def setTitle(/**
      * New value for property title
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets property titleActive. Default value is false.
      *
      * @returns this to allow method chaining
      */
    def setTitleActive(/**
      * new value for property titleActive
      */
    bValue: Boolean): this.type = js.native
  }
  
  trait ObjectIdentifier$TitlePressEventParameters extends StObject {
    
    /**
      * DOM reference of the object identifier's title.
      */
    var domRef: js.UndefOr[js.Object] = js.undefined
  }
  object ObjectIdentifier$TitlePressEventParameters {
    
    inline def apply(): ObjectIdentifier$TitlePressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectIdentifier$TitlePressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectIdentifier$TitlePressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: js.Object): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    }
  }
  
  trait ObjectIdentifierSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs, which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Indicates whether or not the attachments icon is displayed.
      */
    var badgeAttachments: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Indicates whether or not the notes icon is displayed.
      */
    var badgeNotes: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.24.0) - There is no replacement for the moment.
      *
      * Indicates whether or not the address book icon is displayed.
      */
    var badgePeople: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.89
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      */
    var emptyIndicatorMode: js.UndefOr[
        EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the object text.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.28.0
      *
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the object title.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.26
      *
      * Indicates if the ObjectIdentifier's title is clickable.
      */
    var titleActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.26
      *
      * Fires when the title is active and the user taps/clicks on it.
      */
    var titlePress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectIdentifier$TitlePressEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object ObjectIdentifierSettings {
    
    inline def apply(): ObjectIdentifierSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectIdentifierSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectIdentifierSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBadgeAttachments(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "badgeAttachments", value.asInstanceOf[js.Any])
      
      inline def setBadgeAttachmentsUndefined: Self = StObject.set(x, "badgeAttachments", js.undefined)
      
      inline def setBadgeNotes(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "badgeNotes", value.asInstanceOf[js.Any])
      
      inline def setBadgeNotesUndefined: Self = StObject.set(x, "badgeNotes", js.undefined)
      
      inline def setBadgePeople(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "badgePeople", value.asInstanceOf[js.Any])
      
      inline def setBadgePeopleUndefined: Self = StObject.set(x, "badgePeople", js.undefined)
      
      inline def setEmptyIndicatorMode(
        value: EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleActive", value.asInstanceOf[js.Any])
      
      inline def setTitleActiveUndefined: Self = StObject.set(x, "titleActive", js.undefined)
      
      inline def setTitlePress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectIdentifier$TitlePressEventParameters] => Unit
      ): Self = StObject.set(x, "titlePress", js.Any.fromFunction1(value))
      
      inline def setTitlePressUndefined: Self = StObject.set(x, "titlePress", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type ObjectIdentifierTitlePressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectIdentifier$TitlePressEventParameters]
  
  type ObjectIdentifierTitlePressEventParameters = ObjectIdentifier$TitlePressEventParameters
}
