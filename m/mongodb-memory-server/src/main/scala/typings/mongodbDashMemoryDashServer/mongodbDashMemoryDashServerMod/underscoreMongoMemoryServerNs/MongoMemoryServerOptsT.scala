package typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoMemoryServerNs

import typings.mongodbDashMemoryDashServer.Anon_Arch
import typings.mongodbDashMemoryDashServer.Anon_ArgsDbName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryServerOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var binary: Anon_Arch
  var debug: js.UndefOr[Boolean] = js.undefined
  var instance: Anon_ArgsDbName
  var spawn: js.Any
}

object MongoMemoryServerOptsT {
  @scala.inline
  def apply(
    binary: Anon_Arch,
    instance: Anon_ArgsDbName,
    spawn: js.Any,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined
  ): MongoMemoryServerOptsT = {
    val __obj = js.Dynamic.literal(binary = binary, instance = instance, spawn = spawn)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[MongoMemoryServerOptsT]
  }
}

