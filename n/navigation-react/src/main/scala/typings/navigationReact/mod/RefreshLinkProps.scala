package typings.navigationReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshLinkProps extends LinkProps {
  /**
    * The Css Class to display when the Link is active
    */
  var activeCssClass: js.UndefOr[String] = js.native
  /**
    * The style to display when the Link is active
    */
  var activeStyle: js.UndefOr[js.Any] = js.native
  /**
    * The data to add from the current NavigationData
    */
  var currentDataKeys: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Indicates whether the Link is disabled when active
    */
  var disableActive: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to include all the current NavigationData
    */
  var includeCurrentData: js.UndefOr[Boolean] = js.native
  /**
    * The NavigationData to pass
    */
  var navigationData: js.UndefOr[js.Any] = js.native
}

object RefreshLinkProps {
  @scala.inline
  def apply(): RefreshLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshLinkProps]
  }
  @scala.inline
  implicit class RefreshLinkPropsOps[Self <: RefreshLinkProps] (val x: Self) extends AnyVal {
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
    def setActiveCssClass(value: String): Self = this.set("activeCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveCssClass: Self = this.set("activeCssClass", js.undefined)
    @scala.inline
    def setActiveStyle(value: js.Any): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    @scala.inline
    def setCurrentDataKeysVarargs(value: String*): Self = this.set("currentDataKeys", js.Array(value :_*))
    @scala.inline
    def setCurrentDataKeys(value: String | js.Array[String]): Self = this.set("currentDataKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDataKeys: Self = this.set("currentDataKeys", js.undefined)
    @scala.inline
    def setDisableActive(value: Boolean): Self = this.set("disableActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableActive: Self = this.set("disableActive", js.undefined)
    @scala.inline
    def setIncludeCurrentData(value: Boolean): Self = this.set("includeCurrentData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCurrentData: Self = this.set("includeCurrentData", js.undefined)
    @scala.inline
    def setNavigationData(value: js.Any): Self = this.set("navigationData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationData: Self = this.set("navigationData", js.undefined)
  }
  
}

