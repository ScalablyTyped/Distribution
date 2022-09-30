package typings.mongodb.anon

import typings.mongodb.mongodbBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameOnly extends StObject {
  
  var nameOnly: `true`
}
object NameOnly {
  
  inline def apply(): NameOnly = {
    val __obj = js.Dynamic.literal(nameOnly = true)
    __obj.asInstanceOf[NameOnly]
  }
  
  extension [Self <: NameOnly](x: Self) {
    
    inline def setNameOnly(value: `true`): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
  }
}
