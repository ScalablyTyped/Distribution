package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsCreateParamsFilesKeyString extends StObject {
  
  var content: String = js.native
}
object GistsCreateParamsFilesKeyString {
  
  @scala.inline
  def apply(content: String): GistsCreateParamsFilesKeyString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateParamsFilesKeyString]
  }
  
  @scala.inline
  implicit class GistsCreateParamsFilesKeyStringMutableBuilder[Self <: GistsCreateParamsFilesKeyString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
