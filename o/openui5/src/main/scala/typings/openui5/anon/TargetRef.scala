package typings.openui5.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetRef extends StObject {
  
  /**
    * DOM ref of the clicked element
    */
  var targetRef: js.UndefOr[HTMLElement] = js.undefined
}
object TargetRef {
  
  inline def apply(): TargetRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetRef] (val x: Self) extends AnyVal {
    
    inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
  }
}
