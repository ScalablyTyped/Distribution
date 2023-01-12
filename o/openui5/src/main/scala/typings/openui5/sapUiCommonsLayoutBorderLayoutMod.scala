package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutBorderLayoutMod {
  
  @JSImport("sap/ui/commons/layout/BorderLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/BorderLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BorderLayout {
    def this(/**
      * initial settings for the new control
      */
    mSettings: BorderLayoutSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: BorderLayoutSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: BorderLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/BorderLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.BorderLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, BorderLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BorderLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.BorderLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BorderLayout
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addContent(
      /**
      * Specifies the area where controls will be added
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): this.type = js.native
    /**
      * Adds controls to the specified area.
      *
      * @returns `this` to allow method chaining
      */
    def addContent(/**
      * Specifies the area where controls will be added
      */
    sAreaId: BorderLayoutAreaTypes): this.type = js.native
    
    def createArea(
      /**
      * Specifies which area will be created. If the area is already available, the method call is ignored.
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String,
      /**
      * Any number of controls can be submitted to be added to the newly created area; where each control is
      * submitted as one argument.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    /**
      * Creates the specified area and adds the given controls to it. Returns the created area.
      *
      * @returns The created aria
      */
    def createArea(
      /**
      * Specifies which area will be created. If the area is already available, the method call is ignored.
      */
    sAreaId: BorderLayoutAreaTypes,
      /**
      * Any number of controls can be submitted to be added to the newly created area; where each control is
      * submitted as one argument.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    /**
      * Destroys the begin in the aggregation {@link #getBegin begin}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBegin(): this.type = js.native
    
    /**
      * Destroys the bottom in the aggregation {@link #getBottom bottom}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBottom(): this.type = js.native
    
    /**
      * Destroys the center in the aggregation {@link #getCenter center}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCenter(): this.type = js.native
    
    def destroyContent(
      /**
      * Specifies the area whose content will be destroyed
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): this.type = js.native
    /**
      * Destroys the content of the specified area.
      *
      * @returns `this` to allow method chaining
      */
    def destroyContent(/**
      * Specifies the area whose content will be destroyed
      */
    sAreaId: BorderLayoutAreaTypes): this.type = js.native
    
    /**
      * Destroys the end in the aggregation {@link #getEnd end}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEnd(): this.type = js.native
    
    /**
      * Destroys the top in the aggregation {@link #getTop top}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTop(): this.type = js.native
    
    def getArea(
      /**
      * The aria ID
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String,
      /**
      * Whether the aria must be created
      */
    bCreate: Boolean
    ): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    /**
      * Returns the area of the given type. If the area does not exist, it will be created when create is set
      * to true.
      *
      * @returns The aria
      */
    def getArea(
      /**
      * The aria ID
      */
    sAreaId: BorderLayoutAreaTypes,
      /**
      * Whether the aria must be created
      */
    bCreate: Boolean
    ): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    def getAreaById(
      /**
      * Specifies the area whose object will be returned.
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    /**
      * Returns the object of the specified area. If the area does not exist, the area will be created and returned.
      *
      * @returns The aria
      */
    def getAreaById(/**
      * Specifies the area whose object will be returned.
      */
    sAreaId: BorderLayoutAreaTypes): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    def getAreaData(
      /**
      * Specifies the area whose data will be returned
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): js.Object = js.native
    /**
      * Returns a JSON-like object that contains all property values of the requested area.
      *
      * @returns The aria data
      */
    def getAreaData(/**
      * Specifies the area whose data will be returned
      */
    sAreaId: BorderLayoutAreaTypes): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getBegin begin}.
      *
      * Represents the Begin area
      */
    def getBegin(): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getBottom bottom}.
      *
      * Represents the Bottom area
      */
    def getBottom(): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCenter center}.
      *
      * Represents the Center area
      */
    def getCenter(): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    def getContent(
      /**
      * Specifies the area whose content controls shall be returned.
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    /**
      * Returns all controls inside the specified area inside an array.
      *
      * @returns The array with the content
      */
    def getContent(
      /**
      * Specifies the area whose content controls shall be returned.
      */
    sAreaId: BorderLayoutAreaTypes
    ): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getEnd end}.
      *
      * Represents the End area
      */
    def getEnd(): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the overall height of the layout
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @deprecated (since 1.5.2) - replaced by the global configuration for the page
      *
      * Gets current value of property {@link #getRtl rtl}.
      *
      * The RTL setting swaps the areas Begin and End.
      *
      * Default value is `false`.
      *
      * @returns Value of property `rtl`
      */
    def getRtl(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getTop top}.
      *
      * Represents the Top area
      */
    def getTop(): typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the overall width of the layout
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    def indexOfContent(
      /**
      * Specifies the area that will be searched
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String,
      /**
      * Specifies the control whose index will be searched
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    /**
      * Determines the index of a given content control.
      *
      * @returns The index of the content
      */
    def indexOfContent(
      /**
      * Specifies the area that will be searched
      */
    sAreaId: BorderLayoutAreaTypes,
      /**
      * Specifies the control whose index will be searched
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    def insertContent(
      /**
      * Specifies the area where the controls shall be inserted.
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String,
      /**
      * Specifies the index where the controls shall be added. For a negative value of iIndex, the content is
      * inserted at position '0'; for a value greater than the current size of the aggregation, the content is
      * inserted at the last position.
      */
    iIndex: int
    ): this.type = js.native
    /**
      * Inserts controls to an area at a given index.
      *
      * @returns `this` to allow method chaining
      */
    def insertContent(
      /**
      * Specifies the area where the controls shall be inserted.
      */
    sAreaId: BorderLayoutAreaTypes,
      /**
      * Specifies the index where the controls shall be added. For a negative value of iIndex, the content is
      * inserted at position '0'; for a value greater than the current size of the aggregation, the content is
      * inserted at the last position.
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAllContent(
      /**
      * Specifies the area whose content shall be removed
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): this.type = js.native
    /**
      * Removes all content from an area.
      *
      * @returns `this` to allow method chaining
      */
    def removeAllContent(/**
      * Specifies the area whose content shall be removed
      */
    sAreaId: BorderLayoutAreaTypes): this.type = js.native
    
    def removeContent(
      /**
      * Specifies the area whose content shall be removed
      */
    oAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String,
      /**
      * The content to be removed Specifies the control that shall be removed
      */
    vElement: Any
    ): this.type = js.native
    /**
      * Removes the content with the given index from an area.
      *
      * @returns `this` to allow method chaining
      */
    def removeContent(
      /**
      * Specifies the area whose content shall be removed
      */
    oAreaId: BorderLayoutAreaTypes,
      /**
      * The content to be removed Specifies the control that shall be removed
      */
    vElement: Any
    ): this.type = js.native
    
    def setAreaData(
      /**
      * Specifies the area whose properties will be set
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String,
      /**
      * JSON-like object that contains the values to be set
      */
    oData: js.Object
    ): this.type = js.native
    /**
      * Sets the properties of the specified area with the given values.
      *
      * @returns `this` to allow method chaining
      */
    def setAreaData(
      /**
      * Specifies the area whose properties will be set
      */
    sAreaId: BorderLayoutAreaTypes,
      /**
      * JSON-like object that contains the values to be set
      */
    oData: js.Object
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getBegin begin}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBegin(
      /**
      * The begin to set
      */
    oBegin: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getBottom bottom}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBottom(
      /**
      * The bottom to set
      */
    oBottom: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCenter center}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCenter(
      /**
      * The center to set
      */
    oCenter: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getEnd end}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnd(/**
      * The end to set
      */
    oEnd: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the overall height of the layout
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @deprecated (since 1.5.2) - replaced by the global configuration for the page
      *
      * Sets a new value for property {@link #getRtl rtl}.
      *
      * The RTL setting swaps the areas Begin and End.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRtl(): this.type = js.native
    def setRtl(/**
      * New value for property `rtl`
      */
    bRtl: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTop top}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTop(/**
      * The top to set
      */
    oTop: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the overall width of the layout
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait BorderLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Represents the Begin area
      */
    var begin: js.UndefOr[typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default] = js.undefined
    
    /**
      * Represents the Bottom area
      */
    var bottom: js.UndefOr[typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default] = js.undefined
    
    /**
      * Represents the Center area
      */
    var center: js.UndefOr[typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default] = js.undefined
    
    /**
      * Represents the End area
      */
    var end: js.UndefOr[typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default] = js.undefined
    
    /**
      * Defines the overall height of the layout
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.5.2) - replaced by the global configuration for the page
      *
      * The RTL setting swaps the areas Begin and End.
      */
    var rtl: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Represents the Top area
      */
    var top: js.UndefOr[typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default] = js.undefined
    
    /**
      * Defines the overall width of the layout
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BorderLayoutSettings {
    
    inline def apply(): BorderLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setBegin(value: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBottom(value: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCenter(value: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setEnd(value: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRtl(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTop(value: typings.openui5.sapUiCommonsLayoutBorderLayoutAreaMod.default): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
