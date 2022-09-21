package typings.npmInstallWebpackPlugin

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Speed up development by automatically installing & saving dependencies with Webpack.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("npm-install-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  type DevFunction = js.Function2[/* module */ String, /* path */ String, Boolean]
  
  /**
    * Speed up development by automatically installing & saving dependencies with Webpack.
    */
  type NpmInstallPlugin = Plugin
  
  trait Options extends StObject {
    
    /**
      * Use --save or --save-dev
      * @default false
      */
    var dev: js.UndefOr[Boolean | DevFunction] = js.undefined
    
    /**
      * npm command used inside company, yarn is not supported yet
      */
    var npm: js.UndefOr[String] = js.undefined
    
    /**
      * Install missing peerDependencies
      * @default true
      */
    var peerDependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reduce amount of console logging
      * @default false
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDev(value: Boolean | DevFunction): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevFunction2(value: (/* module */ String, /* path */ String) => Boolean): Self = StObject.set(x, "dev", js.Any.fromFunction2(value))
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setNpm(value: String): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      inline def setNpmUndefined: Self = StObject.set(x, "npm", js.undefined)
      
      inline def setPeerDependencies(value: Boolean): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
