package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutPositionContainerMod {
  
  @JSImport("sap/ui/commons/layout/PositionContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/PositionContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PositionContainer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: PositionContainerSettings) = this()
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
    mSettings: PositionContainerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: PositionContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/PositionContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.PositionContainer with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, PositionContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PositionContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.PositionContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PositionContainer
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Destroys the control in the aggregation {@link #getControl control}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyControl(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getBottom bottom}.
      *
      * Defines the distance to the bottom of the layout (as specified in HTML)
      *
      * @returns Value of property `bottom`
      */
    def getBottom(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getCenterHorizontally centerHorizontally}.
      *
      * Indicates whether this container shall be centered horizontally within the AbsoluteLayout area. The values
      * of the attributes left and right are ignored when this feature is activated.
      *
      * Default value is `false`.
      *
      * @returns Value of property `centerHorizontally`
      */
    def getCenterHorizontally(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCenterVertically centerVertically}.
      *
      * Indicates whether this container should be centered vertically within the AbsoluteLayout area. The values
      * of the attributes top and bottom are ignored when this feature is activated.
      *
      * Default value is `false`.
      *
      * @returns Value of property `centerVertically`
      */
    def getCenterVertically(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getControl control}.
      *
      * Child control of the position container
      */
    def getControl(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getLeft left}.
      *
      * Defines the distance to the left of the layout (as specified in HTML)
      *
      * @returns Value of property `left`
      */
    def getLeft(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getRight right}.
      *
      * Defines the distance to the right of the layout (as specified in HTML)
      *
      * @returns Value of property `right`
      */
    def getRight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getTop top}.
      *
      * Defines the distance to the top of the layout (as specified in HTML)
      *
      * @returns Value of property `top`
      */
    def getTop(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getBottom bottom}.
      *
      * Defines the distance to the bottom of the layout (as specified in HTML)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBottom(): this.type = js.native
    def setBottom(/**
      * New value for property `bottom`
      */
    sBottom: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCenterHorizontally centerHorizontally}.
      *
      * Indicates whether this container shall be centered horizontally within the AbsoluteLayout area. The values
      * of the attributes left and right are ignored when this feature is activated.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCenterHorizontally(): this.type = js.native
    def setCenterHorizontally(/**
      * New value for property `centerHorizontally`
      */
    bCenterHorizontally: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCenterVertically centerVertically}.
      *
      * Indicates whether this container should be centered vertically within the AbsoluteLayout area. The values
      * of the attributes top and bottom are ignored when this feature is activated.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCenterVertically(): this.type = js.native
    def setCenterVertically(/**
      * New value for property `centerVertically`
      */
    bCenterVertically: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getControl control}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setControl(/**
      * The control to set
      */
    oControl: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLeft left}.
      *
      * Defines the distance to the left of the layout (as specified in HTML)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLeft(): this.type = js.native
    def setLeft(/**
      * New value for property `left`
      */
    sLeft: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRight right}.
      *
      * Defines the distance to the right of the layout (as specified in HTML)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRight(): this.type = js.native
    def setRight(/**
      * New value for property `right`
      */
    sRight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTop top}.
      *
      * Defines the distance to the top of the layout (as specified in HTML)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTop(): this.type = js.native
    def setTop(/**
      * New value for property `top`
      */
    sTop: CSSSize): this.type = js.native
    
    /**
      * Updates the position properties of the container according to the given position in JSON style.
      */
    def updatePosition(
      /**
      * JSON-like object which defines the position of the child control in the absolute layout. The object is
      * expected to have one or more out of the attributes top, bottom, left, right (each with a value of type
      * sap.ui.core.CSSSize). If no object is given, nothing is updated.
      */
    oPos: js.Object
    ): Unit = js.native
  }
  
  trait PositionContainerSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Defines the distance to the bottom of the layout (as specified in HTML)
      */
    var bottom: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether this container shall be centered horizontally within the AbsoluteLayout area. The values
      * of the attributes left and right are ignored when this feature is activated.
      */
    var centerHorizontally: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether this container should be centered vertically within the AbsoluteLayout area. The values
      * of the attributes top and bottom are ignored when this feature is activated.
      */
    var centerVertically: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Child control of the position container
      */
    var control: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the distance to the left of the layout (as specified in HTML)
      */
    var left: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the distance to the right of the layout (as specified in HTML)
      */
    var right: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the distance to the top of the layout (as specified in HTML)
      */
    var top: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PositionContainerSettings {
    
    inline def apply(): PositionContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionContainerSettings]
    }
    
    extension [Self <: PositionContainerSettings](x: Self) {
      
      inline def setBottom(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCenterHorizontally(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
      
      inline def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
      
      inline def setCenterVertically(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
      
      inline def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
      
      inline def setControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setLeft(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
