package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueColor extends StObject
@JSImport("sap/m/library", "ValueColor")
@js.native
object ValueColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValueColor & String] = js.native
  
  /**
    * Critical value color.
    */
  @js.native
  sealed trait Critical
    extends StObject
       with ValueColor
  /* "Critical" */ val Critical: typings.openui5.sapMLibraryMod.ValueColor.Critical & String = js.native
  
  /**
    * Error value color.
    */
  @js.native
  sealed trait Error
    extends StObject
       with ValueColor
  /* "Error" */ val Error: typings.openui5.sapMLibraryMod.ValueColor.Error & String = js.native
  
  /**
    * Good value color.
    */
  @js.native
  sealed trait Good
    extends StObject
       with ValueColor
  /* "Good" */ val Good: typings.openui5.sapMLibraryMod.ValueColor.Good & String = js.native
  
  /**
    * Neutral value color.
    */
  @js.native
  sealed trait Neutral
    extends StObject
       with ValueColor
  /* "Neutral" */ val Neutral: typings.openui5.sapMLibraryMod.ValueColor.Neutral & String = js.native
  
  /**
    * @SINCE 1.84
    *
    * None value color.
    *
    * **Note:** The None value color is set to prevent the display of tooltip 'Neutral' for numeric content.
    */
  @js.native
  sealed trait None
    extends StObject
       with ValueColor
  /* "None" */ val None: typings.openui5.sapMLibraryMod.ValueColor.None & String = js.native
}
