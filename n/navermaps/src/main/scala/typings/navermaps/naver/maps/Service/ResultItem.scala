package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultItem extends StObject {
  
  var code: Id
  
  var name: String
  
  var region: Region
}
object ResultItem {
  
  inline def apply(code: Id, name: String, region: Region): ResultItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultItem] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Id): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
