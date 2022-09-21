package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadStreamOptions
  extends StObject
     with StreamOptions {
  
  var end: js.UndefOr[Double] = js.undefined
}
object ReadStreamOptions {
  
  inline def apply(): ReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadStreamOptions]
  }
  
  extension [Self <: ReadStreamOptions](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
