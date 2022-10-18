package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TitleAlignment extends StObject
@JSImport("sap/m/library", "TitleAlignment")
@js.native
object TitleAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TitleAlignment & String] = js.native
  
  /**
    * The default type (if specified in the theme)
    */
  @js.native
  sealed trait Auto
    extends StObject
       with TitleAlignment
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.TitleAlignment.Auto & String = js.native
  
  /**
    * Explicitly sets the alignment to the center
    */
  @js.native
  sealed trait Center
    extends StObject
       with TitleAlignment
  /* "Center" */ val Center: typings.openui5.sapMLibraryMod.TitleAlignment.Center & String = js.native
  
  /**
    * Disables an automatic title alignment depending on theme Mostly used in sap.m.Bar
    */
  @js.native
  sealed trait None
    extends StObject
       with TitleAlignment
  /* "None" */ val None: typings.openui5.sapMLibraryMod.TitleAlignment.None & String = js.native
  
  /**
    * Explicitly sets the alignment to the start (left or right depending on LTR/RTL)
    */
  @js.native
  sealed trait Start
    extends StObject
       with TitleAlignment
  /* "Start" */ val Start: typings.openui5.sapMLibraryMod.TitleAlignment.Start & String = js.native
}
