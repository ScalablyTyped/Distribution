package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the map logo.
  */
@js.native
trait LogoOptions extends StObject {
  
  var href: String = js.native
  
  var src: String = js.native
}
object LogoOptions {
  
  @scala.inline
  def apply(href: String, src: String): LogoOptions = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoOptions]
  }
  
  @scala.inline
  implicit class LogoOptionsMutableBuilder[Self <: LogoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
