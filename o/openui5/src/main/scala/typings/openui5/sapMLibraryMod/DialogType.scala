package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialogType extends StObject
@JSImport("sap/m/library", "DialogType")
@js.native
object DialogType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DialogType & String] = js.native
  
  /**
    * Dialog with type Message looks the same as the Standard Dialog in Android. It puts the Left and the Right
    * buttons at the bottom of the Dialog in iOS.
    */
  @js.native
  sealed trait Message
    extends StObject
       with DialogType
  /* "Message" */ val Message: typings.openui5.sapMLibraryMod.DialogType.Message & String = js.native
  
  /**
    * This is the default value for Dialog type.
    *
    * The Standard Dialog in iOS has a header on the top. The Left and the Right buttons are put inside the
    * header. In Android, the Left and the Right buttons are put at the bottom of the Dialog.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with DialogType
  /* "Standard" */ val Standard: typings.openui5.sapMLibraryMod.DialogType.Standard & String = js.native
}
