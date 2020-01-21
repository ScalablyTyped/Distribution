package typings.node

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.moduleMod.Module
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassModule
  extends Instantiable1[/* id */ java.lang.String, Module]
     with Instantiable2[/* id */ java.lang.String, /* parent */ Module, Module] {
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequire(path: java.lang.String): NodeRequire = js.native
  def createRequire(path: URL_): NodeRequire = js.native
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: java.lang.String): NodeRequire = js.native
  def runMain(): Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

