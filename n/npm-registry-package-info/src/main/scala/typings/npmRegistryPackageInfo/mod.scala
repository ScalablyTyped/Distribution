package typings.npmRegistryPackageInfo

import typings.npmRegistryPackageInfo.anon.Failure
import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.http
import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.https
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-registry-package-info", JSImport.Namespace)
  @js.native
  def apply(opts: Options, callback: Callback): Unit = js.native
  
  @JSImport("npm-registry-package-info", "factory")
  @js.native
  def factory(opts: Options, callback: Callback): js.Function0[Unit] = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* data */ Data, Unit]
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var meta: Failure = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, meta: Failure): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Failure): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Boolean indicating whether to return only the latest package information from a registry. */
    var latest: js.UndefOr[Boolean] = js.native
    
    /** Array of package names (required). */
    var packages: js.Array[String] = js.native
    
    /** Registry port. Default: 443 (HTTPS) or 80 (HTTP). */
    var port: js.UndefOr[Double] = js.native
    
    /** Registry protocol. Default: 'https'. */
    var protocol: js.UndefOr[http | https] = js.native
    
    /** Registry. Default: 'registry.npmjs.org'. */
    var registry: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(packages: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}
