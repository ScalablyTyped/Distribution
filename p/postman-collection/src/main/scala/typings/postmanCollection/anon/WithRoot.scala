package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithRoot extends StObject {
  
  var withRoot: Boolean
}
object WithRoot {
  
  inline def apply(withRoot: Boolean): WithRoot = {
    val __obj = js.Dynamic.literal(withRoot = withRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRoot]
  }
  
  extension [Self <: WithRoot](x: Self) {
    
    inline def setWithRoot(value: Boolean): Self = StObject.set(x, "withRoot", value.asInstanceOf[js.Any])
  }
}
