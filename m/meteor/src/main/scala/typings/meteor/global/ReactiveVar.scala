package typings.meteor.global

import org.scalablytyped.runtime.TopLevel
import typings.meteor.ReactiveVarStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ReactiveVar")
@js.native
class ReactiveVar[T] protected ()
  extends typings.meteor.ReactiveVar[T] {
  def this(initialValue: T) = this()
  def this(initialValue: T, equalsFunc: js.Function) = this()
}
@JSGlobal("ReactiveVar")
@js.native
object ReactiveVar extends TopLevel[ReactiveVarStatic]
