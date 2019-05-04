package typings
package atPhosphorWidgetsLib.libTitleMod.TitleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a title.
  */
trait IOptions[T] extends js.Object {
  /**
    * The caption for the title.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The extra class name for the title.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The closable state for the title.
    */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The dataset for the title.
    */
  var dataset: js.UndefOr[Dataset] = js.undefined
  /**
    * @deprecated Use `iconClass` instead.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The icon class name for the title.
    */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The icon label for the title.
    */
  var iconLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The label for the title.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mnemonic index for the title.
    */
  var mnemonic: js.UndefOr[scala.Double] = js.undefined
  /**
    * The object which owns the title.
    */
  var owner: T
}

object IOptions {
  @scala.inline
  def apply[T](
    owner: T,
    caption: java.lang.String = null,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    dataset: Dataset = null,
    icon: java.lang.String = null,
    iconClass: java.lang.String = null,
    iconLabel: java.lang.String = null,
    label: java.lang.String = null,
    mnemonic: scala.Int | scala.Double = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

