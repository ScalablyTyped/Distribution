package typings.migrateMongo

import typings.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var databaseName: String
  var options: MongoClientOptions
  var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.Fn_CallbackOptions>[0] */ js.Any
}

object Anon0 {
  @scala.inline
  def apply(
    databaseName: String,
    options: MongoClientOptions,
    url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.Fn_CallbackOptions>[0] */ js.Any
  ): Anon0 = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

