package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanCondition extends StObject {
  
  /** The type of condition. */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The values of the condition. The number of supported values depends on the condition type. Some support zero values, others one or two values, and ConditionType.ONE_OF_LIST supports
    * an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[ConditionValue]] = js.native
}
object BooleanCondition {
  
  @scala.inline
  def apply(): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanCondition]
  }
  
  @scala.inline
  implicit class BooleanConditionMutableBuilder[Self <: BooleanCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[ConditionValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ConditionValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
