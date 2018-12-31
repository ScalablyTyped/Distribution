package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the environment in which the add-in is running.
  */
trait ContextInformation extends js.Object {
  /**
    * Gets the Office application host in which the add-in is running.
    */
  var host: HostType
  /**
    * Gets the platform on which the add-in is running.
    */
  var platform: PlatformType
  /**
    * Gets the version of Office on which the add-in is running.
    */
  var version: java.lang.String
}

