package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod

import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.MongoMemoryInstancePropT
import typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.node.childUnderscoreProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryServerOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var instance: js.UndefOr[MongoMemoryInstancePropT] = js.undefined
  var spawn: js.UndefOr[SpawnOptions] = js.undefined
}

object MongoMemoryServerOptsT {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    binary: MongoBinaryOpts = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    instance: MongoMemoryInstancePropT = null,
    spawn: SpawnOptions = null
  ): MongoMemoryServerOptsT = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryServerOptsT]
  }
}

