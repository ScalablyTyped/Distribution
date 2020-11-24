package typings.megajs.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("megajs", "File")
@js.native
class File protected () extends js.Object {
  def this(options: String) = this()
  def this(options: FileOptions) = this()
  
  var attributes: js.Object = js.native
  
  var children: js.Array[File] = js.native
  
  var directory: Boolean = js.native
  
  def download(): Readable = js.native
  def download(options: js.UndefOr[scala.Nothing], cb: js.Any): Readable = js.native
  def download(options: DownloadOptions): Readable = js.native
  def download(options: DownloadOptions, cb: js.Any): Readable = js.native
  
  var downloadId: String = js.native
  
  var key: Buffer = js.native
  
  def loadAttributes(): Readable = js.native
  def loadAttributes(cb: js.Any): Readable = js.native
  
  var name: String = js.native
  
  var nodeId: String = js.native
  
  var size: Double = js.native
  
  var timestamp: Double = js.native
}
/* static members */
@JSImport("megajs", "File")
@js.native
object File extends js.Object {
  
  def fromURL(options: String): File = js.native
  def fromURL(options: FileOptions): File = js.native
  
  def unpackAttributes(at: js.Any): JSON = js.native
}
