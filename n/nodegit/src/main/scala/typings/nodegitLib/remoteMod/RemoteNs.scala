package typings
package nodegitLib.remoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/remote", "Remote")
@js.native
object RemoteNs extends js.Object {
  @js.native
  sealed trait AUTOTAG_OPTION extends js.Object
  
  @js.native
  sealed trait COMPLETION_TYPE extends js.Object
  
  @js.native
  object AUTOTAG_OPTION extends js.Object {
    @js.native
    sealed trait DOWNLOAD_TAGS_ALL
      extends nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION
    
    @js.native
    sealed trait DOWNLOAD_TAGS_AUTO
      extends nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION
    
    @js.native
    sealed trait DOWNLOAD_TAGS_NONE
      extends nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION
    
    @js.native
    sealed trait DOWNLOAD_TAGS_UNSPECIFIED
      extends nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION
    
    /* 3 */ val DOWNLOAD_TAGS_ALL: DOWNLOAD_TAGS_ALL with scala.Double = js.native
    /* 1 */ val DOWNLOAD_TAGS_AUTO: DOWNLOAD_TAGS_AUTO with scala.Double = js.native
    /* 2 */ val DOWNLOAD_TAGS_NONE: DOWNLOAD_TAGS_NONE with scala.Double = js.native
    /* 0 */ val DOWNLOAD_TAGS_UNSPECIFIED: DOWNLOAD_TAGS_UNSPECIFIED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION with scala.Double] = js.native
  }
  
  @js.native
  object COMPLETION_TYPE extends js.Object {
    @js.native
    sealed trait COMPLETION_DOWNLOAD
      extends nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE
    
    @js.native
    sealed trait COMPLETION_ERROR
      extends nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE
    
    @js.native
    sealed trait COMPLETION_INDEXING
      extends nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE
    
    /* 0 */ val COMPLETION_DOWNLOAD: COMPLETION_DOWNLOAD with scala.Double = js.native
    /* 2 */ val COMPLETION_ERROR: COMPLETION_ERROR with scala.Double = js.native
    /* 1 */ val COMPLETION_INDEXING: COMPLETION_INDEXING with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE with scala.Double] = js.native
  }
  
}

