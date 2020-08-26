package typings.mocBetterSqlite3.mod.MocBetterSqlite3

import typings.mocBetterSqlite3.mod.RunResult
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement[BindParameters /* <: js.Array[_] */] extends js.Object {
  var database: Database = js.native
  var reader: Boolean = js.native
  var source: String = js.native
  def all(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): js.Array[_] = js.native
  def bind(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): this.type = js.native
  def columns(): js.Array[ColumnDefinition] = js.native
  def expand(): this.type = js.native
  def expand(toggleState: Boolean): this.type = js.native
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): js.Any = js.native
  def iterate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): IterableIterator[_] = js.native
  def pluck(): this.type = js.native
  def pluck(toggleState: Boolean): this.type = js.native
  def raw(): this.type = js.native
  def raw(toggleState: Boolean): this.type = js.native
  def run(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): RunResult = js.native
  def safeIntegers(): this.type = js.native
  def safeIntegers(toggleState: Boolean): this.type = js.native
}

