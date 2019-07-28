package typings.mongodb.mongodbMod

import typings.mongodb.Anon_MaxStalenessSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ReadPreference")
@js.native
class ReadPreference protected () extends js.Object {
  def this(mode: String, tags: js.Object) = this()
  var mode: String = js.native
  var options: Anon_MaxStalenessSeconds = js.native
  var tags: js.Any = js.native
  def isValid(mode: String): Boolean = js.native
}

/* static members */
@JSImport("mongodb", "ReadPreference")
@js.native
object ReadPreference extends js.Object {
  var NEAREST: String = js.native
  var PRIMARY: String = js.native
  var PRIMARY_PREFERRED: String = js.native
  var SECONDARY: String = js.native
  var SECONDARY_PREFERRED: String = js.native
  def isValid(mode: String): Boolean = js.native
}

