package typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs

import typings.mongodbDashMemoryDashServer.Anon_Args
import typings.mongodbDashMemoryDashServer.Anon_Argv0
import typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongodOps extends js.Object {
  // mongo binary options
  var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
  var debug: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  // instance options
  var instance: Anon_Args
  // child process spawn options
  var spawn: js.UndefOr[Anon_Argv0] = js.undefined
}

object MongodOps {
  @scala.inline
  def apply(
    instance: Anon_Args,
    binary: MongoBinaryOpts = null,
    debug: Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    spawn: Anon_Argv0 = null
  ): MongodOps = {
    val __obj = js.Dynamic.literal(instance = instance)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn)
    __obj.asInstanceOf[MongodOps]
  }
}

