package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IOCRPage
import typings.mfiles.IOCRPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OCRPages")
@js.native
class OCRPages () extends IOCRPages {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, OCRPage: IOCRPage): Unit = js.native
  /* CompleteClass */
  override def Clone(): IOCRPages = js.native
  /* CompleteClass */
  override def Item(Index: Double): IOCRPage = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.OCRPages")
@js.native
object OCRPages extends Instantiable0[IOCRPages]

