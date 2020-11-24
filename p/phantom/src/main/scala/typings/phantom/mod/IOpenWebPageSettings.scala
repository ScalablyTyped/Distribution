package typings.phantom.mod

import org.scalablytyped.runtime.StringDictionary
import typings.phantom.phantomStrings.DELETE
import typings.phantom.phantomStrings.GET
import typings.phantom.phantomStrings.HEAD
import typings.phantom.phantomStrings.POST
import typings.phantom.phantomStrings.PUT
import typings.phantom.phantomStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOpenWebPageSettings extends js.Object {
  
  var data: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[utf8 | String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var operation: js.UndefOr[GET | POST | HEAD | DELETE | PUT | String] = js.native
}
object IOpenWebPageSettings {
  
  @scala.inline
  def apply(): IOpenWebPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenWebPageSettings]
  }
  
  @scala.inline
  implicit class IOpenWebPageSettingsOps[Self <: IOpenWebPageSettings] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEncoding(value: utf8 | String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOperation(value: GET | POST | HEAD | DELETE | PUT | String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
}
