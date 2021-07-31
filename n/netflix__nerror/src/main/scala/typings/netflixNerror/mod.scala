package typings.netflixNerror

import org.scalablytyped.runtime.StringDictionary
import typings.netflixNerror.anon.Instantiable
import typings.netflixNerror.mod.VError.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@netflix/nerror", "VError")
  @js.native
  class VError protected ()
    extends StObject
       with Error {
    def this(message: String, params: js.Any*) = this()
    def this(message: Unit, params: js.Any*) = this()
    def this(options: Options, message: String, params: js.Any*) = this()
    def this(options: Error, message: String, params: js.Any*) = this()
    
    def cause(): js.UndefOr[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
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
      def this(message: String, params: js.Any*) = this()
      def this(message: Unit, params: js.Any*) = this()
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
      def this(message: String, params: js.Any*) = this()
      def this(message: Unit, params: js.Any*) = this()
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
      def this(message: String, params: js.Any*) = this()
      def this(message: Unit, params: js.Any*) = this()
      def this(options: Options, message: String, params: js.Any*) = this()
      def this(options: Error, message: String, params: js.Any*) = this()
    }
    
    @scala.inline
    def cause(err: Error): Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cause")(err.asInstanceOf[js.Any]).asInstanceOf[Error | Null]
    
    @scala.inline
    def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForEach")(err.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorFromList")(errors.asInstanceOf[js.Any]).asInstanceOf[Null | T | MultiError]
    
    @scala.inline
    def findCauseByName(err: Error, name: String): Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findCauseByName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Error | Null]
    
    @scala.inline
    def fullStack(err: Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fullStack")(err.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def hasCauseWithName(err: Error, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCauseWithName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def info(err: Error): Info = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(err.asInstanceOf[js.Any]).asInstanceOf[Info]
    
    type Info = StringDictionary[js.Any]
    
    trait Options extends StObject {
      
      var cause: js.UndefOr[Error | Null] = js.undefined
      
      var constructorOpt: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
      
      var info: js.UndefOr[Info] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var strict: js.UndefOr[Boolean] = js.undefined
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
