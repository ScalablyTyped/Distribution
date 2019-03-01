package typings
package navigationDashReactLib.navigationDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshLinkProps extends LinkProps {
  /**
    * The Css Class to display when the Link is active
    */
  var activeCssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The data to add from the current NavigationData
    */
  var currentDataKeys: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the Link is disabled when active
    */
  var disableActive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to include all the current NavigationData
    */
  var includeCurrentData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The NavigationData to pass
    */
  var navigationData: js.UndefOr[js.Any] = js.undefined
}

object RefreshLinkProps {
  @scala.inline
  def apply(
    LinkProps: LinkProps = null,
    activeCssClass: java.lang.String = null,
    currentDataKeys: java.lang.String = null,
    disableActive: js.UndefOr[scala.Boolean] = js.undefined,
    includeCurrentData: js.UndefOr[scala.Boolean] = js.undefined,
    navigationData: js.Any = null
  ): RefreshLinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (activeCssClass != null) __obj.updateDynamic("activeCssClass")(activeCssClass)
    if (currentDataKeys != null) __obj.updateDynamic("currentDataKeys")(currentDataKeys)
    if (!js.isUndefined(disableActive)) __obj.updateDynamic("disableActive")(disableActive)
    if (!js.isUndefined(includeCurrentData)) __obj.updateDynamic("includeCurrentData")(includeCurrentData)
    if (navigationData != null) __obj.updateDynamic("navigationData")(navigationData)
    __obj.asInstanceOf[RefreshLinkProps]
  }
}

