package typings
package nodegitLib.objectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/object", "Object")
@js.native
object ObjectNs extends js.Object {
  @js.native
  sealed trait TYPE extends js.Object
  
  @js.native
  object TYPE extends js.Object {
    @js.native
    sealed trait ANY
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait BAD
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait BLOB
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait COMMIT
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait EXT1
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait EXT2
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait OFS_DELTA
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait REF_DELTA
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait TAG
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    @js.native
    sealed trait TREE
      extends nodegitLib.objectMod.ObjectNs.TYPE
    
    /* -2 */ val ANY: ANY with scala.Double = js.native
    /* -1 */ val BAD: BAD with scala.Double = js.native
    /* 3 */ val BLOB: BLOB with scala.Double = js.native
    /* 1 */ val COMMIT: COMMIT with scala.Double = js.native
    /* 0 */ val EXT1: EXT1 with scala.Double = js.native
    /* 5 */ val EXT2: EXT2 with scala.Double = js.native
    /* 6 */ val OFS_DELTA: OFS_DELTA with scala.Double = js.native
    /* 7 */ val REF_DELTA: REF_DELTA with scala.Double = js.native
    /* 4 */ val TAG: TAG with scala.Double = js.native
    /* 2 */ val TREE: TREE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.objectMod.ObjectNs.TYPE with scala.Double] = js.native
  }
  
}

