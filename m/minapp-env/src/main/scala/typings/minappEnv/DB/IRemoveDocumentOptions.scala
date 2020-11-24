package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRemoveDocumentOptions
  extends IAPIParam[js.Any] {
  
  var query: IQueryCondition = js.native
}
object IRemoveDocumentOptions {
  
  @scala.inline
  def apply(query: IQueryCondition): IRemoveDocumentOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveDocumentOptions]
  }
  
  @scala.inline
  implicit class IRemoveDocumentOptionsOps[Self <: IRemoveDocumentOptions] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: IQueryCondition): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
