package typings.playable.titleTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITitleAPI extends js.Object {
  
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  
  var setTitleClickCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
}
object ITitleAPI {
  
  @scala.inline
  def apply(): ITitleAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITitleAPI]
  }
  
  @scala.inline
  implicit class ITitleAPIOps[Self <: ITitleAPI] (val x: Self) extends AnyVal {
    
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
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    
    @scala.inline
    def setSetTitleClickCallback(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit): Self = this.set("setTitleClickCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTitleClickCallback: Self = this.set("setTitleClickCallback", js.undefined)
  }
}
