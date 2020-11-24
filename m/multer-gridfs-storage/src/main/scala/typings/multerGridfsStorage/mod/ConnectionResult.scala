package typings.multerGridfsStorage.mod

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionResult extends js.Object {
  
  var client: js.UndefOr[MongoClient] = js.native
  
  var db: Db = js.native
}
object ConnectionResult {
  
  @scala.inline
  def apply(db: Db): ConnectionResult = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
  
  @scala.inline
  implicit class ConnectionResultOps[Self <: ConnectionResult] (val x: Self) extends AnyVal {
    
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
    def setDb(value: Db): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: MongoClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
  }
}
