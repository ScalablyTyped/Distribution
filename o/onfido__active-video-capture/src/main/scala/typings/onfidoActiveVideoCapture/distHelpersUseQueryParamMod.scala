package typings.onfidoActiveVideoCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUseQueryParamMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useQueryParam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQueryParam[T /* <: String */](param: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryParam")(param.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useQueryParam[T /* <: String */](param: String, validValues: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryParam")(param.asInstanceOf[js.Any], validValues.asInstanceOf[js.Any])).asInstanceOf[T]
}
