package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OCRZones")
@js.native
class OCRZones ()
  extends mfilesLib.IOCRZones {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, OCRZone: mfilesLib.IOCRZone): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IOCRZones = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IOCRZone = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.OCRZones")
@js.native
object OCRZones
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IOCRZones]

