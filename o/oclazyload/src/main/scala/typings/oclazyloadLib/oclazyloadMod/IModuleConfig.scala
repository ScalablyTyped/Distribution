package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModuleConfig extends IOptionsConfig {
  /**
    * The list of files to be loaded for this module.
    */
  var files: js.Array[java.lang.String]
  /**
    * The name of the module for easy retrieval later.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

