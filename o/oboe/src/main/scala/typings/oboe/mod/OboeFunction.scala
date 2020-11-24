package typings.oboe.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OboeFunction
  extends js.Function {
  
  def apply(options: Options): Oboe = js.native
  def apply(stream: ReadableStream): Oboe = js.native
  def apply(url: String): Oboe = js.native
  
  var drop: js.Object = js.native
}
