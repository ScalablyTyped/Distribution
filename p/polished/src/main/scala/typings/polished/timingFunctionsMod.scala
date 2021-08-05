package typings.polished

import typings.polished.timingFunctionMod.TimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timingFunctionsMod {
  
  @JSImport("polished/lib/mixins/timingFunctions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(timingFunction: TimingFunction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(timingFunction.asInstanceOf[js.Any]).asInstanceOf[String]
}
