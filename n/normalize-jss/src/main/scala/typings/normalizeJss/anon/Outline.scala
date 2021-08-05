package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var outline: String
}
object Outline {
  
  inline def apply(outline: String): Outline = {
    val __obj = js.Dynamic.literal(outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  
  extension [Self <: Outline](x: Self) {
    
    inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
