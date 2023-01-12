package typings.nginstackWebFramework.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  var buttons: Record[String, String]
  
  var overview: String
}
object Buttons {
  
  inline def apply(buttons: Record[String, String], overview: String): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: Record[String, String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
  }
}
