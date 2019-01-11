package typings
package moduleDashAliasLib.moduleDashAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module-alias", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Import aliases from package.json
    */
  def apply(): scala.Unit = js.native
  def apply(options: java.lang.String | moduleDashAliasLib.moduleDashAliasMod.initNs.Options): scala.Unit = js.native
  /**
    * Register a single alias
    */
  def addAlias(alias: java.lang.String, path: java.lang.String): scala.Unit = js.native
  /**
    * Register mutliple aliases
    */
  def addAliases(aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  /**
    * Register a custom modules directory
    */
  def addPath(path: java.lang.String): scala.Unit = js.native
  def isPathMatchesAlias(path: java.lang.String, alias: java.lang.String): scala.Boolean = js.native
  /**
    * Reset any changes maded (resets all registered aliases
    * and custom module directories)
    * The function is undocumented and for testing purposes only
    */
  def reset(): scala.Unit = js.native
}

