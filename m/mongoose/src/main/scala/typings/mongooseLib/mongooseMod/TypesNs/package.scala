package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypesNs {
  // mongodb.ObjectID does not allow mongoose.Types.ObjectId(id). This is
  //   commonly used in mongoose and is found in an example in the docs:
  //   http://mongoosejs.com/docs/api.html#aggregate_Aggregate
  // constructor exposes static methods of mongodb.ObjectID and ObjectId(id)
  type ObjectIdConstructor = mongooseLib.Anon_CacheHexStringCreateFromHexString with mongooseLib.Anon_S
}
