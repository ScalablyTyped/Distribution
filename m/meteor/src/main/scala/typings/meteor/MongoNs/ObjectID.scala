package typings.meteor.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectID extends js.Object {
  def equals(otherID: ObjectID): Boolean
  def toHexString(): String
}

@JSGlobal("Mongo.ObjectID")
@js.native
class ObjectIDCls () extends ObjectID {
  def this(hexString: String) = this()
  /* CompleteClass */
  override def equals(otherID: ObjectID): Boolean = js.native
  /* CompleteClass */
  override def toHexString(): String = js.native
}

object ObjectID {
  @scala.inline
  def apply(equals: ObjectID => Boolean, toHexString: () => String): ObjectID = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), toHexString = js.Any.fromFunction0(toHexString))
  
    __obj.asInstanceOf[ObjectID]
  }
}

