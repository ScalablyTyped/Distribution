package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod

import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.MongoMemoryInstancePropBaseT
import typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryReplSetOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var instanceOpts: js.UndefOr[js.Array[MongoMemoryInstancePropBaseT]] = js.undefined
  var replSet: js.UndefOr[ReplSetOpts] = js.undefined
}

object MongoMemoryReplSetOptsT {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    binary: MongoBinaryOpts = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    instanceOpts: js.Array[MongoMemoryInstancePropBaseT] = null,
    replSet: ReplSetOpts = null
  ): MongoMemoryReplSetOptsT = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (instanceOpts != null) __obj.updateDynamic("instanceOpts")(instanceOpts.asInstanceOf[js.Any])
    if (replSet != null) __obj.updateDynamic("replSet")(replSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryReplSetOptsT]
  }
}

