package typings.pouchdb

import org.scalablytyped.runtime.Shortcut
import typings.pouchdbAdapterFruitdown.PouchDB.FruitDOWNAdapter.FruitDOWNAdapterConfiguration
import typings.pouchdbAdapterFruitdown.PouchDB.Static
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pouchdb", JSImport.Namespace)
  @js.native
  class ^[Content /* <: js.Object */] protected () extends Database[Content] {
    def this(name: String, options: FruitDOWNAdapterConfiguration) = this()
    def this(name: Null, options: FruitDOWNAdapterConfiguration) = this()
  }
  @JSImport("pouchdb", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
