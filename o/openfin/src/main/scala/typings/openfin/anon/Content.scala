package typings.openfin.anon

import typings.openfin.GoldenLayout.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  var content: Config = js.native
  
  var dimensions: HeightLeft = js.native
  
  var indexInParent: Double = js.native
  
  var parentId: String = js.native
}
object Content {
  
  @scala.inline
  def apply(content: Config, dimensions: HeightLeft, indexInParent: Double, parentId: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], indexInParent = indexInParent.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Config): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: HeightLeft): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexInParent(value: Double): Self = StObject.set(x, "indexInParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
