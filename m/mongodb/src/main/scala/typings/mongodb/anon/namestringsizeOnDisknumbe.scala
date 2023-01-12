package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string,   sizeOnDisk :number | undefined,   empty :boolean | undefined} & bson.bson.Document */
trait namestringsizeOnDisknumbe
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var sizeOnDisk: js.UndefOr[Double] = js.undefined
}
object namestringsizeOnDisknumbe {
  
  inline def apply(name: String): namestringsizeOnDisknumbe = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[namestringsizeOnDisknumbe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: namestringsizeOnDisknumbe] (val x: Self) extends AnyVal {
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSizeOnDisk(value: Double): Self = StObject.set(x, "sizeOnDisk", value.asInstanceOf[js.Any])
    
    inline def setSizeOnDiskUndefined: Self = StObject.set(x, "sizeOnDisk", js.undefined)
  }
}
