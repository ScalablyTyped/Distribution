package typings.nodeMysqlWrapper.global.Mongo

import typings.nodeMysqlWrapper.anon.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mongo.Collection")
@js.native
class CollectionCls[T] protected ()
  extends typings.nodeMysqlWrapper.Mongo.Collection[T] {
  def this(name: String) = this()
  def this(name: String, options: Connection) = this()
}

