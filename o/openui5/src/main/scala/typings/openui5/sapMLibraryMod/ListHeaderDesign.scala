package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListHeaderDesign extends StObject
@JSImport("sap/m/library", "ListHeaderDesign")
@js.native
object ListHeaderDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListHeaderDesign & String] = js.native
  
  /**
    * Plain header style
    */
  @js.native
  sealed trait Plain
    extends StObject
       with ListHeaderDesign
  /* "Plain" */ val Plain: typings.openui5.sapMLibraryMod.ListHeaderDesign.Plain & String = js.native
  
  /**
    * Standard header style
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ListHeaderDesign
  /* "Standard" */ val Standard: typings.openui5.sapMLibraryMod.ListHeaderDesign.Standard & String = js.native
}
