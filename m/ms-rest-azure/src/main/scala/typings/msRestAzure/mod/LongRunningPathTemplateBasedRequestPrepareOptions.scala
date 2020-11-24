package typings.msRestAzure.mod

import typings.msRest.mod.Mapper
import typings.msRest.mod.PathTemplateBasedRequestPrepareOptions
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
  implicit class LongRunningPathTemplateBasedRequestPrepareOptionsOps[Self <: LongRunningPathTemplateBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
    
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
    def setDeserializationMapperForTerminalResponse(value: Mapper): Self = this.set("deserializationMapperForTerminalResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeserializationMapperForTerminalResponse: Self = this.set("deserializationMapperForTerminalResponse", js.undefined)
  }
}
