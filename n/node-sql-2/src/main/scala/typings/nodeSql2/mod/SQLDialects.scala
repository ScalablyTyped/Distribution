package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeSql2.nodeSql2Strings.mssql
  - typings.nodeSql2.nodeSql2Strings.mysql
  - typings.nodeSql2.nodeSql2Strings.oracle
  - typings.nodeSql2.nodeSql2Strings.postgres
  - typings.nodeSql2.nodeSql2Strings.sqlite
*/
trait SQLDialects extends js.Object

object SQLDialects {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mssql: typings.nodeSql2.nodeSql2Strings.mssql = this.cast("mssql")
  @scala.inline
  def mysql: typings.nodeSql2.nodeSql2Strings.mysql = this.cast("mysql")
  @scala.inline
  def oracle: typings.nodeSql2.nodeSql2Strings.oracle = this.cast("oracle")
  @scala.inline
  def postgres: typings.nodeSql2.nodeSql2Strings.postgres = this.cast("postgres")
  @scala.inline
  def sqlite: typings.nodeSql2.nodeSql2Strings.sqlite = this.cast("sqlite")
}

