package typings.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.Optional<minapp-env.Record<'complete' | 'success' | 'fail', (args : ...any): any>> */
@js.native
trait OptionalRecordcompletesuc extends js.Object {
  
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object OptionalRecordcompletesuc {
  
  @scala.inline
  def apply(): OptionalRecordcompletesuc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRecordcompletesuc]
  }
  
  @scala.inline
  implicit class OptionalRecordcompletesucOps[Self <: OptionalRecordcompletesuc] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: /* repeated */ js.Any => _): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* repeated */ js.Any => _): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* repeated */ js.Any => _): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
