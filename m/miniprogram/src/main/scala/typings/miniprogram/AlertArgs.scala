package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertArgs extends AsyncCallback[Unit] {
  
  /**
    * Button text, which is OK by default.
    */
  var buttonText: js.UndefOr[String] = js.native
  
  /**
    * Contents of the alert box.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Title of the alert box.
    */
  var title: js.UndefOr[String] = js.native
}
object AlertArgs {
  
  @scala.inline
  def apply(): AlertArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertArgs]
  }
  
  @scala.inline
  implicit class AlertArgsMutableBuilder[Self <: AlertArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
