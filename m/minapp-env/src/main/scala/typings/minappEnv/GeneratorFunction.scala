package typings.minappEnv

import org.scalablytyped.runtime.Instantiable1
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorFunction
  extends StObject
     with /**
  * Creates a new Generator object.
  * @param args A list of arguments the function accepts.
  */
Instantiable1[/* args (repeated) */ js.Any, Generator[js.Any, js.Any, js.Any]] {
  
  /**
    * Creates a new Generator object.
    * @param args A list of arguments the function accepts.
    */
  def apply(args: js.Any*): Generator[js.Any, js.Any, js.Any] = js.native
  
  /**
    * The length of the arguments.
    */
  val length: Double = js.native
  
  /**
    * Returns the name of the function.
    */
  val name: java.lang.String = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.minappEnv.minappEnvStrings.GeneratorFunction = js.native
}
