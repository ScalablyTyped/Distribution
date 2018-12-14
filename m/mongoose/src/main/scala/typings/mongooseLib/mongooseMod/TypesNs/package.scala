package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypesNs {
  // var objectId: mongoose.Types.ObjectId should reference mongodb.ObjectID not
  //   the ObjectIdConstructor, so we add the interface below
  type ObjectId = mongodbLib.mongodbMod.ObjectID
  // mongodb.ObjectID does not allow mongoose.Types.ObjectId(id). This is
  //   commonly used in mongoose and is found in an example in the docs:
  //   http://mongoosejs.com/docs/api.html#aggregate_Aggregate
  // constructor exposes static methods of mongodb.ObjectID and ObjectId(id)
  type ObjectIdConstructor = org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.ObjectID] with mongooseLib.Anon_S
}
