package typings.octokitOpenapiTypes.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `601` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Origin | (Record[String, scala.Nothing])
}
object `601` {
  
  inline def apply(applicationSlashjson: Origin | (Record[String, scala.Nothing])): `601` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`601`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `601`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Origin | (Record[String, scala.Nothing])): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
