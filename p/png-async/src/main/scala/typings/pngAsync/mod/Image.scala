package typings.pngAsync.mod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("png-async", "Image")
@js.native
class Image () extends Duplex {
  def this(option: IImageOptions) = this()
  
  var _gamma: js.Any = js.native
  
  var _handleClose: js.Any = js.native
  
  var _metadata: js.Any = js.native
  
  var _packer: js.Any = js.native
  
  var _parser: js.Any = js.native
  
  def _read(): Unit = js.native
  
  def _write(data: js.Any, encoding: js.Any, callback: js.Any): Boolean = js.native
  
  def bitblt(dst: Image, sx: Double, sy: Double, w: Double, h: Double, dx: Double, dy: Double): this.type = js.native
  
  var data: Buffer = js.native
  
  var gamma: Double = js.native
  
  var height: Double = js.native
  
  def pack(): Image = js.native
  
  def parse(data: Buffer): Image = js.native
  def parse(data: Buffer, callback: js.Function2[/* err */ Error, /* image */ this.type, Unit]): Image = js.native
  
  var width: Double = js.native
}
