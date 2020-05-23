package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsColumnStyles extends js.Object {
  /**
    * Styleable label region.
    */
  var accessibleLabel: IStyle
  /**
    * Styleable border region after drag & drop.
    */
  var borderAfterDropping: IStyle
  /**
    * Styleable border while drag & drop occurs.
    */
  var borderWhileDragging: IStyle
  /**
    * Styleable cell name region.
    */
  var cellName: IStyle
  /**
    * Styleable cell title region.
    */
  var cellTitle: IStyle
  /**
    * Styleable cell tooltip region.
    */
  var cellTooltip: IStyle
  /**
    * Styleable filter glyph.
    */
  var filterChevron: IStyle
  /**
    * Styleable resize glyph region.
    */
  var gripperBarVerticalStyle: IStyle
  /**
    * Styleable icon region.
    */
  var iconClassName: IStyle
  /**
    * Styleable margin by icon region.
    */
  var nearIcon: IStyle
  /**
    * Transparent no border region after drag & drop to avoid content shift.
    */
  var noBorderAfterDropping: IStyle
  /**
    * Transparent no border region while drag & drop occurs to avoid content shift.
    */
  var noBorderWhileDragging: IStyle
  /**
    * Styleable root region.
    */
  var root: IStyle
  /**
    * Styleable column sort icon region.
    */
  var sortIcon: IStyle
}

object IDetailsColumnStyles {
  @scala.inline
  def apply(
    accessibleLabel: js.UndefOr[Null | IStyle] = js.undefined,
    borderAfterDropping: js.UndefOr[Null | IStyle] = js.undefined,
    borderWhileDragging: js.UndefOr[Null | IStyle] = js.undefined,
    cellName: js.UndefOr[Null | IStyle] = js.undefined,
    cellTitle: js.UndefOr[Null | IStyle] = js.undefined,
    cellTooltip: js.UndefOr[Null | IStyle] = js.undefined,
    filterChevron: js.UndefOr[Null | IStyle] = js.undefined,
    gripperBarVerticalStyle: js.UndefOr[Null | IStyle] = js.undefined,
    iconClassName: js.UndefOr[Null | IStyle] = js.undefined,
    nearIcon: js.UndefOr[Null | IStyle] = js.undefined,
    noBorderAfterDropping: js.UndefOr[Null | IStyle] = js.undefined,
    noBorderWhileDragging: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    sortIcon: js.UndefOr[Null | IStyle] = js.undefined
  ): IDetailsColumnStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibleLabel)) __obj.updateDynamic("accessibleLabel")(accessibleLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(borderAfterDropping)) __obj.updateDynamic("borderAfterDropping")(borderAfterDropping.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWhileDragging)) __obj.updateDynamic("borderWhileDragging")(borderWhileDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(cellName)) __obj.updateDynamic("cellName")(cellName.asInstanceOf[js.Any])
    if (!js.isUndefined(cellTitle)) __obj.updateDynamic("cellTitle")(cellTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(cellTooltip)) __obj.updateDynamic("cellTooltip")(cellTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(filterChevron)) __obj.updateDynamic("filterChevron")(filterChevron.asInstanceOf[js.Any])
    if (!js.isUndefined(gripperBarVerticalStyle)) __obj.updateDynamic("gripperBarVerticalStyle")(gripperBarVerticalStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(iconClassName)) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(nearIcon)) __obj.updateDynamic("nearIcon")(nearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorderAfterDropping)) __obj.updateDynamic("noBorderAfterDropping")(noBorderAfterDropping.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorderWhileDragging)) __obj.updateDynamic("noBorderWhileDragging")(noBorderWhileDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIcon)) __obj.updateDynamic("sortIcon")(sortIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnStyles]
  }
}

