package typings.node.zlibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zlib", "deflateRawSync")
@js.native
object deflateRawSync extends js.Object {
  def apply(buf: InputType): Buffer = js.native
  def apply(buf: InputType, options: ZlibOptions): Buffer = js.native
}

