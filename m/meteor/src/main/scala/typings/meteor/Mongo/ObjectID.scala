package typings.meteor.Mongo

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectID extends js.Object {
  def equals(otherID: ObjectID): Boolean
  def toHexString(): String
}

@JSGlobal("Mongo.ObjectID")
@js.native
object ObjectID extends TopLevel[ObjectIDStatic]

