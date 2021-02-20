package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initialize
  extends /* key */ StringDictionary[js.Any] {
  
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[this.type], /* options */ js.Object, Unit]] = js.native
  
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var urlRoot: js.UndefOr[String] = js.native
  
  var validate: js.UndefOr[
    Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], Double])
  ] = js.native
}
object Initialize {
  
  @scala.inline
  def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  
  @scala.inline
  implicit class InitializeMutableBuilder[Self <: Initialize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialize(value: (/* models */ js.Array[Initialize], /* options */ js.Object) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    @scala.inline
    def setParse(value: /* data */ js.Any => _): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseSave(value: /* data */ js.Any => _): Self = StObject.set(x, "parseSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseSaveUndefined: Self = StObject.set(x, "parseSave", js.undefined)
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setUrlRoot(value: String): Self = StObject.set(x, "urlRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlRootUndefined: Self = StObject.set(x, "urlRoot", js.undefined)
    
    @scala.inline
    def setValidate(
      value: js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[Initialize], Double])
    ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateFunction2(value: (/* attributes */ js.Object, /* options */ js.UndefOr[Initialize]) => Double): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateNull: Self = StObject.set(x, "validate", null)
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
