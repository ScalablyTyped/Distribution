package typings.meteor.mongoMod.Mongo

import typings.meteor.Anon_Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo.Collection")
@js.native
class CollectionCls[T] protected () extends Collection[T] {
  def this(name: String) = this()
  def this(name: String, options: Anon_Connection) = this()
}

