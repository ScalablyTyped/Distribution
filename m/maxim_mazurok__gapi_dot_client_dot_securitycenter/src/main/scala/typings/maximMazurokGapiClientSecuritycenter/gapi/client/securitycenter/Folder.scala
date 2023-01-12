package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  /** Full resource name of this folder. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var resourceFolder: js.UndefOr[String] = js.undefined
  
  /** The user defined display name for this folder. */
  var resourceFolderDisplayName: js.UndefOr[String] = js.undefined
}
object Folder {
  
  inline def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    inline def setResourceFolder(value: String): Self = StObject.set(x, "resourceFolder", value.asInstanceOf[js.Any])
    
    inline def setResourceFolderDisplayName(value: String): Self = StObject.set(x, "resourceFolderDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceFolderDisplayNameUndefined: Self = StObject.set(x, "resourceFolderDisplayName", js.undefined)
    
    inline def setResourceFolderUndefined: Self = StObject.set(x, "resourceFolder", js.undefined)
  }
}
