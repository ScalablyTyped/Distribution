package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Submodule")
@js.native
object SubmoduleNs extends js.Object {
  @js.native
  object IGNORE extends js.Object {
    /* 4 */ val ALL: nodegitLib.submoduleMod.SubmoduleNs.IGNORE.ALL with scala.Double = js.native
    /* 3 */ val DIRTY: nodegitLib.submoduleMod.SubmoduleNs.IGNORE.DIRTY with scala.Double = js.native
    /* 1 */ val NONE: nodegitLib.submoduleMod.SubmoduleNs.IGNORE.NONE with scala.Double = js.native
    /* -1 */ val UNSPECIFIED: nodegitLib.submoduleMod.SubmoduleNs.IGNORE.UNSPECIFIED with scala.Double = js.native
    /* 2 */ val UNTRACKED: nodegitLib.submoduleMod.SubmoduleNs.IGNORE.UNTRACKED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.IGNORE with scala.Double] = js.native
  }
  
  @js.native
  object RECURSE extends js.Object {
    /* 0 */ val NO: nodegitLib.submoduleMod.SubmoduleNs.RECURSE.NO with scala.Double = js.native
    /* 2 */ val ONDEMAND: nodegitLib.submoduleMod.SubmoduleNs.RECURSE.ONDEMAND with scala.Double = js.native
    /* 1 */ val YES: nodegitLib.submoduleMod.SubmoduleNs.RECURSE.YES with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.RECURSE with scala.Double] = js.native
  }
  
  @js.native
  object STATUS extends js.Object {
    /* 16 */ val INDEX_ADDED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.INDEX_ADDED with scala.Double = js.native
    /* 32 */ val INDEX_DELETED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.INDEX_DELETED with scala.Double = js.native
    /* 64 */ val INDEX_MODIFIED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.INDEX_MODIFIED with scala.Double = js.native
    /* 4 */ val IN_CONFIG: nodegitLib.submoduleMod.SubmoduleNs.STATUS.IN_CONFIG with scala.Double = js.native
    /* 1 */ val IN_HEAD: nodegitLib.submoduleMod.SubmoduleNs.STATUS.IN_HEAD with scala.Double = js.native
    /* 2 */ val IN_INDEX: nodegitLib.submoduleMod.SubmoduleNs.STATUS.IN_INDEX with scala.Double = js.native
    /* 8 */ val IN_WD: nodegitLib.submoduleMod.SubmoduleNs.STATUS.IN_WD with scala.Double = js.native
    /* 256 */ val WD_ADDED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_ADDED with scala.Double = js.native
    /* 512 */ val WD_DELETED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_DELETED with scala.Double = js.native
    /* 2048 */ val WD_INDEX_MODIFIED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_INDEX_MODIFIED with scala.Double = js.native
    /* 1024 */ val WD_MODIFIED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_MODIFIED with scala.Double = js.native
    /* 128 */ val WD_UNINITIALIZED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_UNINITIALIZED with scala.Double = js.native
    /* 8192 */ val WD_UNTRACKED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_UNTRACKED with scala.Double = js.native
    /* 4096 */ val WD_WD_MODIFIED: nodegitLib.submoduleMod.SubmoduleNs.STATUS.WD_WD_MODIFIED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.STATUS with scala.Double] = js.native
  }
  
  @js.native
  object UPDATE extends js.Object {
    /* 1 */ val CHECKOUT: nodegitLib.submoduleMod.SubmoduleNs.UPDATE.CHECKOUT with scala.Double = js.native
    /* 0 */ val DEFAULT: nodegitLib.submoduleMod.SubmoduleNs.UPDATE.DEFAULT with scala.Double = js.native
    /* 3 */ val MERGE: nodegitLib.submoduleMod.SubmoduleNs.UPDATE.MERGE with scala.Double = js.native
    /* 4 */ val NONE: nodegitLib.submoduleMod.SubmoduleNs.UPDATE.NONE with scala.Double = js.native
    /* 2 */ val REBASE: nodegitLib.submoduleMod.SubmoduleNs.UPDATE.REBASE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.submoduleMod.SubmoduleNs.UPDATE with scala.Double] = js.native
  }
  
  type IGNORE = nodegitLib.submoduleMod.SubmoduleNs.IGNORE
  type RECURSE = nodegitLib.submoduleMod.SubmoduleNs.RECURSE
  type STATUS = nodegitLib.submoduleMod.SubmoduleNs.STATUS
  type UPDATE = nodegitLib.submoduleMod.SubmoduleNs.UPDATE
}

