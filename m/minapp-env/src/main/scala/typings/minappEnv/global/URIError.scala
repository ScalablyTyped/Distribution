package typings.minappEnv.global

import typings.minappEnv.URIErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URIError")
@js.native
open class URIError ()
  extends StObject
     with typings.std.Error {
  def this(message: java.lang.String) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object URIError {
  
  inline def apply: URIErrorConstructor = js.Dynamic.global.selectDynamic("URIError").asInstanceOf[URIErrorConstructor]
}
