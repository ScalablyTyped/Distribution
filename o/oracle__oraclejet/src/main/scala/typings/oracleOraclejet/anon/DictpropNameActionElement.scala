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
trait DictpropNameActionElement
  extends /* key */ StringDictionary[js.Any] {
  
  var action: add | remove | update = js.native
  
  var element: typings.std.Element = js.native
}
object DictpropNameActionElement {
  
  @scala.inline
  def apply(action: add | remove | update, element: typings.std.Element): DictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameActionElement]
  }
  
  @scala.inline
  implicit class DictpropNameActionElementMutableBuilder[Self <: DictpropNameActionElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: add | remove | update): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
