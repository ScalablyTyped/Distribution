package typings.pTry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-try", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType, ArgumentsType /* <: js.Array[Any] */](
    function_ : js.Function1[/* arguments */ ArgumentsType, js.Thenable[ValueType] | ValueType],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
  ): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(function_.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
}
