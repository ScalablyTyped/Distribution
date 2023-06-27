package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelFilterTypeMod.FilterType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTreeBindingMod {
  
  @JSImport("sap/ui/model/TreeBinding", JSImport.Default)
  @js.native
  open class default protected () extends TreeBinding {
    /**
      * Constructor for TreeBinding.
      *
      * This constructor should only be called by subclasses or model implementations, not by application or
      * control code. Such code should use {@link sap.ui.model.Model#bindTree Model#bindTree} on the corresponding
      * model instead.
      */
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: js.Object,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: String,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding (optional)
      */
    oContext: Unit,
      /**
      * Predefined filter or an array of filters (optional)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters (optional)
      */
    mParameters: Unit,
      /**
      * Predefined sorter or an array of sorters (optional)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/TreeBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.TreeBinding with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Binding.extend}.
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
    oClassInfo: ClassInfo[T, TreeBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.TreeBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait TreeBinding
    extends typings.openui5.sapUiModelBindingMod.default {
    
    /**
      * @deprecated (since 1.11) - use the `change` event. It now contains a parameter `(reason : "filter")`
      * when a filter event is fired.
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Attaches event handler `fnFunction` to the {@link #event:_filter _filter} event of this `sap.ui.model.TreeBinding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.TreeBinding` itself.
      */
    def attachFilter(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachFilter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `TreeBinding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.11) - use the `change` event.
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Detaches event handler `fnFunction` from the {@link #event:_filter _filter} event of this `sap.ui.model.TreeBinding`.
      *
      * The passed function and listener object must match the ones used for event registration.
      */
    def detachFilter(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachFilter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    def filter(
      /**
      * Single sap.ui.model.Filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String
    ): Unit = js.native
    def filter(
      /**
      * Single sap.ui.model.Filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: FilterType
    ): Unit = js.native
    def filter(
      /**
      * Single sap.ui.model.Filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String
    ): Unit = js.native
    /**
      * Filters the tree according to the filter definitions.
      */
    def filter(
      /**
      * Single sap.ui.model.Filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: FilterType
    ): Unit = js.native
    
    /**
      * Returns the number of child nodes of a specific context
      *
      * @returns the number of children
      */
    def getChildCount(/**
      * the context element of the node
      */
    oContext: js.Object): int = js.native
    
    /**
      * @since 1.108.0
      *
      * Returns the count of entries in the tree, or `undefined` if it is unknown. If the tree is filtered, the
      * count of all entries matching the filter conditions is returned. The entries required only for the tree
      * structure are not counted.
      *
      * **Note:** The default implementation returns `undefined` and has to be overwritten by subclasses.
      *
      * @returns The count of entries in the tree, or `undefined` if it is unknown, for example because the binding
      * is not resolved or because this feature is not supported.
      */
    def getCount(): js.UndefOr[Double] = js.native
    
    /**
      * Returns the current value of the bound target
      *
      * @returns the array of child contexts for the given node
      */
    def getNodeContexts(
      /**
      * the context element of the node
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * the startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * determines how many contexts to retrieve beginning from the start index.
      */
    iLength: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Returns the current value of the bound target
      *
      * @returns the array of child contexts for the root node
      */
    def getRootContexts(
      /**
      * the startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * determines how many contexts to retrieve beginning from the start index.
      */
    iLength: int
    ): js.Array[Any] = js.native
    
    /**
      * Returns if the node has child nodes
      *
      * @returns true if node has children
      */
    def hasChildren(/**
      * the context element of the node
      */
    oContext: js.Object): Boolean = js.native
    
    /**
      * Sorts the tree according to the sorter definitions.
      */
    def sort(
      /**
      * Array of sap.ui.model.Sorter objects
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): Unit = js.native
  }
}
