package typings.postmanCollection.mod

import typings.postmanCollection.anon.SrcString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyDefinition
  extends StObject
     with PropertyBaseDefinition {
  
  var file: js.UndefOr[String | SrcString] = js.undefined
  
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.undefined
  
  var mode: String
  
  var raw: js.UndefOr[String] = js.undefined
  
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.undefined
}
object RequestBodyDefinition {
  
  inline def apply(mode: String): RequestBodyDefinition = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyDefinition]
  }
  
  extension [Self <: RequestBodyDefinition](x: Self) {
    
    inline def setFile(value: String | SrcString): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFormdata(value: js.Array[FormParamDefinition] | PropertyList[FormParam]): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
    
    inline def setFormdataUndefined: Self = StObject.set(x, "formdata", js.undefined)
    
    inline def setFormdataVarargs(value: FormParamDefinition*): Self = StObject.set(x, "formdata", js.Array(value :_*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setUrlencoded(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
    
    inline def setUrlencodedUndefined: Self = StObject.set(x, "urlencoded", js.undefined)
    
    inline def setUrlencodedVarargs(value: QueryParamDefinition*): Self = StObject.set(x, "urlencoded", js.Array(value :_*))
  }
}
