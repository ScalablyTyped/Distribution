package typings.officeUiFabricReact.stackItemTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typings.officeUiFabricReact.officeUiFabricReactStrings.initial
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typings.officeUiFabricReact.officeUiFabricReactStrings.unset
import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typings.uifabricFoundation.libIcomponentMod.IStyleableComponentProps
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackItemProps
  extends IStackItemSlots
     with IStyleableComponentProps[IStackItemProps, IStackItemTokens, IStackItemStyles] {
  /**
    * Defines how to align the StackItem along the x-axis (for vertical Stacks) or the y-axis (for horizontal Stacks).
    */
  var align: js.UndefOr[auto | stretch | baseline | start | center | end] = js.undefined
  /**
    * Defines whether the StackItem should be prevented from shrinking.
    * This can be used to prevent a StackItem from shrinking when it is inside of a Stack that has shrinking items.
    * @defaultvalue false
    */
  var disableShrink: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines how much to grow the StackItem in proportion to its siblings.
    */
  var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.undefined
  /**
    * Defines order of the StackItem.
    * @defaultvalue 0
    */
  var order: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines at what ratio should the StackItem shrink to fit the available space.
    */
  var shrink: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.undefined
  /**
    * Defines whether the StackItem should take up 100% of the height of its parent.
    * @defaultvalue true
    */
  var verticalFill: js.UndefOr[Boolean] = js.undefined
}

object IStackItemProps {
  @scala.inline
  def apply(
    align: auto | stretch | baseline | start | center | end = null,
    className: String = null,
    disableShrink: js.UndefOr[Boolean] = js.undefined,
    grow: Boolean | Double | inherit | initial | unset = null,
    order: Double | String = null,
    root: IHTMLSlot = null,
    shrink: Boolean | Double | inherit | initial | unset = null,
    styles: IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[IStackItemProps, IStackItemTokens] = null,
    verticalFill: js.UndefOr[Boolean] = js.undefined
  ): IStackItemProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableShrink)) __obj.updateDynamic("disableShrink")(disableShrink.asInstanceOf[js.Any])
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalFill)) __obj.updateDynamic("verticalFill")(verticalFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackItemProps]
  }
}

