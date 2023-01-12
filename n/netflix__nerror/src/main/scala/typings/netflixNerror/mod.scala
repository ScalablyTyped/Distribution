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
  open class VError protected ()
    extends StObject
       with Error {
    def this(message: String, params: Any*) = this()
    def this(message: Unit, params: Any*) = this()
    def this(options: js.Error, message: String, params: Any*) = this()
    def this(options: Options, message: String, params: Any*) = this()
    
    @JSName("cause")
    def cause_MVError(): js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
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
    open class MultiError protected () extends VError {
      def this(errors: js.Array[js.Error]) = this()
      
      def errors(): js.Array[js.Error] = js.native
    }
    
    /*
      * PError is like VError, but the message is not run through printf-style
      * templating.
      */
    @JSImport("@netflix/nerror", "VError.PError")
    @js.native
    open class PError protected () extends VError {
      def this(message: String, params: Any*) = this()
      def this(message: Unit, params: Any*) = this()
      def this(options: js.Error, message: String, params: Any*) = this()
      def this(options: Options, message: String, params: Any*) = this()
    }
    
    /*
      * SError is like VError, but stricter about types.  You cannot pass "null" or
      * "undefined" as string arguments to the formatter.  Since SError is only a
      * different function, not really a different class, we don't set
      * SError.prototype.name.
      */
    @JSImport("@netflix/nerror", "VError.SError")
    @js.native
    open class SError protected () extends VError {
      def this(message: String, params: Any*) = this()
      def this(message: Unit, params: Any*) = this()
      def this(options: js.Error, message: String, params: Any*) = this()
      def this(options: Options, message: String, params: Any*) = this()
    }
    
    @JSImport("@netflix/nerror", "VError.VError")
    @js.native
    def VError: Instantiable = js.native
    inline def VError_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VError")(x.asInstanceOf[js.Any])
    
    /*
      * Like JavaScript's built-in Error class, but supports a "cause" argument which
      * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
      * The cause argument can be null.
      */
    @JSImport("@netflix/nerror", "VError.WError")
    @js.native
    open class WError protected () extends VError {
      def this(message: String, params: Any*) = this()
      def this(message: Unit, params: Any*) = this()
      def this(options: js.Error, message: String, params: Any*) = this()
      def this(options: Options, message: String, params: Any*) = this()
    }
    
    inline def cause(err: js.Error): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cause")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error | Null]
    
    inline def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForEach")(err.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorFromList")(errors.asInstanceOf[js.Any]).asInstanceOf[Null | T | MultiError]
    
    inline def findCauseByName(err: js.Error, name: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findCauseByName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
    
    inline def fullStack(err: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fullStack")(err.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hasCauseWithName(err: js.Error, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCauseWithName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def info(err: js.Error): Info = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(err.asInstanceOf[js.Any]).asInstanceOf[Info]
    
    type Info = StringDictionary[Any]
    
    trait Options extends StObject {
      
      var cause: js.UndefOr[js.Error | Null] = js.undefined
      
      var constructorOpt: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
      
      var info: js.UndefOr[Info] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var strict: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
        
        inline def setCauseNull: Self = StObject.set(x, "cause", null)
        
        inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
        
        inline def setConstructorOpt(value: /* repeated */ Any => Unit): Self = StObject.set(x, "constructorOpt", js.Any.fromFunction1(value))
        
        inline def setConstructorOptUndefined: Self = StObject.set(x, "constructorOpt", js.undefined)
        
        inline def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
