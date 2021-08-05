package typings.phaser.spine.webgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAttribute extends StObject {
  
  var name: String
  
  var numElements: Double
  
  var `type`: VertexAttributeType
}
object VertexAttribute {
  
  inline def apply(name: String, numElements: Double, `type`: VertexAttributeType): VertexAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numElements = numElements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttribute]
  }
  
  extension [Self <: VertexAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumElements(value: Double): Self = StObject.set(x, "numElements", value.asInstanceOf[js.Any])
    
    inline def setType(value: VertexAttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
