package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFixFlexMod {
  
  @JSImport("sap/ui/layout/FixFlex", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FixFlex.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FixFlex {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FixFlexSettings) = this()
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
    mSettings: FixFlexSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FixFlexSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/FixFlex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.FixFlex with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, FixFlex]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FixFlex],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.FixFlex.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FixFlex
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some fixContent to the aggregation {@link #getFixContent fixContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFixContent(
      /**
      * The fixContent to add; if empty, nothing is inserted
      */
    oFixContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the fixContent in the aggregation {@link #getFixContent fixContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFixContent(): this.type = js.native
    
    /**
      * Destroys the flexContent in the aggregation {@link #getFlexContent flexContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFlexContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getFixContent fixContent}.
      *
      * Controls in the fixed part of the layout.
      */
    def getFixContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getFixContentSize fixContentSize}.
      *
      * Determines the height (if the vertical property is "true") or the width (if the vertical property is
      * "false") of the fixed area. If left at the default value "auto", the fixed-size area will be as large
      * as its content. In this case the content cannot use percentage sizes.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `fixContentSize`
      */
    def getFixContentSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getFixFirst fixFirst}.
      *
      * Determines whether the fixed-size area should be on the beginning/top ( if the value is "true") or end/bottom
      * ( if the value is "false").
      *
      * Default value is `true`.
      *
      * @returns Value of property `fixFirst`
      */
    def getFixFirst(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFlexContent flexContent}.
      *
      * Control in the stretching part of the layout.
      */
    def getFlexContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.29
      *
      * Gets current value of property {@link #getMinFlexSize minFlexSize}.
      *
      * Enables scrolling inside the flexible part. The given size is calculated in "px". If the child control
      * in the flexible part is larger than the available flexible size on the screen and if the available size
      * for the flexible part is smaller or equal to the minFlexSize value, the scroll will be for the entire
      * FixFlex control.
      *
      * Default value is `0`.
      *
      * @returns Value of property `minFlexSize`
      */
    def getMinFlexSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getVertical vertical}.
      *
      * Determines the direction of the layout of child elements. True for vertical and false for horizontal
      * layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `vertical`
      */
    def getVertical(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getFixContent fixContent}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFixContent(
      /**
      * The fixContent whose index is looked for
      */
    oFixContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a fixContent into the aggregation {@link #getFixContent fixContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFixContent(
      /**
      * The fixContent to insert; if empty, nothing is inserted
      */
    oFixContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the fixContent should be inserted at; for a negative value of `iIndex`, the fixContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the fixContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFixContent fixContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFixContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeFixContent(/**
      * The fixContent to remove or its index or id
      */
    vFixContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a fixContent from the aggregation {@link #getFixContent fixContent}.
      *
      * @returns The removed fixContent or `null`
      */
    def removeFixContent(/**
      * The fixContent to remove or its index or id
      */
    vFixContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeFixContent(
      /**
      * The fixContent to remove or its index or id
      */
    vFixContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFixContentSize fixContentSize}.
      *
      * Determines the height (if the vertical property is "true") or the width (if the vertical property is
      * "false") of the fixed area. If left at the default value "auto", the fixed-size area will be as large
      * as its content. In this case the content cannot use percentage sizes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixContentSize(): this.type = js.native
    def setFixContentSize(/**
      * New value for property `fixContentSize`
      */
    sFixContentSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFixFirst fixFirst}.
      *
      * Determines whether the fixed-size area should be on the beginning/top ( if the value is "true") or end/bottom
      * ( if the value is "false").
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixFirst(): this.type = js.native
    def setFixFirst(/**
      * New value for property `fixFirst`
      */
    bFixFirst: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFlexContent flexContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlexContent(/**
      * The flexContent to set
      */
    oFlexContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @SINCE 1.29
      *
      * Sets a new value for property {@link #getMinFlexSize minFlexSize}.
      *
      * Enables scrolling inside the flexible part. The given size is calculated in "px". If the child control
      * in the flexible part is larger than the available flexible size on the screen and if the available size
      * for the flexible part is smaller or equal to the minFlexSize value, the scroll will be for the entire
      * FixFlex control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinFlexSize(): this.type = js.native
    def setMinFlexSize(/**
      * New value for property `minFlexSize`
      */
    iMinFlexSize: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVertical vertical}.
      *
      * Determines the direction of the layout of child elements. True for vertical and false for horizontal
      * layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVertical(): this.type = js.native
    def setVertical(/**
      * New value for property `vertical`
      */
    bVertical: Boolean): this.type = js.native
  }
  
  trait FixFlexSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Controls in the fixed part of the layout.
      */
    var fixContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the height (if the vertical property is "true") or the width (if the vertical property is
      * "false") of the fixed area. If left at the default value "auto", the fixed-size area will be as large
      * as its content. In this case the content cannot use percentage sizes.
      */
    var fixContentSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the fixed-size area should be on the beginning/top ( if the value is "true") or end/bottom
      * ( if the value is "false").
      */
    var fixFirst: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Control in the stretching part of the layout.
      */
    var flexContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.29
      *
      * Enables scrolling inside the flexible part. The given size is calculated in "px". If the child control
      * in the flexible part is larger than the available flexible size on the screen and if the available size
      * for the flexible part is smaller or equal to the minFlexSize value, the scroll will be for the entire
      * FixFlex control.
      */
    var minFlexSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the direction of the layout of child elements. True for vertical and false for horizontal
      * layout.
      */
    var vertical: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FixFlexSettings {
    
    inline def apply(): FixFlexSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixFlexSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixFlexSettings] (val x: Self) extends AnyVal {
      
      inline def setFixContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fixContent", value.asInstanceOf[js.Any])
      
      inline def setFixContentSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixContentSize", value.asInstanceOf[js.Any])
      
      inline def setFixContentSizeUndefined: Self = StObject.set(x, "fixContentSize", js.undefined)
      
      inline def setFixContentUndefined: Self = StObject.set(x, "fixContent", js.undefined)
      
      inline def setFixContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "fixContent", js.Array(value*))
      
      inline def setFixFirst(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixFirst", value.asInstanceOf[js.Any])
      
      inline def setFixFirstUndefined: Self = StObject.set(x, "fixFirst", js.undefined)
      
      inline def setFlexContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "flexContent", value.asInstanceOf[js.Any])
      
      inline def setFlexContentUndefined: Self = StObject.set(x, "flexContent", js.undefined)
      
      inline def setMinFlexSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minFlexSize", value.asInstanceOf[js.Any])
      
      inline def setMinFlexSizeUndefined: Self = StObject.set(x, "minFlexSize", js.undefined)
      
      inline def setVertical(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
