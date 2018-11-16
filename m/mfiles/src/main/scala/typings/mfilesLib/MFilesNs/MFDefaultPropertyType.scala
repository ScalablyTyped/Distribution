package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFDefaultPropertyType extends js.Object

@JSGlobal("MFiles.MFDefaultPropertyType")
@js.native
object MFDefaultPropertyType extends js.Object {
  @js.native
  sealed trait FixedValue
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  @js.native
  sealed trait FromEmail
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  @js.native
  sealed trait FromEmailHeader
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  @js.native
  sealed trait FromHPDSSXML
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  @js.native
  sealed trait FromOCR
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  @js.native
  sealed trait FromXML
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.MFDefaultPropertyType
  
  /* 1 */ val FixedValue: FixedValue with scala.Double = js.native
  /* 4 */ val FromEmail: FromEmail with scala.Double = js.native
  /* 5 */ val FromEmailHeader: FromEmailHeader with scala.Double = js.native
  /* 2 */ val FromHPDSSXML: FromHPDSSXML with scala.Double = js.native
  /* 6 */ val FromOCR: FromOCR with scala.Double = js.native
  /* 3 */ val FromXML: FromXML with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFDefaultPropertyType with scala.Double] = js.native
}

