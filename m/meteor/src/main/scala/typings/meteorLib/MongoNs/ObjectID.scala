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
  def apply(equals: js.Function1[ObjectID, scala.Boolean], toHexString: js.Function0[java.lang.String]): ObjectID = {
    val __obj = js.Dynamic.literal(equals = equals, toHexString = toHexString)
  
    __obj.asInstanceOf[ObjectID]
  }
}

