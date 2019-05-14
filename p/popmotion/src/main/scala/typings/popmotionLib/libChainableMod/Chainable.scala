package typings
package popmotionLib.libChainableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chainable[T] extends js.Object {
  var props: popmotionLib.libChainableTypesMod.Props
  def applyMiddleware(middleware: popmotionLib.libObserverTypesMod.Middleware): T
  def create(props: popmotionLib.libChainableTypesMod.Props): T
  def filter(predicate: popmotionLib.libChainableTypesMod.Predicate): T
  def pipe(funcs: popmotionLib.libObserverTypesMod.Update*): T
  def `while`(predicate: popmotionLib.libChainableTypesMod.Predicate): T
}

object Chainable {
  @scala.inline
  def apply[T](
    applyMiddleware: popmotionLib.libObserverTypesMod.Middleware => T,
    create: popmotionLib.libChainableTypesMod.Props => T,
    filter: popmotionLib.libChainableTypesMod.Predicate => T,
    pipe: /* repeated */ popmotionLib.libObserverTypesMod.Update => T,
    props: popmotionLib.libChainableTypesMod.Props,
    `while`: popmotionLib.libChainableTypesMod.Predicate => T
  ): Chainable[T] = {
    val __obj = js.Dynamic.literal(applyMiddleware = js.Any.fromFunction1(applyMiddleware), create = js.Any.fromFunction1(create), filter = js.Any.fromFunction1(filter), pipe = js.Any.fromFunction1(pipe), props = props)
    __obj.updateDynamic("while")(js.Any.fromFunction1(`while`))
    __obj.asInstanceOf[Chainable[T]]
  }
}

