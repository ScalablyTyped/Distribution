package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryUpdateOptions extends ModelUpdateOptions {
  
  /**
    * if set to 'query' and runValidators is on, this will refer to the query
    * in customvalidator functions that update validation runs. Does nothing
    * if runValidators is false.
    */
  var context: js.UndefOr[String] = js.native
}
object QueryUpdateOptions {
  
  @scala.inline
  def apply(): QueryUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryUpdateOptions]
  }
  
  @scala.inline
  implicit class QueryUpdateOptionsOps[Self <: QueryUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
}
