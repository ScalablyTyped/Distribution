package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceColumnMod {
  
  inline def apply(name: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSourceColumn {
    def this(name: String, `type`: String) = this()
    
    /* CompleteClass */
    var aggregate: String = js.native
    
    /* CompleteClass */
    var alias: String = js.native
    
    /* CompleteClass */
    var canonicalName: String = js.native
    
    /* private */ /* CompleteClass */
    var canonicalName_ : Any = js.native
    
    /* CompleteClass */
    var coalesceValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var dimensionDataSize_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var dimensionDataType_ : Any = js.native
    
    /* CompleteClass */
    var distinct: Boolean = js.native
    
    /* CompleteClass */
    var fieldName: String = js.native
    
    /* private */ /* CompleteClass */
    var fieldName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var format: Any = js.native
    
    /* CompleteClass */
    override def formatDimension(value: Any): String = js.native
    
    /* private */ /* CompleteClass */
    var format_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getBackDepth: Any = js.native
    
    /* private */ /* CompleteClass */
    var getDepth: Any = js.native
    
    /* CompleteClass */
    override def getDimensionDataSize(): String = js.native
    
    /* CompleteClass */
    override def getDimensionDataType(): String = js.native
    
    /* CompleteClass */
    override def getLevel(): String = js.native
    
    /* private */ /* CompleteClass */
    var getSource_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var level_ : Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var notifyNameChange_ : Any = js.native
    
    /* CompleteClass */
    override def onBeforeAliasChange(arg0: DataSourceColumn, arg1: String): Any = js.native
    
    /* CompleteClass */
    var pathDepth: Double | Null = js.native
    
    /* CompleteClass */
    var pathHeight: Double | Null = js.native
    
    /* CompleteClass */
    var pathRoot: Double | Null = js.native
    
    /* CompleteClass */
    var pivot: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var prefix_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var propertiesToAssign_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var setBackDepth: Any = js.native
    
    /* private */ /* CompleteClass */
    var setDepth: Any = js.native
    
    /* CompleteClass */
    var showGlobalActions: Boolean = js.native
    
    /* CompleteClass */
    var sort: String = js.native
    
    /* CompleteClass */
    override def suggestAlias(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var updateCanonicalName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updateDimensionDataType_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updateFieldName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updateLevel_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updatePrefix_ : Any = js.native
    
    /* CompleteClass */
    var weight: String | Null = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "AGGREGATE_AVG")
  @js.native
  val AGGREGATE_AVG: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "AGGREGATE_COUNT")
  @js.native
  val AGGREGATE_COUNT: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "AGGREGATE_MAX")
  @js.native
  val AGGREGATE_MAX: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "AGGREGATE_MIN")
  @js.native
  val AGGREGATE_MIN: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "AGGREGATE_NONE")
  @js.native
  val AGGREGATE_NONE: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "AGGREGATE_SUM")
  @js.native
  val AGGREGATE_SUM: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "DIMENSION_SEP")
  @js.native
  val DIMENSION_SEP: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "SORT_ASC")
  @js.native
  val SORT_ASC: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "SORT_DESC")
  @js.native
  val SORT_DESC: String = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumn", "SORT_NONE")
  @js.native
  val SORT_NONE: String = js.native
  
  inline def colNameFromField(fld: Any, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colNameFromField")(fld.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromField(fld: Any, prefix: String): DataSourceColumn = (^.asInstanceOf[js.Dynamic].applyDynamic("fromField")(fld.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[DataSourceColumn]
  
  inline def getRootFromLeafNode(leafNode: Double, opt_suggestedRoot: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRootFromLeafNode")(leafNode.asInstanceOf[js.Any], opt_suggestedRoot.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait DataSourceColumn extends StObject {
    
    var aggregate: String
    
    var alias: String
    
    var canonicalName: String
    
    /* private */ var canonicalName_ : Any
    
    var coalesceValue: Any
    
    /* private */ var dimensionDataSize_ : Any
    
    /* private */ var dimensionDataType_ : Any
    
    var distinct: Boolean
    
    var fieldName: String
    
    /* private */ var fieldName_ : Any
    
    /* private */ var format: Any
    
    def formatDimension(value: Any): String
    
    /* private */ var format_ : Any
    
    /* private */ var getBackDepth: Any
    
    /* private */ var getDepth: Any
    
    def getDimensionDataSize(): String
    
    def getDimensionDataType(): String
    
    def getLevel(): String
    
    /* private */ var getSource_ : Any
    
    /* private */ var level_ : Any
    
    var name: String
    
    /* private */ var notifyNameChange_ : Any
    
    def onBeforeAliasChange(arg0: DataSourceColumn, arg1: String): Any
    
    var pathDepth: Double | Null
    
    var pathHeight: Double | Null
    
    var pathRoot: Double | Null
    
    var pivot: Boolean
    
    /* private */ var prefix_ : Any
    
    /* private */ var propertiesToAssign_ : Any
    
    /* private */ var setBackDepth: Any
    
    /* private */ var setDepth: Any
    
    var showGlobalActions: Boolean
    
    var sort: String
    
    def suggestAlias(): Unit
    
    /* private */ var updateCanonicalName_ : Any
    
    /* private */ var updateDimensionDataType_ : Any
    
    /* private */ var updateFieldName_ : Any
    
    /* private */ var updateLevel_ : Any
    
    /* private */ var updatePrefix_ : Any
    
    var weight: String | Null
  }
  object DataSourceColumn {
    
    inline def apply(
      aggregate: String,
      alias: String,
      canonicalName: String,
      canonicalName_ : Any,
      coalesceValue: Any,
      dimensionDataSize_ : Any,
      dimensionDataType_ : Any,
      distinct: Boolean,
      fieldName: String,
      fieldName_ : Any,
      format: Any,
      formatDimension: Any => String,
      format_ : Any,
      getBackDepth: Any,
      getDepth: Any,
      getDimensionDataSize: () => String,
      getDimensionDataType: () => String,
      getLevel: () => String,
      getSource_ : Any,
      level_ : Any,
      name: String,
      notifyNameChange_ : Any,
      onBeforeAliasChange: (DataSourceColumn, String) => Any,
      pivot: Boolean,
      prefix_ : Any,
      propertiesToAssign_ : Any,
      setBackDepth: Any,
      setDepth: Any,
      showGlobalActions: Boolean,
      sort: String,
      suggestAlias: () => Unit,
      updateCanonicalName_ : Any,
      updateDimensionDataType_ : Any,
      updateFieldName_ : Any,
      updateLevel_ : Any,
      updatePrefix_ : Any
    ): DataSourceColumn = {
      val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], canonicalName = canonicalName.asInstanceOf[js.Any], canonicalName_ = canonicalName_.asInstanceOf[js.Any], coalesceValue = coalesceValue.asInstanceOf[js.Any], dimensionDataSize_ = dimensionDataSize_.asInstanceOf[js.Any], dimensionDataType_ = dimensionDataType_.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldName_ = fieldName_.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatDimension = js.Any.fromFunction1(formatDimension), format_ = format_.asInstanceOf[js.Any], getBackDepth = getBackDepth.asInstanceOf[js.Any], getDepth = getDepth.asInstanceOf[js.Any], getDimensionDataSize = js.Any.fromFunction0(getDimensionDataSize), getDimensionDataType = js.Any.fromFunction0(getDimensionDataType), getLevel = js.Any.fromFunction0(getLevel), getSource_ = getSource_.asInstanceOf[js.Any], level_ = level_.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifyNameChange_ = notifyNameChange_.asInstanceOf[js.Any], onBeforeAliasChange = js.Any.fromFunction2(onBeforeAliasChange), pivot = pivot.asInstanceOf[js.Any], prefix_ = prefix_.asInstanceOf[js.Any], propertiesToAssign_ = propertiesToAssign_.asInstanceOf[js.Any], setBackDepth = setBackDepth.asInstanceOf[js.Any], setDepth = setDepth.asInstanceOf[js.Any], showGlobalActions = showGlobalActions.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], suggestAlias = js.Any.fromFunction0(suggestAlias), updateCanonicalName_ = updateCanonicalName_.asInstanceOf[js.Any], updateDimensionDataType_ = updateDimensionDataType_.asInstanceOf[js.Any], updateFieldName_ = updateFieldName_.asInstanceOf[js.Any], updateLevel_ = updateLevel_.asInstanceOf[js.Any], updatePrefix_ = updatePrefix_.asInstanceOf[js.Any], pathDepth = null, pathHeight = null, pathRoot = null, weight = null)
      __obj.asInstanceOf[DataSourceColumn]
    }
    
    extension [Self <: DataSourceColumn](x: Self) {
      
      inline def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
      
      inline def setCanonicalName_(value: Any): Self = StObject.set(x, "canonicalName_", value.asInstanceOf[js.Any])
      
      inline def setCoalesceValue(value: Any): Self = StObject.set(x, "coalesceValue", value.asInstanceOf[js.Any])
      
      inline def setDimensionDataSize_(value: Any): Self = StObject.set(x, "dimensionDataSize_", value.asInstanceOf[js.Any])
      
      inline def setDimensionDataType_(value: Any): Self = StObject.set(x, "dimensionDataType_", value.asInstanceOf[js.Any])
      
      inline def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldName_(value: Any): Self = StObject.set(x, "fieldName_", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatDimension(value: Any => String): Self = StObject.set(x, "formatDimension", js.Any.fromFunction1(value))
      
      inline def setFormat_(value: Any): Self = StObject.set(x, "format_", value.asInstanceOf[js.Any])
      
      inline def setGetBackDepth(value: Any): Self = StObject.set(x, "getBackDepth", value.asInstanceOf[js.Any])
      
      inline def setGetDepth(value: Any): Self = StObject.set(x, "getDepth", value.asInstanceOf[js.Any])
      
      inline def setGetDimensionDataSize(value: () => String): Self = StObject.set(x, "getDimensionDataSize", js.Any.fromFunction0(value))
      
      inline def setGetDimensionDataType(value: () => String): Self = StObject.set(x, "getDimensionDataType", js.Any.fromFunction0(value))
      
      inline def setGetLevel(value: () => String): Self = StObject.set(x, "getLevel", js.Any.fromFunction0(value))
      
      inline def setGetSource_(value: Any): Self = StObject.set(x, "getSource_", value.asInstanceOf[js.Any])
      
      inline def setLevel_(value: Any): Self = StObject.set(x, "level_", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotifyNameChange_(value: Any): Self = StObject.set(x, "notifyNameChange_", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeAliasChange(value: (DataSourceColumn, String) => Any): Self = StObject.set(x, "onBeforeAliasChange", js.Any.fromFunction2(value))
      
      inline def setPathDepth(value: Double): Self = StObject.set(x, "pathDepth", value.asInstanceOf[js.Any])
      
      inline def setPathDepthNull: Self = StObject.set(x, "pathDepth", null)
      
      inline def setPathHeight(value: Double): Self = StObject.set(x, "pathHeight", value.asInstanceOf[js.Any])
      
      inline def setPathHeightNull: Self = StObject.set(x, "pathHeight", null)
      
      inline def setPathRoot(value: Double): Self = StObject.set(x, "pathRoot", value.asInstanceOf[js.Any])
      
      inline def setPathRootNull: Self = StObject.set(x, "pathRoot", null)
      
      inline def setPivot(value: Boolean): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      inline def setPrefix_(value: Any): Self = StObject.set(x, "prefix_", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToAssign_(value: Any): Self = StObject.set(x, "propertiesToAssign_", value.asInstanceOf[js.Any])
      
      inline def setSetBackDepth(value: Any): Self = StObject.set(x, "setBackDepth", value.asInstanceOf[js.Any])
      
      inline def setSetDepth(value: Any): Self = StObject.set(x, "setDepth", value.asInstanceOf[js.Any])
      
      inline def setShowGlobalActions(value: Boolean): Self = StObject.set(x, "showGlobalActions", value.asInstanceOf[js.Any])
      
      inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSuggestAlias(value: () => Unit): Self = StObject.set(x, "suggestAlias", js.Any.fromFunction0(value))
      
      inline def setUpdateCanonicalName_(value: Any): Self = StObject.set(x, "updateCanonicalName_", value.asInstanceOf[js.Any])
      
      inline def setUpdateDimensionDataType_(value: Any): Self = StObject.set(x, "updateDimensionDataType_", value.asInstanceOf[js.Any])
      
      inline def setUpdateFieldName_(value: Any): Self = StObject.set(x, "updateFieldName_", value.asInstanceOf[js.Any])
      
      inline def setUpdateLevel_(value: Any): Self = StObject.set(x, "updateLevel_", value.asInstanceOf[js.Any])
      
      inline def setUpdatePrefix_(value: Any): Self = StObject.set(x, "updatePrefix_", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightNull: Self = StObject.set(x, "weight", null)
    }
  }
}
