package typings.mongoose

import org.scalablytyped.runtime.Instantiable2
import typings.mongodb.mod.ReadPreference
import typings.mongodb.mod.ReadPreferenceMode
import typings.mongoose.mongooseStrings.nearest
import typings.mongoose.mongooseStrings.primary
import typings.mongoose.mongooseStrings.primaryPreferred
import typings.mongoose.mongooseStrings.secondary
import typings.mongoose.mongooseStrings.secondaryPreferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReadPreference
  extends Instantiable2[/* mode */ ReadPreferenceMode, /* tags */ js.Object, ReadPreference] {
  var NEAREST: nearest = js.native
  var PRIMARY: primary = js.native
  var PRIMARY_PREFERRED: primaryPreferred = js.native
  var SECONDARY: secondary = js.native
  var SECONDARY_PREFERRED: secondaryPreferred = js.native
  def isValid(mode: String): Boolean = js.native
}

