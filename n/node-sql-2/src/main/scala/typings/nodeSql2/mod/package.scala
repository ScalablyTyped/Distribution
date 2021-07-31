package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def define[Name /* <: java.lang.String */, T](map: typings.nodeSql2.mod.TableDefinition[Name, T]): typings.nodeSql2.mod.Table[Name, T] = typings.nodeSql2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("define")(map.asInstanceOf[js.Any]).asInstanceOf[typings.nodeSql2.mod.Table[Name, T]]

@scala.inline
def setDialect(dialect: typings.nodeSql2.mod.SQLDialects): scala.Unit = typings.nodeSql2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDialect")(dialect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
  */ typings.nodeSql2.nodeSql2Strings.Columns & org.scalablytyped.runtime.TopLevel[T]

type Table[Name /* <: java.lang.String */, T] = typings.nodeSql2.mod.TableNode & typings.nodeSql2.mod.Queryable[T] & typings.nodeSql2.mod.Named[Name] & typings.nodeSql2.mod.Columns[T] & typings.nodeSql2.anon.Alter[T]
