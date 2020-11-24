package typings.mongodbMemoryServerCore.anon

import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoStart extends js.Object {
  
  var autoStart: js.UndefOr[Boolean] = js.native
  
  var binary: MongoBinaryOpts = js.native
  
  var instanceOpts: js.Array[MongoMemoryInstancePropBaseT] = js.native
  
  var replSet: RequiredReplSetOpts = js.native
}
object AutoStart {
  
  @scala.inline
  def apply(
    binary: MongoBinaryOpts,
    instanceOpts: js.Array[MongoMemoryInstancePropBaseT],
    replSet: RequiredReplSetOpts
  ): AutoStart = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], instanceOpts = instanceOpts.asInstanceOf[js.Any], replSet = replSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoStart]
  }
  
  @scala.inline
  implicit class AutoStartOps[Self <: AutoStart] (val x: Self) extends AnyVal {
    
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
    def setBinary(value: MongoBinaryOpts): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOptsVarargs(value: MongoMemoryInstancePropBaseT*): Self = this.set("instanceOpts", js.Array(value :_*))
    
    @scala.inline
    def setInstanceOpts(value: js.Array[MongoMemoryInstancePropBaseT]): Self = this.set("instanceOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplSet(value: RequiredReplSetOpts): Self = this.set("replSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
  }
}
