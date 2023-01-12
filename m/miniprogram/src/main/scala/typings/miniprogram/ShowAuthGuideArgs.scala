package typings.miniprogram

import typings.miniprogram.anon.Shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowAuthGuideArgs
  extends StObject
     with AsyncCallback[Shown] {
  
  /**
    * Identifier of the permission under guide, used to identify
    * the type of the permission (such as LBS).
    */
  var authType: String
}
object ShowAuthGuideArgs {
  
  inline def apply(authType: String): ShowAuthGuideArgs = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAuthGuideArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowAuthGuideArgs] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
  }
}
