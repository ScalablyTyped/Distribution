package typings.mongodb.anon

import typings.mongodb.mongodbBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var nameOnly: `false`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(nameOnly = false)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setNameOnly(value: `false`): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
  }
}
