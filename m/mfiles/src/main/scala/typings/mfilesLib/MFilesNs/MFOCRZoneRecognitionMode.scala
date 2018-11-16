package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFOCRZoneRecognitionMode extends js.Object

@JSGlobal("MFiles.MFOCRZoneRecognitionMode")
@js.native
object MFOCRZoneRecognitionMode extends js.Object {
  @js.native
  sealed trait AutoDetectZones
    extends mfilesLib.MFilesNs.MFOCRZoneRecognitionMode
  
  @js.native
  sealed trait NoZoneRecognition
    extends mfilesLib.MFilesNs.MFOCRZoneRecognitionMode
  
  @js.native
  sealed trait RecognizeSpecifiedZones
    extends mfilesLib.MFilesNs.MFOCRZoneRecognitionMode
  
  /* 2 */ val AutoDetectZones: AutoDetectZones with scala.Double = js.native
  /* 0 */ val NoZoneRecognition: NoZoneRecognition with scala.Double = js.native
  /* 1 */ val RecognizeSpecifiedZones: RecognizeSpecifiedZones with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFOCRZoneRecognitionMode with scala.Double] = js.native
}

