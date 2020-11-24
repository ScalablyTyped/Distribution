package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss-selector-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  // TODO: Conditional types in TS 1.8 will really clean this up.
  def apply(): Processor[scala.Nothing, Selectors] = js.native
  def apply(processor: AsyncProcessor[Unit] | SyncProcessor[Unit]): Processor[scala.Nothing, scala.Nothing] = js.native
}
