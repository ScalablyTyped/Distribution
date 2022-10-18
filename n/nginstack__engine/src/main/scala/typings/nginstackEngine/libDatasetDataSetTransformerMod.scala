package typings.nginstackEngine

import typings.nginstackEngine.anon.DefaultDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetDataSetTransformerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetTransformer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSetTransformer
  @JSImport("@nginstack/engine/lib/dataset/DataSetTransformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetTransformer", "DistinctController")
  @js.native
  /* private */ open class DistinctController () extends StObject {
    
    /* private */ var addRecord: Any = js.native
    
    /* private */ var isDistinct: Any = js.native
  }
  object DistinctController {
    
    @JSImport("@nginstack/engine/lib/dataset/DataSetTransformer", "DistinctController")
    @js.native
    def apply(ds: typings.nginstackEngine.libDatasetDataSetMod.^, groupColumns: js.Array[Any]): Unit = js.native
  }
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetTransformer", "PIVOT_NULL_VALUE_LABEL")
  @js.native
  def PIVOT_NULL_VALUE_LABEL: String = js.native
  inline def PIVOT_NULL_VALUE_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PIVOT_NULL_VALUE_LABEL")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetTransformer", "PIVOT_TOTAL_LABEL")
  @js.native
  def PIVOT_TOTAL_LABEL: String = js.native
  inline def PIVOT_TOTAL_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PIVOT_TOTAL_LABEL")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DataSetTransformer extends StObject {
    
    def aggregate(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      groupColumns: js.Array[Any],
      aggregateColumns: Any
    ): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def calculate(ds: typings.nginstackEngine.libDatasetDataSetMod.^, exprs: js.Array[Any]): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def calculate(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      exprs: js.Array[Any],
      hiddenFields: js.Array[Any]
    ): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def pivot(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      pivotFieldName: String,
      totalFieldsNames: String
    ): PivotResult = js.native
    def pivot(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      pivotFieldName: String,
      totalFieldsNames: String,
      options: DefaultDate
    ): PivotResult = js.native
    def pivot(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      pivotFieldName: String,
      totalFieldsNames: js.Array[Any]
    ): PivotResult = js.native
    def pivot(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      pivotFieldName: String,
      totalFieldsNames: js.Array[Any],
      options: DefaultDate
    ): PivotResult = js.native
  }
  
  trait PivotResult extends StObject {
    
    var dynamicFieldsNames: js.Array[String]
    
    var groupFieldsNames: js.Array[String]
    
    var pivotDS: typings.nginstackEngine.libDatasetDataSetMod.^
    
    var pivotFieldName: String
    
    var totalFieldsNames: js.Array[String]
  }
  object PivotResult {
    
    inline def apply(
      dynamicFieldsNames: js.Array[String],
      groupFieldsNames: js.Array[String],
      pivotDS: typings.nginstackEngine.libDatasetDataSetMod.^,
      pivotFieldName: String,
      totalFieldsNames: js.Array[String]
    ): PivotResult = {
      val __obj = js.Dynamic.literal(dynamicFieldsNames = dynamicFieldsNames.asInstanceOf[js.Any], groupFieldsNames = groupFieldsNames.asInstanceOf[js.Any], pivotDS = pivotDS.asInstanceOf[js.Any], pivotFieldName = pivotFieldName.asInstanceOf[js.Any], totalFieldsNames = totalFieldsNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[PivotResult]
    }
    
    extension [Self <: PivotResult](x: Self) {
      
      inline def setDynamicFieldsNames(value: js.Array[String]): Self = StObject.set(x, "dynamicFieldsNames", value.asInstanceOf[js.Any])
      
      inline def setDynamicFieldsNamesVarargs(value: String*): Self = StObject.set(x, "dynamicFieldsNames", js.Array(value*))
      
      inline def setGroupFieldsNames(value: js.Array[String]): Self = StObject.set(x, "groupFieldsNames", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldsNamesVarargs(value: String*): Self = StObject.set(x, "groupFieldsNames", js.Array(value*))
      
      inline def setPivotDS(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "pivotDS", value.asInstanceOf[js.Any])
      
      inline def setPivotFieldName(value: String): Self = StObject.set(x, "pivotFieldName", value.asInstanceOf[js.Any])
      
      inline def setTotalFieldsNames(value: js.Array[String]): Self = StObject.set(x, "totalFieldsNames", value.asInstanceOf[js.Any])
      
      inline def setTotalFieldsNamesVarargs(value: String*): Self = StObject.set(x, "totalFieldsNames", js.Array(value*))
    }
  }
}
