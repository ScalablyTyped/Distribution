package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredPreview[T] extends StObject {
  
  var mediaType: `0`[T] = js.native
}
object RequiredPreview {
  
  @scala.inline
  def apply[T](mediaType: `0`[T]): RequiredPreview[T] = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPreview[T]]
  }
  
  @scala.inline
  implicit class RequiredPreviewMutableBuilder[Self <: RequiredPreview[_], T] (val x: Self with RequiredPreview[T]) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `0`[T]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
  }
}
