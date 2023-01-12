package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attribute members to search on; any one hit will return the attribute
  */
trait GetAttributeOpts extends StObject {
  
  /**
    * Long name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Short name
    */
  var shortName: js.UndefOr[String] = js.undefined
  
  /**
    * OID
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GetAttributeOpts {
  
  inline def apply(): GetAttributeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAttributeOpts] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
