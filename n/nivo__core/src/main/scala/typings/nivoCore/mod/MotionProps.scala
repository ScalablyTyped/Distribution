package typings.nivoCore.mod

import typings.reactSpringCore.mod.SpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  animate :boolean,   motionConfig :string | @react-spring/web.@react-spring/web.SpringConfig}> */
trait MotionProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var motionConfig: js.UndefOr[String | SpringConfig] = js.undefined
}
object MotionProps {
  
  inline def apply(): MotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionProps] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setMotionConfig(value: String | SpringConfig): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
  }
}
