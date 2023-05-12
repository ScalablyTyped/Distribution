package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformMenuCommandResult extends StObject {
  
  /** If true then the menu command was available and was executed. If false, then Photoshop was in a state where the requested command was not available. */
  var available: Boolean
  
  /** If the menu command was executed (if available is true), then this value is true if the user cancelled the request. */
  var userCancelled: Boolean
}
object PerformMenuCommandResult {
  
  inline def apply(available: Boolean, userCancelled: Boolean): PerformMenuCommandResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], userCancelled = userCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformMenuCommandResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformMenuCommandResult] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setUserCancelled(value: Boolean): Self = StObject.set(x, "userCancelled", value.asInstanceOf[js.Any])
  }
}
