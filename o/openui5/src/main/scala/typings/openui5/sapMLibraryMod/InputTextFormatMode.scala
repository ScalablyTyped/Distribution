package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputTextFormatMode extends StObject
@JSImport("sap/m/library", "InputTextFormatMode")
@js.native
object InputTextFormatMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InputTextFormatMode & String] = js.native
  
  /**
    * Key
    */
  @js.native
  sealed trait Key
    extends StObject
       with InputTextFormatMode
  /* "Key" */ val Key: typings.openui5.sapMLibraryMod.InputTextFormatMode.Key & String = js.native
  
  /**
    * A key-value pair formatted like "(key) text"
    */
  @js.native
  sealed trait KeyValue
    extends StObject
       with InputTextFormatMode
  /* "KeyValue" */ val KeyValue: typings.openui5.sapMLibraryMod.InputTextFormatMode.KeyValue & String = js.native
  
  /**
    * Text
    */
  @js.native
  sealed trait Value
    extends StObject
       with InputTextFormatMode
  /* "Value" */ val Value: typings.openui5.sapMLibraryMod.InputTextFormatMode.Value & String = js.native
  
  /**
    * A value-key pair formatted like "text (key)"
    */
  @js.native
  sealed trait ValueKey
    extends StObject
       with InputTextFormatMode
  /* "ValueKey" */ val ValueKey: typings.openui5.sapMLibraryMod.InputTextFormatMode.ValueKey & String = js.native
}
