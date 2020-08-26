package typings.mocBetterSqlite3.mod.MocBetterSqlite3

import typings.mocBetterSqlite3.mod.AggregateOptions
import typings.mocBetterSqlite3.mod.BackupMetadata
import typings.mocBetterSqlite3.mod.BackupOptions
import typings.mocBetterSqlite3.mod.PragmaOptions
import typings.mocBetterSqlite3.mod.RegistrationOptions
import typings.mocBetterSqlite3.mod.VariableArgFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var inTransaction: Boolean = js.native
  var memory: Boolean = js.native
  var name: String = js.native
  var open: Boolean = js.native
  var readonly: Boolean = js.native
  def aggregate(name: String, options: AggregateOptions): this.type = js.native
  def backup(destinationFile: String): js.Promise[BackupMetadata] = js.native
  def backup(destinationFile: String, options: BackupOptions): js.Promise[BackupMetadata] = js.native
  def checkpoint(): this.type = js.native
  def checkpoint(databaseName: String): this.type = js.native
  def close(): this.type = js.native
  def defaultSafeIntegers(): this.type = js.native
  def defaultSafeIntegers(toggleState: Boolean): this.type = js.native
  def exec(source: String): this.type = js.native
  def function(name: String, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def function(name: String, options: RegistrationOptions, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def loadExtension(path: String): this.type = js.native
  def pragma(source: String): js.Any = js.native
  def pragma(source: String, options: PragmaOptions): js.Any = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def prepare[BindParameters /* <: js.Array[_] | js.Object */](source: String): Statement[js.Array[BindParameters] | BindParameters] = js.native
  def transaction[F /* <: VariableArgFunction */](fn: F): Transaction[F] = js.native
}

