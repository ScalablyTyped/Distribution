package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearance extends StObject {
  
  var appearance: String
  
  var font: String
}
object Appearance {
  
  @scala.inline
  def apply(appearance: String, font: String): Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
  
  @scala.inline
  implicit class AppearanceMutableBuilder[Self <: Appearance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
