package typings.parse5.distCommonTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /** The name of the attribute. */
  var name: String
  
  /** The namespace of the attribute. */
  var namespace: js.UndefOr[String] = js.undefined
  
  /** The namespace-related prefix of the attribute. */
  var prefix: js.UndefOr[String] = js.undefined
  
  /** The value of the attribute. */
  var value: String
}
object Attribute {
  
  inline def apply(name: String, value: String): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
