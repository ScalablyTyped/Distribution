package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    accessibleLabel: IStyle = null,
    borderAfterDropping: IStyle = null,
    borderWhileDragging: IStyle = null,
    cellName: IStyle = null,
    cellTitle: IStyle = null,
    cellTooltip: IStyle = null,
    filterChevron: IStyle = null,
    gripperBarVerticalStyle: IStyle = null,
    iconClassName: IStyle = null,
    nearIcon: IStyle = null,
    noBorderAfterDropping: IStyle = null,
    noBorderWhileDragging: IStyle = null,
    root: IStyle = null,
    sortIcon: IStyle = null
  ): IDetailsColumnStyles = {
    val __obj = js.Dynamic.literal()
    if (accessibleLabel != null) __obj.updateDynamic("accessibleLabel")(accessibleLabel.asInstanceOf[js.Any])
    if (borderAfterDropping != null) __obj.updateDynamic("borderAfterDropping")(borderAfterDropping.asInstanceOf[js.Any])
    if (borderWhileDragging != null) __obj.updateDynamic("borderWhileDragging")(borderWhileDragging.asInstanceOf[js.Any])
    if (cellName != null) __obj.updateDynamic("cellName")(cellName.asInstanceOf[js.Any])
    if (cellTitle != null) __obj.updateDynamic("cellTitle")(cellTitle.asInstanceOf[js.Any])
    if (cellTooltip != null) __obj.updateDynamic("cellTooltip")(cellTooltip.asInstanceOf[js.Any])
    if (filterChevron != null) __obj.updateDynamic("filterChevron")(filterChevron.asInstanceOf[js.Any])
    if (gripperBarVerticalStyle != null) __obj.updateDynamic("gripperBarVerticalStyle")(gripperBarVerticalStyle.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (nearIcon != null) __obj.updateDynamic("nearIcon")(nearIcon.asInstanceOf[js.Any])
    if (noBorderAfterDropping != null) __obj.updateDynamic("noBorderAfterDropping")(noBorderAfterDropping.asInstanceOf[js.Any])
    if (noBorderWhileDragging != null) __obj.updateDynamic("noBorderWhileDragging")(noBorderWhileDragging.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sortIcon != null) __obj.updateDynamic("sortIcon")(sortIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnStyles]
  }
}

