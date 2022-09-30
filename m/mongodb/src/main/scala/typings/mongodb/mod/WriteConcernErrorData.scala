package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteConcernErrorData extends StObject {
  
  var code: scala.Double
  
  var errInfo: js.UndefOr[Document] = js.undefined
  
  var errmsg: String
}
object WriteConcernErrorData {
  
  inline def apply(code: scala.Double, errmsg: String): WriteConcernErrorData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteConcernErrorData]
  }
  
  extension [Self <: WriteConcernErrorData](x: Self) {
    
    inline def setCode(value: scala.Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrInfo(value: Document): Self = StObject.set(x, "errInfo", value.asInstanceOf[js.Any])
    
    inline def setErrInfoUndefined: Self = StObject.set(x, "errInfo", js.undefined)
    
    inline def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
  }
}
