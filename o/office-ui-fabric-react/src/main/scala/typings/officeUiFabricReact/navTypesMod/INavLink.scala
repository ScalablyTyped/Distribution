package typings.officeUiFabricReact.navTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.`true`
import typings.officeUiFabricReact.officeUiFabricReactStrings.date
import typings.officeUiFabricReact.officeUiFabricReactStrings.location
import typings.officeUiFabricReact.officeUiFabricReactStrings.page
import typings.officeUiFabricReact.officeUiFabricReactStrings.step
import typings.officeUiFabricReact.officeUiFabricReactStrings.time
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavLink
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Aria-current token for active nav links. Must be a valid token value, and defaults to 'page'.
    */
  var ariaCurrent: js.UndefOr[page | step | location | date | time | `true`] = js.undefined
  /**
    * Aria label for nav link. Ignored if `collapseAriaLabel` or `expandAriaLabel` is provided.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.undefined
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var collapseAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the link is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var expandAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * (Optional) By default, any link with onClick defined will render as a button.
    * Set this property to true to override that behavior. (Links without onClick defined
    * will render as anchors by default.)
    */
  var forceAnchor: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of an icon to render next to the link button.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Deprecated. Use `iconProps.className` instead.
    * @deprecated Use `iconProps.className` instead.
    */
  var iconClassName: js.UndefOr[String] = js.undefined
  /**
    * Props for an icon to render next to the link button.
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Whether or not the link is in an expanded state
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /**
    * Unique, stable key for the link, used when rendering the list of links and for tracking
    * the currently selected link.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Child links to this link, if any
    */
  var links: js.UndefOr[js.Array[INavLink]] = js.undefined
  /**
    * Text to render for this link
    */
  var name: String
  /**
    * Callback invoked when this link is clicked. Providing this callback will cause the link
    * to render as a button (rather than an anchor) unless forceAnchor is set to true.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.undefined
  /**
    * Link <a> target.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * Text for title tooltip and ARIA description.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * URL to navigate to for this link
    */
  var url: String
}

object INavLink {
  @scala.inline
  def apply(
    name: String,
    url: String,
    StringDictionary: /**
    * (Optional) Any additional properties to apply to the rendered links.
    */
  /* propertyName */ StringDictionary[js.Any] = null,
    ariaCurrent: page | step | location | date | time | `true` = null,
    ariaLabel: String = null,
    automationId: String = null,
    collapseAriaLabel: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    expandAriaLabel: String = null,
    forceAnchor: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconClassName: String = null,
    iconProps: IIconProps = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    links: js.Array[INavLink] = null,
    onClick: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit = null,
    target: String = null,
    title: String = null
  ): INavLink = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ariaCurrent != null) __obj.updateDynamic("ariaCurrent")(ariaCurrent.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (automationId != null) __obj.updateDynamic("automationId")(automationId.asInstanceOf[js.Any])
    if (collapseAriaLabel != null) __obj.updateDynamic("collapseAriaLabel")(collapseAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (expandAriaLabel != null) __obj.updateDynamic("expandAriaLabel")(expandAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAnchor)) __obj.updateDynamic("forceAnchor")(forceAnchor.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavLink]
  }
}

