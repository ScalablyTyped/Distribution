package typings
package popmotionLib.libChainableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/chainable", JSImport.Default)
@js.native
abstract class default[T] () extends Chainable[T] {
  def this(props: popmotionLib.libChainableTypesMod.Props) = this()
  /* CompleteClass */
  override var props: popmotionLib.libChainableTypesMod.Props = js.native
  /* CompleteClass */
  override def applyMiddleware(middleware: popmotionLib.libObserverTypesMod.Middleware): T = js.native
  /* CompleteClass */
  override def create(props: popmotionLib.libChainableTypesMod.Props): T = js.native
  /* CompleteClass */
  override def filter(predicate: popmotionLib.libChainableTypesMod.Predicate): T = js.native
  /* CompleteClass */
  override def pipe(funcs: popmotionLib.libObserverTypesMod.Update*): T = js.native
  /* CompleteClass */
  override def `while`(predicate: popmotionLib.libChainableTypesMod.Predicate): T = js.native
}

