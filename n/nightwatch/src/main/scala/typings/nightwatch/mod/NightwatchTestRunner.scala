package typings.nightwatch.mod

import typings.nightwatch.anon.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestRunner extends StObject {
  
  var options: js.UndefOr[Ui] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object NightwatchTestRunner {
  
  @scala.inline
  def apply(): NightwatchTestRunner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestRunner]
  }
  
  @scala.inline
  implicit class NightwatchTestRunnerMutableBuilder[Self <: NightwatchTestRunner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Ui): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
