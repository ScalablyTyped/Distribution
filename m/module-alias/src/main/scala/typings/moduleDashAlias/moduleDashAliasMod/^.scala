package typings.moduleDashAlias.moduleDashAliasMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module-alias", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Import aliases from package.json
    */
  def apply(): Unit = js.native
  def apply(options: String | Options): Unit = js.native
  /**
    * Register a single alias
    */
  def addAlias(alias: String, path: String): Unit = js.native
  /**
    * Register mutliple aliases
    */
  def addAliases(aliases: StringDictionary[String]): Unit = js.native
  /**
    * Register a custom modules directory
    */
  def addPath(path: String): Unit = js.native
  def isPathMatchesAlias(path: String, alias: String): Boolean = js.native
  /**
    * Reset any changes maded (resets all registered aliases
    * and custom module directories)
    * The function is undocumented and for testing purposes only
    */
  def reset(): Unit = js.native
}

