package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkAccessibleRole extends StObject
@JSImport("sap/m/library", "LinkAccessibleRole")
@js.native
object LinkAccessibleRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkAccessibleRole & String] = js.native
  
  /**
    * Link will receive `role="Button"` attibute.
    */
  @js.native
  sealed trait Button
    extends StObject
       with LinkAccessibleRole
  /* "Button" */ val Button: typings.openui5.sapMLibraryMod.LinkAccessibleRole.Button & String = js.native
  
  /**
    * Default mode.
    */
  @js.native
  sealed trait Default
    extends StObject
       with LinkAccessibleRole
  /* "Default" */ val Default: typings.openui5.sapMLibraryMod.LinkAccessibleRole.Default & String = js.native
}
