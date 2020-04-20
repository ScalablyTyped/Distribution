package typings.nodeSql2

import typings.nodeSql2.mod.SQLDialects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeSql2Strings {
  @js.native
  sealed trait Columns extends js.Object
  
  @js.native
  sealed trait Queryable extends js.Object
  
  @js.native
  sealed trait TableDefinition extends js.Object
  
  @js.native
  sealed trait cascade extends js.Object
  
  @js.native
  sealed trait mssql extends SQLDialects
  
  @js.native
  sealed trait mysql extends SQLDialects
  
  @js.native
  sealed trait `no action` extends js.Object
  
  @js.native
  sealed trait oracle extends SQLDialects
  
  @js.native
  sealed trait postgres extends SQLDialects
  
  @js.native
  sealed trait restrict extends js.Object
  
  @js.native
  sealed trait `set default` extends js.Object
  
  @js.native
  sealed trait `set null` extends js.Object
  
  @js.native
  sealed trait sqlite extends SQLDialects
  
  @scala.inline
  def Columns: Columns = "Columns".asInstanceOf[Columns]
  @scala.inline
  def Queryable: Queryable = "Queryable".asInstanceOf[Queryable]
  @scala.inline
  def TableDefinition: TableDefinition = "TableDefinition".asInstanceOf[TableDefinition]
  @scala.inline
  def cascade: cascade = "cascade".asInstanceOf[cascade]
  @scala.inline
  def mssql: mssql = "mssql".asInstanceOf[mssql]
  @scala.inline
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  @scala.inline
  def `no action`: `no action` = ("no action").asInstanceOf[`no action`]
  @scala.inline
  def oracle: oracle = "oracle".asInstanceOf[oracle]
  @scala.inline
  def postgres: postgres = "postgres".asInstanceOf[postgres]
  @scala.inline
  def restrict: restrict = "restrict".asInstanceOf[restrict]
  @scala.inline
  def `set default`: `set default` = ("set default").asInstanceOf[`set default`]
  @scala.inline
  def `set null`: `set null` = ("set null").asInstanceOf[`set null`]
  @scala.inline
  def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
}

