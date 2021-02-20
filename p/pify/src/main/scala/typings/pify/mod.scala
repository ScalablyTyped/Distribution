package typings.pify

import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pify", JSImport.Namespace)
  @js.native
  def apply(input: js.Any): js.Any = js.native
  @JSImport("pify", JSImport.Namespace)
  @js.native
  def apply(input: js.Any, options: PifyOptions): js.Any = js.native
  @JSImport("pify", JSImport.Namespace)
  @js.native
  def apply(input: js.Function): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  @JSImport("pify", JSImport.Namespace)
  @js.native
  def apply(input: js.Function, options: PifyOptions): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  
  @js.native
  trait PifyOptions extends StObject {
    
    var errorFirst: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var excludeMain: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var multiArgs: js.UndefOr[Boolean] = js.native
    
    var promiseModule: js.UndefOr[PromiseModule] = js.native
  }
  object PifyOptions {
    
    @scala.inline
    def apply(): PifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PifyOptions]
    }
    
    @scala.inline
    implicit class PifyOptionsMutableBuilder[Self <: PifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorFirst(value: Boolean): Self = StObject.set(x, "errorFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFirstUndefined: Self = StObject.set(x, "errorFirst", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeMain(value: Boolean): Self = StObject.set(x, "excludeMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeMainUndefined: Self = StObject.set(x, "excludeMain", js.undefined)
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
      
      @scala.inline
      def setPromiseModule(value: PromiseModule): Self = StObject.set(x, "promiseModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseModuleUndefined: Self = StObject.set(x, "promiseModule", js.undefined)
    }
  }
  
  @js.native
  trait PromiseModule
    extends Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          js.Any
        ]
}
