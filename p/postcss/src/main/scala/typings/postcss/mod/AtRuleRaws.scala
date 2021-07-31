package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtRuleRaws
  extends StObject
     with NodeRaws {
  
  var params: js.UndefOr[String] = js.undefined
}
object AtRuleRaws {
  
  @scala.inline
  def apply(): AtRuleRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtRuleRaws]
  }
  
  @scala.inline
  implicit class AtRuleRawsMutableBuilder[Self <: AtRuleRaws] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
