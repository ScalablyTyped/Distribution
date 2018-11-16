package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFStringDataType extends js.Object

@JSGlobal("MFiles.MFStringDataType")
@js.native
object MFStringDataType extends js.Object {
  @js.native
  sealed trait JSON
    extends mfilesLib.MFilesNs.MFStringDataType
  
  @js.native
  sealed trait XML
    extends mfilesLib.MFilesNs.MFStringDataType
  
  /* 0 */ val JSON: JSON with scala.Double = js.native
  /* 1 */ val XML: XML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFStringDataType with scala.Double] = js.native
}

