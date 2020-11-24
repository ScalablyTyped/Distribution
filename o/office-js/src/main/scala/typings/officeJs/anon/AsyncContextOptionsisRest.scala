package typings.officeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-js.Office.AsyncContextOptions & {  isRest :boolean | undefined} */
@js.native
trait AsyncContextOptionsisRest extends js.Object {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  var isRest: js.UndefOr[Boolean] = js.native
}
object AsyncContextOptionsisRest {
  
  @scala.inline
  def apply(): AsyncContextOptionsisRest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncContextOptionsisRest]
  }
  
  @scala.inline
  implicit class AsyncContextOptionsisRestOps[Self <: AsyncContextOptionsisRest] (val x: Self) extends AnyVal {
    
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    
    @scala.inline
    def setIsRest(value: Boolean): Self = this.set("isRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRest: Self = this.set("isRest", js.undefined)
  }
}
