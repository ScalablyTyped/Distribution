package typings.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsOptions extends js.Object {
  
  var exposedHeaders: js.Array[String] = js.native
  
  var methods: js.Array[String] = js.native
  
  var origin: Boolean = js.native
}
object CorsOptions {
  
  @scala.inline
  def apply(exposedHeaders: js.Array[String], methods: js.Array[String], origin: Boolean): CorsOptions = {
    val __obj = js.Dynamic.literal(exposedHeaders = exposedHeaders.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsOptions]
  }
  
  @scala.inline
  implicit class CorsOptionsOps[Self <: CorsOptions] (val x: Self) extends AnyVal {
    
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
    def setExposedHeadersVarargs(value: String*): Self = this.set("exposedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposedHeaders(value: js.Array[String]): Self = this.set("exposedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Boolean): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
