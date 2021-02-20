package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromStep
  extends /* key */ StringDictionary[js.Any] {
  
  var fromStep: String = js.native
  
  var toStep: String = js.native
}
object FromStep {
  
  @scala.inline
  def apply(fromStep: String, toStep: String): FromStep = {
    val __obj = js.Dynamic.literal(fromStep = fromStep.asInstanceOf[js.Any], toStep = toStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromStep]
  }
  
  @scala.inline
  implicit class FromStepMutableBuilder[Self <: FromStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromStep(value: String): Self = StObject.set(x, "fromStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStep(value: String): Self = StObject.set(x, "toStep", value.asInstanceOf[js.Any])
  }
}
