package typings.mithril.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonpOptions extends StObject {
  
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.undefined
  
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[js.Any] = js.undefined
  
  /** The name of the querystring parameter name that specifies the callback name. */
  var callbackKey: js.UndefOr[String] = js.undefined
  
  /** The name of the function that will be called as the callback. */
  var callbackName: js.UndefOr[String] = js.undefined
  
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.undefined
}
object JsonpOptions {
  
  @scala.inline
  def apply(): JsonpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonpOptions]
  }
  
  @scala.inline
  implicit class JsonpOptionsMutableBuilder[Self <: JsonpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
    
    @scala.inline
    def setCallbackName(value: String): Self = StObject.set(x, "callbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackNameUndefined: Self = StObject.set(x, "callbackName", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setType(value: Instantiable1[/* o */ js.Any, js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
