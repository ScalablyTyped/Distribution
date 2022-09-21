package typings.opentelemetryApi

import typings.std.ReturnType
import typings.std.ThisParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextTypesMod {
  
  trait Context extends StObject {
    
    /**
      * Return a new context which inherits from this context but does
      * not contain a value for the given key.
      *
      * @param key context key for which to clear a value
      */
    def deleteValue(key: js.Symbol): Context
    
    /**
      * Get a value from the context.
      *
      * @param key key which identifies a context value
      */
    def getValue(key: js.Symbol): Any
    
    /**
      * Create a new context which inherits from this context and has
      * the given key set to the given value.
      *
      * @param key context key for which to set the value
      * @param value value to set for the given key
      */
    def setValue(key: js.Symbol, value: Any): Context
  }
  object Context {
    
    inline def apply(
      deleteValue: js.Symbol => Context,
      getValue: js.Symbol => Any,
      setValue: (js.Symbol, Any) => Context
    ): Context = {
      val __obj = js.Dynamic.literal(deleteValue = js.Any.fromFunction1(deleteValue), getValue = js.Any.fromFunction1(getValue), setValue = js.Any.fromFunction2(setValue))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setDeleteValue(value: js.Symbol => Context): Self = StObject.set(x, "deleteValue", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: js.Symbol => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: (js.Symbol, Any) => Context): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ContextManager extends StObject {
    
    /**
      * Get the current active context
      */
    def active(): Context = js.native
    
    /**
      * Bind an object as the current context (or a specific one)
      * @param [context] Optionally specify the context which you want to assign
      * @param target Any object to which a context need to be set
      */
    def bind[T](context: Context, target: T): T = js.native
    
    /**
      * Disable context management
      */
    def disable(): this.type = js.native
    
    /**
      * Enable context management
      */
    def enable(): this.type = js.native
    
    def `with`[A /* <: js.Array[Any] */, F /* <: js.Function1[/* args */ A, ReturnType[F]] */](
      context: Context,
      fn: F,
      thisArg: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): ReturnType[F] = js.native
    /**
      * Run the fn callback with object set as the current active context
      * @param context Any object to set as the current active context
      * @param fn A callback to be immediately run within a specific context
      * @param thisArg optional receiver to be used for calling fn
      * @param args optional arguments forwarded to fn
      */
    def `with`[A /* <: js.Array[Any] */, F /* <: js.Function1[/* args */ A, ReturnType[F]] */](
      context: Context,
      fn: F,
      thisArg: ThisParameterType[F],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): ReturnType[F] = js.native
  }
}
