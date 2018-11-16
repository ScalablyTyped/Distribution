package typings
package nodegitLib.packDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/pack-builder", "Packbuilder")
@js.native
object PackbuilderNs extends js.Object {
  @js.native
  sealed trait STAGE extends js.Object
  
  @js.native
  object STAGE extends js.Object {
    @js.native
    sealed trait ADDING_OBJECTS
      extends nodegitLib.packDashBuilderMod.PackbuilderNs.STAGE
    
    @js.native
    sealed trait DELTAFICATION
      extends nodegitLib.packDashBuilderMod.PackbuilderNs.STAGE
    
    /* 0 */ val ADDING_OBJECTS: ADDING_OBJECTS with scala.Double = js.native
    /* 1 */ val DELTAFICATION: DELTAFICATION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.packDashBuilderMod.PackbuilderNs.STAGE with scala.Double] = js.native
  }
  
}

