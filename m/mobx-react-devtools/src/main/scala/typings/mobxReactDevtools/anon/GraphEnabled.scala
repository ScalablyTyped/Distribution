package typings.mobxReactDevtools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphEnabled extends js.Object {
  
  var graphEnabled: js.UndefOr[Boolean] = js.native
  
  var logEnabled: js.UndefOr[Boolean] = js.native
  
  var logFilter: js.UndefOr[js.Function1[/* p */ js.Any, Boolean]] = js.native
  
  var updatesEnabled: js.UndefOr[Boolean] = js.native
}
object GraphEnabled {
  
  @scala.inline
  def apply(): GraphEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphEnabled]
  }
  
  @scala.inline
  implicit class GraphEnabledOps[Self <: GraphEnabled] (val x: Self) extends AnyVal {
    
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
    def setGraphEnabled(value: Boolean): Self = this.set("graphEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphEnabled: Self = this.set("graphEnabled", js.undefined)
    
    @scala.inline
    def setLogEnabled(value: Boolean): Self = this.set("logEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogEnabled: Self = this.set("logEnabled", js.undefined)
    
    @scala.inline
    def setLogFilter(value: /* p */ js.Any => Boolean): Self = this.set("logFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogFilter: Self = this.set("logFilter", js.undefined)
    
    @scala.inline
    def setUpdatesEnabled(value: Boolean): Self = this.set("updatesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatesEnabled: Self = this.set("updatesEnabled", js.undefined)
  }
}
