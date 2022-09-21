package typings.moize.anon

import typings.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSerialized extends StObject {
  
  var isSerialized: `true`
}
object IsSerialized {
  
  inline def apply(): IsSerialized = {
    val __obj = js.Dynamic.literal(isSerialized = true)
    __obj.asInstanceOf[IsSerialized]
  }
  
  extension [Self <: IsSerialized](x: Self) {
    
    inline def setIsSerialized(value: `true`): Self = StObject.set(x, "isSerialized", value.asInstanceOf[js.Any])
  }
}
