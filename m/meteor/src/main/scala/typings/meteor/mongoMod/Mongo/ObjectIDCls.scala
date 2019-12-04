package typings.meteor.mongoMod.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo.ObjectID")
@js.native
class ObjectIDCls () extends ObjectID {
  def this(hexString: String) = this()
  /* CompleteClass */
  override def equals(otherID: ObjectID): Boolean = js.native
  /* CompleteClass */
  override def toHexString(): String = js.native
}

