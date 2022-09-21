package typings.minappEnv.global

import typings.minappEnv.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Function")
@js.native
open class Function protected ()
  extends StObject
     with typings.minappEnv.Function {
  /**
    * Creates a new function.
    * @param args A list of arguments the function accepts.
    */
  def this(args: java.lang.String*) = this()
}
object Function {
  
  inline def apply: FunctionConstructor = js.Dynamic.global.selectDynamic("Function").asInstanceOf[FunctionConstructor]
}
