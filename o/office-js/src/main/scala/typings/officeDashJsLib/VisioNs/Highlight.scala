package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the highlight data added to the shape.
  *
  * [Api set:  1.1]
  */
trait Highlight extends js.Object {
  /**
    *
    * A string that specifies the color of the highlight. It must have the form "#RRGGBB", where each letter represents a hexadecimal digit between 0 and F, and where RR is the red value between 0 and 0xFF (255), GG the green value between 0 and 0xFF (255), and BB is the blue value between 0 and 0xFF (255).
    *
    * [Api set:  1.1]
    */
  var color: java.lang.String
  /**
    *
    * A positive integer that specifies the width of the highlight's stroke in pixels.
    *
    * [Api set:  1.1]
    */
  var width: scala.Double
}

