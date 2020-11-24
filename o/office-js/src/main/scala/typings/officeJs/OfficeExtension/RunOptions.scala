package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOptions[T] extends js.Object {
  
  /**
    *  A previously-created context, or API object, or array of objects. 
    * The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up 
    * by `context.sync()`.
    */
  var previousObjects: js.UndefOr[ClientObject | js.Array[ClientObject] | ClientRequestContext] = js.native
  
  /**
    * The URL of the remote workbook and the request headers to be sent.
    */
  var session: js.UndefOr[RequestUrlAndHeaderInfo | T] = js.native
}
object RunOptions {
  
  @scala.inline
  def apply[T](): RunOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions[T]]
  }
  
  @scala.inline
  implicit class RunOptionsOps[Self <: RunOptions[_], T] (val x: Self with RunOptions[T]) extends AnyVal {
    
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
    def setPreviousObjectsVarargs(value: ClientObject*): Self = this.set("previousObjects", js.Array(value :_*))
    
    @scala.inline
    def setPreviousObjects(value: ClientObject | js.Array[ClientObject] | ClientRequestContext): Self = this.set("previousObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousObjects: Self = this.set("previousObjects", js.undefined)
    
    @scala.inline
    def setSession(value: RequestUrlAndHeaderInfo | T): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
