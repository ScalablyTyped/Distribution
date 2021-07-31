package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTargetingDimension extends StObject {
  
  /** How the items in this list should be targeted. */
  var targetingMode: js.UndefOr[String] = js.undefined
  
  /** The values specified. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object StringTargetingDimension {
  
  @scala.inline
  def apply(): StringTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringTargetingDimension]
  }
  
  @scala.inline
  implicit class StringTargetingDimensionMutableBuilder[Self <: StringTargetingDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
