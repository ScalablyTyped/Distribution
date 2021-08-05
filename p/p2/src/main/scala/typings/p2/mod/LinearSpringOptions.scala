package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearSpringOptions
  extends StObject
     with SpringOptions {
  
  var restLength: js.UndefOr[Double] = js.undefined
}
object LinearSpringOptions {
  
  inline def apply(): LinearSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearSpringOptions]
  }
  
  extension [Self <: LinearSpringOptions](x: Self) {
    
    inline def setRestLength(value: Double): Self = StObject.set(x, "restLength", value.asInstanceOf[js.Any])
    
    inline def setRestLengthUndefined: Self = StObject.set(x, "restLength", js.undefined)
  }
}
