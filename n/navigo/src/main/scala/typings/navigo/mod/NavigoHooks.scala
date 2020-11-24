package typings.navigo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigoHooks extends js.Object {
  
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
  
  var already: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
  
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
      /* params */ js.UndefOr[Params], 
      Unit
    ]
  ] = js.native
  
  var leave: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
}
object NavigoHooks {
  
  @scala.inline
  def apply(): NavigoHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigoHooks]
  }
  
  @scala.inline
  implicit class NavigoHooksOps[Self <: NavigoHooks] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: /* params */ js.UndefOr[Params] => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAlready(value: /* params */ js.UndefOr[Params] => Unit): Self = this.set("already", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAlready: Self = this.set("already", js.undefined)
    
    @scala.inline
    def setBefore(
      value: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Unit
    ): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setLeave(value: /* params */ js.UndefOr[Params] => Unit): Self = this.set("leave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
}
