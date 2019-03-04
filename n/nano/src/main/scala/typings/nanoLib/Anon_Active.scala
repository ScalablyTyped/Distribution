package typings
package nanoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  // The size of live data inside the database, in bytes.
  var active: scala.Double
  // The uncompressed size of database contents in bytes.
  var external: scala.Double
  // The size of the database file on disk in bytes. Views indexes
  var file: scala.Double
}

object Anon_Active {
  @scala.inline
  def apply(active: scala.Double, external: scala.Double, file: scala.Double): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active, external = external, file = file)
  
    __obj.asInstanceOf[Anon_Active]
  }
}

