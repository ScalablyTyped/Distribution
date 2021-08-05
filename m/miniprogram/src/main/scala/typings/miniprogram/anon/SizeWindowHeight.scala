package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeWindowHeight extends StObject {
  
  var size: WindowHeight
}
object SizeWindowHeight {
  
  inline def apply(size: WindowHeight): SizeWindowHeight = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeWindowHeight]
  }
  
  extension [Self <: SizeWindowHeight](x: Self) {
    
    inline def setSize(value: WindowHeight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
