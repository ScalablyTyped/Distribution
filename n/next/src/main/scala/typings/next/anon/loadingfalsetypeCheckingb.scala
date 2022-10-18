package typings.next.anon

import typings.next.distBuildOutputStoreMod.OutputState
import typings.next.nextBooleans.`false`
import typings.next.nextStrings.`client and server`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  loading :false,   typeChecking :boolean,   partial :'client and server' | undefined,   modules :number,   errors :std.Array<string> | null,   warnings :std.Array<string> | null,   hasEdgeServer :boolean} & {  bootstrap :false,   appUrl :string | null,   bindAddr :string | null} */
trait loadingfalsetypeCheckingb
  extends StObject
     with OutputState {
  
  var appUrl: String | Null
  
  var bindAddr: String | Null
  
  var bootstrap: `false`
  
  var errors: js.Array[String] | Null
  
  var hasEdgeServer: Boolean
  
  var loading: `false`
  
  var modules: Double
  
  var partial: js.UndefOr[`client and server`] = js.undefined
  
  var typeChecking: Boolean
  
  var warnings: js.Array[String] | Null
}
object loadingfalsetypeCheckingb {
  
  inline def apply(hasEdgeServer: Boolean, modules: Double, typeChecking: Boolean): loadingfalsetypeCheckingb = {
    val __obj = js.Dynamic.literal(bootstrap = false, hasEdgeServer = hasEdgeServer.asInstanceOf[js.Any], loading = false, modules = modules.asInstanceOf[js.Any], typeChecking = typeChecking.asInstanceOf[js.Any], appUrl = null, bindAddr = null, errors = null, warnings = null)
    __obj.asInstanceOf[loadingfalsetypeCheckingb]
  }
  
  extension [Self <: loadingfalsetypeCheckingb](x: Self) {
    
    inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlNull: Self = StObject.set(x, "appUrl", null)
    
    inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    inline def setBindAddrNull: Self = StObject.set(x, "bindAddr", null)
    
    inline def setBootstrap(value: `false`): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setHasEdgeServer(value: Boolean): Self = StObject.set(x, "hasEdgeServer", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: `false`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setModules(value: Double): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setPartial(value: `client and server`): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setTypeChecking(value: Boolean): Self = StObject.set(x, "typeChecking", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
