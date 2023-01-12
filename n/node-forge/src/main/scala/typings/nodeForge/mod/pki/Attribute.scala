package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * Extensions
    */
  var extensions: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * e.g. challengePassword
    */
  var name: String
  
  /**
    * Short name, if available (e.g. 'CN' for 'commonName')
    */
  var shortName: js.UndefOr[String] = js.undefined
  
  /**
    * OID, e.g. '1.2.840.113549.1.9.7'
    */
  var `type`: String
  
  /**
    * Attribute value
    */
  var value: Any
  
  /**
    * Attribute value data type
    */
  var valueTagClass: Double
}
object Attribute {
  
  inline def apply(name: String, `type`: String, value: Any, valueTagClass: Double): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueTagClass = valueTagClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: js.Array[Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Any*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueTagClass(value: Double): Self = StObject.set(x, "valueTagClass", value.asInstanceOf[js.Any])
  }
}
