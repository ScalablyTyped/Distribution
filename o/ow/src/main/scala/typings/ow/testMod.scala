package typings.ow

import typings.ow.basePredicateMod.BasePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/test", JSImport.Namespace)
@js.native
object testMod extends js.Object {
  
  def default[T](value: T, label: String, predicate: BasePredicate[T]): Unit = js.native
  def default[T](value: T, label: js.Function, predicate: BasePredicate[T]): Unit = js.native
}
