package typings.nodeGzip

import typings.node.Buffer
import typings.node.zlibMod.InputType
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-gzip", "gzip")
  @js.native
  def gzip(input: InputType): js.Promise[Buffer] = js.native
  @JSImport("node-gzip", "gzip")
  @js.native
  def gzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = js.native
  
  @JSImport("node-gzip", "ungzip")
  @js.native
  def ungzip(input: InputType): js.Promise[Buffer] = js.native
  @JSImport("node-gzip", "ungzip")
  @js.native
  def ungzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = js.native
}
