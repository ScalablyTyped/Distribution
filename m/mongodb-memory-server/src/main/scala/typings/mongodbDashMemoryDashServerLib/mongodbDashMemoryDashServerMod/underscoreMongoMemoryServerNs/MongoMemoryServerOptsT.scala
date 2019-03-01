package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoMemoryServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryServerOptsT extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var binary: mongodbDashMemoryDashServerLib.Anon_Arch
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var instance: mongodbDashMemoryDashServerLib.Anon_ArgsDbName
  var spawn: js.Any
}

object MongoMemoryServerOptsT {
  @scala.inline
  def apply(
    binary: mongodbDashMemoryDashServerLib.Anon_Arch,
    instance: mongodbDashMemoryDashServerLib.Anon_ArgsDbName,
    spawn: js.Any,
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined
  ): MongoMemoryServerOptsT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binary")(binary)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("spawn")(spawn)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[MongoMemoryServerOptsT]
  }
}

