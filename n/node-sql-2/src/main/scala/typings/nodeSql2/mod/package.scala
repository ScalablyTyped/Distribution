package typings.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import typings.nodeSql2.anon.Alter
import typings.nodeSql2.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def define[Name /* <: String */, T](map: TableDefinition[Name, T]): Table[Name, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(map.asInstanceOf[js.Any]).asInstanceOf[Table[Name, T]]

inline def setDialect(dialect: SQLDialects): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDialect")(dialect.asInstanceOf[js.Any]).asInstanceOf[Unit]

type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Name in keyof T ]: node-sql-2.node-sql-2.Column<Name, T[Name]>}
  */ typings.nodeSql2.nodeSql2Strings.Columns & TopLevel[T]

type Table[Name /* <: String */, T] = TableNode & Queryable[T] & Named[Name] & Columns[T] & Alter[T]
