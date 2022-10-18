package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutBorderLayoutAreaMod {
  
  @JSImport("sap/ui/commons/layout/BorderLayoutArea", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/BorderLayoutArea.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BorderLayoutArea {
    def this(/**
      * initial settings for the new control
      */
    mSettings: BorderLayoutAreaSettings) = this()
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
    mSettings: BorderLayoutAreaSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: BorderLayoutAreaSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/BorderLayoutArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.BorderLayoutArea with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, BorderLayoutArea]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BorderLayoutArea],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.BorderLayoutArea.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BorderLayoutArea
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @deprecated (since 1.3.3) - Redundant to the aggregation by the parent border layout.
      *
      * Gets current value of property {@link #getAreaId areaId}.
      *
      * Defines which area the element represents: top, begin, center, end, bottom
      *
      * Default value is `top`.
      *
      * @returns Value of property `areaId`
      */
    def getAreaId(): BorderLayoutAreaTypes | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Controls within the area
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getContentAlign contentAlign}.
      *
      * The content alignment as CSS value
      *
      * Default value is `'left'`.
      *
      * @returns Value of property `contentAlign`
      */
    def getContentAlign(): String = js.native
    
    /**
      * Gets current value of property {@link #getOverflowX overflowX}.
      *
      * The overflow mode of the area in horizontal direction as CSS value
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `overflowX`
      */
    def getOverflowX(): String = js.native
    
    /**
      * Gets current value of property {@link #getOverflowY overflowY}.
      *
      * The overflow mode of the area in vertical direction as CSS value
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `overflowY`
      */
    def getOverflowY(): String = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Defines the height or the width. Is not used when the area element is in Center.
      *
      * Default value is `'100px'`.
      *
      * @returns Value of property `size`
      */
    def getSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Invisible controls are not rendered
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.3.3) - Redundant to the aggregation by the parent border layout.
      *
      * Sets a new value for property {@link #getAreaId areaId}.
      *
      * Defines which area the element represents: top, begin, center, end, bottom
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `top`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAreaId(): this.type = js.native
    def setAreaId(
      /**
      * New value for property `areaId`
      */
    sAreaId: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String
    ): this.type = js.native
    def setAreaId(/**
      * New value for property `areaId`
      */
    sAreaId: BorderLayoutAreaTypes): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContentAlign contentAlign}.
      *
      * The content alignment as CSS value
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'left'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentAlign(): this.type = js.native
    def setContentAlign(/**
      * New value for property `contentAlign`
      */
    sContentAlign: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOverflowX overflowX}.
      *
      * The overflow mode of the area in horizontal direction as CSS value
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOverflowX(): this.type = js.native
    def setOverflowX(/**
      * New value for property `overflowX`
      */
    sOverflowX: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOverflowY overflowY}.
      *
      * The overflow mode of the area in vertical direction as CSS value
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOverflowY(): this.type = js.native
    def setOverflowY(/**
      * New value for property `overflowY`
      */
    sOverflowY: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Defines the height or the width. Is not used when the area element is in Center.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100px'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Invisible controls are not rendered
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait BorderLayoutAreaSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @deprecated (since 1.3.3) - Redundant to the aggregation by the parent border layout.
      *
      * Defines which area the element represents: top, begin, center, end, bottom
      */
    var areaId: js.UndefOr[
        BorderLayoutAreaTypes | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Controls within the area
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content alignment as CSS value
      */
    var contentAlign: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The overflow mode of the area in horizontal direction as CSS value
      */
    var overflowX: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The overflow mode of the area in vertical direction as CSS value
      */
    var overflowY: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the height or the width. Is not used when the area element is in Center.
      */
    var size: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Invisible controls are not rendered
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BorderLayoutAreaSettings {
    
    inline def apply(): BorderLayoutAreaSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderLayoutAreaSettings]
    }
    
    extension [Self <: BorderLayoutAreaSettings](x: Self) {
      
      inline def setAreaId(
        value: BorderLayoutAreaTypes | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BorderLayoutAreaTypes * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "areaId", value.asInstanceOf[js.Any])
      
      inline def setAreaIdUndefined: Self = StObject.set(x, "areaId", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentAlign(value: String | PropertyBindingInfo): Self = StObject.set(x, "contentAlign", value.asInstanceOf[js.Any])
      
      inline def setContentAlignUndefined: Self = StObject.set(x, "contentAlign", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setOverflowX(value: String | PropertyBindingInfo): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: String | PropertyBindingInfo): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
