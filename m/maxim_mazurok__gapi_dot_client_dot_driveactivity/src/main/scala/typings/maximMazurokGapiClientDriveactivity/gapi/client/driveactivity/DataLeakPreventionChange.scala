package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLeakPreventionChange extends StObject {
  
  /** The type of Data Leak Prevention (DLP) change. */
  var `type`: js.UndefOr[String] = js.native
}
object DataLeakPreventionChange {
  
  @scala.inline
  def apply(): DataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLeakPreventionChange]
  }
  
  @scala.inline
  implicit class DataLeakPreventionChangeMutableBuilder[Self <: DataLeakPreventionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
