package typings.nodeSql2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
    */ typings.nodeSql2.nodeSql2Strings.Columns with org.scalablytyped.runtime.TopLevel[T]
  type Table[Name /* <: java.lang.String */, T] = typings.nodeSql2.mod.TableNode with typings.nodeSql2.mod.Queryable[T] with typings.nodeSql2.mod.Named[Name] with typings.nodeSql2.mod.Columns[T] with typings.nodeSql2.AnonAlter[T]
}
