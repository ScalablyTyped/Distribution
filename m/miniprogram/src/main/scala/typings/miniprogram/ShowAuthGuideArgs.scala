package typings.miniprogram

import typings.miniprogram.anon.Shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowAuthGuideArgs extends AsyncCallback[Shown] {
  
  /**
    * Identifier of the permission under guide, used to identify
    * the type of the permission (such as LBS).
    */
  var authType: String = js.native
}
object ShowAuthGuideArgs {
  
  @scala.inline
  def apply(authType: String): ShowAuthGuideArgs = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAuthGuideArgs]
  }
  
  @scala.inline
  implicit class ShowAuthGuideArgsMutableBuilder[Self <: ShowAuthGuideArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
  }
}
