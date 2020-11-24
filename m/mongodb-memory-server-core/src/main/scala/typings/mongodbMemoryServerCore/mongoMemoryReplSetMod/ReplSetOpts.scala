package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplSetOpts extends js.Object {
  
  /**
    * additional command line args passed to `mongod`
    * @default []
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * enable auth ("--auth" / "--noauth")
    * @default false
    */
  var auth: js.UndefOr[Boolean] = js.native
  
  /**
    * Options for "rsConfig"
    * @default {}
    */
  var configSettings: js.UndefOr[MongoMemoryReplSetConfigSettingsT] = js.native
  
  /**
    * number of `mongod` servers to start
    * @default 1
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * database name used in connection string
    * @default uuidv4()
    */
  var dbName: js.UndefOr[String] = js.native
  
  /**
    * bind to all IP addresses specify `::,0.0.0.0`
    * @default '127.0.0.1'
    */
  var ip: js.UndefOr[String] = js.native
  
  /**
    * replSet name
    * @default 'testset'
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * oplog size (in MB)
    * @default 1
    */
  var oplogSize: js.UndefOr[Double] = js.native
  
  /**
    * Childprocess spawn options
    * @default {}
    */
  var spawn: js.UndefOr[SpawnOptions] = js.native
  
  /**
    *`mongod` storage engine type
    * @default 'ephemeralForTest'
    */
  var storageEngine: js.UndefOr[StorageEngineT] = js.native
}
object ReplSetOpts {
  
  @scala.inline
  def apply(): ReplSetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplSetOpts]
  }
  
  @scala.inline
  implicit class ReplSetOptsOps[Self <: ReplSetOpts] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setConfigSettings(value: MongoMemoryReplSetConfigSettingsT): Self = this.set("configSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigSettings: Self = this.set("configSettings", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbName: Self = this.set("dbName", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOplogSize(value: Double): Self = this.set("oplogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOplogSize: Self = this.set("oplogSize", js.undefined)
    
    @scala.inline
    def setSpawn(value: SpawnOptions): Self = this.set("spawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpawn: Self = this.set("spawn", js.undefined)
    
    @scala.inline
    def setStorageEngine(value: StorageEngineT): Self = this.set("storageEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEngine: Self = this.set("storageEngine", js.undefined)
  }
}
