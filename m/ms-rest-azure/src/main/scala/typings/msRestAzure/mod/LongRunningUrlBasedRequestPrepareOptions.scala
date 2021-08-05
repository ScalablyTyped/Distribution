package typings.msRestAzure.mod

import typings.msRest.mod.Mapper
import typings.msRest.mod.UrlBasedRequestPrepareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRunningUrlBasedRequestPrepareOptions
  extends StObject
     with UrlBasedRequestPrepareOptions {
  
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.undefined
}
object LongRunningUrlBasedRequestPrepareOptions {
  
  inline def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper, url: String): LongRunningUrlBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningUrlBasedRequestPrepareOptions]
  }
  
  extension [Self <: LongRunningUrlBasedRequestPrepareOptions](x: Self) {
    
    inline def setDeserializationMapperForTerminalResponse(value: Mapper): Self = StObject.set(x, "deserializationMapperForTerminalResponse", value.asInstanceOf[js.Any])
    
    inline def setDeserializationMapperForTerminalResponseUndefined: Self = StObject.set(x, "deserializationMapperForTerminalResponse", js.undefined)
  }
}
