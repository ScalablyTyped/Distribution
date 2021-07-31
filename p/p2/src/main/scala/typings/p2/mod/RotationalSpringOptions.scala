package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationalSpringOptions
  extends StObject
     with SpringOptions {
  
  var restAngle: js.UndefOr[Double] = js.undefined
}
object RotationalSpringOptions {
  
  @scala.inline
  def apply(): RotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationalSpringOptions]
  }
  
  @scala.inline
  implicit class RotationalSpringOptionsMutableBuilder[Self <: RotationalSpringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestAngle(value: Double): Self = StObject.set(x, "restAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestAngleUndefined: Self = StObject.set(x, "restAngle", js.undefined)
  }
}
