package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the page that raised the PageLoadComplete event.
  *
  * [Api set:  1.1]
  */
trait PageLoadCompleteEventArgs extends StObject {
  
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: String
  
  /**
    *
    * Gets the success or failure of the PageLoadComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean
}
object PageLoadCompleteEventArgs {
  
  @scala.inline
  def apply(pageName: String, success: Boolean): PageLoadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLoadCompleteEventArgs]
  }
  
  @scala.inline
  implicit class PageLoadCompleteEventArgsMutableBuilder[Self <: PageLoadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
