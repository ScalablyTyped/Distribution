package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiLayoutLibraryMod.BoxesPerRowConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutCssgridGridBoxLayoutMod {
  
  @JSImport("sap/ui/layout/cssgrid/GridBoxLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GridBoxLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridBoxLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridBoxLayoutSettings) = this()
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
    mSettings: GridBoxLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridBoxLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/cssgrid/GridBoxLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.cssgrid.GridBoxLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.layout.cssgrid.GridLayoutBase.extend}.
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
    oClassInfo: ClassInfo[T, GridBoxLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridBoxLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.cssgrid.GridBoxLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait GridBoxLayout
    extends typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default {
    
    /**
      * Returns a gridTemplateColumns value based on boxWidth and boxMinWidth properties
      *
      * @returns A value for gridTemplateColumns property
      */
    def _getTemplateColumns(): String = js.native
    
    /**
      * Gets current value of property {@link #getBoxMinWidth boxMinWidth}.
      *
      * Defines the minimum width of the Boxes
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `boxMinWidth`
      */
    def getBoxMinWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getBoxWidth boxWidth}.
      *
      * Defines the width of the Boxes
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `boxWidth`
      */
    def getBoxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getBoxesPerRowConfig boxesPerRowConfig}.
      *
      * A string type that defines number of Boxes per row for extra large, large, medium and small screens
      *
      * **Note:** When the property `boxMinWidth` or `boxWidth` is set this property has no effect.
      *
      * Default value is `"XL7 L6 M4 S2"`.
      *
      * @returns Value of property `boxesPerRowConfig`
      */
    def getBoxesPerRowConfig(): BoxesPerRowConfig = js.native
    
    /**
      * Sets a new value for property {@link #getBoxMinWidth boxMinWidth}.
      *
      * Defines the minimum width of the Boxes
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBoxMinWidth(): this.type = js.native
    def setBoxMinWidth(/**
      * New value for property `boxMinWidth`
      */
    sBoxMinWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBoxWidth boxWidth}.
      *
      * Defines the width of the Boxes
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBoxWidth(): this.type = js.native
    def setBoxWidth(/**
      * New value for property `boxWidth`
      */
    sBoxWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBoxesPerRowConfig boxesPerRowConfig}.
      *
      * A string type that defines number of Boxes per row for extra large, large, medium and small screens
      *
      * **Note:** When the property `boxMinWidth` or `boxWidth` is set this property has no effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"XL7 L6 M4 S2"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBoxesPerRowConfig(): this.type = js.native
    def setBoxesPerRowConfig(/**
      * New value for property `boxesPerRowConfig`
      */
    sBoxesPerRowConfig: BoxesPerRowConfig): this.type = js.native
  }
  
  trait GridBoxLayoutSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Defines the minimum width of the Boxes
      */
    var boxMinWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the Boxes
      */
    var boxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A string type that defines number of Boxes per row for extra large, large, medium and small screens
      *
      * **Note:** When the property `boxMinWidth` or `boxWidth` is set this property has no effect.
      */
    var boxesPerRowConfig: js.UndefOr[
        BoxesPerRowConfig | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridBoxLayoutSettings {
    
    inline def apply(): GridBoxLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridBoxLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridBoxLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setBoxMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "boxMinWidth", value.asInstanceOf[js.Any])
      
      inline def setBoxMinWidthUndefined: Self = StObject.set(x, "boxMinWidth", js.undefined)
      
      inline def setBoxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
      
      inline def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
      
      inline def setBoxesPerRowConfig(
        value: BoxesPerRowConfig | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "boxesPerRowConfig", value.asInstanceOf[js.Any])
      
      inline def setBoxesPerRowConfigUndefined: Self = StObject.set(x, "boxesPerRowConfig", js.undefined)
    }
  }
}
