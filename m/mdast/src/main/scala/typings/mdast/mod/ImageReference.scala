package typings.mdast.mod

import typings.mdast.mdastStrings.imageReference
import typings.unist.mod.Node
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
  implicit class ImageReferenceOps[Self <: ImageReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: imageReference): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
