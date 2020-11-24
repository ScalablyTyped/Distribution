package typings.migrateMongo.anon

import typings.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseName extends js.Object {
  
  var databaseName: String = js.native
  
  var options: MongoClientOptions = js.native
  
  var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any = js.native
}
object DatabaseName {
  
  @scala.inline
  def apply(
    databaseName: String,
    options: MongoClientOptions,
    url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
  ): DatabaseName = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseName]
  }
  
  @scala.inline
  implicit class DatabaseNameOps[Self <: DatabaseName] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MongoClientOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
    ): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
