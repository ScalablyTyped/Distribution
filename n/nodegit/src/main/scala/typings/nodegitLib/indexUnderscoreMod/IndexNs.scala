package typings
package nodegitLib.indexUnderscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/index_", "Index")
@js.native
object IndexNs extends js.Object {
  @js.native
  sealed trait ADD_OPTION extends js.Object
  
  @js.native
  sealed trait CAP extends js.Object
  
  @js.native
  object ADD_OPTION extends js.Object {
    @js.native
    sealed trait ADD_CHECK_PATHSPEC
      extends nodegitLib.indexUnderscoreMod.IndexNs.ADD_OPTION
    
    @js.native
    sealed trait ADD_DEFAULT
      extends nodegitLib.indexUnderscoreMod.IndexNs.ADD_OPTION
    
    @js.native
    sealed trait ADD_DISABLE_PATHSPEC_MATCH
      extends nodegitLib.indexUnderscoreMod.IndexNs.ADD_OPTION
    
    @js.native
    sealed trait ADD_FORCE
      extends nodegitLib.indexUnderscoreMod.IndexNs.ADD_OPTION
    
    /* 4 */ val ADD_CHECK_PATHSPEC: ADD_CHECK_PATHSPEC with scala.Double = js.native
    /* 0 */ val ADD_DEFAULT: ADD_DEFAULT with scala.Double = js.native
    /* 2 */ val ADD_DISABLE_PATHSPEC_MATCH: ADD_DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 1 */ val ADD_FORCE: ADD_FORCE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.indexUnderscoreMod.IndexNs.ADD_OPTION with scala.Double] = js.native
  }
  
  @js.native
  object CAP extends js.Object {
    @js.native
    sealed trait FROM_OWNER
      extends nodegitLib.indexUnderscoreMod.IndexNs.CAP
    
    @js.native
    sealed trait IGNORE_CASE
      extends nodegitLib.indexUnderscoreMod.IndexNs.CAP
    
    @js.native
    sealed trait NO_FILEMODE
      extends nodegitLib.indexUnderscoreMod.IndexNs.CAP
    
    @js.native
    sealed trait NO_SYMLINKS
      extends nodegitLib.indexUnderscoreMod.IndexNs.CAP
    
    /* -1 */ val FROM_OWNER: FROM_OWNER with scala.Double = js.native
    /* 1 */ val IGNORE_CASE: IGNORE_CASE with scala.Double = js.native
    /* 2 */ val NO_FILEMODE: NO_FILEMODE with scala.Double = js.native
    /* 4 */ val NO_SYMLINKS: NO_SYMLINKS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.indexUnderscoreMod.IndexNs.CAP with scala.Double] = js.native
  }
  
}

