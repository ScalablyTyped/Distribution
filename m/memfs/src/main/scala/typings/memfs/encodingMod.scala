package typings.memfs

import typings.memfs.memfsStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("memfs/lib/encoding", "ENCODING_UTF8")
  @js.native
  val ENCODING_UTF8: BufferEncoding = js.native
  
  @JSImport("memfs/lib/encoding", "assertEncoding")
  @js.native
  def assertEncoding(): Unit = js.native
  @JSImport("memfs/lib/encoding", "assertEncoding")
  @js.native
  def assertEncoding(encoding: String): Unit = js.native
  
  @JSImport("memfs/lib/encoding", "strToEncoding")
  @js.native
  def strToEncoding(str: String): TDataOut = js.native
  @JSImport("memfs/lib/encoding", "strToEncoding")
  @js.native
  def strToEncoding(str: String, encoding: TEncodingExtended): TDataOut = js.native
  
  type TDataOut = String | Buffer
  
  type TEncodingExtended = BufferEncoding | buffer
}
