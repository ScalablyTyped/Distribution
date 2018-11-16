package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFolderContentItemType extends js.Object

@JSGlobal("MFiles.MFFolderContentItemType")
@js.native
object MFFolderContentItemType extends js.Object {
  @js.native
  sealed trait ObjectVersion
    extends mfilesLib.MFilesNs.MFFolderContentItemType
  
  @js.native
  sealed trait PropertyFolder
    extends mfilesLib.MFilesNs.MFFolderContentItemType
  
  @js.native
  sealed trait TraditionalFolder
    extends mfilesLib.MFilesNs.MFFolderContentItemType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFFolderContentItemType
  
  @js.native
  sealed trait ViewFolder
    extends mfilesLib.MFilesNs.MFFolderContentItemType
  
  /* 4 */ val ObjectVersion: ObjectVersion with scala.Double = js.native
  /* 2 */ val PropertyFolder: PropertyFolder with scala.Double = js.native
  /* 3 */ val TraditionalFolder: TraditionalFolder with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 1 */ val ViewFolder: ViewFolder with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFolderContentItemType with scala.Double] = js.native
}

