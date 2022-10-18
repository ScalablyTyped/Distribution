package typings.next.anon

import typings.next.distBuildOutputStoreMod.OutputState
import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  loading :true,   trigger :string | undefined} & {  bootstrap :false,   appUrl :string | null,   bindAddr :string | null} */
trait loadingtruetriggerstringu
  extends StObject
     with OutputState {
  
  var appUrl: String | Null
  
  var bindAddr: String | Null
  
  var bootstrap: `false`
  
  var loading: `true`
  
  var trigger: js.UndefOr[String] = js.undefined
}
object loadingtruetriggerstringu {
  
  inline def apply(): loadingtruetriggerstringu = {
    val __obj = js.Dynamic.literal(bootstrap = false, loading = true, appUrl = null, bindAddr = null)
    __obj.asInstanceOf[loadingtruetriggerstringu]
  }
  
  extension [Self <: loadingtruetriggerstringu](x: Self) {
    
    inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlNull: Self = StObject.set(x, "appUrl", null)
    
    inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    inline def setBindAddrNull: Self = StObject.set(x, "bindAddr", null)
    
    inline def setBootstrap(value: `false`): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: `true`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
