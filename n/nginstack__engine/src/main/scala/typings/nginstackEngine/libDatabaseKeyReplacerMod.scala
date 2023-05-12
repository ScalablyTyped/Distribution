package typings.nginstackEngine

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseKeyReplacerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/KeyReplacer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with KeyReplacer {
    
    /* private */ /* CompleteClass */
    var getFieldType_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getMemoStringReplaced_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getTableFieldName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var references: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def replaceKey(
      keyMatch: Double,
      keyChange: Double,
      tableName: String,
      ignoredTables: String,
      keysLimit: Double,
      createLog: Boolean
    ): Double = js.native
    
    /* CompleteClass */
    var segmentInDays: Double = js.native
    
    /* CompleteClass */
    var segmentMaxDate: js.Date = js.native
    
    /* CompleteClass */
    var segmentMinDate: js.Date = js.native
    
    /* private */ /* CompleteClass */
    var tableStructuresByName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updateTableByDateRange_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updateTableWithDateRange_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var updateTableWithoutDateRange_ : Any = js.native
    
    /* CompleteClass */
    var versions: js.Array[Double] = js.native
  }
  @JSImport("@nginstack/engine/lib/database/KeyReplacer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/database/KeyReplacer", "partitionDateFields_")
  @js.native
  val partitionDateFields: Record[String, String] = js.native
  
  inline def registerPartitionDateField(tableName: String, dateFieldName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPartitionDateField")(tableName.asInstanceOf[js.Any], dateFieldName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait KeyReplacer extends StObject {
    
    /* private */ var getFieldType_ : Any
    
    /* private */ var getMemoStringReplaced_ : Any
    
    /* private */ var getTableFieldName_ : Any
    
    /* private */ var logger_ : Any
    
    var references: typings.nginstackEngine.libDatasetDataSetMod.^
    
    def replaceKey(
      keyMatch: Double,
      keyChange: Double,
      tableName: String,
      ignoredTables: String,
      keysLimit: Double,
      createLog: Boolean
    ): Double
    
    var segmentInDays: Double
    
    var segmentMaxDate: js.Date
    
    var segmentMinDate: js.Date
    
    /* private */ var tableStructuresByName_ : Any
    
    /* private */ var updateTableByDateRange_ : Any
    
    /* private */ var updateTableWithDateRange_ : Any
    
    /* private */ var updateTableWithoutDateRange_ : Any
    
    var versions: js.Array[Double]
  }
  object KeyReplacer {
    
    inline def apply(
      getFieldType_ : Any,
      getMemoStringReplaced_ : Any,
      getTableFieldName_ : Any,
      logger_ : Any,
      references: typings.nginstackEngine.libDatasetDataSetMod.^,
      replaceKey: (Double, Double, String, String, Double, Boolean) => Double,
      segmentInDays: Double,
      segmentMaxDate: js.Date,
      segmentMinDate: js.Date,
      tableStructuresByName_ : Any,
      updateTableByDateRange_ : Any,
      updateTableWithDateRange_ : Any,
      updateTableWithoutDateRange_ : Any,
      versions: js.Array[Double]
    ): KeyReplacer = {
      val __obj = js.Dynamic.literal(getFieldType_ = getFieldType_.asInstanceOf[js.Any], getMemoStringReplaced_ = getMemoStringReplaced_.asInstanceOf[js.Any], getTableFieldName_ = getTableFieldName_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], replaceKey = js.Any.fromFunction6(replaceKey), segmentInDays = segmentInDays.asInstanceOf[js.Any], segmentMaxDate = segmentMaxDate.asInstanceOf[js.Any], segmentMinDate = segmentMinDate.asInstanceOf[js.Any], tableStructuresByName_ = tableStructuresByName_.asInstanceOf[js.Any], updateTableByDateRange_ = updateTableByDateRange_.asInstanceOf[js.Any], updateTableWithDateRange_ = updateTableWithDateRange_.asInstanceOf[js.Any], updateTableWithoutDateRange_ = updateTableWithoutDateRange_.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyReplacer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyReplacer] (val x: Self) extends AnyVal {
      
      inline def setGetFieldType_(value: Any): Self = StObject.set(x, "getFieldType_", value.asInstanceOf[js.Any])
      
      inline def setGetMemoStringReplaced_(value: Any): Self = StObject.set(x, "getMemoStringReplaced_", value.asInstanceOf[js.Any])
      
      inline def setGetTableFieldName_(value: Any): Self = StObject.set(x, "getTableFieldName_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReplaceKey(value: (Double, Double, String, String, Double, Boolean) => Double): Self = StObject.set(x, "replaceKey", js.Any.fromFunction6(value))
      
      inline def setSegmentInDays(value: Double): Self = StObject.set(x, "segmentInDays", value.asInstanceOf[js.Any])
      
      inline def setSegmentMaxDate(value: js.Date): Self = StObject.set(x, "segmentMaxDate", value.asInstanceOf[js.Any])
      
      inline def setSegmentMinDate(value: js.Date): Self = StObject.set(x, "segmentMinDate", value.asInstanceOf[js.Any])
      
      inline def setTableStructuresByName_(value: Any): Self = StObject.set(x, "tableStructuresByName_", value.asInstanceOf[js.Any])
      
      inline def setUpdateTableByDateRange_(value: Any): Self = StObject.set(x, "updateTableByDateRange_", value.asInstanceOf[js.Any])
      
      inline def setUpdateTableWithDateRange_(value: Any): Self = StObject.set(x, "updateTableWithDateRange_", value.asInstanceOf[js.Any])
      
      inline def setUpdateTableWithoutDateRange_(value: Any): Self = StObject.set(x, "updateTableWithoutDateRange_", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[Double]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: Double*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
}
