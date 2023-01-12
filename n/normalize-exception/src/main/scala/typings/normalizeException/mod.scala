package typings.normalizeException

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalize-exception", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ErrorArg](error: ErrorArg): NormalizedError[ErrorArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any]).asInstanceOf[NormalizedError[ErrorArg]]
  inline def default[ErrorArg](error: ErrorArg, options: Options): NormalizedError[ErrorArg] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NormalizedError[ErrorArg]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends string ? Value extends '' ? DefaultValue : Value : DefaultValue
    }}}
    */
  type DefinedString[Value, DefaultValue] = DefaultValue
  
  type NormalizedError[ErrorArg] = js.Error & (/* import warning: importer.ImportType#apply Failed type conversion: ErrorArg extends std.Error ? {  name :normalize-exception.normalize-exception.DefinedString<ErrorArg['name'], std.Error['constructor']['name']>,   message :normalize-exception.normalize-exception.DefinedString<ErrorArg['message'], ''>,   stack :normalize-exception.normalize-exception.DefinedString<ErrorArg['stack'], string>} : unknown */ js.Any)
  
  trait Options extends StObject {
    
    /**
      * Unless `true`,
      * [`error.cause`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/cause)
      * and
      * [`error.errors`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/AggregateError)
      * are normalized recursively, when present.
      */
    val shallow: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
}
