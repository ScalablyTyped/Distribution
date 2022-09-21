package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var motionDamping: js.UndefOr[Double] = js.undefined
  
  var motionStiffness: js.UndefOr[Double] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object ContainerProps {
  
  inline def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  extension [Self <: ContainerProps](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionDamping(value: Double): Self = StObject.set(x, "motionDamping", value.asInstanceOf[js.Any])
    
    inline def setMotionDampingUndefined: Self = StObject.set(x, "motionDamping", js.undefined)
    
    inline def setMotionStiffness(value: Double): Self = StObject.set(x, "motionStiffness", value.asInstanceOf[js.Any])
    
    inline def setMotionStiffnessUndefined: Self = StObject.set(x, "motionStiffness", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
