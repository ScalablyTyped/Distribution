package typings.minappEnv.global

import typings.minappEnv.GeneratorFunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("GeneratorFunction")
@js.native
open class GeneratorFunction protected ()
  extends StObject
     with typings.minappEnv.GeneratorFunction {
  /**
    * Creates a new Generator function.
    * @param args A list of arguments the function accepts.
    */
  def this(args: java.lang.String*) = this()
}
object GeneratorFunction {
  
  inline def apply: GeneratorFunctionConstructor = js.Dynamic.global.selectDynamic("GeneratorFunction").asInstanceOf[GeneratorFunctionConstructor]
}
