package typings.navigo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericHooks extends js.Object {
  
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
  
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
      /* params */ js.UndefOr[Params], 
      Unit
    ]
  ] = js.native
}
object GenericHooks {
  
  @scala.inline
  def apply(): GenericHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericHooks]
  }
  
  @scala.inline
  implicit class GenericHooksOps[Self <: GenericHooks] (val x: Self) extends AnyVal {
    
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
    def setBefore(
      value: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Unit
    ): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
