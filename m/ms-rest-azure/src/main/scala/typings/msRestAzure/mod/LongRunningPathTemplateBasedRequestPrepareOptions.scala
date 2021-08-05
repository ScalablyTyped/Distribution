package typings.msRestAzure.mod

import typings.msRest.mod.Mapper
import typings.msRest.mod.PathTemplateBasedRequestPrepareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRunningPathTemplateBasedRequestPrepareOptions
  extends StObject
     with PathTemplateBasedRequestPrepareOptions {
  
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.undefined
}
object LongRunningPathTemplateBasedRequestPrepareOptions {
  
  inline def apply(deserializationMapper: Mapper, method: String, pathTemplate: String, serializationMapper: Mapper): LongRunningPathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pathTemplate = pathTemplate.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningPathTemplateBasedRequestPrepareOptions]
  }
  
  extension [Self <: LongRunningPathTemplateBasedRequestPrepareOptions](x: Self) {
    
    inline def setDeserializationMapperForTerminalResponse(value: Mapper): Self = StObject.set(x, "deserializationMapperForTerminalResponse", value.asInstanceOf[js.Any])
    
    inline def setDeserializationMapperForTerminalResponseUndefined: Self = StObject.set(x, "deserializationMapperForTerminalResponse", js.undefined)
  }
}
