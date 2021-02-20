package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBridgeVersion extends StObject {
  
  var name: String = js.native
  
  var version: Api = js.native
}
object IBridgeVersion {
  
  @scala.inline
  def apply(name: String, version: Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeVersion]
  }
  
  @scala.inline
  implicit class IBridgeVersionMutableBuilder[Self <: IBridgeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Api): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
