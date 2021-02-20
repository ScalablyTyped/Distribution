package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononPageObject extends StObject {
  
  var content: js.UndefOr[String | Null] = js.native
  
  var page: String = js.native
  
  var preventClose: js.UndefOr[Boolean] = js.native
  
  var readyDelay: js.UndefOr[Double] = js.native
}
object PhononPageObject {
  
  @scala.inline
  def apply(page: String): PhononPageObject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPageObject]
  }
  
  @scala.inline
  implicit class PhononPageObjectMutableBuilder[Self <: PhononPageObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    @scala.inline
    def setReadyDelay(value: Double): Self = StObject.set(x, "readyDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyDelayUndefined: Self = StObject.set(x, "readyDelay", js.undefined)
  }
}
