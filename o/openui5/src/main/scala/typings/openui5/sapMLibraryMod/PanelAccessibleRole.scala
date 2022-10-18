package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PanelAccessibleRole extends StObject
@JSImport("sap/m/library", "PanelAccessibleRole")
@js.native
object PanelAccessibleRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PanelAccessibleRole & String] = js.native
  
  /**
    * Represents the ARIA role `complementary`. A section of the page, designed to be complementary to the
    * main content at a similar level in the DOM hierarchy.
    */
  @js.native
  sealed trait Complementary
    extends StObject
       with PanelAccessibleRole
  /* "Complementary" */ val Complementary: typings.openui5.sapMLibraryMod.PanelAccessibleRole.Complementary & String = js.native
  
  /**
    * Represents the ARIA role `Form`. A landmark region that contains a collection of items and objects that,
    * as a whole, create a form.
    */
  @js.native
  sealed trait Form
    extends StObject
       with PanelAccessibleRole
  /* "Form" */ val Form: typings.openui5.sapMLibraryMod.PanelAccessibleRole.Form & String = js.native
  
  /**
    * Represents the ARIA role `Region`. A section of a page, that is important enough to be included in a
    * page summary or table of contents.
    */
  @js.native
  sealed trait Region
    extends StObject
       with PanelAccessibleRole
  /* "Region" */ val Region: typings.openui5.sapMLibraryMod.PanelAccessibleRole.Region & String = js.native
}
