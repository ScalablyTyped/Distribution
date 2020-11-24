package typings.meteor.reactiveVarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/reactive-var", "ReactiveVar")
@js.native
class ReactiveVarCls[T] protected () extends ReactiveVar[T] {
  def this(initialValue: T) = this()
  def this(initialValue: T, equalsFunc: js.Function2[/* oldValue */ T, /* newValue */ T, Boolean]) = this()
}
