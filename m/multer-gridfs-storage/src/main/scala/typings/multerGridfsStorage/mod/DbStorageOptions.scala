package typings.multerGridfsStorage.mod

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import typings.mongoose.mod.Connection_
import typings.mongoose.mod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbStorageOptions extends MulterGfsOptions {
  
  var client: js.UndefOr[MongoClient | js.Promise[MongoClient]] = js.native
  
  var db: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db]) = js.native
}
object DbStorageOptions {
  
  @scala.inline
  def apply(db: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db])): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbStorageOptions]
  }
  
  @scala.inline
  implicit class DbStorageOptionsOps[Self <: DbStorageOptions] (val x: Self) extends AnyVal {
    
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
    def setDb(value: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db])): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: MongoClient | js.Promise[MongoClient]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
  }
}
