package typings.openui5

import typings.openui5.anon.Index
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelFilterTypeMod.FilterType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelListBindingMod {
  
  @JSImport("sap/ui/model/ListBinding", JSImport.Default)
  @js.native
  open class default protected () extends ListBinding {
    /**
      * Constructor for ListBinding.
      */
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding belongs to
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * Binding path for this binding; a relative path will be resolved relative to a given context
      */
    sPath: String,
      /**
      * Context to be used to resolve a relative path
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
      * Additional, implementation-specific parameters that should be used by the new list binding; this base
      * class doesn't define any parameters, check the API reference for the concrete model implementations to
      * learn about their supported parameters (if any)
      */
    mParameters: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/ListBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.ListBinding with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, ListBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ListBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.ListBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ListBinding
    extends typings.openui5.sapUiModelBindingMod.default {
    
    /**
      * @deprecated (since 1.11) - use the `change` event. It now contains a parameter `(reason : "filter")`
      * when a filter event is fired.
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Attaches event handler `fnFunction` to the {@link #event:filter filter} event of this `sap.ui.model.ListBinding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.ListBinding` itself.
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
      * Context object to call the event handler with; defaults to this `ListBinding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.11) - use the `change` event. It now contains a parameter `(reason : "sort")` when
      * a sorter event is fired.
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Attaches event handler `fnFunction` to the {@link #event:sort sort} event of this `sap.ui.model.ListBinding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.ListBinding` itself.
      */
    def attachSort(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachSort(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `ListBinding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.11) - use the `change` event.
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Detaches event handler `fnFunction` from the {@link #event:filter filter} event of this `sap.ui.model.ListBinding`.
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
      * On which object the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.11) - use the `change` event.
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Detaches event handler `fnFunction` from the {@link #event:sort sort} event of this `sap.ui.model.ListBinding`.
      */
    def detachSort(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachSort(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Calculates delta of specified old data array and new data array.
      *
      * For more information, see {@link module:sap/base/util/array/diff}.
      *
      * @returns List of update operations
      */
    def diffData(/**
      * Old data array
      */
    aOld: js.Array[Any], /**
      * New data array
      */
    aNew: js.Array[Any]): js.Array[Index] = js.native
    
    def enableExtendedChangeDetection(
      /**
      * Whether changes within the same entity should cause a delete and insert command
      */
    bDetectUpdates: Boolean,
      /**
      * The path of the property containing the key or a function getting the context as only parameter to calculate
      * a key to identify an entry
      */
    vKey: String,
      /**
      * The configuration for the change detection
      */
    oExtendedChangeDetectionConfig: js.Object
    ): Unit = js.native
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Enable extended change detection. When extended change detection is enabled, the list binding provides
      * detailed information about changes, for example which entries have been removed or inserted. This can
      * be utilized by a control for fine-grained update of its elements. Please see {@link sap.ui.model.ListBinding.prototype.getContexts }
      * for more information.
      *
      * For models that do not have a unique key on each entry by default, a key property or function can be
      * set which is used to identify entries.
      */
    def enableExtendedChangeDetection(
      /**
      * Whether changes within the same entity should cause a delete and insert command
      */
    bDetectUpdates: Boolean,
      /**
      * The path of the property containing the key or a function getting the context as only parameter to calculate
      * a key to identify an entry
      */
    vKey: js.Function,
      /**
      * The configuration for the change detection
      */
    oExtendedChangeDetectionConfig: js.Object
    ): Unit = js.native
    
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted; if no type is given, the behavior depends on the model implementation
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted; if no type is given, the behavior depends on the model implementation
      */
    sFilterType: FilterType
    ): this.type = js.native
    /**
      * Applies a new set of filters to the list represented by this binding.
      *
      * Depending on the nature of the model (client or server), the operation might be executed locally or on
      * a server and it might execute asynchronously.
      *
      * Application and Control Filters: Each list binding maintains two separate lists of filters, one for filters
      * defined by the control that owns the binding, and another list for filters that an application can define
      * in addition. When executing the filter operation, both sets of filters are combined.
      *
      * By using the `sFilterType` parameter of the `filter` method, the caller can control which set of filters
      * is modified. If no type is given, then the behavior depends on the model implementation and should be
      * documented in the API reference for that model.
      *
      * Auto-Grouping of Filters: Filters are first grouped according to their binding path. All filters belonging
      * to the same path are ORed, and after that the results of all paths are ANDed. Usually this means that
      * all filters applied to the same property are ORed, while filters on different properties are ANDed. Please
      * use either the automatic grouping of filters (where applicable) or explicit AND/OR filters, as a mixture
      * of both is not supported.
      *
      * @returns Returns `this` to facilitate method chaining
      */
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted; if no type is given, the behavior depends on the model implementation
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted; if no type is given, the behavior depends on the model implementation
      */
    sFilterType: FilterType
    ): this.type = js.native
    
    /**
      * @since 1.97.0
      *
      * Returns all current contexts of this list binding in no special order. Just like {@link #getCurrentContexts},
      * this method does not request any data from a back end and does not change the binding's state. In contrast
      * to {@link #getCurrentContexts}, it does not only return those contexts that were last requested by a
      * control, but all contexts that are currently available in the binding.
      *
      * @returns All current contexts of this list binding, in no special order
      */
    def getAllCurrentContexts(): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns an array of binding contexts for the bound target list.
      *
      * In case of extended change detection, the context array may have an additional `diff` property, see {@link https://ui5.sap.com/#/topic/7cdff73f308b4b10bdf7d83b7aba72e7 documentation on extended change detection }
      * for details.
      *
      * **Note:**The public usage of this method is deprecated, as calls from outside of controls will lead to
      * unexpected side effects. To avoid this, use {@link sap.ui.model.ListBinding.prototype.getCurrentContexts }
      * instead.
      *
      * @returns The array of contexts for each row of the bound list
      */
    def getContexts(): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: Unit,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: Unit,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: Unit,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(/**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: Unit,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: Unit,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The startIndex where to start the retrieval of contexts
      */
    iStartIndex: int,
      /**
      * Determines how many contexts to retrieve beginning from the start index; default is the whole list length
      * up to the model's size limit; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table; this parameter is model-specific
      * and not implemented by all models
      */
    iMaximumPrefetchSize: int,
      /**
      * Whether this call keeps the result of {@link #getCurrentContexts} untouched; since 1.86.0. This parameter
      * is model-specific and not implemented by all models
      */
    bKeepCurrent: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * @since 1.93.0
      *
      * Returns the count of entries in the list, or `undefined` if it is unknown. The count is by default identical
      * to the list length if it is final. Concrete subclasses may, however, override the method, for example:
      *
      * 	 for server-side models where lists are not completely read by the client,  for lists representing
      * hierarchical data.
      * See:
      * 	#getLength
      * 	#isLengthFinal
      *
      * @returns The count of entries
      */
    def getCount(): js.UndefOr[Double] = js.native
    
    /**
      * @since 1.28
      *
      * Returns the contexts of this list binding as last requested by the control and in the same order the
      * control has received them.
      *
      * This method does not request any data from a back end and does not change the binding's state.
      *
      * @returns The contexts of this list binding as last requested by the control and in the same order the
      * control has received them
      */
    def getCurrentContexts(): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Returns list of distinct values for the given relative binding path.
      *
      * @returns Array of distinct values.
      */
    def getDistinctValues(/**
      * Relative binding path
      */
    sPath: String): js.Array[Any] = js.native
    
    def getFilters(
      /**
      * The FilterType
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String
    ): js.Array[typings.openui5.sapUiModelFilterMod.default] = js.native
    /**
      * @since 1.96.0
      *
      * Returns the filters set via the constructor or via {@link #filter} for the given {@link sap.ui.model.FilterType}.
      *
      * @returns An array of filters for the given filter type.
      */
    def getFilters(/**
      * The FilterType
      */
    sFilterType: FilterType): js.Array[typings.openui5.sapUiModelFilterMod.default] = js.native
    
    /**
      * Gets the group for the given context. Must only be called if `isGrouped()` returns that grouping is enabled
      * for this binding. The grouping will be performed using the first sorter (in case multiple sorters are
      * defined).
      * See:
      * 	sap.ui.model.Sorter#getGroup
      *
      * @returns The group object containing a key property and optional custom properties
      */
    def getGroup(/**
      * The binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default): js.Object = js.native
    
    /**
      * @since 1.24
      *
      * Returns the number of entries in the list.
      *
      * This might be an estimated or preliminary length, in case the full length is not known yet, see method
      * {@link #isLengthFinal}.
      *
      * @returns Returns the number of entries in the list
      */
    def getLength(): int = js.native
    
    /**
      * Indicates whether grouping is enabled for the binding. Grouping is enabled for a list binding if at least
      * one sorter exists on the binding and the first sorter is a grouping sorter.
      *
      * @returns Whether grouping is enabled
      */
    def isGrouped(): Boolean = js.native
    
    /**
      * @since 1.24
      *
      * Returns whether the length which can be retrieved using getLength() is a known, final length, or a preliminary
      * or estimated length which may change if further data is requested.
      *
      * @returns Whether the length is final
      */
    def isLengthFinal(): Boolean = js.native
    
    /**
      * @since 1.77.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Requests a {@link sap.ui.model.Filter} object which can be used to filter the list binding by entries
      * with model messages. With the filter callback, you can define if a message is considered when creating
      * the filter for entries with messages.
      *
      * The resulting filter does not consider application or control filters specified for this list binding
      * in its constructor or in its {@link #filter} method; add filters which you want to keep with the "and"
      * conjunction to the resulting filter before calling {@link #filter}.
      *
      * The implementation of this method is optional for model specific implementations of `sap.ui.model.ListBinding`.
      * Check for existence of this function before calling it.
      *
      * @returns A Promise that resolves with a {@link sap.ui.model.Filter} representing the entries with messages;
      * it resolves with `null` if the binding is not resolved or if the binding knows that there is no message
      * for any entry
      */
    def requestFilterForMessages(): js.Promise[typings.openui5.sapUiModelFilterMod.default | Null] = js.native
    def requestFilterForMessages(
      /**
      * A callback function to filter only relevant messages. The callback returns whether the given {@link sap.ui.core.message.Message }
      * is considered. If no callback function is given, all messages are considered.
      */
    fnFilter: js.Function1[/* p1 */ typings.openui5.sapUiCoreMessageMessageMod.default, Boolean]
    ): js.Promise[typings.openui5.sapUiModelFilterMod.default | Null] = js.native
    
    def sort(
      /**
      * The Sorter object or an array of sorters which defines the sort order
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): this.type = js.native
    /**
      * Sorts the list according to the sorter object.
      *
      * Instead of a single sorter also an array of sorters can be passed to the sort method. In this case they
      * are processed in the sequence in which they are contained in the array.
      *
      * Grouping: Sorting and grouping are closely related. In case a list should be grouped, it must be sorted
      * by the property to group with. Grouping is enabled by setting the `group` property on the sorter object.
      * If it is enabled, you can get the current group of an item using {@link sap.ui.model.ListBinding.prototype.getGroup}.
      * In case multiple sorters are provided, grouping can only be done on the first sorter, nested grouping
      * is not supported.
      *
      * @returns Returns `this` to facilitate method chaining
      */
    def sort(
      /**
      * The Sorter object or an array of sorters which defines the sort order
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ): this.type = js.native
  }
  
  trait ListBinding$FilterEventParameters extends StObject
  
  trait ListBinding$SortEventParameters extends StObject
  
  type ListBindingFilterEvent = typings.openui5.sapUiBaseEventMod.default[ListBinding$FilterEventParameters]
  
  type ListBindingFilterEventParameters = ListBinding$FilterEventParameters
  
  type ListBindingSortEvent = typings.openui5.sapUiBaseEventMod.default[ListBinding$SortEventParameters]
  
  type ListBindingSortEventParameters = ListBinding$SortEventParameters
}
