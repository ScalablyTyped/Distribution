package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveBoxesSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var fourFilledBoxes: Icon
  var noFilledBoxes: Icon
  var oneFilledBox: Icon
  var threeFilledBoxes: Icon
  var twoFilledBoxes: Icon
}

object FiveBoxesSet {
  @scala.inline
  def apply(
    fourFilledBoxes: Icon,
    noFilledBoxes: Icon,
    oneFilledBox: Icon,
    threeFilledBoxes: Icon,
    twoFilledBoxes: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FiveBoxesSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fourFilledBoxes")(fourFilledBoxes)
    __obj.updateDynamic("noFilledBoxes")(noFilledBoxes)
    __obj.updateDynamic("oneFilledBox")(oneFilledBox)
    __obj.updateDynamic("threeFilledBoxes")(threeFilledBoxes)
    __obj.updateDynamic("twoFilledBoxes")(twoFilledBoxes)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveBoxesSet]
  }
}

