package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PouchDB")
@js.native
class PouchDB[Content /* <: js.Object */] ()
  extends pouchdbDashCoreLib.PouchDBNs.Database[Content] {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.DatabaseConfiguration) = this()
}

