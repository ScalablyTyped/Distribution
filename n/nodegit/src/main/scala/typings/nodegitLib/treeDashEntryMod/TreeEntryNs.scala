package typings
package nodegitLib.treeDashEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree-entry", "TreeEntry")
@js.native
object TreeEntryNs extends js.Object {
  @js.native
  sealed trait FILEMODE extends js.Object
  
  @js.native
  object FILEMODE extends js.Object {
    @js.native
    sealed trait BLOB
      extends nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE
    
    @js.native
    sealed trait COMMIT
      extends nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE
    
    @js.native
    sealed trait EXECUTABLE
      extends nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE
    
    @js.native
    sealed trait LINK
      extends nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE
    
    @js.native
    sealed trait TREE
      extends nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE
    
    @js.native
    sealed trait UNREADABLE
      extends nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE
    
    /* 33188 */ val BLOB: BLOB with scala.Double = js.native
    /* 57344 */ val COMMIT: COMMIT with scala.Double = js.native
    /* 33261 */ val EXECUTABLE: EXECUTABLE with scala.Double = js.native
    /* 40960 */ val LINK: LINK with scala.Double = js.native
    /* 16384 */ val TREE: TREE with scala.Double = js.native
    /* 0 */ val UNREADABLE: UNREADABLE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE with scala.Double] = js.native
  }
  
}

