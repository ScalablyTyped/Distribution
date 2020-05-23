package typings.meteor.global

import org.scalablytyped.runtime.TopLevel
import typings.meteor.ReactiveVarStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReactiveVar")
@js.native
class ReactiveVar[T] protected ()
  extends typings.meteor.ReactiveVar[T] {
  def this(initialValue: T) = this()
  def this(initialValue: T, equalsFunc: js.Function) = this()
  /* CompleteClass */
  override def get(): T = js.native
  /* CompleteClass */
  override def set(newValue: T): Unit = js.native
}

@JSGlobal("ReactiveVar")
@js.native
object ReactiveVar extends TopLevel[ReactiveVarStatic]

