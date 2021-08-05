package typings.npmRegistryPackageInfo

import typings.npmRegistryPackageInfo.anon.Failure
import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.http
import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.https
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("npm-registry-package-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(opts: Options, callback: Callback): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type Callback = js.Function2[/* error */ Error | Null, /* data */ Data, Unit]
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var meta: Failure
  }
  object Data {
    
    inline def apply(data: js.Any, meta: Failure): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Failure): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Boolean indicating whether to return only the latest package information from a registry. */
    var latest: js.UndefOr[Boolean] = js.undefined
    
    /** Array of package names (required). */
    var packages: js.Array[String]
    
    /** Registry port. Default: 443 (HTTPS) or 80 (HTTP). */
    var port: js.UndefOr[Double] = js.undefined
    
    /** Registry protocol. Default: 'https'. */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /** Registry. Default: 'registry.npmjs.org'. */
    var registry: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(packages: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value :_*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}
