package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// For Library Version: 1.113.0
object sapBaseAssertMod {
  
  @JSImport("sap/base/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * Result of the checked assertion
    */
  bResult: Boolean,
    /**
    * Message that will be logged when the result is `false`. In case this is a function, the return value
    * of the function will be displayed. This can be used to execute complex code only if the assertion fails.
    */
  vMessage: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bResult.asInstanceOf[js.Any], vMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    /**
    * Result of the checked assertion
    */
  bResult: Boolean,
    /**
    * Message that will be logged when the result is `false`. In case this is a function, the return value
    * of the function will be displayed. This can be used to execute complex code only if the assertion fails.
    */
  vMessage: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bResult.asInstanceOf[js.Any], vMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
