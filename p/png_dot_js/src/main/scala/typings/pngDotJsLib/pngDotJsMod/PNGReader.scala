package typings
package pngDotJsLib.pngDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGReader extends js.Object {
  var bytes: stdLib.Uint8Array | js.Array[scala.Double] | nodeLib.Buffer = js.native
  var dataChunks: js.Array[js.Array[scala.Double]] = js.native
  var i: scala.Double = js.native
  var png: PNG = js.native
  def parse(callback: pngDotJsLib.ParseCallback): scala.Unit = js.native
  def parse(options: ParseOptions, callback: pngDotJsLib.ParseCallback): scala.Unit = js.native
}

