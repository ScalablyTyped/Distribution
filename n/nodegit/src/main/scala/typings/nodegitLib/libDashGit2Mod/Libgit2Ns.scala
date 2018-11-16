package typings
package nodegitLib.libDashGit2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/lib-git2", "Libgit2")
@js.native
object Libgit2Ns extends js.Object {
  @js.native
  sealed trait OPT extends js.Object
  
  @js.native
  object OPT extends js.Object {
    @js.native
    sealed trait ENABLE_CACHING
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait GET_CACHED_MEMORY
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait GET_MWINDOW_MAPPED_LIMIT
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait GET_MWINDOW_SIZE
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait GET_SEARCH_PATH
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait GET_TEMPLATE_PATH
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_CACHE_MAX_SIZE
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_CACHE_OBJECT_LIMIT
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_MWINDOW_MAPPED_LIMIT
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_MWINDOW_SIZE
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_SEARCH_PATH
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_SSL_CERT_LOCATIONS
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    @js.native
    sealed trait SET_TEMPLATE_PATH
      extends nodegitLib.libDashGit2Mod.Libgit2Ns.OPT
    
    /* 8 */ val ENABLE_CACHING: ENABLE_CACHING with scala.Double = js.native
    /* 9 */ val GET_CACHED_MEMORY: GET_CACHED_MEMORY with scala.Double = js.native
    /* 2 */ val GET_MWINDOW_MAPPED_LIMIT: GET_MWINDOW_MAPPED_LIMIT with scala.Double = js.native
    /* 0 */ val GET_MWINDOW_SIZE: GET_MWINDOW_SIZE with scala.Double = js.native
    /* 4 */ val GET_SEARCH_PATH: GET_SEARCH_PATH with scala.Double = js.native
    /* 10 */ val GET_TEMPLATE_PATH: GET_TEMPLATE_PATH with scala.Double = js.native
    /* 7 */ val SET_CACHE_MAX_SIZE: SET_CACHE_MAX_SIZE with scala.Double = js.native
    /* 6 */ val SET_CACHE_OBJECT_LIMIT: SET_CACHE_OBJECT_LIMIT with scala.Double = js.native
    /* 3 */ val SET_MWINDOW_MAPPED_LIMIT: SET_MWINDOW_MAPPED_LIMIT with scala.Double = js.native
    /* 1 */ val SET_MWINDOW_SIZE: SET_MWINDOW_SIZE with scala.Double = js.native
    /* 5 */ val SET_SEARCH_PATH: SET_SEARCH_PATH with scala.Double = js.native
    /* 12 */ val SET_SSL_CERT_LOCATIONS: SET_SSL_CERT_LOCATIONS with scala.Double = js.native
    /* 11 */ val SET_TEMPLATE_PATH: SET_TEMPLATE_PATH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.libDashGit2Mod.Libgit2Ns.OPT with scala.Double] = js.native
  }
  
}

