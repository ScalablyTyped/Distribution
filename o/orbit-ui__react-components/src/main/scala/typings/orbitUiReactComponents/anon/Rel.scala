package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rel extends StObject {
  
  var className: String
  
  var ref: MergedRef[HTMLElement]
  
  var rel: String
  
  var tabIndex: Double
  
  var target: String
}
object Rel {
  
  inline def apply(className: String, ref: MergedRef[HTMLElement], rel: String, tabIndex: Double, target: String): Rel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rel] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setRef(value: MergedRef[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
