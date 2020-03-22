package typings.meteor.reactiveVarMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveVar[T] extends js.Object {
  def get(): T
  def set(newValue: T): Unit
}

@JSImport("meteor/reactive-var", "ReactiveVar")
@js.native
object ReactiveVar extends TopLevel[ReactiveVarStatic]

