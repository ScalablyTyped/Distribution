package typings.popmotion.chainableMod

import typings.popmotion.chainableTypesMod.Predicate
import typings.popmotion.chainableTypesMod.Props
import typings.popmotion.observerTypesMod.Middleware
import typings.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chainable[T] extends js.Object {
  var props: Props = js.native
  def applyMiddleware(middleware: Middleware): T = js.native
  def create(props: Props): T = js.native
  def filter(predicate: Predicate): T = js.native
  def pipe(funcs: Update*): T = js.native
  def `while`(predicate: Predicate): T = js.native
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
  @scala.inline
  implicit class ChainableOps[Self <: Chainable[_], T] (val x: Self with Chainable[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyMiddleware(value: Middleware => T): Self = this.set("applyMiddleware", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Props => T): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: Predicate => T): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setPipe(value: /* repeated */ Update => T): Self = this.set("pipe", js.Any.fromFunction1(value))
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhile(value: Predicate => T): Self = this.set("while", js.Any.fromFunction1(value))
  }
  
}

