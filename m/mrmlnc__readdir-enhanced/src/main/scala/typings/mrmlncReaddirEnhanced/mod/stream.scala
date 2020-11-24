package typings.mrmlncReaddirEnhanced.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mrmlnc/readdir-enhanced", "stream")
@js.native
object stream extends js.Object {
  
  def apply(root: String): ReadableStream = js.native
  def apply(root: String, options: Options): ReadableStream = js.native
  
  def stat(root: String): ReadableStream = js.native
  def stat(root: String, options: Options): ReadableStream = js.native
}
