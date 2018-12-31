package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// mongodb.ObjectID does not allow mongoose.Types.ObjectId(id). This is
//   commonly used in mongoose and is found in an example in the docs:
//   http://mongoosejs.com/docs/api.html#aggregate_Aggregate
// constructor exposes static methods of mongodb.ObjectID and ObjectId(id)
@js.native
trait ObjectIdConstructor extends js.Object {
  def apply(): mongodbLib.mongodbMod.ObjectID = js.native
  def apply(s: java.lang.String): mongodbLib.mongodbMod.ObjectID = js.native
  def apply(s: scala.Double): mongodbLib.mongodbMod.ObjectID = js.native
}

