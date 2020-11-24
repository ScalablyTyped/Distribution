package typings.neo4j.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CypherOptions extends js.Object {
  
  var commit: js.UndefOr[js.Object] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var lean: js.UndefOr[js.Object] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var query: js.UndefOr[js.Object] = js.native
}
object CypherOptions {
  
  @scala.inline
  def apply(): CypherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CypherOptions]
  }
  
  @scala.inline
  implicit class CypherOptionsOps[Self <: CypherOptions] (val x: Self) extends AnyVal {
    
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
    def setCommit(value: js.Object): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLean(value: js.Object): Self = this.set("lean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLean: Self = this.set("lean", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
