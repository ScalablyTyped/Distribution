package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDBNs.ConfigurationNs.DatabaseConfiguration
import typings.pouchdbDashCore.PouchDBNs.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PouchDB")
@js.native
class PouchDB[Content /* <: js.Object */] () extends Database[Content] {
  def this(name: String) = this()
  def this(name: String, options: DatabaseConfiguration) = this()
}

