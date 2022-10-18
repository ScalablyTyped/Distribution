package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexWrap extends StObject
@JSImport("sap/m/library", "FlexWrap")
@js.native
object FlexWrap extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexWrap & String] = js.native
  
  /**
    * The flex container is single-line.
    */
  @js.native
  sealed trait NoWrap
    extends StObject
       with FlexWrap
  /* "NoWrap" */ val NoWrap: typings.openui5.sapMLibraryMod.FlexWrap.NoWrap & String = js.native
  
  /**
    * The flex container is multi-line.
    */
  @js.native
  sealed trait Wrap
    extends StObject
       with FlexWrap
  /* "Wrap" */ val Wrap: typings.openui5.sapMLibraryMod.FlexWrap.Wrap & String = js.native
  
  /**
    * The flex container is multi-line with the cross-axis start and end being swapped.
    */
  @js.native
  sealed trait WrapReverse
    extends StObject
       with FlexWrap
  /* "WrapReverse" */ val WrapReverse: typings.openui5.sapMLibraryMod.FlexWrap.WrapReverse & String = js.native
}
