package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreVariantLayoutDataMod {
  
  @JSImport("sap/ui/core/VariantLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new VariantLayoutData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends VariantLayoutData {
    def this(/**
      * initial settings for the new control
      */
    mSettings: VariantLayoutDataSettings) = this()
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
    mSettings: VariantLayoutDataSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: VariantLayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/VariantLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.VariantLayoutData with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, VariantLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, VariantLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.VariantLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait VariantLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Adds some multipleLayoutData to the aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMultipleLayoutData(
      /**
      * The multipleLayoutData to add; if empty, nothing is inserted
      */
    oMultipleLayoutData: typings.openui5.sapUiCoreLayoutDataMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the multipleLayoutData in the aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMultipleLayoutData(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      *
      * Allows multiple LayoutData.
      */
    def getMultipleLayoutData(): js.Array[typings.openui5.sapUiCoreLayoutDataMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.LayoutData` in the aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMultipleLayoutData(
      /**
      * The multipleLayoutData whose index is looked for
      */
    oMultipleLayoutData: typings.openui5.sapUiCoreLayoutDataMod.default
    ): int = js.native
    
    /**
      * Inserts a multipleLayoutData into the aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMultipleLayoutData(
      /**
      * The multipleLayoutData to insert; if empty, nothing is inserted
      */
    oMultipleLayoutData: typings.openui5.sapUiCoreLayoutDataMod.default,
      /**
      * The `0`-based index the multipleLayoutData should be inserted at; for a negative value of `iIndex`, the
      * multipleLayoutData is inserted at position 0; for a value greater than the current size of the aggregation,
      * the multipleLayoutData is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMultipleLayoutData(): js.Array[typings.openui5.sapUiCoreLayoutDataMod.default] = js.native
    
    def removeMultipleLayoutData(/**
      * The multipleLayoutData to remove or its index or id
      */
    vMultipleLayoutData: String): typings.openui5.sapUiCoreLayoutDataMod.default | Null = js.native
    /**
      * Removes a multipleLayoutData from the aggregation {@link #getMultipleLayoutData multipleLayoutData}.
      *
      * @returns The removed multipleLayoutData or `null`
      */
    def removeMultipleLayoutData(/**
      * The multipleLayoutData to remove or its index or id
      */
    vMultipleLayoutData: int): typings.openui5.sapUiCoreLayoutDataMod.default | Null = js.native
    def removeMultipleLayoutData(
      /**
      * The multipleLayoutData to remove or its index or id
      */
    vMultipleLayoutData: typings.openui5.sapUiCoreLayoutDataMod.default
    ): typings.openui5.sapUiCoreLayoutDataMod.default | Null = js.native
  }
  
  trait VariantLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Allows multiple LayoutData.
      */
    var multipleLayoutData: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreLayoutDataMod.default] | typings.openui5.sapUiCoreLayoutDataMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object VariantLayoutDataSettings {
    
    inline def apply(): VariantLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariantLayoutDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariantLayoutDataSettings] (val x: Self) extends AnyVal {
      
      inline def setMultipleLayoutData(
        value: js.Array[typings.openui5.sapUiCoreLayoutDataMod.default] | typings.openui5.sapUiCoreLayoutDataMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "multipleLayoutData", value.asInstanceOf[js.Any])
      
      inline def setMultipleLayoutDataUndefined: Self = StObject.set(x, "multipleLayoutData", js.undefined)
      
      inline def setMultipleLayoutDataVarargs(value: typings.openui5.sapUiCoreLayoutDataMod.default*): Self = StObject.set(x, "multipleLayoutData", js.Array(value*))
    }
  }
}
