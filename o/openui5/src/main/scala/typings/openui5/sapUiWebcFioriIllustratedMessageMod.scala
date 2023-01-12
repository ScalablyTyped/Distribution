package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageSize
import typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageType
import typings.openui5.sapUiWebcMainLibraryMod.IButton
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriIllustratedMessageMod {
  
  @JSImport("sap/ui/webc/fiori/IllustratedMessage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `IllustratedMessage`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends IllustratedMessage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IllustratedMessageSettings) = this()
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
    mSettings: IllustratedMessageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IllustratedMessageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/IllustratedMessage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.IllustratedMessage with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, IllustratedMessage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IllustratedMessage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.IllustratedMessage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait IllustratedMessage
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(/**
      * The action to add; if empty, nothing is inserted
      */
    oAction: IButton): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys the subtitle in the aggregation {@link #getSubtitle subtitle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubtitle(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Defines the component actions.
      */
    def getActions(): js.Array[IButton] = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Default value is `BeforeSearch`.
      *
      * @returns Value of property `name`
      */
    def getName(): IllustrationMessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Determines which illustration breakpoint variant is used.
      *
      *  Available options are:
      * 	 - `Auto`
      * 	 - `Base`
      * 	 - `Spot`
      * 	 - `Dialog`
      * 	 - `Scene`
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other elements of the component
      * are displayed differently on the different breakpoints/illustration sizes.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `size`
      */
    def getSize(): IllustrationMessageSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageSize * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getSubtitle subtitle}.
      *
      * Defines the subtitle of the component.
      *
      *  **Note:** Using this slot, the default subtitle text of illustration and the value of `subtitleText`
      * property will be overwritten.
      */
    def getSubtitle(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getSubtitleText subtitleText}.
      *
      * Defines the subtitle of the component.
      *
      *  **Note:** Using this property, the default subtitle text of illustration will be overwritten.
      *
      *  **Note:** Using `subtitle` slot, the default of this property will be overwritten.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `subtitleText`
      */
    def getSubtitleText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleText titleText}.
      *
      * Defines the title of the component.
      *
      *  **Note:** Using this property, the default title text of illustration will be overwritten.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `titleText`
      */
    def getTitleText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IButton` in the aggregation {@link #getActions actions}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(/**
      * The action whose index is looked for
      */
    oAction: IButton): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: IButton,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): IButton | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): IButton | Null = js.native
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: IButton): IButton | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[IButton] = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `BeforeSearch`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(
      /**
      * New value for property `name`
      */
    sName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageType * / any */ String
    ): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: IllustrationMessageType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Determines which illustration breakpoint variant is used.
      *
      *  Available options are:
      * 	 - `Auto`
      * 	 - `Base`
      * 	 - `Spot`
      * 	 - `Dialog`
      * 	 - `Scene`
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other elements of the component
      * are displayed differently on the different breakpoints/illustration sizes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(
      /**
      * New value for property `size`
      */
    sSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageSize * / any */ String
    ): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: IllustrationMessageSize): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSubtitle subtitle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitle(/**
      * The subtitle to set
      */
    oSubtitle: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitleText subtitleText}.
      *
      * Defines the subtitle of the component.
      *
      *  **Note:** Using this property, the default subtitle text of illustration will be overwritten.
      *
      *  **Note:** Using `subtitle` slot, the default of this property will be overwritten.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitleText(): this.type = js.native
    def setSubtitleText(/**
      * New value for property `subtitleText`
      */
    sSubtitleText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleText titleText}.
      *
      * Defines the title of the component.
      *
      *  **Note:** Using this property, the default title text of illustration will be overwritten.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleText(): this.type = js.native
    def setTitleText(/**
      * New value for property `titleText`
      */
    sTitleText: String): this.type = js.native
  }
  
  trait IllustratedMessageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the component actions.
      */
    var actions: js.UndefOr[
        js.Array[IButton] | IButton | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var name: js.UndefOr[
        IllustrationMessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines which illustration breakpoint variant is used.
      *
      *  Available options are:
      * 	 - `Auto`
      * 	 - `Base`
      * 	 - `Spot`
      * 	 - `Dialog`
      * 	 - `Scene`
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other elements of the component
      * are displayed differently on the different breakpoints/illustration sizes.
      */
    var size: js.UndefOr[
        IllustrationMessageSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the subtitle of the component.
      *
      *  **Note:** Using this slot, the default subtitle text of illustration and the value of `subtitleText`
      * property will be overwritten.
      */
    var subtitle: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the subtitle of the component.
      *
      *  **Note:** Using this property, the default subtitle text of illustration will be overwritten.
      *
      *  **Note:** Using `subtitle` slot, the default of this property will be overwritten.
      */
    var subtitleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the title of the component.
      *
      *  **Note:** Using this property, the default title text of illustration will be overwritten.
      */
    var titleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object IllustratedMessageSettings {
    
    inline def apply(): IllustratedMessageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IllustratedMessageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IllustratedMessageSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[IButton] | IButton | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: IButton*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setName(
        value: IllustrationMessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(
        value: IllustrationMessageSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustrationMessageSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitleText", value.asInstanceOf[js.Any])
      
      inline def setSubtitleTextUndefined: Self = StObject.set(x, "subtitleText", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
