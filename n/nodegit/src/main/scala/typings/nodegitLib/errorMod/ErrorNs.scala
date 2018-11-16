package typings
package nodegitLib.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/error", "Error")
@js.native
object ErrorNs extends js.Object {
  @js.native
  sealed trait CODE extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  object CODE extends js.Object {
    @js.native
    sealed trait EAMBIGUOUS
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EAPPLIED
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EAUTH
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EBAREREPO
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EBUFS
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ECERTIFICATE
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ECONFLICT
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EDIRECTORY
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EEOF
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EEXISTS
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EINVALID
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EINVALIDSPEC
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ELOCKED
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EMODIFIED
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ENONFASTFORWARD
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ENOTFOUND
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EPEEL
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ERROR
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EUNBORNBRANCH
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EUNCOMMITTED
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EUNMERGED
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait EUSER
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait ITEROVER
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait OK
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    @js.native
    sealed trait PASSTHROUGH
      extends nodegitLib.errorMod.ErrorNs.CODE
    
    /* -5 */ val EAMBIGUOUS: EAMBIGUOUS with scala.Double = js.native
    /* -18 */ val EAPPLIED: EAPPLIED with scala.Double = js.native
    /* -16 */ val EAUTH: EAUTH with scala.Double = js.native
    /* -8 */ val EBAREREPO: EBAREREPO with scala.Double = js.native
    /* -6 */ val EBUFS: EBUFS with scala.Double = js.native
    /* -17 */ val ECERTIFICATE: ECERTIFICATE with scala.Double = js.native
    /* -13 */ val ECONFLICT: ECONFLICT with scala.Double = js.native
    /* -23 */ val EDIRECTORY: EDIRECTORY with scala.Double = js.native
    /* -20 */ val EEOF: EEOF with scala.Double = js.native
    /* -4 */ val EEXISTS: EEXISTS with scala.Double = js.native
    /* -21 */ val EINVALID: EINVALID with scala.Double = js.native
    /* -12 */ val EINVALIDSPEC: EINVALIDSPEC with scala.Double = js.native
    /* -14 */ val ELOCKED: ELOCKED with scala.Double = js.native
    /* -15 */ val EMODIFIED: EMODIFIED with scala.Double = js.native
    /* -11 */ val ENONFASTFORWARD: ENONFASTFORWARD with scala.Double = js.native
    /* -3 */ val ENOTFOUND: ENOTFOUND with scala.Double = js.native
    /* -19 */ val EPEEL: EPEEL with scala.Double = js.native
    /* -1 */ val ERROR: ERROR with scala.Double = js.native
    /* -9 */ val EUNBORNBRANCH: EUNBORNBRANCH with scala.Double = js.native
    /* -22 */ val EUNCOMMITTED: EUNCOMMITTED with scala.Double = js.native
    /* -10 */ val EUNMERGED: EUNMERGED with scala.Double = js.native
    /* -7 */ val EUSER: EUSER with scala.Double = js.native
    /* -31 */ val ITEROVER: ITEROVER with scala.Double = js.native
    /* 0 */ val OK: OK with scala.Double = js.native
    /* -30 */ val PASSTHROUGH: PASSTHROUGH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.errorMod.ErrorNs.CODE with scala.Double] = js.native
  }
  
  @js.native
  object ERROR extends js.Object {
    @js.native
    sealed trait GITERR_CALLBACK
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_CHECKOUT
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_CHERRYPICK
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_CONFIG
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_DESCRIBE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_FETCHHEAD
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_FILESYSTEM
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_FILTER
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_INDEX
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_INDEXER
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_INVALID
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_MERGE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_NET
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_NOMEMORY
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_NONE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_OBJECT
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_ODB
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_OS
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_REBASE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_REFERENCE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_REGEX
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_REPOSITORY
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_REVERT
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_SSH
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_SSL
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_STASH
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_SUBMODULE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_TAG
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_THREAD
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_TREE
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    @js.native
    sealed trait GITERR_ZLIB
      extends nodegitLib.errorMod.ErrorNs.ERROR
    
    /* 26 */ val GITERR_CALLBACK: GITERR_CALLBACK with scala.Double = js.native
    /* 20 */ val GITERR_CHECKOUT: GITERR_CHECKOUT with scala.Double = js.native
    /* 27 */ val GITERR_CHERRYPICK: GITERR_CHERRYPICK with scala.Double = js.native
    /* 7 */ val GITERR_CONFIG: GITERR_CONFIG with scala.Double = js.native
    /* 28 */ val GITERR_DESCRIBE: GITERR_DESCRIBE with scala.Double = js.native
    /* 21 */ val GITERR_FETCHHEAD: GITERR_FETCHHEAD with scala.Double = js.native
    /* 30 */ val GITERR_FILESYSTEM: GITERR_FILESYSTEM with scala.Double = js.native
    /* 24 */ val GITERR_FILTER: GITERR_FILTER with scala.Double = js.native
    /* 10 */ val GITERR_INDEX: GITERR_INDEX with scala.Double = js.native
    /* 15 */ val GITERR_INDEXER: GITERR_INDEXER with scala.Double = js.native
    /* 3 */ val GITERR_INVALID: GITERR_INVALID with scala.Double = js.native
    /* 22 */ val GITERR_MERGE: GITERR_MERGE with scala.Double = js.native
    /* 12 */ val GITERR_NET: GITERR_NET with scala.Double = js.native
    /* 1 */ val GITERR_NOMEMORY: GITERR_NOMEMORY with scala.Double = js.native
    /* 0 */ val GITERR_NONE: GITERR_NONE with scala.Double = js.native
    /* 11 */ val GITERR_OBJECT: GITERR_OBJECT with scala.Double = js.native
    /* 9 */ val GITERR_ODB: GITERR_ODB with scala.Double = js.native
    /* 2 */ val GITERR_OS: GITERR_OS with scala.Double = js.native
    /* 29 */ val GITERR_REBASE: GITERR_REBASE with scala.Double = js.native
    /* 4 */ val GITERR_REFERENCE: GITERR_REFERENCE with scala.Double = js.native
    /* 8 */ val GITERR_REGEX: GITERR_REGEX with scala.Double = js.native
    /* 6 */ val GITERR_REPOSITORY: GITERR_REPOSITORY with scala.Double = js.native
    /* 25 */ val GITERR_REVERT: GITERR_REVERT with scala.Double = js.native
    /* 23 */ val GITERR_SSH: GITERR_SSH with scala.Double = js.native
    /* 16 */ val GITERR_SSL: GITERR_SSL with scala.Double = js.native
    /* 19 */ val GITERR_STASH: GITERR_STASH with scala.Double = js.native
    /* 17 */ val GITERR_SUBMODULE: GITERR_SUBMODULE with scala.Double = js.native
    /* 13 */ val GITERR_TAG: GITERR_TAG with scala.Double = js.native
    /* 18 */ val GITERR_THREAD: GITERR_THREAD with scala.Double = js.native
    /* 14 */ val GITERR_TREE: GITERR_TREE with scala.Double = js.native
    /* 5 */ val GITERR_ZLIB: GITERR_ZLIB with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.errorMod.ErrorNs.ERROR with scala.Double] = js.native
  }
  
}

