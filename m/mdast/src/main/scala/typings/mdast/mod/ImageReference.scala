package typings.mdast.mod

import typings.mdast.mdastStrings.imageReference
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageReference
  extends StaticPhrasingContent
     with Node
     with Reference
     with Alternative {
  
  @JSName("type")
  var type_ImageReference: imageReference = js.native
}
object ImageReference {
  
  @scala.inline
  def apply(identifier: String, referenceType: ReferenceType, `type`: imageReference): ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageReference]
  }
  
  @scala.inline
  implicit class ImageReferenceMutableBuilder[Self <: ImageReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: imageReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
