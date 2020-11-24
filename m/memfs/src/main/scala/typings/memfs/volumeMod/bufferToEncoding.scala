package typings.memfs.volumeMod

import typings.memfs.encodingMod.TDataOut
import typings.memfs.encodingMod.TEncodingExtended
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/volume", "bufferToEncoding")
@js.native
object bufferToEncoding extends js.Object {
  
  def apply(buffer: Buffer): TDataOut = js.native
  def apply(buffer: Buffer, encoding: TEncodingExtended): TDataOut = js.native
}
