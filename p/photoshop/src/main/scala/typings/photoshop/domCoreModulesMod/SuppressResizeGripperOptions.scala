package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressResizeGripperOptions extends StObject {
  
  /** Id of entrypoint in manifest file */
  var target: String
  
  /** Type of entrypoint e.g. `panel`*/
  var `type`: String
  
  /** Set true to hide resize gripper */
  var value: Boolean
}
object SuppressResizeGripperOptions {
  
  inline def apply(target: String, `type`: String, value: Boolean): SuppressResizeGripperOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressResizeGripperOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuppressResizeGripperOptions] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
