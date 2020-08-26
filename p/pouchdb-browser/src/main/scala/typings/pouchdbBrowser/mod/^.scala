package typings.pouchdbBrowser.mod

import org.scalablytyped.runtime.TopLevel
import typings.pouchdbCore.PouchDB.Configuration.DatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import typings.pouchdbCore.PouchDB.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pouchdb-browser", JSImport.Namespace)
@js.native
class ^[Content /* <: js.Object */] () extends Database[Content] {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], options: DatabaseConfiguration) = this()
  def this(name: String, options: DatabaseConfiguration) = this()
}

@JSImport("pouchdb-browser", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Static]

