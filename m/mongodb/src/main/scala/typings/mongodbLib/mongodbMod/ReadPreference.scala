package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ReadPreference")
@js.native
class ReadPreference protected () extends js.Object {
  def this(mode: java.lang.String, tags: js.Object) = this()
  var mode: java.lang.String = js.native
  var options: mongodbLib.Anon_MaxStalenessSeconds = js.native
  var tags: js.Any = js.native
  def isValid(mode: java.lang.String): scala.Boolean = js.native
}

@JSImport("mongodb", "ReadPreference")
@js.native
object ReadPreference extends js.Object {
  var NEAREST: java.lang.String = js.native
   // Max Secondary Read Stalleness in Seconds
  var PRIMARY: java.lang.String = js.native
  var PRIMARY_PREFERRED: java.lang.String = js.native
  var SECONDARY: java.lang.String = js.native
  var SECONDARY_PREFERRED: java.lang.String = js.native
  def isValid(mode: java.lang.String): scala.Boolean = js.native
}

