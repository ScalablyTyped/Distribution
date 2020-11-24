package typings.pngAsync.crcMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrcStream extends Writable {
  
  var _crc: js.Any = js.native
  
  def _write(data: js.Any, encoding: js.Any, cb: js.Any): Unit = js.native
  
  val crc32: Double = js.native
}
