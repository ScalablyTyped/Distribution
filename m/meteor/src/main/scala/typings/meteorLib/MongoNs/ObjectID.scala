package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectID extends js.Object {
  def equals(otherID: ObjectID): scala.Boolean
  def toHexString(): java.lang.String
}

object ObjectID {
  @scala.inline
  def apply(equals: ObjectID => scala.Boolean, toHexString: () => java.lang.String): ObjectID = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), toHexString = js.Any.fromFunction0(toHexString))
  
    __obj.asInstanceOf[ObjectID]
  }
}

