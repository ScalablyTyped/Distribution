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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavLink
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ StringDictionary[js.Any] {
  
  /**
    * Aria-current token for active nav links. Must be a valid token value, and defaults to 'page'.
    */
  var ariaCurrent: js.UndefOr[page | step | location | date | time | `true`] = js.native
  
  /**
    * Aria label for nav link. Ignored if `collapseAriaLabel` or `expandAriaLabel` is provided.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.native
  
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var collapseAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the link is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var expandAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * (Optional) By default, any link with onClick defined will render as a button.
    * Set this property to true to override that behavior. (Links without onClick defined
    * will render as anchors by default.)
    */
  var forceAnchor: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of an icon to render next to the link button.
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Use `iconProps.className` instead.
    * @deprecated Use `iconProps.className` instead.
    */
  var iconClassName: js.UndefOr[String] = js.native
  
  /**
    * Props for an icon to render next to the link button.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * Whether or not the link is in an expanded state
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  /**
    * Unique, stable key for the link, used when rendering the list of links and for tracking
    * the currently selected link.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Child links to this link, if any
    */
  var links: js.UndefOr[js.Array[INavLink]] = js.native
  
  /**
    * Text to render for this link
    */
  var name: String = js.native
  
  /**
    * Callback invoked when this link is clicked. Providing this callback will cause the link
    * to render as a button (rather than an anchor) unless forceAnchor is set to true.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  
  /**
    * Link <a> target.
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Text for title tooltip and ARIA description.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * URL to navigate to for this link
    */
  var url: String = js.native
}
object INavLink {
  
  @scala.inline
  def apply(name: String, url: String): INavLink = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavLink]
  }
  
  @scala.inline
  implicit class INavLinkOps[Self <: INavLink] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaCurrent(value: page | step | location | date | time | `true`): Self = this.set("ariaCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaCurrent: Self = this.set("ariaCurrent", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAutomationId(value: String): Self = this.set("automationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationId: Self = this.set("automationId", js.undefined)
    
    @scala.inline
    def setCollapseAriaLabel(value: String): Self = this.set("collapseAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseAriaLabel: Self = this.set("collapseAriaLabel", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExpandAriaLabel(value: String): Self = this.set("expandAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandAriaLabel: Self = this.set("expandAriaLabel", js.undefined)
    
    @scala.inline
    def setForceAnchor(value: Boolean): Self = this.set("forceAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAnchor: Self = this.set("forceAnchor", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: INavLink*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[INavLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
