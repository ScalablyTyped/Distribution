package typings.pouchdbHttp

import org.scalablytyped.runtime.Shortcut
import typings.pouchdbCore.PouchDB.Configuration.DatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import typings.pouchdbCore.PouchDB.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pouchdb-http", JSImport.Namespace)
  @js.native
  class ^[Content /* <: js.Object */] () extends Database[Content] {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], options: DatabaseConfiguration) = this()
    def this(name: String, options: DatabaseConfiguration) = this()
  }
  @JSImport("pouchdb-http", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
