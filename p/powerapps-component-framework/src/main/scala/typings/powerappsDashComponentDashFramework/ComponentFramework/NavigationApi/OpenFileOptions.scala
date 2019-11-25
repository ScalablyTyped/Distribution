package typings.powerappsDashComponentDashFramework.ComponentFramework.NavigationApi

import typings.powerappsDashComponentDashFramework.ComponentFramework.NavigationApi.Types.OpenFileMode
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
  var openMode: OpenFileMode
}

object OpenFileOptions {
  @scala.inline
  def apply(openMode: OpenFileMode): OpenFileOptions = {
    val __obj = js.Dynamic.literal(openMode = openMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenFileOptions]
  }
}

