package typings.officeJsPreview.Visio

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
  var height: Double
  /**
    *
    * The distance between the left and right edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var width: Double
  /**
    *
    * An integer that specifies the x-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var x: Double
  /**
    *
    * An integer that specifies the y-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var y: Double
}

object BoundingBox {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundingBox]
  }
}

