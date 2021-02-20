package typings.minappEnv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICloudService extends StObject {
  
  def getAPIs(): StringDictionary[IAPIFunction[_, _]] = js.native
  
  var name: java.lang.String = js.native
}
object ICloudService {
  
  @scala.inline
  def apply(getAPIs: () => StringDictionary[IAPIFunction[_, _]], name: java.lang.String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = js.Any.fromFunction0(getAPIs), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
  
  @scala.inline
  implicit class ICloudServiceMutableBuilder[Self <: ICloudService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAPIs(value: () => StringDictionary[IAPIFunction[_, _]]): Self = StObject.set(x, "getAPIs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
