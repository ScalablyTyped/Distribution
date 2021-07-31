package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var outline: String
}
object Outline {
  
  @scala.inline
  def apply(outline: String): Outline = {
    val __obj = js.Dynamic.literal(outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit class OutlineMutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
