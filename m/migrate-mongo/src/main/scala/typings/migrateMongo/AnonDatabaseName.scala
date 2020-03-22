package typings.migrateMongo

import typings.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatabaseName extends js.Object {
  var databaseName: String
  var options: MongoClientOptions
  var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.FnCallUriOptionsCallback>[0] */ js.Any
}

object AnonDatabaseName {
  @scala.inline
  def apply(
    databaseName: String,
    options: MongoClientOptions,
    url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.FnCallUriOptionsCallback>[0] */ js.Any
  ): AnonDatabaseName = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDatabaseName]
  }
}

