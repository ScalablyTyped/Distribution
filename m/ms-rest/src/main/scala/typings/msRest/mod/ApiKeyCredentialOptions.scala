package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeyCredentialOptions extends StObject {
  
  /**
    * @property {object} [inHeader]  A key value pair of the header parameters that need to be applied to the request.
    */
  var inHeader: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * @property {object} [inQuery]   A key value pair of the query parameters that need to be applied to the request.
    */
  var inQuery: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object ApiKeyCredentialOptions {
  
  @scala.inline
  def apply(): ApiKeyCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyCredentialOptions]
  }
  
  @scala.inline
  implicit class ApiKeyCredentialOptionsMutableBuilder[Self <: ApiKeyCredentialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInHeader(value: StringDictionary[js.Any]): Self = StObject.set(x, "inHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInHeaderUndefined: Self = StObject.set(x, "inHeader", js.undefined)
    
    @scala.inline
    def setInQuery(value: StringDictionary[js.Any]): Self = StObject.set(x, "inQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInQueryUndefined: Self = StObject.set(x, "inQuery", js.undefined)
  }
}
