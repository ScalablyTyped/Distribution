package typings.ow.predicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator[T] extends js.Object {
  
  def message(value: T): String = js.native
  def message(value: T, label: js.UndefOr[scala.Nothing], result: js.Any): String = js.native
  def message(value: T, label: String): String = js.native
  def message(value: T, label: String, result: js.Any): String = js.native
  
  /**
    Provide custom message used by `not` operator.
    When absent, the return value of `message()` is used and 'not' is inserted after the first 'to',
    e.g. `Expected 'smth' to be empty` -> `Expected 'smth' to not be empty`.
    */
  var negatedMessage: js.UndefOr[js.Function2[/* value */ T, /* label */ String, String]] = js.native
  
  def validator(value: T): js.Any = js.native
}
