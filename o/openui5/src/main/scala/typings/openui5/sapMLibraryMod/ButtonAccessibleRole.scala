package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonAccessibleRole extends StObject
@JSImport("sap/m/library", "ButtonAccessibleRole")
@js.native
object ButtonAccessibleRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonAccessibleRole & String] = js.native
  
  /**
    * Default mode.
    */
  @js.native
  sealed trait Default
    extends StObject
       with ButtonAccessibleRole
  /* "Default" */ val Default: typings.openui5.sapMLibraryMod.ButtonAccessibleRole.Default & String = js.native
  
  /**
    * Button will receive `role="Link"` attibute.
    */
  @js.native
  sealed trait Link
    extends StObject
       with ButtonAccessibleRole
  /* "Link" */ val Link: typings.openui5.sapMLibraryMod.ButtonAccessibleRole.Link & String = js.native
}
