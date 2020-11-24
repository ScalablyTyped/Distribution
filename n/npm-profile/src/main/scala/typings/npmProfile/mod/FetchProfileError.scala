package typings.npmProfile.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchProfileError extends Error {
  
  var body: Uint8Array = js.native
  
  var code: String = js.native
  
  var headers: StringDictionary[js.Any] = js.native
  
  var method: String = js.native
  
  var pkgid: js.UndefOr[String] = js.native
  
  var statucCode: Double = js.native
  
  var uri: String = js.native
}
object FetchProfileError {
  
  @scala.inline
  def apply(
    body: Uint8Array,
    code: String,
    headers: StringDictionary[js.Any],
    message: String,
    method: String,
    name: String,
    statucCode: Double,
    uri: String
  ): FetchProfileError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statucCode = statucCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProfileError]
  }
  
  @scala.inline
  implicit class FetchProfileErrorOps[Self <: FetchProfileError] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatucCode(value: Double): Self = this.set("statucCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkgid(value: String): Self = this.set("pkgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkgid: Self = this.set("pkgid", js.undefined)
  }
}
