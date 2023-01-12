package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutProperties extends StObject {
  
  /** The human-readable name of the layout. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The object ID of the master that this layout is based on. */
  var masterObjectId: js.UndefOr[String] = js.undefined
  
  /** The name of the layout. */
  var name: js.UndefOr[String] = js.undefined
}
object LayoutProperties {
  
  inline def apply(): LayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutProperties] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
    
    inline def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
