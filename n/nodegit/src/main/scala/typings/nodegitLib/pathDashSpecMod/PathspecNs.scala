package typings
package nodegitLib.pathDashSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/path-spec", "Pathspec")
@js.native
object PathspecNs extends js.Object {
  @js.native
  sealed trait FLAG extends js.Object
  
  @js.native
  object FLAG extends js.Object {
    @js.native
    sealed trait DEFAULT
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    @js.native
    sealed trait FAILURES_ONLY
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    @js.native
    sealed trait FIND_FAILURES
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    @js.native
    sealed trait IGNORE_CASE
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    @js.native
    sealed trait NO_GLOB
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    @js.native
    sealed trait NO_MATCH_ERROR
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    @js.native
    sealed trait USE_CASE
      extends nodegitLib.pathDashSpecMod.PathspecNs.FLAG
    
    /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
    /* 32 */ val FAILURES_ONLY: FAILURES_ONLY with scala.Double = js.native
    /* 16 */ val FIND_FAILURES: FIND_FAILURES with scala.Double = js.native
    /* 1 */ val IGNORE_CASE: IGNORE_CASE with scala.Double = js.native
    /* 4 */ val NO_GLOB: NO_GLOB with scala.Double = js.native
    /* 8 */ val NO_MATCH_ERROR: NO_MATCH_ERROR with scala.Double = js.native
    /* 2 */ val USE_CASE: USE_CASE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.pathDashSpecMod.PathspecNs.FLAG with scala.Double] = js.native
  }
  
}

