package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeTrianglesSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeTrianglesSet = {
    val __obj = js.Dynamic.literal(greenUpTriangle = greenUpTriangle, redDownTriangle = redDownTriangle, yellowDash = yellowDash)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeTrianglesSet]
  }
}

