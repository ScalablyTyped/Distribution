package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View
  extends /* key */ StringDictionary[js.Any] {
  
  var view: js.Array[Node] = js.native
  
  var viewModel: js.Object = js.native
}
object View {
  
  @scala.inline
  def apply(view: js.Array[Node], viewModel: js.Object): View = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    
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
    def setViewVarargs(value: Node*): Self = this.set("view", js.Array(value :_*))
    
    @scala.inline
    def setView(value: js.Array[Node]): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: js.Object): Self = this.set("viewModel", value.asInstanceOf[js.Any])
  }
}
