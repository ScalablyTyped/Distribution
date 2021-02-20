package typings.nodeSql2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
    */ typings.nodeSql2.nodeSql2Strings.Columns with org.scalablytyped.runtime.TopLevel[T]
  
  type Table[Name /* <: java.lang.String */, T] = typings.nodeSql2.mod.TableNode with typings.nodeSql2.mod.Queryable[T] with typings.nodeSql2.mod.Named[Name] with typings.nodeSql2.mod.Columns[T] with typings.nodeSql2.anon.Alter[T]
  
  @scala.inline
  def define[Name /* <: java.lang.String */, T](map: typings.nodeSql2.mod.TableDefinition[Name, T]): typings.nodeSql2.mod.Table[Name, T] = typings.nodeSql2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("define")(map.asInstanceOf[js.Any]).asInstanceOf[typings.nodeSql2.mod.Table[Name, T]]
  
  @scala.inline
  def setDialect(dialect: typings.nodeSql2.mod.SQLDialects): scala.Unit = typings.nodeSql2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDialect")(dialect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
