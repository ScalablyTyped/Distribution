package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldAggregatorMod {
  
  inline def apply(fieldName: Any, dataSet: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(fieldName.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/field-aggregator/FieldAggregator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldAggregator {
    def this(fieldName: Any, dataSet: Any) = this()
  }
  @JSImport("@nginstack/web-framework/lib/field-aggregator/FieldAggregator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FieldAggregator extends StObject {
    
    def assign(obj: FieldAggregator): Unit = js.native
    
    /* private */ var checkDataSetFilters: Any = js.native
    
    def checkRecNo(recNo: Double): Unit = js.native
    
    var dataSet: typings.nginstackEngine.dataSetMod.^ = js.native
    
    var decimalPrecision: Double | Null = js.native
    
    var description: String = js.native
    
    var fValue: Double = js.native
    
    var fieldName: Any = js.native
    
    def formatValue(value: js.Date): String = js.native
    def formatValue(value: Double): String = js.native
    
    /* private */ var getFormatedValue: Any = js.native
    
    /* private */ var lastDataSetVersion: Any = js.native
    
    /* private */ var lastRangeValues: Any = js.native
    
    /* private */ var lastSentValue: Any = js.native
    
    var lastValue: Double = js.native
    
    var originalDataSet: Any = js.native
    
    def previewValue(recNo: Any, newValue: Any): Unit = js.native
    
    var readOnly: Boolean = js.native
    
    /* private */ var readOnlyModified: Any = js.native
    
    def reset(): Unit = js.native
    
    var supportsCalculatedFields: Boolean = js.native
    
    var value: Double = js.native
  }
}
