package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WizardRenderMode extends StObject
@JSImport("sap/m/library", "WizardRenderMode")
@js.native
object WizardRenderMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WizardRenderMode & String] = js.native
  
  /**
    * Display steps as separate, single pages.
    */
  @js.native
  sealed trait Page
    extends StObject
       with WizardRenderMode
  /* "Page" */ val Page: typings.openui5.sapMLibraryMod.WizardRenderMode.Page & String = js.native
  
  /**
    * Display all steps into a scroll section.
    */
  @js.native
  sealed trait Scroll
    extends StObject
       with WizardRenderMode
  /* "Scroll" */ val Scroll: typings.openui5.sapMLibraryMod.WizardRenderMode.Scroll & String = js.native
}
