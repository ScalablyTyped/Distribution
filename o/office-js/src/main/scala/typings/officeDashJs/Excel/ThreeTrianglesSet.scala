package typings.officeDashJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeTrianglesSet extends /* index */ NumberDictionary[Icon] {
  var greenUpTriangle: Icon
  var redDownTriangle: Icon
  var yellowDash: Icon
}

object ThreeTrianglesSet {
  @scala.inline
  def apply(
    greenUpTriangle: Icon,
    redDownTriangle: Icon,
    yellowDash: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeTrianglesSet = {
    val __obj = js.Dynamic.literal(greenUpTriangle = greenUpTriangle.asInstanceOf[js.Any], redDownTriangle = redDownTriangle.asInstanceOf[js.Any], yellowDash = yellowDash.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeTrianglesSet]
  }
}

