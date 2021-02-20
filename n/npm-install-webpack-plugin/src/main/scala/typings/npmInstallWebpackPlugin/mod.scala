package typings.npmInstallWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Speed up development by automatically installing & saving dependencies with Webpack.
    */
  @JSImport("npm-install-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  type DevFunction = js.Function2[/* module */ String, /* path */ String, Boolean]
  
  /**
    * Speed up development by automatically installing & saving dependencies with Webpack.
    */
  type NpmInstallPlugin = Plugin
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Use --save or --save-dev
      * @default false
      */
    var dev: js.UndefOr[Boolean | DevFunction] = js.native
    
    /**
      * npm command used inside company, yarn is not supported yet
      */
    var npm: js.UndefOr[String] = js.native
    
    /**
      * Install missing peerDependencies
      * @default true
      */
    var peerDependencies: js.UndefOr[Boolean] = js.native
    
    /**
      * Reduce amount of console logging
      * @default false
      */
    var quiet: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDev(value: Boolean | DevFunction): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevFunction2(value: (/* module */ String, /* path */ String) => Boolean): Self = StObject.set(x, "dev", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setNpm(value: String): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpmUndefined: Self = StObject.set(x, "npm", js.undefined)
      
      @scala.inline
      def setPeerDependencies(value: Boolean): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
