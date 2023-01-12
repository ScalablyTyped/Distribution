package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutBlockLayoutCellDataMod {
  
  @JSImport("sap/ui/layout/BlockLayoutCellData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new BlockLayoutCellData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BlockLayoutCellData {
    def this(/**
      * initial settings for the new control
      */
    mSettings: BlockLayoutCellDataSettings) = this()
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
    mSettings: BlockLayoutCellDataSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: BlockLayoutCellDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/BlockLayoutCellData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.BlockLayoutCellData with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, BlockLayoutCellData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BlockLayoutCellData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.BlockLayoutCellData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BlockLayoutCellData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getLSize lSize}.
      *
      * Sets the width of the cell for L size of the BlockLayout.
      *
      * Default value is `1`.
      *
      * @returns Value of property `lSize`
      */
    def getLSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getMSize mSize}.
      *
      * Sets the width of the cell for M size of the BlockLayout.
      *
      * Default value is `1`.
      *
      * @returns Value of property `mSize`
      */
    def getMSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getSSize sSize}.
      *
      * Sets the width of the cell for S size of the BlockLayout.
      *
      * Default value is `1`.
      *
      * @returns Value of property `sSize`
      */
    def getSSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getXlSize xlSize}.
      *
      * Sets the width of the cell for XL size of the BlockLayout.
      *
      * Default value is `1`.
      *
      * @returns Value of property `xlSize`
      */
    def getXlSize(): int = js.native
    
    /**
      * Sets a new value for property {@link #getLSize lSize}.
      *
      * Sets the width of the cell for L size of the BlockLayout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLSize(): this.type = js.native
    def setLSize(/**
      * New value for property `lSize`
      */
    iLSize: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMSize mSize}.
      *
      * Sets the width of the cell for M size of the BlockLayout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMSize(): this.type = js.native
    def setMSize(/**
      * New value for property `mSize`
      */
    iMSize: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSSize sSize}.
      *
      * Sets the width of the cell for S size of the BlockLayout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSSize(): this.type = js.native
    def setSSize(/**
      * New value for property `sSize`
      */
    iSSize: int): this.type = js.native
    
    /**
      * Sets width of the cell to all sizes if the width is specified.
      */
    def setSize(iValue: Unit): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getXlSize xlSize}.
      *
      * Sets the width of the cell for XL size of the BlockLayout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setXlSize(): this.type = js.native
    def setXlSize(/**
      * New value for property `xlSize`
      */
    iXlSize: int): this.type = js.native
  }
  
  trait BlockLayoutCellDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Sets the width of the cell for L size of the BlockLayout.
      */
    var lSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Sets the width of the cell for M size of the BlockLayout.
      */
    var mSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Sets the width of the cell for S size of the BlockLayout.
      */
    var sSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Sets the width of the cell for XL size of the BlockLayout.
      */
    var xlSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object BlockLayoutCellDataSettings {
    
    inline def apply(): BlockLayoutCellDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockLayoutCellDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockLayoutCellDataSettings] (val x: Self) extends AnyVal {
      
      inline def setLSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "lSize", value.asInstanceOf[js.Any])
      
      inline def setLSizeUndefined: Self = StObject.set(x, "lSize", js.undefined)
      
      inline def setMSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "mSize", value.asInstanceOf[js.Any])
      
      inline def setMSizeUndefined: Self = StObject.set(x, "mSize", js.undefined)
      
      inline def setSSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sSize", value.asInstanceOf[js.Any])
      
      inline def setSSizeUndefined: Self = StObject.set(x, "sSize", js.undefined)
      
      inline def setXlSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "xlSize", value.asInstanceOf[js.Any])
      
      inline def setXlSizeUndefined: Self = StObject.set(x, "xlSize", js.undefined)
    }
  }
}
