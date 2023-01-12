package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Createdate extends StObject {
  
  var `create date`: js.Date
  
  var `last use date`: js.Date
  
  var name: String
}
object Createdate {
  
  inline def apply(`create date`: js.Date, `last use date`: js.Date, name: String): Createdate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create date")((`create date`).asInstanceOf[js.Any])
    __obj.updateDynamic("last use date")((`last use date`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Createdate] (val x: Self) extends AnyVal {
    
    inline def `setCreate date`(value: js.Date): Self = StObject.set(x, "create date", value.asInstanceOf[js.Any])
    
    inline def `setLast use date`(value: js.Date): Self = StObject.set(x, "last use date", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
