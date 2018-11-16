package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TCreatedPdf extends js.Object {
  @JSName("download")
  var download_Original: CreatedPdfParams = js.native
  @JSName("open")
  var open_Original: CreatedPdfParams = js.native
  @JSName("print")
  var print_Original: CreatedPdfParams = js.native
  def download(): scala.Unit = js.native
  def download(defaultFileName: java.lang.String): scala.Unit = js.native
  def download(defaultFileName: java.lang.String, cb: java.lang.String): scala.Unit = js.native
  def download(defaultFileName: java.lang.String, cb: java.lang.String, options: java.lang.String): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def open(defaultFileName: java.lang.String): scala.Unit = js.native
  def open(defaultFileName: java.lang.String, cb: java.lang.String): scala.Unit = js.native
  def open(defaultFileName: java.lang.String, cb: java.lang.String, options: java.lang.String): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def print(defaultFileName: java.lang.String): scala.Unit = js.native
  def print(defaultFileName: java.lang.String, cb: java.lang.String): scala.Unit = js.native
  def print(defaultFileName: java.lang.String, cb: java.lang.String, options: java.lang.String): scala.Unit = js.native
}

