package typings.node.assertMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "fail")
@js.native
object fail extends js.Object {
  
  def apply(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def apply(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def apply(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
  def apply(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  def apply(
    actual: js.Any,
    expected: js.Any,
    message: String,
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: String, operator: String, stackStartFn: js.Function): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: Error): scala.Nothing = js.native
  def apply(
    actual: js.Any,
    expected: js.Any,
    message: Error,
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: Error, operator: String): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: Error, operator: String, stackStartFn: js.Function): scala.Nothing = js.native
  def apply(message: String): scala.Nothing = js.native
  def apply(message: Error): scala.Nothing = js.native
}
