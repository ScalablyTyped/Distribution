package typings.nuclearJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMixin extends js.Object {
  def componentDidMount(): Unit
  def componentWillUnmount(): Unit
  def getInitialState(): js.Any
}

object ReactMixin {
  @scala.inline
  def apply(componentDidMount: () => Unit, componentWillUnmount: () => Unit, getInitialState: () => js.Any): ReactMixin = {
    val __obj = js.Dynamic.literal(componentDidMount = js.Any.fromFunction0(componentDidMount), componentWillUnmount = js.Any.fromFunction0(componentWillUnmount), getInitialState = js.Any.fromFunction0(getInitialState))
  
    __obj.asInstanceOf[ReactMixin]
  }
}

