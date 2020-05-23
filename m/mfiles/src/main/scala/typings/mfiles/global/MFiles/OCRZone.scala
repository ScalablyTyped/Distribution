package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IOCROptions
import typings.mfiles.IOCRZone
import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OCRZone")
@js.native
class OCRZone () extends IOCRZone {
  /* CompleteClass */
  override var Barcode: Boolean = js.native
  /* CompleteClass */
  override var DataType: MFDataType = js.native
  /* CompleteClass */
  override var DimensionUnit: MFOCRDimensionUnit = js.native
  /* CompleteClass */
  override val HasOCROptions: Boolean = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Left: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var OCROptions: IOCROptions = js.native
  /* CompleteClass */
  override var Top: Double = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override def ClearOCROptions(): Unit = js.native
  /* CompleteClass */
  override def Clone(): IOCRZone = js.native
  /* CompleteClass */
  override def SetOCROptions(OCROptions: IOCROptions): Unit = js.native
}

@JSGlobal("MFiles.OCRZone")
@js.native
object OCRZone extends Instantiable0[IOCRZone]

