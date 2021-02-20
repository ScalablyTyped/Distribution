package typings.msRestAzure.mod

import typings.msRest.mod.Mapper
import typings.msRest.mod.PathTemplateBasedRequestPrepareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRunningPathTemplateBasedRequestPrepareOptions extends PathTemplateBasedRequestPrepareOptions {
  
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.native
}
object LongRunningPathTemplateBasedRequestPrepareOptions {
  
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, pathTemplate: String, serializationMapper: Mapper): LongRunningPathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pathTemplate = pathTemplate.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningPathTemplateBasedRequestPrepareOptions]
  }
  
  @scala.inline
  implicit class LongRunningPathTemplateBasedRequestPrepareOptionsMutableBuilder[Self <: LongRunningPathTemplateBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserializationMapperForTerminalResponse(value: Mapper): Self = StObject.set(x, "deserializationMapperForTerminalResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializationMapperForTerminalResponseUndefined: Self = StObject.set(x, "deserializationMapperForTerminalResponse", js.undefined)
  }
}
