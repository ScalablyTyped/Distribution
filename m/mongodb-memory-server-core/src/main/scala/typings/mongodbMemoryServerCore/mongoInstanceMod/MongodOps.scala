package typings.mongodbMemoryServerCore.mongoInstanceMod

import typings.mongodbMemoryServerCore.anon.Args
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongodOps extends js.Object {
  var binary: js.UndefOr[MongoBinaryOpts] = js.native
  var instance: Args = js.native
  var spawn: js.UndefOr[SpawnOptions] = js.native
}

object MongodOps {
  @scala.inline
  def apply(instance: Args): MongodOps = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongodOps]
  }
  @scala.inline
  implicit class MongodOpsOps[Self <: MongodOps] (val x: Self) extends AnyVal {
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
    def setInstance(value: Args): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinary(value: MongoBinaryOpts): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setSpawn(value: SpawnOptions): Self = this.set("spawn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpawn: Self = this.set("spawn", js.undefined)
  }
  
}

