package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathTemplateBasedRequestPrepareOptions extends RequestPrepareOptions {
  
  var pathTemplate: String = js.native
}
object PathTemplateBasedRequestPrepareOptions {
  
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, pathTemplate: String, serializationMapper: Mapper): PathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pathTemplate = pathTemplate.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTemplateBasedRequestPrepareOptions]
  }
  
  @scala.inline
  implicit class PathTemplateBasedRequestPrepareOptionsMutableBuilder[Self <: PathTemplateBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
  }
}
