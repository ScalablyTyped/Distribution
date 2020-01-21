package typings.popmotion.chainableMod

import typings.popmotion.chainableTypesMod.Predicate
import typings.popmotion.chainableTypesMod.Props
import typings.popmotion.observerTypesMod.Middleware
import typings.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chainable[T] extends js.Object {
  var props: Props
  def applyMiddleware(middleware: Middleware): T
  def create(props: Props): T
  def filter(predicate: Predicate): T
  def pipe(funcs: Update*): T
  def `while`(predicate: Predicate): T
}

object Chainable {
  @scala.inline
  def apply[T](
    applyMiddleware: Middleware => T,
    create: Props => T,
    filter: Predicate => T,
    pipe: /* repeated */ Update => T,
    props: Props,
    `while`: Predicate => T
  ): Chainable[T] = {
    val __obj = js.Dynamic.literal(applyMiddleware = js.Any.fromFunction1(applyMiddleware), create = js.Any.fromFunction1(create), filter = js.Any.fromFunction1(filter), pipe = js.Any.fromFunction1(pipe), props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("while")(js.Any.fromFunction1(`while`))
    __obj.asInstanceOf[Chainable[T]]
  }
}

