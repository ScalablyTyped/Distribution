package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: typings.orbitUiReactComponents.distSharedSrcSizeMod.Size
}
object Size {
  
  inline def apply(size: typings.orbitUiReactComponents.distSharedSrcSizeMod.Size): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setSize(value: typings.orbitUiReactComponents.distSharedSrcSizeMod.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
