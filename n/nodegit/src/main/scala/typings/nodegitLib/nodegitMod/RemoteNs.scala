package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Remote")
@js.native
object RemoteNs extends js.Object {
  @js.native
  object AUTOTAG_OPTION extends js.Object {
    /* 3 */ val DOWNLOAD_TAGS_ALL: nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION.DOWNLOAD_TAGS_ALL with scala.Double = js.native
    /* 1 */ val DOWNLOAD_TAGS_AUTO: nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION.DOWNLOAD_TAGS_AUTO with scala.Double = js.native
    /* 2 */ val DOWNLOAD_TAGS_NONE: nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION.DOWNLOAD_TAGS_NONE with scala.Double = js.native
    /* 0 */ val DOWNLOAD_TAGS_UNSPECIFIED: nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION.DOWNLOAD_TAGS_UNSPECIFIED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION with scala.Double] = js.native
  }
  
  @js.native
  object COMPLETION_TYPE extends js.Object {
    /* 0 */ val COMPLETION_DOWNLOAD: nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE.COMPLETION_DOWNLOAD with scala.Double = js.native
    /* 2 */ val COMPLETION_ERROR: nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE.COMPLETION_ERROR with scala.Double = js.native
    /* 1 */ val COMPLETION_INDEXING: nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE.COMPLETION_INDEXING with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE with scala.Double] = js.native
  }
  
  type AUTOTAG_OPTION = nodegitLib.remoteMod.RemoteNs.AUTOTAG_OPTION
  type COMPLETION_TYPE = nodegitLib.remoteMod.RemoteNs.COMPLETION_TYPE
}

