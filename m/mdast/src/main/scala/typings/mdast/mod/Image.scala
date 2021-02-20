package typings.mdast.mod

import typings.mdast.mdastStrings.image
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image
  extends StaticPhrasingContent
     with Node
     with Resource
     with Alternative {
  
  @JSName("type")
  var type_Image: image = js.native
}
object Image {
  
  @scala.inline
  def apply(`type`: image, url: String): Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
