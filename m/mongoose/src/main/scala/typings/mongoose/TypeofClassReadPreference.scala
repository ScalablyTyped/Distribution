package typings.mongoose

import org.scalablytyped.runtime.Instantiable2
import typings.mongodb.mongodbMod.ReadPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassReadPreference
  extends Instantiable2[/* mode */ String, /* tags */ js.Object, ReadPreference] {
  var NEAREST: String = js.native
  var PRIMARY: String = js.native
  var PRIMARY_PREFERRED: String = js.native
  var SECONDARY: String = js.native
  var SECONDARY_PREFERRED: String = js.native
  def isValid(mode: String): Boolean = js.native
}

