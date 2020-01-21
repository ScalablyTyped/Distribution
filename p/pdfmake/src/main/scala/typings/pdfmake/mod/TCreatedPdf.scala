package typings.pdfmake.mod

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TCreatedPdf extends js.Object {
  @JSName("download")
  var download_Original: CreatedPdfDownloadParams = js.native
  @JSName("getBase64")
  var getBase64_Original: CreatedPdfBufferParams = js.native
  @JSName("getBlob")
  var getBlob_Original: CreatedPdfBufferParams = js.native
  @JSName("getBuffer")
  var getBuffer_Original: CreatedPdfBufferParams = js.native
  @JSName("getDataUrl")
  var getDataUrl_Original: CreatedPdfBufferParams = js.native
  @JSName("getStream")
  var getStream_Original: CreatedPdfBufferParams = js.native
   // minimal version 0.1.41
  @JSName("open")
  var open_Original: CreatedPdfOpenPrintParams = js.native
  @JSName("print")
  var print_Original: CreatedPdfOpenPrintParams = js.native
  def download(): Unit = js.native
  def download(defaultFileName: String): Unit = js.native
  def download(defaultFileName: String, cb: js.Function0[Unit]): Unit = js.native
  def download(defaultFileName: String, cb: js.Function0[Unit], options: BufferOptions): Unit = js.native
  def getBase64(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit]): Unit = js.native
  def getBase64(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit], options: BufferOptions): Unit = js.native
  def getBlob(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit]): Unit = js.native
  def getBlob(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit], options: BufferOptions): Unit = js.native
  def getBuffer(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit]): Unit = js.native
  def getBuffer(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit], options: BufferOptions): Unit = js.native
  def getDataUrl(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit]): Unit = js.native
  def getDataUrl(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit], options: BufferOptions): Unit = js.native
  def getStream(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit]): Unit = js.native
  def getStream(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit], options: BufferOptions): Unit = js.native
   // minimal version 0.1.41
  def open(): Unit = js.native
  def open(options: BufferOptions): Unit = js.native
  def open(options: BufferOptions, win: Window_): Unit = js.native
  def print(): Unit = js.native
  def print(options: BufferOptions): Unit = js.native
  def print(options: BufferOptions, win: Window_): Unit = js.native
}

