package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongodOps extends js.Object {
  // mongo binary options
  var binary: js.UndefOr[
    mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryOpts
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  // instance options
  var instance: mongodbDashMemoryDashServerLib.Anon_Args
  // child process spawn options
  var spawn: js.UndefOr[mongodbDashMemoryDashServerLib.Anon_Argv0] = js.undefined
}

object MongodOps {
  @scala.inline
  def apply(
    instance: mongodbDashMemoryDashServerLib.Anon_Args,
    binary: mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryOpts = null,
    debug: scala.Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    spawn: mongodbDashMemoryDashServerLib.Anon_Argv0 = null
  ): MongodOps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instance")(instance)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn)
    __obj.asInstanceOf[MongodOps]
  }
}

