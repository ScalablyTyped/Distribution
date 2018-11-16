package typings
package nodegitLib.submoduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/submodule", "Submodule")
@js.native
object SubmoduleNs extends js.Object {
  @js.native
  sealed trait IGNORE extends js.Object
  
  @js.native
  sealed trait RECURSE extends js.Object
  
  @js.native
  sealed trait STATUS extends js.Object
  
  @js.native
  sealed trait UPDATE extends js.Object
  
  @js.native
  object IGNORE extends js.Object {
    @js.native
    sealed trait ALL
      extends nodegitLib.submoduleMod.SubmoduleNs.IGNORE
    
    @js.native
    sealed trait DIRTY
      extends nodegitLib.submoduleMod.SubmoduleNs.IGNORE
    
    @js.native
    sealed trait NONE
      extends nodegitLib.submoduleMod.SubmoduleNs.IGNORE
    
    @js.native
    sealed trait UNSPECIFIED
      extends nodegitLib.submoduleMod.SubmoduleNs.IGNORE
    
    @js.native
    sealed trait UNTRACKED
      extends nodegitLib.submoduleMod.SubmoduleNs.IGNORE
    
    /* 4 */ val ALL: ALL with scala.Double = js.native
    /* 3 */ val DIRTY: DIRTY with scala.Double = js.native
    /* 1 */ val NONE: NONE with scala.Double = js.native
    /* -1 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
    /* 2 */ val UNTRACKED: UNTRACKED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.IGNORE with scala.Double] = js.native
  }
  
  @js.native
  object RECURSE extends js.Object {
    @js.native
    sealed trait NO
      extends nodegitLib.submoduleMod.SubmoduleNs.RECURSE
    
    @js.native
    sealed trait ONDEMAND
      extends nodegitLib.submoduleMod.SubmoduleNs.RECURSE
    
    @js.native
    sealed trait YES
      extends nodegitLib.submoduleMod.SubmoduleNs.RECURSE
    
    /* 0 */ val NO: NO with scala.Double = js.native
    /* 2 */ val ONDEMAND: ONDEMAND with scala.Double = js.native
    /* 1 */ val YES: YES with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.RECURSE with scala.Double] = js.native
  }
  
  @js.native
  object STATUS extends js.Object {
    @js.native
    sealed trait INDEX_ADDED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait INDEX_DELETED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait INDEX_MODIFIED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait IN_CONFIG
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait IN_HEAD
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait IN_INDEX
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait IN_WD
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_ADDED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_DELETED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_INDEX_MODIFIED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_MODIFIED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_UNINITIALIZED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_UNTRACKED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    @js.native
    sealed trait WD_WD_MODIFIED
      extends nodegitLib.submoduleMod.SubmoduleNs.STATUS
    
    /* 16 */ val INDEX_ADDED: INDEX_ADDED with scala.Double = js.native
    /* 32 */ val INDEX_DELETED: INDEX_DELETED with scala.Double = js.native
    /* 64 */ val INDEX_MODIFIED: INDEX_MODIFIED with scala.Double = js.native
    /* 4 */ val IN_CONFIG: IN_CONFIG with scala.Double = js.native
    /* 1 */ val IN_HEAD: IN_HEAD with scala.Double = js.native
    /* 2 */ val IN_INDEX: IN_INDEX with scala.Double = js.native
    /* 8 */ val IN_WD: IN_WD with scala.Double = js.native
    /* 256 */ val WD_ADDED: WD_ADDED with scala.Double = js.native
    /* 512 */ val WD_DELETED: WD_DELETED with scala.Double = js.native
    /* 2048 */ val WD_INDEX_MODIFIED: WD_INDEX_MODIFIED with scala.Double = js.native
    /* 1024 */ val WD_MODIFIED: WD_MODIFIED with scala.Double = js.native
    /* 128 */ val WD_UNINITIALIZED: WD_UNINITIALIZED with scala.Double = js.native
    /* 8192 */ val WD_UNTRACKED: WD_UNTRACKED with scala.Double = js.native
    /* 4096 */ val WD_WD_MODIFIED: WD_WD_MODIFIED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.STATUS with scala.Double] = js.native
  }
  
  @js.native
  object UPDATE extends js.Object {
    @js.native
    sealed trait CHECKOUT
      extends nodegitLib.submoduleMod.SubmoduleNs.UPDATE
    
    @js.native
    sealed trait DEFAULT
      extends nodegitLib.submoduleMod.SubmoduleNs.UPDATE
    
    @js.native
    sealed trait MERGE
      extends nodegitLib.submoduleMod.SubmoduleNs.UPDATE
    
    @js.native
    sealed trait NONE
      extends nodegitLib.submoduleMod.SubmoduleNs.UPDATE
    
    @js.native
    sealed trait REBASE
      extends nodegitLib.submoduleMod.SubmoduleNs.UPDATE
    
    /* 1 */ val CHECKOUT: CHECKOUT with scala.Double = js.native
    /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
    /* 3 */ val MERGE: MERGE with scala.Double = js.native
    /* 4 */ val NONE: NONE with scala.Double = js.native
    /* 2 */ val REBASE: REBASE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.UPDATE with scala.Double] = js.native
  }
  
}

