package typings.pdfImage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf-image", "PDFImage")
@js.native
class PDFImage[CombinedImage /* <: Boolean */] protected () extends js.Object {
  def this(
    path: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type OptionalSpread<CombinedImage> is not an array type */ options: OptionalSpread[CombinedImage]
  ) = this()
  def combineImages(imagePaths: js.Array[String]): js.Promise[String] = js.native
  def constructCombineCommandForFile(imagePaths: js.Array[String]): String = js.native
  def constructConvertCommandForPage(pageNumber: Double): String = js.native
  def constructConvertOptions(): String = js.native
  def constructGetInfoCommand(): String = js.native
  def convertFile(): js.Promise[js.Array[String] | String] = js.native
  def convertPage(pageNumber: Double): js.Promise[String] = js.native
  def getInfo(): js.Promise[PDFInfo] = js.native
  def getOutputImagePathForFile(): String = js.native
  def getOutputImagePathForPage(pageNumber: Double): String = js.native
  def parseGetInfoCommandOutput(output: String): StringDictionary[String] = js.native
  def setConvertExtension(): Unit = js.native
  def setConvertExtension(convertExtension: String): Unit = js.native
  def setConvertOptions(): Unit = js.native
  def setConvertOptions(convertOptions: ConvertOptions): Unit = js.native
  def setPdfFileBaseName(): Unit = js.native
  def setPdfFileBaseName(pdfFileBaseName: String): Unit = js.native
}

