package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatabaseRequest extends js.Object {
  
  /**
    * Required. A `CREATE DATABASE` statement, which specifies the ID of the new database. The database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30
    * characters in length. If the database ID is a reserved word or if it contains a hyphen, the database ID must be enclosed in backticks (`` ` ``).
    */
  var createStatement: js.UndefOr[String] = js.native
  
  /**
    * Optional. A list of DDL statements to run inside the newly created database. Statements can create tables, indexes, etc. These statements execute atomically with the creation of the
    * database: if there is an error in any statement, the database is not created.
    */
  var extraStatements: js.UndefOr[js.Array[String]] = js.native
}
object CreateDatabaseRequest {
  
  @scala.inline
  def apply(): CreateDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatabaseRequest]
  }
  
  @scala.inline
  implicit class CreateDatabaseRequestOps[Self <: CreateDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateStatement(value: String): Self = this.set("createStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateStatement: Self = this.set("createStatement", js.undefined)
    
    @scala.inline
    def setExtraStatementsVarargs(value: String*): Self = this.set("extraStatements", js.Array(value :_*))
    
    @scala.inline
    def setExtraStatements(value: js.Array[String]): Self = this.set("extraStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraStatements: Self = this.set("extraStatements", js.undefined)
  }
}
