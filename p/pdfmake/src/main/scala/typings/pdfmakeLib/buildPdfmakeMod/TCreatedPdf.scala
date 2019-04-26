package typings
package pdfmakeLib.buildPdfmakeMod

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
  def download(): scala.Unit = js.native
  def download(defaultFileName: java.lang.String): scala.Unit = js.native
  def download(defaultFileName: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def download(defaultFileName: java.lang.String, cb: js.Function0[scala.Unit], options: BufferOptions): scala.Unit = js.native
  def getBase64(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit]): scala.Unit = js.native
  def getBase64(
    cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit],
    options: BufferOptions
  ): scala.Unit = js.native
  def getBlob(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit]): scala.Unit = js.native
  def getBlob(
    cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit],
    options: BufferOptions
  ): scala.Unit = js.native
  def getBuffer(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit]): scala.Unit = js.native
  def getBuffer(
    cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit],
    options: BufferOptions
  ): scala.Unit = js.native
  def getDataUrl(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit]): scala.Unit = js.native
  def getDataUrl(
    cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit],
    options: BufferOptions
  ): scala.Unit = js.native
  def getStream(cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit]): scala.Unit = js.native
  def getStream(
    cb: js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit],
    options: BufferOptions
  ): scala.Unit = js.native
   // minimal version 0.1.41
  def open(): scala.Unit = js.native
  def open(options: BufferOptions): scala.Unit = js.native
  def open(options: BufferOptions, win: stdLib.Window): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def print(options: BufferOptions): scala.Unit = js.native
  def print(options: BufferOptions, win: stdLib.Window): scala.Unit = js.native
}

