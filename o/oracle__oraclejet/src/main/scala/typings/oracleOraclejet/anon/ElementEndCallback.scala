package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.add
import typings.oracleOraclejet.oracleOraclejetStrings.remove
import typings.oracleOraclejet.oracleOraclejetStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementEndCallback
  extends /* key */ StringDictionary[js.Any] {
  
  var action: add | remove | update = js.native
  
  var element: typings.std.Element = js.native
  
  def endCallback(): Unit = js.native
}
object ElementEndCallback {
  
  @scala.inline
  def apply(action: add | remove | update, element: typings.std.Element, endCallback: () => Unit): ElementEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    __obj.asInstanceOf[ElementEndCallback]
  }
  
  @scala.inline
  implicit class ElementEndCallbackMutableBuilder[Self <: ElementEndCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: add | remove | update): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: () => Unit): Self = StObject.set(x, "endCallback", js.Any.fromFunction0(value))
  }
}
