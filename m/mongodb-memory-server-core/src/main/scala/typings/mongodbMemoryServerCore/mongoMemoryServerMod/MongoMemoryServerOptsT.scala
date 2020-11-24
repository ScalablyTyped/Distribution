package typings.mongodbMemoryServerCore.mongoMemoryServerMod

import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoMemoryServerOptsT extends js.Object {
  
  var autoStart: js.UndefOr[Boolean] = js.native
  
  var binary: js.UndefOr[MongoBinaryOpts] = js.native
  
  var instance: js.UndefOr[MongoMemoryInstancePropT] = js.native
  
  var spawn: js.UndefOr[SpawnOptions] = js.native
}
object MongoMemoryServerOptsT {
  
  @scala.inline
  def apply(): MongoMemoryServerOptsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryServerOptsT]
  }
  
  @scala.inline
  implicit class MongoMemoryServerOptsTOps[Self <: MongoMemoryServerOptsT] (val x: Self) extends AnyVal {
    
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setBinary(value: MongoBinaryOpts): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setInstance(value: MongoMemoryInstancePropT): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setSpawn(value: SpawnOptions): Self = this.set("spawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpawn: Self = this.set("spawn", js.undefined)
  }
}
