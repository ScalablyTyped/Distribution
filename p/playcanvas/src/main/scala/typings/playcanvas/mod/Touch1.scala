package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A instance of a single point touch on a {@link TouchDevice}.
  */
trait Touch1 extends StObject {
  
  /**
    * The identifier of the touch.
    *
    * @type {number}
    */
  var id: Double
  
  /**
    * The target element of the touch event.
    *
    * @type {Element}
    */
  var target: Element
  
  /**
    * The original browser Touch object.
    *
    * @type {globalThis.Touch}
    */
  var touch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Touch */ Any
  
  /**
    * The x coordinate relative to the element that the TouchDevice is attached to.
    *
    * @type {number}
    */
  var x: Double
  
  /**
    * The y coordinate relative to the element that the TouchDevice is attached to.
    *
    * @type {number}
    */
  var y: Double
}
object Touch1 {
  
  inline def apply(
    id: Double,
    target: Element,
    touch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Touch */ Any,
    x: Double,
    y: Double
  ): Touch1 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Touch1] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTouch(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Touch */ Any
    ): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
