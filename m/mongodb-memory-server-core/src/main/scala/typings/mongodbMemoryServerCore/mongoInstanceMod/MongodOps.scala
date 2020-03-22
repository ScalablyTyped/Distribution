package typings.mongodbMemoryServerCore.mongoInstanceMod

import typings.mongodbMemoryServerCore.AnonArgs
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongodOps extends js.Object {
  var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
  var instance: AnonArgs
  var spawn: js.UndefOr[SpawnOptions] = js.undefined
}

object MongodOps {
  @scala.inline
  def apply(instance: AnonArgs, binary: MongoBinaryOpts = null, spawn: SpawnOptions = null): MongodOps = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongodOps]
  }
}

