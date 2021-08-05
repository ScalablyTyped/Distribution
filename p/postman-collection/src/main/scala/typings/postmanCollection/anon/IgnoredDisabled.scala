package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoredDisabled extends StObject {
  
  var encode: js.UndefOr[Boolean] = js.undefined
  
  var ignoredDisabled: js.UndefOr[Boolean] = js.undefined
}
object IgnoredDisabled {
  
  inline def apply(): IgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoredDisabled]
  }
  
  extension [Self <: IgnoredDisabled](x: Self) {
    
    inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setIgnoredDisabled(value: Boolean): Self = StObject.set(x, "ignoredDisabled", value.asInstanceOf[js.Any])
    
    inline def setIgnoredDisabledUndefined: Self = StObject.set(x, "ignoredDisabled", js.undefined)
  }
}
