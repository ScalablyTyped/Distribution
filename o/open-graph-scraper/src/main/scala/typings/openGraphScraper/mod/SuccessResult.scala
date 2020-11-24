package typings.openGraphScraper.mod

import typings.node.streamMod.PassThrough
import typings.openGraphScraper.anon.OgDescription
import typings.openGraphScraper.openGraphScraperBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessResult extends js.Object {
  
  var error: `false` = js.native
  
  var response: PassThrough = js.native
  
  var result: OgDescription = js.native
}
object SuccessResult {
  
  @scala.inline
  def apply(error: `false`, response: PassThrough, result: OgDescription): SuccessResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResult]
  }
  
  @scala.inline
  implicit class SuccessResultOps[Self <: SuccessResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: `false`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: PassThrough): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: OgDescription): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
