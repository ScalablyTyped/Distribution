package typings.netflixNerror

import org.scalablytyped.runtime.StringDictionary
import typings.netflixNerror.anon.Instantiable
import typings.netflixNerror.mod.VError.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@netflix/nerror", "VError")
  @js.native
  class VError protected () extends Error {
    def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
    def this(message: String, params: js.Any*) = this()
    def this(options: Options, message: String, params: js.Any*) = this()
    def this(options: Error, message: String, params: js.Any*) = this()
    
    def cause(): js.UndefOr[Error] = js.native
  }
  /* static members */
  object VError {
    
    @JSImport("@netflix/nerror", "VError")
    @js.native
    val ^ : js.Any = js.native
    
    /*
      * Represents a collection of errors for the purpose of consumers that generally
      * only deal with one error.  Callers can extract the individual errors
      * contained in this object, but may also just treat it as a normal single
      * error, in which case a summary message will be printed.
      */
    @JSImport("@netflix/nerror", "VError.MultiError")
    @js.native
    class MultiError protected () extends VError {
      def this(errors: js.Array[Error]) = this()
      
      def errors(): js.Array[Error] = js.native
    }
    
    /*
      * PError is like VError, but the message is not run through printf-style
      * templating.
      */
    @JSImport("@netflix/nerror", "VError.PError")
    @js.native
    class PError protected () extends VError {
      def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
      def this(message: String, params: js.Any*) = this()
      def this(options: Options, message: String, params: js.Any*) = this()
      def this(options: Error, message: String, params: js.Any*) = this()
    }
    
    /*
      * SError is like VError, but stricter about types.  You cannot pass "null" or
      * "undefined" as string arguments to the formatter.  Since SError is only a
      * different function, not really a different class, we don't set
      * SError.prototype.name.
      */
    @JSImport("@netflix/nerror", "VError.SError")
    @js.native
    class SError protected () extends VError {
      def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
      def this(message: String, params: js.Any*) = this()
      def this(options: Options, message: String, params: js.Any*) = this()
      def this(options: Error, message: String, params: js.Any*) = this()
    }
    
    @JSImport("@netflix/nerror", "VError.VError")
    @js.native
    def VError: Instantiable = js.native
    @scala.inline
    def VError_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VError")(x.asInstanceOf[js.Any])
    
    /*
      * Like JavaScript's built-in Error class, but supports a "cause" argument which
      * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
      * The cause argument can be null.
      */
    @JSImport("@netflix/nerror", "VError.WError")
    @js.native
    class WError protected () extends VError {
      def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
      def this(message: String, params: js.Any*) = this()
      def this(options: Options, message: String, params: js.Any*) = this()
      def this(options: Error, message: String, params: js.Any*) = this()
    }
    
    @JSImport("@netflix/nerror", "VError.cause")
    @js.native
    def cause(err: Error): Error | Null = js.native
    
    @JSImport("@netflix/nerror", "VError.errorForEach")
    @js.native
    def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    @JSImport("@netflix/nerror", "VError.errorFromList")
    @js.native
    def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = js.native
    
    @JSImport("@netflix/nerror", "VError.findCauseByName")
    @js.native
    def findCauseByName(err: Error, name: String): Error | Null = js.native
    
    @JSImport("@netflix/nerror", "VError.fullStack")
    @js.native
    def fullStack(err: Error): String = js.native
    
    @JSImport("@netflix/nerror", "VError.hasCauseWithName")
    @js.native
    def hasCauseWithName(err: Error, name: String): Boolean = js.native
    
    @JSImport("@netflix/nerror", "VError.info")
    @js.native
    def info(err: Error): Info = js.native
    
    type Info = StringDictionary[js.Any]
    
    @js.native
    trait Options extends StObject {
      
      var cause: js.UndefOr[Error | Null] = js.native
      
      var constructorOpt: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
      
      var info: js.UndefOr[Info] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var strict: js.UndefOr[Boolean] = js.native
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
        def setCause(value: Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCauseNull: Self = StObject.set(x, "cause", null)
        
        @scala.inline
        def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
        
        @scala.inline
        def setConstructorOpt(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "constructorOpt", js.Any.fromFunction1(value))
        
        @scala.inline
        def setConstructorOptUndefined: Self = StObject.set(x, "constructorOpt", js.undefined)
        
        @scala.inline
        def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
