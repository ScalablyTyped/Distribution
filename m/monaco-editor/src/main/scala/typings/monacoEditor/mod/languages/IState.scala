package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  def equals(other: IState): Boolean
}

object IState {
  @scala.inline
  def apply(equals: IState => Boolean): IState = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[IState]
  }
}

