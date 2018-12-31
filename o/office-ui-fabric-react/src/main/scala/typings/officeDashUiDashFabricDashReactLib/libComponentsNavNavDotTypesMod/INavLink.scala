package typings
package officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavLink
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Deprecated at v0.68.1 and will be removed at \>= v1.0.0.
    * @deprecated Removed at v1.0.0.
    */
  var altText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Aria label for nav link
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Deprecated at v0.68.1 and will be removed at \>= v1.0.0.
    * @deprecated Removed at v1.0.0.
    */
  var engagementName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) By default, any link with onClick defined will render as a button.
    * Set this property to true to override that behavior. (Links without onClick defined
    * will render as anchors by default.)
    */
  var forceAnchor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of an icon to render next to the link button.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Deprecated. Use `iconProps.className` instead.
    * @deprecated Use `iconProps.className` instead.
    */
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Props for an icon to render next to the link button.
    */
  var iconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
    * Whether or not the link is in an expanded state
    */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Unique, stable key for the link, used when rendering the list of links and for tracking
    * the currently selected link.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Child links to this link, if any
    */
  var links: js.UndefOr[js.Array[INavLink]] = js.undefined
  /**
    * Text to render for this link
    */
  var name: java.lang.String
  /**
    * Callback invoked when this link is clicked. Providing this callback will cause the link
    * to render as a button (rather than an anchor) unless forceAnchor is set to true.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      /* item */ js.UndefOr[INavLink], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Not used in the Nav control or anywhere else in office-ui-fabric-react.
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Link <a> target.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for title tooltip and ARIA description.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to navigate to for this link
    */
  var url: java.lang.String
}

