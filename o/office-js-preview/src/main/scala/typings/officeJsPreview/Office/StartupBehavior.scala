package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StartupBehavior extends StObject
// Enumerations
/**
  * Provides options to determine the startup behavior of the add-in upon next start-up.
  */
@JSGlobal("Office.StartupBehavior")
@js.native
object StartupBehavior extends StObject {
  
  /**
    * Load the add-in but do not show UI.
    */
  @js.native
  sealed trait load extends StartupBehavior
  
  /**
    * The add-in does not load until opened by the user.
    */
  @js.native
  sealed trait none extends StartupBehavior
}
