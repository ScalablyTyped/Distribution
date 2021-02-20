package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProperties extends StObject {
  
  /**
    * Optional. Whether the tab should be active. Does not affect whether the window is focused (see windows.update).
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tab should be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Adds or removes the tab from the current selection.
    * @since Chrome 16.
    */
  var highlighted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tab should be muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Whether the tab should be pinned.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tab should be selected.
    * @deprecated since Chrome 33. Please use highlighted.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** Optional. A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.native
}
object UpdateProperties {
  
  @scala.inline
  def apply(): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProperties]
  }
  
  @scala.inline
  implicit class UpdatePropertiesMutableBuilder[Self <: UpdateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAutoDiscardable(value: Boolean): Self = StObject.set(x, "autoDiscardable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDiscardableUndefined: Self = StObject.set(x, "autoDiscardable", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
