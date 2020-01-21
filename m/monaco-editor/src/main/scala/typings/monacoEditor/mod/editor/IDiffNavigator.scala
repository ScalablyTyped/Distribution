package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffNavigator extends js.Object {
  def canNavigate(): Boolean
  def dispose(): Unit
  def next(): Unit
  def previous(): Unit
}

object IDiffNavigator {
  @scala.inline
  def apply(canNavigate: () => Boolean, dispose: () => Unit, next: () => Unit, previous: () => Unit): IDiffNavigator = {
    val __obj = js.Dynamic.literal(canNavigate = js.Any.fromFunction0(canNavigate), dispose = js.Any.fromFunction0(dispose), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
  
    __obj.asInstanceOf[IDiffNavigator]
  }
}

