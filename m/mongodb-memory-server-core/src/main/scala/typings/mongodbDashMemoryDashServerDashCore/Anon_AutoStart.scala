package typings.mongodbDashMemoryDashServerDashCore

import typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod.ReplSetOpts
import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.MongoMemoryInstancePropBaseT
import typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoStart extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var binary: MongoBinaryOpts
  var debug: Boolean
  var instanceOpts: js.Array[MongoMemoryInstancePropBaseT]
  var replSet: Required[ReplSetOpts]
}

object Anon_AutoStart {
  @scala.inline
  def apply(
    binary: MongoBinaryOpts,
    debug: Boolean,
    instanceOpts: js.Array[MongoMemoryInstancePropBaseT],
    replSet: Required[ReplSetOpts],
    autoStart: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoStart = {
    val __obj = js.Dynamic.literal(binary = binary, debug = debug, instanceOpts = instanceOpts, replSet = replSet)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    __obj.asInstanceOf[Anon_AutoStart]
  }
}

