package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFBuiltInDocumentClass extends js.Object

@JSGlobal("MFiles.MFBuiltInDocumentClass")
@js.native
object MFBuiltInDocumentClass extends js.Object {
  @js.native
  sealed trait OtherDocument
    extends mfilesLib.MFilesNs.MFBuiltInDocumentClass
  
  @js.native
  sealed trait UnclassifiedDocument
    extends mfilesLib.MFilesNs.MFBuiltInDocumentClass
  
  /* 1 */ val OtherDocument: OtherDocument with scala.Double = js.native
  /* 0 */ val UnclassifiedDocument: UnclassifiedDocument with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFBuiltInDocumentClass with scala.Double] = js.native
}

