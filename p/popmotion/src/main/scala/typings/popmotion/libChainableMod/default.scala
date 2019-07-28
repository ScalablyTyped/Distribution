package typings.popmotion.libChainableMod

import typings.popmotion.libChainableTypesMod.Predicate
import typings.popmotion.libChainableTypesMod.Props
import typings.popmotion.libObserverTypesMod.Middleware
import typings.popmotion.libObserverTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/chainable", JSImport.Default)
@js.native
abstract class default[T] () extends Chainable[T] {
  def this(props: Props) = this()
  /* CompleteClass */
  override var props: Props = js.native
  /* CompleteClass */
  override def applyMiddleware(middleware: Middleware): T = js.native
  /* CompleteClass */
  override def create(props: Props): T = js.native
  /* CompleteClass */
  override def filter(predicate: Predicate): T = js.native
  /* CompleteClass */
  override def pipe(funcs: Update*): T = js.native
  /* CompleteClass */
  override def `while`(predicate: Predicate): T = js.native
}

