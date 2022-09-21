package typings.parameter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleCustom
  extends StObject
     with ParameterRuleBase
     with /* x */ StringDictionary[Any]
     with _ParameterRuleItem
object ParameterRuleCustom {
  
  inline def apply(`type`: String): ParameterRuleCustom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleCustom]
  }
}
