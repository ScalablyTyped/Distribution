package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelClientListBindingMod {
  
  @JSImport("sap/ui/model/ClientListBinding", JSImport.Default)
  @js.native
  open class default protected () extends ClientListBinding {
    /**
      * Creates a new ClientListBinding.
      *
      * This constructor should only be called by subclasses or model implementations, not by application or
      * control code. Such code should use {@link sap.ui.model.Model#bindList Model#bindList} on the corresponding
      * model implementation instead.
      */
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path to be used for this binding, syntax depends on the concrete subclass
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/ClientListBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.ClientListBinding with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.ListBinding.extend}.
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
    oClassInfo: ClassInfo[T, ClientListBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ClientListBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.ClientListBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ClientListBinding
    extends typings.openui5.sapUiModelListBindingMod.default
}
