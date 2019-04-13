package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.PreviewerActiveXCtrl")
@js.native
class PreviewerActiveXCtrl ()
  extends mfilesLib.IPreviewerActiveXCtrl {
  /* CompleteClass */
  override def ClearPreview(): scala.Double = js.native
  /* CompleteClass */
  override def ShowFilePreview(bstrFilename: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def ShowHitHighlightedFilePreview(
    bstrFilename: java.lang.String,
    lObjType: scala.Double,
    lObjID: scala.Double,
    lObjVersion: scala.Double,
    lFile: scala.Double,
    lFileVersion: scala.Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: java.lang.String
  ): scala.Double = js.native
}

@JSGlobal("MFiles.PreviewerActiveXCtrl")
@js.native
object PreviewerActiveXCtrl
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IPreviewerActiveXCtrl]

