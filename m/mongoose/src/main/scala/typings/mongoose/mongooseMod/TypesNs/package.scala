package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypesNs {
  import typings.mongodb.mongodbMod.ObjectID

  type Decimal128 = typings.mongodb.mongodbMod.Decimal128
  // var objectId: mongoose.Types.ObjectId should reference mongodb.ObjectID not
  //   the ObjectIdConstructor, so we add the interface below
  type ObjectId = ObjectID
}
