package typings.moize.anon

import typings.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPromise extends StObject {
  
  var isPromise: `true`
}
object IsPromise {
  
  inline def apply(): IsPromise = {
    val __obj = js.Dynamic.literal(isPromise = true)
    __obj.asInstanceOf[IsPromise]
  }
  
  extension [Self <: IsPromise](x: Self) {
    
    inline def setIsPromise(value: `true`): Self = StObject.set(x, "isPromise", value.asInstanceOf[js.Any])
  }
}
