package typings.nodeSql2

import typings.nodeSql2.mod.SQLDialects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeSql2Strings {
  
  @js.native
  sealed trait Columns extends StObject
  @scala.inline
  def Columns: Columns = "Columns".asInstanceOf[Columns]
  
  @js.native
  sealed trait Queryable extends StObject
  @scala.inline
  def Queryable: Queryable = "Queryable".asInstanceOf[Queryable]
  
  @js.native
  sealed trait TableDefinition extends StObject
  @scala.inline
  def TableDefinition: TableDefinition = "TableDefinition".asInstanceOf[TableDefinition]
  
  @js.native
  sealed trait cascade extends StObject
  @scala.inline
  def cascade: cascade = "cascade".asInstanceOf[cascade]
  
  @js.native
  sealed trait mssql
    extends StObject
       with SQLDialects
  @scala.inline
  def mssql: mssql = "mssql".asInstanceOf[mssql]
  
  @js.native
  sealed trait mysql
    extends StObject
       with SQLDialects
  @scala.inline
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @js.native
  sealed trait `no action` extends StObject
  @scala.inline
  def `no action`: `no action` = ("no action").asInstanceOf[`no action`]
  
  @js.native
  sealed trait oracle
    extends StObject
       with SQLDialects
  @scala.inline
  def oracle: oracle = "oracle".asInstanceOf[oracle]
  
  @js.native
  sealed trait postgres
    extends StObject
       with SQLDialects
  @scala.inline
  def postgres: postgres = "postgres".asInstanceOf[postgres]
  
  @js.native
  sealed trait restrict extends StObject
  @scala.inline
  def restrict: restrict = "restrict".asInstanceOf[restrict]
  
  @js.native
  sealed trait `set default` extends StObject
  @scala.inline
  def `set default`: `set default` = ("set default").asInstanceOf[`set default`]
  
  @js.native
  sealed trait `set null` extends StObject
  @scala.inline
  def `set null`: `set null` = ("set null").asInstanceOf[`set null`]
  
  @js.native
  sealed trait sqlite
    extends StObject
       with SQLDialects
  @scala.inline
  def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
}
