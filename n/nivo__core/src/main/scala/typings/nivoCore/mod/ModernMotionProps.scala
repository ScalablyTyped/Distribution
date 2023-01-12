package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  animate :boolean,   motionConfig :string | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig * / any}> */
trait ModernMotionProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
}
object ModernMotionProps {
  
  inline def apply(): ModernMotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModernMotionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModernMotionProps] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
  }
}
