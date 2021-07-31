package typings.memfs

import typings.memfs.memfsStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("memfs/lib/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memfs/lib/encoding", "ENCODING_UTF8")
  @js.native
  val ENCODING_UTF8: BufferEncoding = js.native
  
  @scala.inline
  def assertEncoding(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEncoding")().asInstanceOf[Unit]
  @scala.inline
  def assertEncoding(encoding: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def strToEncoding(str: String): TDataOut = ^.asInstanceOf[js.Dynamic].applyDynamic("strToEncoding")(str.asInstanceOf[js.Any]).asInstanceOf[TDataOut]
  @scala.inline
  def strToEncoding(str: String, encoding: TEncodingExtended): TDataOut = (^.asInstanceOf[js.Dynamic].applyDynamic("strToEncoding")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[TDataOut]
  
  type TDataOut = String | Buffer
  
  type TEncodingExtended = BufferEncoding | buffer
}
