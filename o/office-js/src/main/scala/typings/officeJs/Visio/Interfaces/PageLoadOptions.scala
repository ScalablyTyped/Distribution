package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Page class.
  *
  * [Api set:  1.1]
  */
trait PageLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  var isBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the view of the page.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewLoadOptions] = js.undefined
  
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object PageLoadOptions {
  
  @scala.inline
  def apply(): PageLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLoadOptions]
  }
  
  @scala.inline
  implicit class PageLoadOptionsMutableBuilder[Self <: PageLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIsBackground(value: Boolean): Self = StObject.set(x, "isBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBackgroundUndefined: Self = StObject.set(x, "isBackground", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setView(value: PageViewLoadOptions): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
