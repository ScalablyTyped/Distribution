package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputType extends StObject
@JSImport("sap/ui/webc/main/library", "InputType")
@js.native
object InputType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InputType & String] = js.native
  
  /**
    * Used for input fields that must contain an e-mail address.
    */
  @js.native
  sealed trait Email
    extends StObject
       with InputType
  /* "Email" */ val Email: typings.openui5.sapUiWebcMainLibraryMod.InputType.Email & String = js.native
  
  /**
    * Defines a numeric input field.
    */
  @js.native
  sealed trait Number
    extends StObject
       with InputType
  /* "Number" */ val Number: typings.openui5.sapUiWebcMainLibraryMod.InputType.Number & String = js.native
  
  /**
    * Defines a password field.
    */
  @js.native
  sealed trait Password
    extends StObject
       with InputType
  /* "Password" */ val Password: typings.openui5.sapUiWebcMainLibraryMod.InputType.Password & String = js.native
  
  /**
    * Used for input fields that should contain a telephone number.
    */
  @js.native
  sealed trait Tel
    extends StObject
       with InputType
  /* "Tel" */ val Tel: typings.openui5.sapUiWebcMainLibraryMod.InputType.Tel & String = js.native
  
  /**
    * Defines a one-line text input field:
    */
  @js.native
  sealed trait Text
    extends StObject
       with InputType
  /* "Text" */ val Text: typings.openui5.sapUiWebcMainLibraryMod.InputType.Text & String = js.native
  
  /**
    * Used for input fields that should contain a URL address.
    */
  @js.native
  sealed trait URL
    extends StObject
       with InputType
  /* "URL" */ val URL: typings.openui5.sapUiWebcMainLibraryMod.InputType.URL & String = js.native
}
