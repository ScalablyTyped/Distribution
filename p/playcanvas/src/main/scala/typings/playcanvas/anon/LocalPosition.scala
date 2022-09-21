package typings.playcanvas.anon

import typings.playcanvas.mod.AnimTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalPosition extends StObject {
  
  def localPosition(node: Any): AnimTarget
  
  def localRotation(node: Any): AnimTarget
  
  def localScale(node: Any): AnimTarget
  
  def materialTexture(node: Any, textureName: Any): AnimTarget
  
  def weight(node: Any, weightName: Any): AnimTarget
}
object LocalPosition {
  
  inline def apply(
    localPosition: Any => AnimTarget,
    localRotation: Any => AnimTarget,
    localScale: Any => AnimTarget,
    materialTexture: (Any, Any) => AnimTarget,
    weight: (Any, Any) => AnimTarget
  ): LocalPosition = {
    val __obj = js.Dynamic.literal(localPosition = js.Any.fromFunction1(localPosition), localRotation = js.Any.fromFunction1(localRotation), localScale = js.Any.fromFunction1(localScale), materialTexture = js.Any.fromFunction2(materialTexture), weight = js.Any.fromFunction2(weight))
    __obj.asInstanceOf[LocalPosition]
  }
  
  extension [Self <: LocalPosition](x: Self) {
    
    inline def setLocalPosition(value: Any => AnimTarget): Self = StObject.set(x, "localPosition", js.Any.fromFunction1(value))
    
    inline def setLocalRotation(value: Any => AnimTarget): Self = StObject.set(x, "localRotation", js.Any.fromFunction1(value))
    
    inline def setLocalScale(value: Any => AnimTarget): Self = StObject.set(x, "localScale", js.Any.fromFunction1(value))
    
    inline def setMaterialTexture(value: (Any, Any) => AnimTarget): Self = StObject.set(x, "materialTexture", js.Any.fromFunction2(value))
    
    inline def setWeight(value: (Any, Any) => AnimTarget): Self = StObject.set(x, "weight", js.Any.fromFunction2(value))
  }
}
