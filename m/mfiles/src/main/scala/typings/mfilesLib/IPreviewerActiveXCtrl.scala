package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreviewerActiveXCtrl extends js.Object {
  def ClearPreview(): scala.Double
  def ShowFilePreview(bstrFilename: java.lang.String): scala.Double
  def ShowHitHighlightedFilePreview(
    bstrFilename: java.lang.String,
    lObjType: scala.Double,
    lObjID: scala.Double,
    lObjVersion: scala.Double,
    lFile: scala.Double,
    lFileVersion: scala.Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: java.lang.String
  ): scala.Double
}

