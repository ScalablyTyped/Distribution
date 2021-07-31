package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isWrapped(func: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrapped")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
