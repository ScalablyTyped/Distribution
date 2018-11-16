package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Error")
@js.native
object ErrorNs extends js.Object {
  @js.native
  object CODE extends js.Object {
    /* -5 */ val EAMBIGUOUS: nodegitLib.errorMod.ErrorNs.CODE.EAMBIGUOUS with scala.Double = js.native
    /* -18 */ val EAPPLIED: nodegitLib.errorMod.ErrorNs.CODE.EAPPLIED with scala.Double = js.native
    /* -16 */ val EAUTH: nodegitLib.errorMod.ErrorNs.CODE.EAUTH with scala.Double = js.native
    /* -8 */ val EBAREREPO: nodegitLib.errorMod.ErrorNs.CODE.EBAREREPO with scala.Double = js.native
    /* -6 */ val EBUFS: nodegitLib.errorMod.ErrorNs.CODE.EBUFS with scala.Double = js.native
    /* -17 */ val ECERTIFICATE: nodegitLib.errorMod.ErrorNs.CODE.ECERTIFICATE with scala.Double = js.native
    /* -13 */ val ECONFLICT: nodegitLib.errorMod.ErrorNs.CODE.ECONFLICT with scala.Double = js.native
    /* -23 */ val EDIRECTORY: nodegitLib.errorMod.ErrorNs.CODE.EDIRECTORY with scala.Double = js.native
    /* -20 */ val EEOF: nodegitLib.errorMod.ErrorNs.CODE.EEOF with scala.Double = js.native
    /* -4 */ val EEXISTS: nodegitLib.errorMod.ErrorNs.CODE.EEXISTS with scala.Double = js.native
    /* -21 */ val EINVALID: nodegitLib.errorMod.ErrorNs.CODE.EINVALID with scala.Double = js.native
    /* -12 */ val EINVALIDSPEC: nodegitLib.errorMod.ErrorNs.CODE.EINVALIDSPEC with scala.Double = js.native
    /* -14 */ val ELOCKED: nodegitLib.errorMod.ErrorNs.CODE.ELOCKED with scala.Double = js.native
    /* -15 */ val EMODIFIED: nodegitLib.errorMod.ErrorNs.CODE.EMODIFIED with scala.Double = js.native
    /* -11 */ val ENONFASTFORWARD: nodegitLib.errorMod.ErrorNs.CODE.ENONFASTFORWARD with scala.Double = js.native
    /* -3 */ val ENOTFOUND: nodegitLib.errorMod.ErrorNs.CODE.ENOTFOUND with scala.Double = js.native
    /* -19 */ val EPEEL: nodegitLib.errorMod.ErrorNs.CODE.EPEEL with scala.Double = js.native
    /* -1 */ val ERROR: nodegitLib.errorMod.ErrorNs.CODE.ERROR with scala.Double = js.native
    /* -9 */ val EUNBORNBRANCH: nodegitLib.errorMod.ErrorNs.CODE.EUNBORNBRANCH with scala.Double = js.native
    /* -22 */ val EUNCOMMITTED: nodegitLib.errorMod.ErrorNs.CODE.EUNCOMMITTED with scala.Double = js.native
    /* -10 */ val EUNMERGED: nodegitLib.errorMod.ErrorNs.CODE.EUNMERGED with scala.Double = js.native
    /* -7 */ val EUSER: nodegitLib.errorMod.ErrorNs.CODE.EUSER with scala.Double = js.native
    /* -31 */ val ITEROVER: nodegitLib.errorMod.ErrorNs.CODE.ITEROVER with scala.Double = js.native
    /* 0 */ val OK: nodegitLib.errorMod.ErrorNs.CODE.OK with scala.Double = js.native
    /* -30 */ val PASSTHROUGH: nodegitLib.errorMod.ErrorNs.CODE.PASSTHROUGH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.errorMod.ErrorNs.CODE with scala.Double] = js.native
  }
  
  @js.native
  object ERROR extends js.Object {
    /* 26 */ val GITERR_CALLBACK: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_CALLBACK with scala.Double = js.native
    /* 20 */ val GITERR_CHECKOUT: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_CHECKOUT with scala.Double = js.native
    /* 27 */ val GITERR_CHERRYPICK: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_CHERRYPICK with scala.Double = js.native
    /* 7 */ val GITERR_CONFIG: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_CONFIG with scala.Double = js.native
    /* 28 */ val GITERR_DESCRIBE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_DESCRIBE with scala.Double = js.native
    /* 21 */ val GITERR_FETCHHEAD: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_FETCHHEAD with scala.Double = js.native
    /* 30 */ val GITERR_FILESYSTEM: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_FILESYSTEM with scala.Double = js.native
    /* 24 */ val GITERR_FILTER: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_FILTER with scala.Double = js.native
    /* 10 */ val GITERR_INDEX: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_INDEX with scala.Double = js.native
    /* 15 */ val GITERR_INDEXER: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_INDEXER with scala.Double = js.native
    /* 3 */ val GITERR_INVALID: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_INVALID with scala.Double = js.native
    /* 22 */ val GITERR_MERGE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_MERGE with scala.Double = js.native
    /* 12 */ val GITERR_NET: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_NET with scala.Double = js.native
    /* 1 */ val GITERR_NOMEMORY: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_NOMEMORY with scala.Double = js.native
    /* 0 */ val GITERR_NONE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_NONE with scala.Double = js.native
    /* 11 */ val GITERR_OBJECT: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_OBJECT with scala.Double = js.native
    /* 9 */ val GITERR_ODB: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_ODB with scala.Double = js.native
    /* 2 */ val GITERR_OS: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_OS with scala.Double = js.native
    /* 29 */ val GITERR_REBASE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_REBASE with scala.Double = js.native
    /* 4 */ val GITERR_REFERENCE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_REFERENCE with scala.Double = js.native
    /* 8 */ val GITERR_REGEX: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_REGEX with scala.Double = js.native
    /* 6 */ val GITERR_REPOSITORY: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_REPOSITORY with scala.Double = js.native
    /* 25 */ val GITERR_REVERT: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_REVERT with scala.Double = js.native
    /* 23 */ val GITERR_SSH: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_SSH with scala.Double = js.native
    /* 16 */ val GITERR_SSL: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_SSL with scala.Double = js.native
    /* 19 */ val GITERR_STASH: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_STASH with scala.Double = js.native
    /* 17 */ val GITERR_SUBMODULE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_SUBMODULE with scala.Double = js.native
    /* 13 */ val GITERR_TAG: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_TAG with scala.Double = js.native
    /* 18 */ val GITERR_THREAD: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_THREAD with scala.Double = js.native
    /* 14 */ val GITERR_TREE: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_TREE with scala.Double = js.native
    /* 5 */ val GITERR_ZLIB: nodegitLib.errorMod.ErrorNs.ERROR.GITERR_ZLIB with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.errorMod.ErrorNs.ERROR with scala.Double] = js.native
  }
  
  type CODE = nodegitLib.errorMod.ErrorNs.CODE
  type ERROR = nodegitLib.errorMod.ErrorNs.ERROR
}

