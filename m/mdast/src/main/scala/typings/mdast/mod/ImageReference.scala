package typings.mdast.mod

import typings.mdast.mdastStrings.imageReference
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageReference
  extends StObject
     with Node[Data]
     with Reference
     with Alternative {
  
  @JSName("type")
  var type_ImageReference: imageReference
}
object ImageReference {
  
  inline def apply(identifier: String, referenceType: ReferenceType): ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imageReference")
    __obj.asInstanceOf[ImageReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageReference] (val x: Self) extends AnyVal {
    
    inline def setType(value: imageReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
