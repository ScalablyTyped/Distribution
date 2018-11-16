package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Config")
@js.native
object ConfigNs extends js.Object {
  @js.native
  object LEVEL extends js.Object {
    /* 5 */ val APP: nodegitLib.configMod.ConfigNs.LEVEL.APP with scala.Double = js.native
    /* 3 */ val GLOBAL: nodegitLib.configMod.ConfigNs.LEVEL.GLOBAL with scala.Double = js.native
    /* -1 */ val HIGHEST_LEVEL: nodegitLib.configMod.ConfigNs.LEVEL.HIGHEST_LEVEL with scala.Double = js.native
    /* 4 */ val LOCAL: nodegitLib.configMod.ConfigNs.LEVEL.LOCAL with scala.Double = js.native
    /* 1 */ val SYSTEM: nodegitLib.configMod.ConfigNs.LEVEL.SYSTEM with scala.Double = js.native
    /* 2 */ val XDG: nodegitLib.configMod.ConfigNs.LEVEL.XDG with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.configMod.ConfigNs.LEVEL with scala.Double] = js.native
  }
  
  type LEVEL = nodegitLib.configMod.ConfigNs.LEVEL
}

