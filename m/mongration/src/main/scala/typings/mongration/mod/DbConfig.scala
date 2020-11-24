package typings.mongration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbConfig extends js.Object {
  
  var db: js.UndefOr[String] = js.native
  
  var hosts: js.UndefOr[String] = js.native
  
  var migrationCollection: String = js.native
  
  var mongoUri: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var replicaSet: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object DbConfig {
  
  @scala.inline
  def apply(migrationCollection: String): DbConfig = {
    val __obj = js.Dynamic.literal(migrationCollection = migrationCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbConfig]
  }
  
  @scala.inline
  implicit class DbConfigOps[Self <: DbConfig] (val x: Self) extends AnyVal {
    
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
    def setMigrationCollection(value: String): Self = this.set("migrationCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    
    @scala.inline
    def setHosts(value: String): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setMongoUri(value: String): Self = this.set("mongoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMongoUri: Self = this.set("mongoUri", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setReplicaSet(value: String): Self = this.set("replicaSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaSet: Self = this.set("replicaSet", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
