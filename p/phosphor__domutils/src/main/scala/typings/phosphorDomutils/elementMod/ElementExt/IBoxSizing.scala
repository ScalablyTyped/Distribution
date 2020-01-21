package typings.phosphorDomutils.elementMod.ElementExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the border and padding data for an element.
  */
trait IBoxSizing extends js.Object {
  /**
    * The bottom border width, in pixels.
    */
  var borderBottom: Double
  /**
    * The left border width, in pixels.
    */
  var borderLeft: Double
  /**
    * The right border width, in pixels.
    */
  var borderRight: Double
  /**
    * The top border width, in pixels.
    */
  var borderTop: Double
  /**
    * The sum of horizontal border and padding.
    */
  var horizontalSum: Double
  /**
    * The bottom padding width, in pixels.
    */
  var paddingBottom: Double
  /**
    * The left padding width, in pixels.
    */
  var paddingLeft: Double
  /**
    * The right padding width, in pixels.
    */
  var paddingRight: Double
  /**
    * The top padding width, in pixels.
    */
  var paddingTop: Double
  /**
    * The sum of vertical border and padding.
    */
  var verticalSum: Double
}

object IBoxSizing {
  @scala.inline
  def apply(
    borderBottom: Double,
    borderLeft: Double,
    borderRight: Double,
    borderTop: Double,
    horizontalSum: Double,
    paddingBottom: Double,
    paddingLeft: Double,
    paddingRight: Double,
    paddingTop: Double,
    verticalSum: Double
  ): IBoxSizing = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], borderLeft = borderLeft.asInstanceOf[js.Any], borderRight = borderRight.asInstanceOf[js.Any], borderTop = borderTop.asInstanceOf[js.Any], horizontalSum = horizontalSum.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], verticalSum = verticalSum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBoxSizing]
  }
}

