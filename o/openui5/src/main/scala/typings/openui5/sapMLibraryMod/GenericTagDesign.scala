package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenericTagDesign extends StObject
@JSImport("sap/m/library", "GenericTagDesign")
@js.native
object GenericTagDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GenericTagDesign & String] = js.native
  
  /**
    * Everything from the control is rendered.
    */
  @js.native
  sealed trait Full
    extends StObject
       with GenericTagDesign
  /* "Full" */ val Full: typings.openui5.sapMLibraryMod.GenericTagDesign.Full & String = js.native
  
  /**
    * Everything from the control is rendered except the status icon.
    */
  @js.native
  sealed trait StatusIconHidden
    extends StObject
       with GenericTagDesign
  /* "StatusIconHidden" */ val StatusIconHidden: typings.openui5.sapMLibraryMod.GenericTagDesign.StatusIconHidden & String = js.native
}
