package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefMergedRef extends StObject {
  
  var ref: MergedRef[HTMLElement]
}
object RefMergedRef {
  
  inline def apply(ref: MergedRef[HTMLElement]): RefMergedRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefMergedRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefMergedRef] (val x: Self) extends AnyVal {
    
    inline def setRef(value: MergedRef[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
