package typings.openfin.shapesPlatformMod

import typings.openfin.windowOptionMod.WindowOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWindowOptions extends WindowOption {
  
  var stylesheetUrl: String = js.native
}
object DefaultWindowOptions {
  
  @scala.inline
  def apply(stylesheetUrl: String): DefaultWindowOptions = {
    val __obj = js.Dynamic.literal(stylesheetUrl = stylesheetUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWindowOptions]
  }
  
  @scala.inline
  implicit class DefaultWindowOptionsMutableBuilder[Self <: DefaultWindowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylesheetUrl(value: String): Self = StObject.set(x, "stylesheetUrl", value.asInstanceOf[js.Any])
  }
}
