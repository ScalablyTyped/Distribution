package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookIcon extends js.Object {
  // Represents the index of the icon in the given set.
  var index: js.UndefOr[Double] = js.native
  /**
    * Represents the set that the icon is part of. The possible values are: Invalid, ThreeArrows, ThreeArrowsGray,
    * ThreeFlags, ThreeTrafficLights1, ThreeTrafficLights2, ThreeSigns, ThreeSymbols, ThreeSymbols2, FourArrows,
    * FourArrowsGray, FourRedToBlack, FourRating, FourTrafficLights, FiveArrows, FiveArrowsGray, FiveRating, FiveQuarters,
    * ThreeStars, ThreeTriangles, FiveBoxes.
    */
  var set: js.UndefOr[String] = js.native
}

object WorkbookIcon {
  @scala.inline
  def apply(): WorkbookIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookIcon]
  }
  @scala.inline
  implicit class WorkbookIconOps[Self <: WorkbookIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setSet(value: String): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

