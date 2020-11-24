package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class FromStepOps[Self <: FromStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromStep(value: String): Self = this.set("fromStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStep(value: String): Self = this.set("toStep", value.asInstanceOf[js.Any])
  }
}
