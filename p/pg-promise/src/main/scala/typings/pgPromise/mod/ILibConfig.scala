package typings.pgPromise.mod

import typings.pgPromise.typescriptPgSubsetMod.IClient
import typings.pgPromise.typescriptPgSubsetMod.IConnectionParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// API: http://vitaly-t.github.io/pg-promise/Database.html#$config
trait ILibConfig[Ext, C /* <: IClient */] extends StObject {
  
  @JSName("$npm")
  var $npm: Any
  
  var options: IInitOptions[Ext, C]
  
  def pgp[T, C /* <: IClient */](cn: String): (IDatabase[T, C]) & T
  def pgp[T, C /* <: IClient */](cn: String, dc: Any): (IDatabase[T, C]) & T
  def pgp[T, C /* <: IClient */](cn: IConnectionParameters[C]): (IDatabase[T, C]) & T
  def pgp[T, C /* <: IClient */](cn: IConnectionParameters[C], dc: Any): (IDatabase[T, C]) & T
  @JSName("pgp")
  var pgp_Original: IMain[Ext, C]
  
  def promise(
    cb: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[Any], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): js.Promise[Any]
  
  var promiseLib: Any
  
  @JSName("promise")
  var promise_Original: IGenericPromise
  
  var version: String
}
object ILibConfig {
  
  inline def apply[Ext, C /* <: IClient */](
    $npm: Any,
    options: IInitOptions[Ext, C],
    pgp: IMain[Ext, C],
    promise: IGenericPromise,
    promiseLib: Any,
    version: String
  ): ILibConfig[Ext, C] = {
    val __obj = js.Dynamic.literal($npm = $npm.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pgp = pgp.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], promiseLib = promiseLib.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILibConfig[Ext, C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILibConfig[?, ?], Ext, C /* <: IClient */] (val x: Self & (ILibConfig[Ext, C])) extends AnyVal {
    
    inline def set$npm(value: Any): Self = StObject.set(x, "$npm", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IInitOptions[Ext, C]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPgp(value: IMain[Ext, C]): Self = StObject.set(x, "pgp", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: IGenericPromise): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseLib(value: Any): Self = StObject.set(x, "promiseLib", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
