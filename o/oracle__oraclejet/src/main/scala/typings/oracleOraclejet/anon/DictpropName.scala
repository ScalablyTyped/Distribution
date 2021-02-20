package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropName
  extends /* key */ StringDictionary[js.Any] {
  
  var fromCollapsible: typings.std.Element = js.native
  
  var toCollapsible: typings.std.Element = js.native
}
object DictpropName {
  
  @scala.inline
  def apply(fromCollapsible: typings.std.Element, toCollapsible: typings.std.Element): DictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropName]
  }
  
  @scala.inline
  implicit class DictpropNameMutableBuilder[Self <: DictpropName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromCollapsible(value: typings.std.Element): Self = StObject.set(x, "fromCollapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCollapsible(value: typings.std.Element): Self = StObject.set(x, "toCollapsible", value.asInstanceOf[js.Any])
  }
}
