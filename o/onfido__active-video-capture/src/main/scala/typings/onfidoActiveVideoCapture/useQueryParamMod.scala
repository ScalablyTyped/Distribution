package typings.onfidoActiveVideoCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useQueryParamMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useQueryParam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQueryParam(param: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryParam")(param.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useQueryParam(param: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryParam")(param.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
}
