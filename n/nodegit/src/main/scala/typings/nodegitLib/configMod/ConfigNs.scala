package typings
package nodegitLib.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/config", "Config")
@js.native
object ConfigNs extends js.Object {
  @js.native
  sealed trait LEVEL extends js.Object
  
  @js.native
  object LEVEL extends js.Object {
    @js.native
    sealed trait APP
      extends nodegitLib.configMod.ConfigNs.LEVEL
    
    @js.native
    sealed trait GLOBAL
      extends nodegitLib.configMod.ConfigNs.LEVEL
    
    @js.native
    sealed trait HIGHEST_LEVEL
      extends nodegitLib.configMod.ConfigNs.LEVEL
    
    @js.native
    sealed trait LOCAL
      extends nodegitLib.configMod.ConfigNs.LEVEL
    
    @js.native
    sealed trait SYSTEM
      extends nodegitLib.configMod.ConfigNs.LEVEL
    
    @js.native
    sealed trait XDG
      extends nodegitLib.configMod.ConfigNs.LEVEL
    
    /* 5 */ val APP: APP with scala.Double = js.native
    /* 3 */ val GLOBAL: GLOBAL with scala.Double = js.native
    /* -1 */ val HIGHEST_LEVEL: HIGHEST_LEVEL with scala.Double = js.native
    /* 4 */ val LOCAL: LOCAL with scala.Double = js.native
    /* 1 */ val SYSTEM: SYSTEM with scala.Double = js.native
    /* 2 */ val XDG: XDG with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.configMod.ConfigNs.LEVEL with scala.Double] = js.native
  }
  
}

