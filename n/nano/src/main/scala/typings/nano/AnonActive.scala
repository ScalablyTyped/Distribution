package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  // The size of live data inside the database, in bytes.
  var active: Double
  // The uncompressed size of database contents in bytes.
  var external: Double
  // The size of the database file on disk in bytes. Views indexes
  var file: Double
}

object AnonActive {
  @scala.inline
  def apply(active: Double, external: Double, file: Double): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActive]
  }
}

