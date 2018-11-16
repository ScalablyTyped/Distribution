package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFolderDefType extends js.Object

@JSGlobal("MFiles.MFFolderDefType")
@js.native
object MFFolderDefType extends js.Object {
  @js.native
  sealed trait AnyFolder
    extends mfilesLib.MFilesNs.MFFolderDefType
  
  @js.native
  sealed trait PropertyFolder
    extends mfilesLib.MFilesNs.MFFolderDefType
  
  @js.native
  sealed trait SearchFolder
    extends mfilesLib.MFilesNs.MFFolderDefType
  
  @js.native
  sealed trait TraditionalFolder
    extends mfilesLib.MFilesNs.MFFolderDefType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFFolderDefType
  
  @js.native
  sealed trait ViewFolder
    extends mfilesLib.MFilesNs.MFFolderDefType
  
  /* 1 */ val AnyFolder: AnyFolder with scala.Double = js.native
  /* 3 */ val PropertyFolder: PropertyFolder with scala.Double = js.native
  /* 5 */ val SearchFolder: SearchFolder with scala.Double = js.native
  /* 4 */ val TraditionalFolder: TraditionalFolder with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 2 */ val ViewFolder: ViewFolder with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFolderDefType with scala.Double] = js.native
}

