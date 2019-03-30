package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for open file options.
		 */
trait OpenFileOptions extends js.Object {
  /**
  			 * Specify whether to open or save the file
  			 * Values:
  			 *   1 - open
  			 *   2 - save
  			 */
  var openMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.TypesNs.OpenFileMode
}

object OpenFileOptions {
  @scala.inline
  def apply(
    openMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.TypesNs.OpenFileMode
  ): OpenFileOptions = {
    val __obj = js.Dynamic.literal(openMode = openMode)
  
    __obj.asInstanceOf[OpenFileOptions]
  }
}

