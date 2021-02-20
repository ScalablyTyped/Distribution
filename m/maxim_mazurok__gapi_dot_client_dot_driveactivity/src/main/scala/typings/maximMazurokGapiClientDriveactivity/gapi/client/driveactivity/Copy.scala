package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copy extends StObject {
  
  /** The the original object. */
  var originalObject: js.UndefOr[TargetReference] = js.native
}
object Copy {
  
  @scala.inline
  def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyMutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalObject(value: TargetReference): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
