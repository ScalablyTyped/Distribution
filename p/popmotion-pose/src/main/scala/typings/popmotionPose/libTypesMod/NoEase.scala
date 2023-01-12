package typings.popmotionPose.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoEase extends StObject {
  
  var ease: Unit
}
object NoEase {
  
  inline def apply(ease: Unit): NoEase = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoEase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoEase] (val x: Self) extends AnyVal {
    
    inline def setEase(value: Unit): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
  }
}
