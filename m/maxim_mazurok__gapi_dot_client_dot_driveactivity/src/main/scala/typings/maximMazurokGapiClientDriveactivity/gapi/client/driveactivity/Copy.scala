package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Copy extends StObject {
  
  /** The original object. */
  var originalObject: js.UndefOr[TargetReference] = js.undefined
}
object Copy {
  
  inline def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
    
    inline def setOriginalObject(value: TargetReference): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
