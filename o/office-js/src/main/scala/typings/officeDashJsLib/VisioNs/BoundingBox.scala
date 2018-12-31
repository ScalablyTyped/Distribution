package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the BoundingBox of the shape.
  *
  * [Api set:  1.1]
  */
trait BoundingBox extends js.Object {
  /**
    *
    * The distance between the top and bottom edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var height: scala.Double
  /**
    *
    * The distance between the left and right edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var width: scala.Double
  /**
    *
    * An integer that specifies the x-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var x: scala.Double
  /**
    *
    * An integer that specifies the y-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var y: scala.Double
}

