package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlankScreen extends StObject {
  
  /** The screen id of the element */
  var screenId: js.UndefOr[String] = js.undefined
}
object BlankScreen {
  
  inline def apply(): BlankScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlankScreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlankScreen] (val x: Self) extends AnyVal {
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
  }
}
