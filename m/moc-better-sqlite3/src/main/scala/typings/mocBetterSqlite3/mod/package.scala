package typings.mocBetterSqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentTypes[F /* <: typings.mocBetterSqlite3.mod.VariableArgFunction */] = js.Any
  type ColumnDefinition = typings.mocBetterSqlite3.mod.MocBetterSqlite3.ColumnDefinition
  type Database = typings.mocBetterSqlite3.mod.MocBetterSqlite3.Database
  type Integer = (js.Function1[/* val */ typings.integer.mod.IntLike, typings.integer.mod.IntClass]) with typings.mocBetterSqlite3.anon.TypeofInteger
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias moc-better-sqlite3.moc-better-sqlite3.SqliteError */ js.Object
  ]
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = typings.mocBetterSqlite3.mod.MocBetterSqlite3.Statement[js.Array[BindParameters] | BindParameters]
  type Transaction = typings.mocBetterSqlite3.mod.MocBetterSqlite3.Transaction[typings.mocBetterSqlite3.mod.VariableArgFunction]
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
