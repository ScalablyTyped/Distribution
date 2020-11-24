package typings.node.fsMod

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "mkdtempSync")
@js.native
object mkdtempSync extends js.Object {
  
  def apply(prefix: String): String = js.native
  def apply(prefix: String, options: String): String | Buffer = js.native
  def apply(prefix: String, options: BufferEncoding): String = js.native
  def apply(prefix: String, options: BaseEncodingOptions): String = js.native
  def apply(prefix: String, options: BufferEncodingOption): Buffer = js.native
}
