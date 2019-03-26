package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectID extends js.Object {
  def equals(otherID: ObjectID): scala.Boolean
  def toHexString(): java.lang.String
}

@JSGlobal("Mongo.ObjectID")
@js.native
class ObjectIDCls () extends ObjectID {
  def this(hexString: java.lang.String) = this()
  /* CompleteClass */
  override def equals(otherID: ObjectID): scala.Boolean = js.native
  /* CompleteClass */
  override def toHexString(): java.lang.String = js.native
}

object ObjectID {
  @scala.inline
  def apply(equals: ObjectID => scala.Boolean, toHexString: () => java.lang.String): ObjectID = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), toHexString = js.Any.fromFunction0(toHexString))
  
    __obj.asInstanceOf[ObjectID]
  }
}

