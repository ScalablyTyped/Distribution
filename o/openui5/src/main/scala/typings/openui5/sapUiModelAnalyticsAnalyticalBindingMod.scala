package typings.openui5

import typings.openui5.anon.AutoExpandMode
import typings.openui5.anon.Length
import typings.openui5.anon.NumberOfExpandedLevels
import typings.openui5.anon.`40`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelAnalyticsOdata4analyticsMod.QueryResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelAnalyticsAnalyticalBindingMod {
  
  @JSImport("sap/ui/model/analytics/AnalyticalBinding", JSImport.Default)
  @js.native
  open class default protected () extends AnalyticalBinding {
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      */
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any]
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any]
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any],
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any]
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: Unit,
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any]
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any],
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any]
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: Unit,
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any]
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any],
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any],
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any],
      /**
      * An array of predefined filters
      */
    aFilters: Unit,
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: Unit,
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any],
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: js.Object,
      /**
      * An array of predefined sorters
      */
    aSorter: Unit,
      /**
      * An array of predefined filters
      */
    aFilters: Unit,
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any],
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any],
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: js.Array[Any],
      /**
      * An array of predefined filters
      */
    aFilters: Unit,
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: Unit,
      /**
      * An array of predefined filters
      */
    aFilters: js.Array[Any],
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
    def this(
      /**
      * The OData model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this data binding
      */
    oContext: Unit,
      /**
      * An array of predefined sorters
      */
    aSorter: Unit,
      /**
      * An array of predefined filters
      */
    aFilters: Unit,
      /**
      * A map containing additional binding parameters
      */
    mParameters: AutoExpandMode
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/analytics/AnalyticalBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a new subclass of class sap.ui.model.analytics.AnalyticalBinding with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, AnalyticalBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AnalyticalBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns a metadata object for class sap.ui.model.analytics.AnalyticalBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait AnalyticalBinding
    extends typings.openui5.sapUiModelTreeBindingMod.default {
    
    /**
      * Sets filters for matching only a subset of the entities in the bound OData entity set.
      *
      * Invoking this function resets the state of the binding. Subsequent data requests such as calls to getNodeContexts()
      * will need to trigger OData requests in order to fetch the data that are in line with these filters.
      *
      * @returns returns `this` to facilitate method chaining
      */
    def filter(
      /**
      * an Array of sap.ui.model.Filter objects or a single Filter instance.
      */
    aFilter: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): this.type = js.native
    def filter(
      /**
      * an Array of sap.ui.model.Filter objects or a single Filter instance.
      */
    aFilter: typings.openui5.sapUiModelFilterMod.default
    ): this.type = js.native
    
    /**
      * Gets the analytical information for a column with a given name.
      *
      * @returns analytical information for the column; see {@link #updateAnalyticalInfo} for an explanation
      * of the object structure
      */
    def getAnalyticalInfoForColumn(/**
      * the column name.
      */
    sColumnName: String): js.Object = js.native
    
    /**
      * Gets analytical metadata for the bound OData entity set.
      *
      * @returns analytical metadata for the bound OData entity set
      */
    def getAnalyticalQueryResult(): QueryResult = js.native
    
    /**
      * Gets details about the dimension properties included in the bound OData entity set.
      *
      * @returns details for every dimension property addressed by its name. The details object provides these
      * properties: name of the dimension, keyPropertyName for the name of the property holding the dimension
      * key, textPropertyName for the name of the property holding the text for the dimension, aAttributeName
      * listing all properties holding dimension attributes, grouped as indicator whether or not this dimension
      * is currently grouped, and analyticalInfo, which contains the binding information for this dimension passed
      * from the AnalyticalBinding's consumer via call to function updateAnalyticalInfo.
      */
    def getDimensionDetails(): js.Object = js.native
    
    /**
      * @SINCE 1.24
      *
      * Get a download URL with the specified format considering the sort/filter/custom parameters.
      *
      * The download URL also takes into account the selected dimensions and measures, depending on the given
      * column definitions of the AnalyticalTable. This is based on the visible/inResult flags of the columns,
      * as well as integrity dependencies, e.g. for mandatory Unit properties.
      *
      * @returns URL which can be used for downloading
      */
    def getDownloadUrl(/**
      * Value for the $format Parameter
      */
    sFormat: String): String = js.native
    
    /**
      * Gets the names of the filterable properties in the bound OData entity set.
      *
      * @returns names of properties that can be filtered.
      */
    def getFilterablePropertyNames(): js.Array[Any] = js.native
    
    /**
      * Gets a printable name for a group.
      *
      * The printable name follows the pattern is `<label>:<key-value>[-<text-value>]`, where
      * `label` is the label of the dimension property used at the aggregation level for the group, `key-value`
      * is the key value of that dimension for the group, and `text-value` is the value of the associated text
      * property, if it is also used in the binding.
      *
      * Whenever a formatter function has been defined for a column displaying the key or text of this dimension,
      * the return value of this function is applied for the group name instead of the respective key or text
      * value.
      *
      * @returns a printable name for the group.
      */
    def getGroupName(
      /**
      * the parent context identifying the requested group.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * the level number of oContext (because the context might occur at multiple levels)
      */
    iLevel: int
    ): String = js.native
    
    /**
      * Gets the total number of contexts contained in a group, if known.
      *
      * For a given group, be aware that the group size might vary over time. In principle, this can happen if
      * the bound set of OData entities includes measure properties with amount or quantity values. The AnalyticalBinding
      * recognizes situations where the OData service returns multiple entries for a single group entry due to
      * the fact that a measure property cannot be aggregated properly, because an amount exists in multiple
      * currencies or a quantity exists in multiple units. In such situations, the AnalyticalBinding substitutes
      * these entries by a single representative, and the group size gets reduced by the count of duplicate entries.
      * Finally, since the Binding does not always fetch all children of a group at once, but only a page with
      * a certain range, such size changes might happen after every page access.
      *
      * @returns The currently known group size, or -1, if not yet determined
      */
    def getGroupSize(
      /**
      * the parent context identifying the requested group of child contexts.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * the level number of oContext (because the context might occur at multiple levels)
      */
    iLevel: int
    ): int = js.native
    
    /**
      * Gets details about the measure properties included in the bound OData entity set.
      *
      * @returns details for every measure property addressed by its name. The details object provides these
      * properties: name of the measure, rawValuePropertyName for the name of the property holding the raw value,
      * unitPropertyName for the name of the property holding the related value unit or currency, if any, and
      * analyticalInfo, which contains the binding information for this measure passed from the AnalyticalBinding's
      * consumer via call to function updateAnalyticalInfo.
      */
    def getMeasureDetails(): js.Object = js.native
    
    /**
      * Gets child contexts for a specified parent context.
      *
      * Contexts are returned in a stable order imposed by the dimension property that defines this aggregation
      * level beneath the parent context: Either a sort order has been specified for this property, or the entries
      * are returned in ascending order of the values of this dimension property by default.
      *
      * If any of the requested data is missing, an OData request will be triggered to load it.
      *
      * @returns Array containing the requested contexts of class sap.ui.model.Context, limited by the number
      * of entries contained in the entity set at that aggregation level. The array will contain less than the
      * requested number of contexts, if some are not locally available and an OData request is pending to fetch
      * them. In this case, if the parameter numberOfExpandedLevels > 0, the array will be completely empty.
      */
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: Length,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: Unit,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: Unit,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: Unit,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getNodeContexts(
      /**
      * Parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Parameters, specifying the aggregation level for which contexts shall be fetched or (legacy signature
      * variant) index of first child entry to return from the parent context (zero-based)
      */
    mParameters: int,
      /**
      * Same meaning as `mParameters.length`, legacy signature variant only
      */
    iLength: int,
      /**
      * Same meaning as `mParameters.threshold`, legacy signature variant only
      */
    iThreshold: int,
      /**
      * Same meaning as `mParameters.level`, legacy signature variant only
      */
    iLevel: int,
      /**
      * Same meaning as `mParameters.numberOfExpandedLevels`, legacy signature variant only
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Gets the metadata of a property with a given name.
      *
      * @returns OData metadata of this property or null if it does not exist.
      */
    def getProperty(/**
      * The property name.
      */
    sPropertyName: String): js.Object = js.native
    
    /**
      * Gets the label of a property with a given name.
      *
      * @returns The heading maintained for this property or null if it does not exist.
      */
    def getPropertyHeading(/**
      * The property name.
      */
    sPropertyName: String): String = js.native
    
    /**
      * Gets the label of a property with a given name.
      *
      * @returns The label maintained for this property or null if it does not exist.
      */
    def getPropertyLabel(/**
      * The property name.
      */
    sPropertyName: String): String = js.native
    
    /**
      * Gets the quick info of a property with a given name.
      *
      * @returns The quick info maintained for this property or null if it does not exist.
      */
    def getPropertyQuickInfo(/**
      * The property name.
      */
    sPropertyName: String): String = js.native
    
    /**
      * Gets the context for the root aggregation level representing the grand total for all bound measure properties.
      *
      * The context is assigned to parent group ID `null`. If the binding is configured not to provide a grand
      * total, this context is empty. If data for this context is not locally available yet, an OData request
      * will be triggered to load it.
      *
      * This function must be called whenever the bound set of OData entities changes, e.g., by changing selected
      * dimensions, modifying filter conditions, etc.
      *
      * @returns Array with a single object of class sap.ui.model.Context for the root context, or an empty array
      * if an OData request is pending to fetch requested contexts that are not yet locally available.
      */
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: Unit,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: Unit,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: Unit,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: Unit,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: Unit,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: NumberOfExpandedLevels,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: Unit,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: Unit,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: Unit,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: Unit,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: Unit,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getRootContexts(
      /**
      * Parameter map specifying how the topmost aggregation level shall be fetched. If this parameter map is
      * set, the optional function parameters are ignored. Optionally, instead of a parameter map an integer
      * value can be set to define the parameter `startIndex` as described in this parameter list. In this case,
      * the function parameters `iLength`, `iNumberOfExpandedLevels` and `iThreshold` become mandatory.
      */
    mParameters: int,
      /**
      * See documentation of the `length` parameter in the parameter list of `mParameters`
      */
    iLength: int,
      /**
      * See documentation of the `numberOfExpandedLevels` parameter in the parameter list of `mParameters`
      */
    iNumberOfExpandedLevels: int,
      /**
      * See documentation of the `threshold` parameter in the parameter list of `mParameters`
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Gets the names of the sortable properties in the bound OData entity set.
      *
      * @returns names of properties that can be used for sorting the result entities.
      */
    def getSortablePropertyNames(): js.Array[Any] = js.native
    
    /**
      * @deprecated (since 1.92) - use {@link #getCount} instead
      *
      * Gets the total number of leaves or `-1` if this is unknown.
      *
      * @returns The total number of leaves, or `-1` if the number is not yet known or if the binding parameter
      * `provideTotalResultSize` is set to `false`
      */
    def getTotalSize(): Double = js.native
    
    /**
      * Determines if the binding has the entries of a given aggregation level locally available.
      *
      * If so, no further OData request is required to fetch any of them.
      *
      * @returns property of sap.ui.model.analytics.AnalyticalBinding.ContextsAvailabilityStatus, indicating
      * whether all, some, or none of the entries are locally available.
      */
    def hasAvailableNodeContexts(
      /**
      * the parent context identifying the aggregation level.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * the level number of oContext (because the context might occur at multiple levels).
      */
    iLevel: int
    ): Boolean = js.native
    
    /**
      * Determines if the contexts in a specified group have further children. If so, any of these group contexts
      * can be a parent context of a nested sub-group in a subsequent aggregation level.
      *
      * @returns `true` if any of the contexts in the specified group has further children
      */
    def hasChildren(
      /**
      * The parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Boolean = js.native
    def hasChildren(
      /**
      * The parent context identifying the requested group of child contexts
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The only supported parameter is `level` as the level number of oContext (because the context might occur
      * at multiple levels)
      */
    mParameters: `40`
    ): Boolean = js.native
    
    /**
      * Determines if any of the properties included in the bound OData entity set is a measure property.
      *
      * @returns true if and only one or more properties are measure properties.
      */
    def hasMeasures(): Boolean = js.native
    
    /**
      * Determines if a given name refers to a measure property
      *
      * @returns true if and only if the bound OData entity set includes a measure property with this name.
      */
    def isMeasure(/**
      * The property name.
      */
    sPropertyName: String): Boolean = js.native
    
    /**
      * Loads child contexts of multiple groups.
      */
    def loadGroups(
      /**
      * specifies index ranges of child contexts to be loaded for multiple groups identified by their ID. A group
      * index range is given by an object consisting of startIndex, length, threshold. For every group ID, the
      * map holds an array of such range objects.
      */
    mGroupIdRanges: Record[String, js.Array[Any]]
    ): Unit = js.native
    
    /**
      * Determines if the binding has been configured to provide a grand total for the selected measure properties.
      *
      * @returns true if and only if the binding provides a context for the grand totals of all selected measure
      * properties.
      */
    def providesGrandTotal(): Boolean = js.native
    
    /**
      * Sets sorters for retrieving the entities in the bound OData entity set in a specific order.
      *
      * Invoking this function resets the state of the binding. Subsequent data requests such as calls to getNodeContexts()
      * will need to trigger OData requests in order to fetch the data that are in line with these sorters.
      *
      * @returns returns `this` to facilitate method chaining.
      */
    def sort(
      /**
      * a sorter object or an array of sorter objects which define the sort order.
      */
    aSorter: typings.openui5.sapUiModelSorterMod.default
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Updates the binding's structure with new analytical information.
      *
      * Analytical information is the mapping of UI columns to properties in the bound OData entity set. Every
      * column object contains the `name` of the bound property and in addition:
      * 	 - A column bound to a dimension property has further boolean properties:
      * 	grouped: dimension is used for building groups
      * 	 - inResult: if the column is not visible, but declared to be part of the result, values for the related
      * 			property are also fetched from the OData service
      * 	 - visible: if the column is visible, values for the related property are fetched from the OData service
      *
      * 	 - A column bound to a measure property has further boolean properties:
      * 	inResult: if the column is not visible, but declared to be part of the result, values for the related
      * property are also fetched from the OData service
      * 	 - total: totals and sub-totals are provided for the measure at all aggregation levels
      * 	 - visible: if the column is visible, values for the related property are fetched from the OData service
      *
      * 	 - A column bound to a hierarchy property has further properties:
      * 	grouped: boolean value; indicates whether the hierarchy is used for building groups
      * 	 - level: integer value; the hierarchy level is mandatory for at least one of those columns that represent
      * 			the same hierarchy
      *
      * Invoking this function resets the state of the binding and subsequent data requests such as calls to
      * getNodeContexts() trigger OData requests in order to fetch the data that are in line with this analytical
      * information.
      *
      * Be aware that a call of this function might lead to additional back-end requests, as well as a control
      * re-rendering later on. Whenever possible use the API of the analytical control, instead of relying on
      * the binding.
      */
    def updateAnalyticalInfo(
      /**
      * An array with objects holding the analytical information for every column
      */
    aColumns: js.Array[js.Object],
      /**
      * Whether to fire a change event asynchronously even if columns didn't change
      */
    bForceChange: Boolean
    ): Unit = js.native
  }
}
