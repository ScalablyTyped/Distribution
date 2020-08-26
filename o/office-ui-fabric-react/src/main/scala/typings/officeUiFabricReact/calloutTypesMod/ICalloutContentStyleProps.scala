package typings.officeUiFabricReact.calloutTypesMod

import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutContentStyleProps extends js.Object {
  /**
    * Background color for the beak and callout.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Width of Callout beak
    */
  var beakWidth: js.UndefOr[Double] = js.native
  /**
    * Max width for callout including borders.
    */
  var calloutMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Width for callout including borders.
    */
  var calloutWidth: js.UndefOr[Double] = js.native
  /**
    * CSS class to apply to the callout.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether or not to clip content of the callout,
    * if it overflows vertically.
    */
  var overflowYHidden: js.UndefOr[Boolean] = js.native
  /**
    * Callout positioning data
    */
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.native
  /**
    * Theme to apply to the calloutContent.
    */
  var theme: ITheme = js.native
}

object ICalloutContentStyleProps {
  @scala.inline
  def apply(theme: ITheme): ICalloutContentStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutContentStyleProps]
  }
  @scala.inline
  implicit class ICalloutContentStylePropsOps[Self <: ICalloutContentStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeakWidth: Self = this.set("beakWidth", js.undefined)
    @scala.inline
    def setCalloutMaxWidth(value: Double): Self = this.set("calloutMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutMaxWidth: Self = this.set("calloutMaxWidth", js.undefined)
    @scala.inline
    def setCalloutWidth(value: Double): Self = this.set("calloutWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutWidth: Self = this.set("calloutWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOverflowYHidden(value: Boolean): Self = this.set("overflowYHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowYHidden: Self = this.set("overflowYHidden", js.undefined)
    @scala.inline
    def setPositions(value: ICalloutPositionedInfo): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
  }
  
}

