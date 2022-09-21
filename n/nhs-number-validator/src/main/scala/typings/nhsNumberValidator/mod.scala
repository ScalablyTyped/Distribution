package typings.nhsNumberValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nhs-number-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validate(nhsNumber: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(nhsNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validate(nhsNumber: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(nhsNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
