package typings.nodeSql2.mod

import typings.nodeSql2.anon.Alter
import typings.nodeSql2.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def define[Name /* <: String */, T](map: TableDefinition[Name, T]): Table[Name, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(map.asInstanceOf[js.Any]).asInstanceOf[Table[Name, T]]

inline def setDialect(dialect: SQLDialects): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDialect")(dialect.asInstanceOf[js.Any]).asInstanceOf[Unit]

type Table[Name /* <: String */, T] = TableNode & Queryable[T] & Named[Name] & Columns[T] & Alter[T]
