package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the definition of a loaded object (.DAT or .json) such a ride type or scenery item.
  */
trait Object extends StObject {
  
  /**
    * The unique identifier of the object, e.g. "rct2.burgb".
    * Only JSON objects will have an identifier.
    */
  val identifier: String
  
  /**
    * The index of the loaded object for the object type.
    */
  val index: Double
  
  /**
    * The original unique identifier of the object, e.g. "BURGB   ".
    * This may have trailing spaces if the name is shorter than 8 characters.
    * Only .DAT objects or JSON objects based on .DAT objects will have legacy identifiers.
    */
  val legacyIdentifier: String
  
  /**
    * The name in the user's current language.
    */
  val name: String
  
  /**
    * The object type.
    */
  val `type`: ObjectType
}
object Object {
  
  inline def apply(identifier: String, index: Double, legacyIdentifier: String, name: String, `type`: ObjectType): Object = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], legacyIdentifier = legacyIdentifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLegacyIdentifier(value: String): Self = StObject.set(x, "legacyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
