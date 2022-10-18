package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelClientTreeBindingMod {
  
  @JSImport("sap/ui/model/ClientTreeBinding", JSImport.Default)
  @js.native
  open class default protected () extends ClientTreeBinding {
    /**
      * Creates a new ClientTreeBinding.
      *
      * This constructor should only be called by subclasses or model implementations, not by application or
      * control code. Such code should use {@link sap.ui.model.Model#bindTree Model#bindTree} on the corresponding
      * model implementation instead.
      */
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: Unit,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: Unit,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: Unit,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: Unit,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: Unit,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: Unit,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: Unit,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: Unit,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: Unit,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: Unit,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: Unit,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path pointing to the tree / array that should be bound; syntax is defined by subclasses
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when when a relative binding path is given
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined application filter, either a single instance or an array
      */
    aApplicationFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model specific parameters as defined by subclasses; this class does not introduce any own
      * parameters
      */
    mParameters: Unit,
      /**
      * Predefined sorter/s contained in an array (optional)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/ClientTreeBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.ClientTreeBinding with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.TreeBinding.extend}.
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
    oClassInfo: ClassInfo[T, ClientTreeBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ClientTreeBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.ClientTreeBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ClientTreeBinding
    extends typings.openui5.sapUiModelTreeBindingMod.default {
    
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): this.type = js.native
    /**
      * Filters the tree according to the filter definitions.
      *
      * The filtering is applied recursively through the tree. The parent nodes of filtered child nodes will
      * also be displayed if they don't match the filter conditions. All filters belonging to a group (=have
      * the same path) are ORed and after that the results of all groups are ANDed.
      * See:
      * 	sap.ui.model.TreeBinding.prototype.filter
      *
      * @returns `this` to facilitate method chaining
      */
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): this.type = js.native
  }
}
