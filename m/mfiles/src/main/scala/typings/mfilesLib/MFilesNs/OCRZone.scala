package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OCRZone")
@js.native
class OCRZone ()
  extends mfilesLib.IOCRZone {
  /* CompleteClass */
  override var Barcode: scala.Boolean = js.native
  /* CompleteClass */
  override var DataType: MFDataType = js.native
  /* CompleteClass */
  override var DimensionUnit: MFOCRDimensionUnit = js.native
  /* CompleteClass */
  override val HasOCROptions: scala.Boolean = js.native
  /* CompleteClass */
  override var Height: scala.Double = js.native
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Left: scala.Double = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var OCROptions: mfilesLib.IOCROptions = js.native
  /* CompleteClass */
  override var Top: scala.Double = js.native
  /* CompleteClass */
  override var Width: scala.Double = js.native
  /* CompleteClass */
  override def ClearOCROptions(): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IOCRZone = js.native
  /* CompleteClass */
  override def SetOCROptions(OCROptions: mfilesLib.IOCROptions): scala.Unit = js.native
}

@JSGlobal("MFiles.OCRZone")
@js.native
object OCRZone
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IOCRZone]

