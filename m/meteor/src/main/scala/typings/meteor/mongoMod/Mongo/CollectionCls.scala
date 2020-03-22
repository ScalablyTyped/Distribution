package typings.meteor.mongoMod.Mongo

import typings.meteor.AnonConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo.Collection")
@js.native
class CollectionCls[T] () extends Collection[T] {
  def this(name: String) = this()
  def this(name: String, options: AnonConnection) = this()
  def this(name: Null, options: AnonConnection) = this()
}

