package typings.nodeSassMiddleware

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * 
    *
    */
  @scala.inline
  def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("node-sass-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with typings.nodeSass.mod.Options {
    
    /**
      * 
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var error: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var response: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var src: String
  }
  object Options {
    
    @scala.inline
    def apply(src: String): Options = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setError(value: () => Unit): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setResponse(value: Boolean): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
