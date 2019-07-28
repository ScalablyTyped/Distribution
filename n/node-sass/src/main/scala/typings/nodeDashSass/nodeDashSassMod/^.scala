package typings.nodeDashSass.nodeDashSassMod

import typings.nodeDashSass.nodeDashSassMod.typesNs.Boolean
import typings.nodeDashSass.nodeDashSassMod.typesNs.Null
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sass", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FALSE: Boolean = js.native
  val NULL: Null = js.native
  val TRUE: Boolean = js.native
  val info: String = js.native
  def render(options: Options, callback: SassRenderCallback): Unit = js.native
  def renderSync(options: SyncOptions): Result = js.native
}

