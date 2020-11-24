package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class DictpropNameOps[Self <: DictpropName] (val x: Self) extends AnyVal {
    
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
    def setFromCollapsible(value: typings.std.Element): Self = this.set("fromCollapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCollapsible(value: typings.std.Element): Self = this.set("toCollapsible", value.asInstanceOf[js.Any])
  }
}
