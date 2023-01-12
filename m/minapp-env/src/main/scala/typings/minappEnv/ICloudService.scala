package typings.minappEnv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloudService extends StObject {
  
  def getAPIs(): StringDictionary[IAPIFunction[Any, Any]]
  
  var name: java.lang.String
}
object ICloudService {
  
  inline def apply(getAPIs: () => StringDictionary[IAPIFunction[Any, Any]], name: java.lang.String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = js.Any.fromFunction0(getAPIs), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICloudService] (val x: Self) extends AnyVal {
    
    inline def setGetAPIs(value: () => StringDictionary[IAPIFunction[Any, Any]]): Self = StObject.set(x, "getAPIs", js.Any.fromFunction0(value))
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
