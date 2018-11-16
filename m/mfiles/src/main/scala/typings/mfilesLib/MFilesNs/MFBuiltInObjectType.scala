package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFBuiltInObjectType extends js.Object

@JSGlobal("MFiles.MFBuiltInObjectType")
@js.native
object MFBuiltInObjectType extends js.Object {
  @js.native
  sealed trait Assignment
    extends mfilesLib.MFilesNs.MFBuiltInObjectType
  
  @js.native
  sealed trait Document
    extends mfilesLib.MFilesNs.MFBuiltInObjectType
  
  @js.native
  sealed trait DocumentCollection
    extends mfilesLib.MFilesNs.MFBuiltInObjectType
  
  @js.native
  sealed trait DocumentOrDocumentCollection
    extends mfilesLib.MFilesNs.MFBuiltInObjectType
  
  /* 10 */ val Assignment: Assignment with scala.Double = js.native
  /* 0 */ val Document: Document with scala.Double = js.native
  /* 9 */ val DocumentCollection: DocumentCollection with scala.Double = js.native
  /* -102 */ val DocumentOrDocumentCollection: DocumentOrDocumentCollection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFBuiltInObjectType with scala.Double] = js.native
}

