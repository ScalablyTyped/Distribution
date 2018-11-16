package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFSignaturePromptInfoType extends js.Object

@JSGlobal("MFiles.MFSignaturePromptInfoType")
@js.native
object MFSignaturePromptInfoType extends js.Object {
  @js.native
  sealed trait Fixed
    extends mfilesLib.MFilesNs.MFSignaturePromptInfoType
  
  @js.native
  sealed trait MetadataBased
    extends mfilesLib.MFilesNs.MFSignaturePromptInfoType
  
  @js.native
  sealed trait Selectable
    extends mfilesLib.MFilesNs.MFSignaturePromptInfoType
  
  /* 0 */ val Fixed: Fixed with scala.Double = js.native
  /* 2 */ val MetadataBased: MetadataBased with scala.Double = js.native
  /* 1 */ val Selectable: Selectable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFSignaturePromptInfoType with scala.Double] = js.native
}

