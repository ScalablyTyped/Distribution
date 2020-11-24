package typings.pngJs.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNGReader extends js.Object {
  
  var bytes: Uint8Array | js.Array[Double] | Buffer = js.native
  
  var dataChunks: js.Array[js.Array[Double]] = js.native
  
  var i: Double = js.native
  
  def parse(callback: ParseCallback): Unit = js.native
  def parse(options: ParseOptions, callback: ParseCallback): Unit = js.native
  
  var png: PNG = js.native
}
