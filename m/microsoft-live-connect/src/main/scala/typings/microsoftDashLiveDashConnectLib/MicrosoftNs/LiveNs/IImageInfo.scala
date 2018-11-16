package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about an image.
     */

trait IImageInfo extends js.Object {
  /**
           * The height, in pixels, of this image of this particular size.
           */
  var height: scala.Double
  /**
           * The width, in pixels, of this image of this particular size.
           */
  var source: java.lang.String
  /**
           * The type of this image of this particular size. Valid values are:
           * full (maximum size: 2048 x 2048 pixels)
           * - normal (maximum size 800 x 800 pixels)
           * - album (maximum size 176 x 176 pixels)
           * - small (maximum size 96 x 96 pixels)
           */
  var `type`: java.lang.String
  /**
           * The width, in pixels, of this image of this particular size.
           */
  var width: scala.Double
}

