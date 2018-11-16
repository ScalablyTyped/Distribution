package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFValueListItemPropertyDef extends js.Object

@JSGlobal("MFiles.MFValueListItemPropertyDef")
@js.native
object MFValueListItemPropertyDef extends js.Object {
  @js.native
  sealed trait Deleted
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  @js.native
  sealed trait ExtID
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  @js.native
  sealed trait ID
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  @js.native
  sealed trait Name
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  @js.native
  sealed trait ObjectType
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  @js.native
  sealed trait Owner
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  @js.native
  sealed trait Parent
    extends mfilesLib.MFilesNs.MFValueListItemPropertyDef
  
  /* 5 */ val Deleted: Deleted with scala.Double = js.native
  /* 7 */ val ExtID: ExtID with scala.Double = js.native
  /* 1 */ val ID: ID with scala.Double = js.native
  /* 2 */ val Name: Name with scala.Double = js.native
  /* 6 */ val ObjectType: ObjectType with scala.Double = js.native
  /* 3 */ val Owner: Owner with scala.Double = js.native
  /* 4 */ val Parent: Parent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFValueListItemPropertyDef with scala.Double] = js.native
}

