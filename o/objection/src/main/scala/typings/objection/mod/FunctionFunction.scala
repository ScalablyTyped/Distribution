package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionFunction extends js.Object {
  @JSName("avg")
  var avg_Original: SqlFunctionShortcut = js.native
  @JSName("coalesce")
  var coalesce_Original: SqlFunctionShortcut = js.native
  @JSName("concat")
  var concat_Original: SqlFunctionShortcut = js.native
  @JSName("count")
  var count_Original: SqlFunctionShortcut = js.native
  @JSName("lower")
  var lower_Original: SqlFunctionShortcut = js.native
  @JSName("max")
  var max_Original: SqlFunctionShortcut = js.native
  @JSName("min")
  var min_Original: SqlFunctionShortcut = js.native
  @JSName("sum")
  var sum_Original: SqlFunctionShortcut = js.native
  @JSName("upper")
  var upper_Original: SqlFunctionShortcut = js.native
  def apply(functionName: String, arguments: js.Any*): FunctionBuilder = js.native
  def avg(args: js.Any*): FunctionBuilder = js.native
  def coalesce(args: js.Any*): FunctionBuilder = js.native
  def concat(args: js.Any*): FunctionBuilder = js.native
  def count(args: js.Any*): FunctionBuilder = js.native
  def lower(args: js.Any*): FunctionBuilder = js.native
  def max(args: js.Any*): FunctionBuilder = js.native
  def min(args: js.Any*): FunctionBuilder = js.native
  def now(): FunctionBuilder = js.native
  def now(precision: Double): FunctionBuilder = js.native
  def sum(args: js.Any*): FunctionBuilder = js.native
  def upper(args: js.Any*): FunctionBuilder = js.native
}

