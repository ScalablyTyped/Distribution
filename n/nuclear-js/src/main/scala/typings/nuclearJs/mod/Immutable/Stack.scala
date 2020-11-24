package typings.nuclearJs.mod.Immutable

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nuclear-js", "Immutable.Stack")
@js.native
object Stack extends js.Object {
  
  def apply(): typings.immutable.Immutable.Stack[_] = js.native
  def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Stack[T] = js.native
  
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
  
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): typings.immutable.Immutable.Stack[T] = js.native
}
