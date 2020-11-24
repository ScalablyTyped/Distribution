package typings.nodeGzip

import typings.node.Buffer
import typings.node.zlibMod.InputType
import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-gzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def gzip(input: InputType): js.Promise[Buffer] = js.native
  def gzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = js.native
  
  def ungzip(input: InputType): js.Promise[Buffer] = js.native
  def ungzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = js.native
}
