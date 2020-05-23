package typings.migrateMongo.anon

import typings.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseName extends js.Object {
  var databaseName: String
  var options: MongoClientOptions
  var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
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
}

