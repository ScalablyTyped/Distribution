package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var top: String
}
object Top {
  
  @scala.inline
  def apply(top: String): Top = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
