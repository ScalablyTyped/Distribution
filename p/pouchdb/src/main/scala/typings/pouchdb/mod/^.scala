package typings.pouchdb.mod

import org.scalablytyped.runtime.TopLevel
import typings.pouchdbAdapterFruitdown.PouchDB.FruitDOWNAdapter.FruitDOWNAdapterConfiguration
import typings.pouchdbAdapterFruitdown.PouchDB.Static
import typings.pouchdbCore.PouchDB.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pouchdb", JSImport.Namespace)
@js.native
class ^[Content /* <: js.Object */] protected () extends Database[Content] {
  def this(name: String, options: FruitDOWNAdapterConfiguration) = this()
  def this(name: Null, options: FruitDOWNAdapterConfiguration) = this()
}

@JSImport("pouchdb", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Static]

