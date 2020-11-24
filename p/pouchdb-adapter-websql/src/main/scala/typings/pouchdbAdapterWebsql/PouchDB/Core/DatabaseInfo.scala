package typings.pouchdbAdapterWebsql.PouchDB.Core

import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-16`
import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseInfo extends js.Object {
  
  var sqlite_plugin: js.UndefOr[Boolean] = js.native
  
  var websql_encoding: js.UndefOr[`UTF-8` | `UTF-16`] = js.native
}
object DatabaseInfo {
  
  @scala.inline
  def apply(): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInfo]
  }
  
  @scala.inline
  implicit class DatabaseInfoOps[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
    
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
    def setSqlite_plugin(value: Boolean): Self = this.set("sqlite_plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlite_plugin: Self = this.set("sqlite_plugin", js.undefined)
    
    @scala.inline
    def setWebsql_encoding(value: `UTF-8` | `UTF-16`): Self = this.set("websql_encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsql_encoding: Self = this.set("websql_encoding", js.undefined)
  }
}
