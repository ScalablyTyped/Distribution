package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlankScreen extends StObject {
  
  /** The screen id of the element */
  var screenId: js.UndefOr[String] = js.native
}
object BlankScreen {
  
  @scala.inline
  def apply(): BlankScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlankScreen]
  }
  
  @scala.inline
  implicit class BlankScreenMutableBuilder[Self <: BlankScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
  }
}
