package typings.nodeSassTildeImporter

import typings.nodeSass.mod.ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A node-sass custom importer which turns ~ into absolute paths to the nearest parent node_modules directory.
    */
  @JSImport("node-sass-tilde-importer", JSImport.Namespace)
  @js.native
  def apply(url: String, prev: String): ImporterReturnType = js.native
  @JSImport("node-sass-tilde-importer", JSImport.Namespace)
  @js.native
  def apply(url: String, prev: String, done: js.Function1[/* data */ ImporterReturnType, Unit]): Unit = js.native
}
