package typings.meteor.global.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mongo.ObjectID")
@js.native
class ObjectIDCls ()
  extends typings.meteor.Mongo.ObjectID {
  def this(hexString: String) = this()
  /* CompleteClass */
  override def equals(otherID: typings.meteor.Mongo.ObjectID): Boolean = js.native
  /* CompleteClass */
  override def toHexString(): String = js.native
}

