package typings.mongoose.anon

import org.scalablytyped.runtime.Instantiable1
import typings.mongodb.mod.MongoError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMongoError extends Instantiable1[/* message */ String, MongoError] {
  /**
    * @deprecated
    */
  def create(options: String): MongoError = js.native
  def create(options: js.Object): MongoError = js.native
  def create(options: Error): MongoError = js.native
}

