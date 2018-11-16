package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFPermissionsExpressionType extends js.Object

@JSGlobal("MFiles.MFPermissionsExpressionType")
@js.native
object MFPermissionsExpressionType extends js.Object {
  @js.native
  sealed trait ACL
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  @js.native
  sealed trait DeletableBy
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  @js.native
  sealed trait EditableBy
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  @js.native
  sealed trait FullControlBy
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  @js.native
  sealed trait ObjectsAttachableToThisItemBy
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  @js.native
  sealed trait PermissionsChangeableBy
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  @js.native
  sealed trait VisibleTo
    extends mfilesLib.MFilesNs.MFPermissionsExpressionType
  
  /* 0 */ val ACL: ACL with scala.Double = js.native
  /* 5 */ val DeletableBy: DeletableBy with scala.Double = js.native
  /* 2 */ val EditableBy: EditableBy with scala.Double = js.native
  /* 4 */ val FullControlBy: FullControlBy with scala.Double = js.native
  /* 6 */ val ObjectsAttachableToThisItemBy: ObjectsAttachableToThisItemBy with scala.Double = js.native
  /* 3 */ val PermissionsChangeableBy: PermissionsChangeableBy with scala.Double = js.native
  /* 1 */ val VisibleTo: VisibleTo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFPermissionsExpressionType with scala.Double] = js.native
}

