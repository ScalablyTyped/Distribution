package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamDriveReference extends StObject {
  
  /** This field is deprecated; please see `DriveReference.name` instead. */
  var name: js.UndefOr[String] = js.undefined
  
  /** This field is deprecated; please see `DriveReference.title` instead. */
  var title: js.UndefOr[String] = js.undefined
}
object TeamDriveReference {
  
  inline def apply(): TeamDriveReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDriveReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamDriveReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
