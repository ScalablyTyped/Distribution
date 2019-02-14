package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// var objectId: mongoose.Types.ObjectId should reference mongodb.ObjectID not
//   the ObjectIdConstructor, so we add the interface below
@js.native
trait ObjectId
  extends mongodbLib.mongodbMod.ObjectID

