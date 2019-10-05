package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IPreviewerActiveXCtrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.PreviewerActiveXCtrl")
@js.native
class PreviewerActiveXCtrl () extends IPreviewerActiveXCtrl {
  /* CompleteClass */
  override def ClearPreview(): Double = js.native
  /* CompleteClass */
  override def ShowFilePreview(bstrFilename: String): Double = js.native
  /* CompleteClass */
  override def ShowHitHighlightedFilePreview(
    bstrFilename: String,
    lObjType: Double,
    lObjID: Double,
    lObjVersion: Double,
    lFile: Double,
    lFileVersion: Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: String
  ): Double = js.native
}

@JSGlobal("MFiles.PreviewerActiveXCtrl")
@js.native
object PreviewerActiveXCtrl extends Instantiable0[IPreviewerActiveXCtrl]

