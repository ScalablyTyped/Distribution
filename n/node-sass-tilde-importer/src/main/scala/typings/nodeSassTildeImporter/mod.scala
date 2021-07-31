package typings.nodeSassTildeImporter

import typings.nodeSass.mod.ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A node-sass custom importer which turns ~ into absolute paths to the nearest parent node_modules directory.
    */
  @scala.inline
  def apply(url: String, prev: String): ImporterReturnType = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], prev.asInstanceOf[js.Any])).asInstanceOf[ImporterReturnType]
  @scala.inline
  def apply(url: String, prev: String, done: js.Function1[/* data */ ImporterReturnType, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], prev.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node-sass-tilde-importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
