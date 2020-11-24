package typings.pouchdbAdapterHttp.PouchDB.HttpAdapter

import typings.pouchdbAdapterHttp.pouchdbAdapterHttpStrings.http
import typings.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
  
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: http = js.native
}
object HttpAdapterConfiguration {
  
  @scala.inline
  def apply(adapter: http): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
  
  @scala.inline
  implicit class HttpAdapterConfigurationOps[Self <: HttpAdapterConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: http): Self = this.set("adapter", value.asInstanceOf[js.Any])
  }
}
