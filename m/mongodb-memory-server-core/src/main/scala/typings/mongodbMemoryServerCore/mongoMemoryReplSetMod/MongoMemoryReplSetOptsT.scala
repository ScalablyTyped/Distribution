package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryReplSetOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var binary: js.UndefOr[MongoBinaryOpts] = js.native
  var instanceOpts: js.UndefOr[js.Array[MongoMemoryInstancePropBaseT]] = js.native
  var replSet: js.UndefOr[ReplSetOpts] = js.native
}

object MongoMemoryReplSetOptsT {
  @scala.inline
  def apply(): MongoMemoryReplSetOptsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryReplSetOptsT]
  }
  @scala.inline
  implicit class MongoMemoryReplSetOptsTOps[Self <: MongoMemoryReplSetOptsT] (val x: Self) extends AnyVal {
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
    def setInstanceOptsVarargs(value: MongoMemoryInstancePropBaseT*): Self = this.set("instanceOpts", js.Array(value :_*))
    @scala.inline
    def setInstanceOpts(value: js.Array[MongoMemoryInstancePropBaseT]): Self = this.set("instanceOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceOpts: Self = this.set("instanceOpts", js.undefined)
    @scala.inline
    def setReplSet(value: ReplSetOpts): Self = this.set("replSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplSet: Self = this.set("replSet", js.undefined)
  }
  
}

