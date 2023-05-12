package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteAsModalOptions extends StObject {
  
  /**
    * Name of the command. It will be shown in the progress bar if the operation takes a noticeable amount of time.
    * @minVersion 22.5
    */
  var commandName: String
  
  /**
    * An object literal that is passed as the second parameter of `targetFunction` following an [executeAsModal](../executeasmodal) call.
    * Cannot include functions.
    * @minVersion 22.5
    */
  var descriptor: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Optional mode where UI interactions are permissible within the executeAsModal state. Useful for allowing users to input
    * data into invoked dialogs or workspaces. See [Modal Execution](../executeasmodal).
    * @minVersion 23.3
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
}
object ExecuteAsModalOptions {
  
  inline def apply(commandName: String): ExecuteAsModalOptions = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteAsModalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteAsModalOptions] (val x: Self) extends AnyVal {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: js.Object): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}
