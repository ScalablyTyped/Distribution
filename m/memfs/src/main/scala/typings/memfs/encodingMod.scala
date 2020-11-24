package typings.memfs

import typings.memfs.memfsStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/encoding", JSImport.Namespace)
@js.native
object encodingMod extends js.Object {
  
  val ENCODING_UTF8: BufferEncoding = js.native
  
  def assertEncoding(): Unit = js.native
  def assertEncoding(encoding: String): Unit = js.native
  
  def strToEncoding(str: String): TDataOut = js.native
  def strToEncoding(str: String, encoding: TEncodingExtended): TDataOut = js.native
  
  type TDataOut = String | Buffer
  
  type TEncodingExtended = BufferEncoding | buffer
}
