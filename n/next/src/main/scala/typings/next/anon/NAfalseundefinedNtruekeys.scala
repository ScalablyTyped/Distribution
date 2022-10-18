package typings.next.anon

import typings.next.distSharedLibRouterRouterMod.TransitionOptions
import typings.next.distSharedLibRouterRouterMod._HistoryState
import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  __NA :false | undefined,   __N :true,   key :string} & next.next/dist/shared/lib/router/router.NextHistoryState */
trait NAfalseundefinedNtruekeys
  extends StObject
     with _HistoryState {
  
  var __N: `true`
  
  var __NA: js.UndefOr[`false`] = js.undefined
  
  var as: String
  
  var key: String
  
  var options: TransitionOptions
  
  var url: String
}
object NAfalseundefinedNtruekeys {
  
  inline def apply(as: String, key: String, options: TransitionOptions, url: String): NAfalseundefinedNtruekeys = {
    val __obj = js.Dynamic.literal(__N = true, as = as.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NAfalseundefinedNtruekeys]
  }
  
  extension [Self <: NAfalseundefinedNtruekeys](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TransitionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set__N(value: `true`): Self = StObject.set(x, "__N", value.asInstanceOf[js.Any])
    
    inline def set__NA(value: `false`): Self = StObject.set(x, "__NA", value.asInstanceOf[js.Any])
    
    inline def set__NAUndefined: Self = StObject.set(x, "__NA", js.undefined)
  }
}
