package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the PageView class.
  *
  * [Api set:  1.1]
  */
trait PageViewLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Boolean] = js.undefined
}
object PageViewLoadOptions {
  
  @scala.inline
  def apply(): PageViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageViewLoadOptions]
  }
  
  @scala.inline
  implicit class PageViewLoadOptionsMutableBuilder[Self <: PageViewLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
