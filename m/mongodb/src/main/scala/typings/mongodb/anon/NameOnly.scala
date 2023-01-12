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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameOnly] (val x: Self) extends AnyVal {
    
    inline def setNameOnly(value: `true`): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
  }
}
