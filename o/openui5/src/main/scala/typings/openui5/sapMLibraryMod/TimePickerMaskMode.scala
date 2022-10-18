package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimePickerMaskMode extends StObject
@JSImport("sap/m/library", "TimePickerMaskMode")
@js.native
object TimePickerMaskMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimePickerMaskMode & String] = js.native
  
  /**
    * `MaskInput` is disabled for the `sap.m.TimePicker`.
    */
  @js.native
  sealed trait Off
    extends StObject
       with TimePickerMaskMode
  /* "Off" */ val Off: typings.openui5.sapMLibraryMod.TimePickerMaskMode.Off & String = js.native
  
  /**
    * `MaskInput` is enabled for the `sap.m.TimePicker`.
    */
  @js.native
  sealed trait On
    extends StObject
       with TimePickerMaskMode
  /* "On" */ val On: typings.openui5.sapMLibraryMod.TimePickerMaskMode.On & String = js.native
}
