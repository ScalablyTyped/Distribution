package typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
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
    * Aria label for nav link
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the link is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
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
    ariaLabel: String = null,
    automationId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
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
    val __obj = js.Dynamic.literal(name = name, url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (automationId != null) __obj.updateDynamic("automationId")(automationId)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceAnchor)) __obj.updateDynamic("forceAnchor")(forceAnchor)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (key != null) __obj.updateDynamic("key")(key)
    if (links != null) __obj.updateDynamic("links")(links)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[INavLink]
  }
}

