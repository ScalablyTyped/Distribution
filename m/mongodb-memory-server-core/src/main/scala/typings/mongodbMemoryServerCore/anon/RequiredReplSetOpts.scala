package typings.mongodbMemoryServerCore.anon

import typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetConfigSettingsT
import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryReplSet.ReplSetOpts> */
@js.native
trait RequiredReplSetOpts extends js.Object {
  
  var args: js.Array[String] = js.native
  
  var auth: Boolean = js.native
  
  var configSettings: MongoMemoryReplSetConfigSettingsT = js.native
  
  var count: Double = js.native
  
  var dbName: String = js.native
  
  var ip: String = js.native
  
  var name: String = js.native
  
  var oplogSize: Double = js.native
  
  var spawn: SpawnOptions = js.native
  
  var storageEngine: StorageEngineT = js.native
}
object RequiredReplSetOpts {
  
  @scala.inline
  def apply(
    args: js.Array[String],
    auth: Boolean,
    configSettings: MongoMemoryReplSetConfigSettingsT,
    count: Double,
    dbName: String,
    ip: String,
    name: String,
    oplogSize: Double,
    spawn: SpawnOptions,
    storageEngine: StorageEngineT
  ): RequiredReplSetOpts = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], configSettings = configSettings.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oplogSize = oplogSize.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredReplSetOpts]
  }
  
  @scala.inline
  implicit class RequiredReplSetOptsOps[Self <: RequiredReplSetOpts] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSettings(value: MongoMemoryReplSetConfigSettingsT): Self = this.set("configSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOplogSize(value: Double): Self = this.set("oplogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpawn(value: SpawnOptions): Self = this.set("spawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEngine(value: StorageEngineT): Self = this.set("storageEngine", value.asInstanceOf[js.Any])
  }
}
