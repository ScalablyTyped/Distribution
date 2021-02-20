package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterCapability extends StObject {
  
  var operators: js.Array[String] = js.native
}
object FilterCapability {
  
  @scala.inline
  def apply(operators: js.Array[String]): FilterCapability = {
    val __obj = js.Dynamic.literal(operators = operators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCapability]
  }
  
  @scala.inline
  implicit class FilterCapabilityMutableBuilder[Self <: FilterCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperators(value: js.Array[String]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsVarargs(value: String*): Self = StObject.set(x, "operators", js.Array(value :_*))
  }
}
