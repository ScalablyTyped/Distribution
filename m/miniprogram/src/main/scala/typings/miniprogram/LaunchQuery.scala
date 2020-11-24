package typings.miniprogram

import typings.miniprogram.anon.AppId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchQuery extends js.Object {
  
  var path: String = js.native
  
  /**
    * Current Mini Program query, parsed from the query field in the startup parameter
    */
  var query: js.Any = js.native
  
  var referrerInfo: js.UndefOr[AppId] = js.native
}
object LaunchQuery {
  
  @scala.inline
  def apply(path: String, query: js.Any): LaunchQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchQuery]
  }
  
  @scala.inline
  implicit class LaunchQueryOps[Self <: LaunchQuery] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: AppId): Self = this.set("referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerInfo: Self = this.set("referrerInfo", js.undefined)
  }
}
