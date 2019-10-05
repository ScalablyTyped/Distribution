package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  def equals(other: IState): Boolean
}

object IState {
  @scala.inline
  def apply(clone: () => IState, equals: IState => Boolean): IState = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), equals = js.Any.fromFunction1(equals))
  
    __obj.asInstanceOf[IState]
  }
}

