package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloudMetaData extends StObject {
  
  var session_id: java.lang.String
}
object ICloudMetaData {
  
  inline def apply(session_id: java.lang.String): ICloudMetaData = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICloudMetaData] (val x: Self) extends AnyVal {
    
    inline def setSession_id(value: java.lang.String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
