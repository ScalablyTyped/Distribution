package typings.postmanCollection.mod

import typings.postmanCollection.anon.SrcString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestBodyDefinition extends PropertyBaseDefinition {
  
  var file: js.UndefOr[String | SrcString] = js.native
  
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.native
  
  var mode: String = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
}
object RequestBodyDefinition {
  
  @scala.inline
  def apply(mode: String): RequestBodyDefinition = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyDefinition]
  }
  
  @scala.inline
  implicit class RequestBodyDefinitionMutableBuilder[Self <: RequestBodyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String | SrcString): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFormdata(value: js.Array[FormParamDefinition] | PropertyList[FormParam]): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormdataUndefined: Self = StObject.set(x, "formdata", js.undefined)
    
    @scala.inline
    def setFormdataVarargs(value: FormParamDefinition*): Self = StObject.set(x, "formdata", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setUrlencoded(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlencodedUndefined: Self = StObject.set(x, "urlencoded", js.undefined)
    
    @scala.inline
    def setUrlencodedVarargs(value: QueryParamDefinition*): Self = StObject.set(x, "urlencoded", js.Array(value :_*))
  }
}
