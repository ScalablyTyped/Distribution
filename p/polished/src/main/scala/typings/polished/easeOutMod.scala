package typings.polished

import typings.polished.timingFunctionMod.TimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easeOutMod {
  
  @JSImport("polished/lib/easings/easeOut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(functionName: String): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(functionName.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
}
