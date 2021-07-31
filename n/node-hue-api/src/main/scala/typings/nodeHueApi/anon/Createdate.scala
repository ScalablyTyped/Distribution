package typings.nodeHueApi.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Createdate extends StObject {
  
  var `create date`: Date
  
  var `last use date`: Date
  
  var name: String
}
object Createdate {
  
  @scala.inline
  def apply(`create date`: Date, `last use date`: Date, name: String): Createdate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create date")((`create date`).asInstanceOf[js.Any])
    __obj.updateDynamic("last use date")((`last use date`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdate]
  }
  
  @scala.inline
  implicit class CreatedateMutableBuilder[Self <: Createdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCreate date`(value: Date): Self = StObject.set(x, "create date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLast use date`(value: Date): Self = StObject.set(x, "last use date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
