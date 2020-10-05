package typings.node.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.NodeRequire
import typings.node.moduleMod.Module
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofModule
  extends Instantiable1[/* id */ String, Module]
     with Instantiable2[/* id */ String, /* parent */ Module, Module] {
  var builtinModules: js.Array[String] = js.native
  def createRequire(path: String): NodeRequire = js.native
  def createRequire(path: URL_): NodeRequire = js.native
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: String): NodeRequire = js.native
  def runMain(): Unit = js.native
  def wrap(code: String): String = js.native
}

