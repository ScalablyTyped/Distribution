package typings.phosphorWidgets.titleMod.Title

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
  var caption: js.UndefOr[String] = js.undefined
  /**
    * The extra class name for the title.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The closable state for the title.
    */
  var closable: js.UndefOr[Boolean] = js.undefined
  /**
    * The dataset for the title.
    */
  var dataset: js.UndefOr[Dataset] = js.undefined
  /**
    * @deprecated Use `iconClass` instead.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * The icon class name for the title.
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * The icon label for the title.
    */
  var iconLabel: js.UndefOr[String] = js.undefined
  /**
    * The label for the title.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The mnemonic index for the title.
    */
  var mnemonic: js.UndefOr[Double] = js.undefined
  /**
    * The object which owns the title.
    */
  var owner: T
}

object IOptions {
  @scala.inline
  def apply[T](
    owner: T,
    caption: String = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    dataset: Dataset = null,
    icon: String = null,
    iconClass: String = null,
    iconLabel: String = null,
    label: String = null,
    mnemonic: Int | Double = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

