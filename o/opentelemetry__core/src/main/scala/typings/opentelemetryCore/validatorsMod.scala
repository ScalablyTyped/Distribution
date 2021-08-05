package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @JSImport("@opentelemetry/core/build/src/internal/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateKey(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateValue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
