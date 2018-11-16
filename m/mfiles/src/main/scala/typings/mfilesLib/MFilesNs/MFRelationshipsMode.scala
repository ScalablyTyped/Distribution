package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFRelationshipsMode extends js.Object

@JSGlobal("MFiles.MFRelationshipsMode")
@js.native
object MFRelationshipsMode extends js.Object {
  @js.native
  sealed trait All
    extends mfilesLib.MFilesNs.MFRelationshipsMode
  
  @js.native
  sealed trait FromThisObject
    extends mfilesLib.MFilesNs.MFRelationshipsMode
  
  @js.native
  sealed trait ToThisObject
    extends mfilesLib.MFilesNs.MFRelationshipsMode
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 1 */ val FromThisObject: FromThisObject with scala.Double = js.native
  /* 2 */ val ToThisObject: ToThisObject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFRelationshipsMode with scala.Double] = js.native
}

