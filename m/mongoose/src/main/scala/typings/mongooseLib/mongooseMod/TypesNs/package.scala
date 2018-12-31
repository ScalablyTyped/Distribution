package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypesNs {
  // var objectId: mongoose.Types.ObjectId should reference mongodb.ObjectID not
  //   the ObjectIdConstructor, so we add the interface below
  type ObjectId = mongodbLib.mongodbMod.ObjectID
}
