package typings.mongodbMemoryServerCore.mongoMemoryServerMod

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.tmp.mod.DirResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartupInstanceData extends js.Object {
  
  var dbName: String = js.native
  
  var dbPath: js.UndefOr[String] = js.native
  
  var ip: String = js.native
  
  var port: Double = js.native
  
  var replSet: js.UndefOr[String] = js.native
  
  var storageEngine: StorageEngineT = js.native
  
  var tmpDir: js.UndefOr[DirResult] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object StartupInstanceData {
  
  @scala.inline
  def apply(dbName: String, ip: String, port: Double, storageEngine: StorageEngineT): StartupInstanceData = {
    val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartupInstanceData]
  }
  
  @scala.inline
  implicit class StartupInstanceDataOps[Self <: StartupInstanceData] (val x: Self) extends AnyVal {
    
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
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEngine(value: StorageEngineT): Self = this.set("storageEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbPath(value: String): Self = this.set("dbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbPath: Self = this.set("dbPath", js.undefined)
    
    @scala.inline
    def setReplSet(value: String): Self = this.set("replSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplSet: Self = this.set("replSet", js.undefined)
    
    @scala.inline
    def setTmpDir(value: DirResult): Self = this.set("tmpDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpDir: Self = this.set("tmpDir", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
