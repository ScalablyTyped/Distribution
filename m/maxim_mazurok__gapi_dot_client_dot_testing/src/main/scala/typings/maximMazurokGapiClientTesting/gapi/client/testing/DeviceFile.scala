package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceFile extends StObject {
  
  /** A reference to an opaque binary blob file. */
  var obbFile: js.UndefOr[ObbFile] = js.native
  
  /** A reference to a regular file. */
  var regularFile: js.UndefOr[RegularFile] = js.native
}
object DeviceFile {
  
  @scala.inline
  def apply(): DeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFile]
  }
  
  @scala.inline
  implicit class DeviceFileMutableBuilder[Self <: DeviceFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObbFile(value: ObbFile): Self = StObject.set(x, "obbFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObbFileUndefined: Self = StObject.set(x, "obbFile", js.undefined)
    
    @scala.inline
    def setRegularFile(value: RegularFile): Self = StObject.set(x, "regularFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularFileUndefined: Self = StObject.set(x, "regularFile", js.undefined)
  }
}
