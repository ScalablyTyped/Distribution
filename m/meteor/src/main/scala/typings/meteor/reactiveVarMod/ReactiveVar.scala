package typings.meteor.reactiveVarMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveVar[T] extends js.Object {
  
  def get(): T = js.native
  
  def set(newValue: T): Unit = js.native
}
@JSImport("meteor/reactive-var", "ReactiveVar")
@js.native
object ReactiveVar extends TopLevel[ReactiveVarStatic]
