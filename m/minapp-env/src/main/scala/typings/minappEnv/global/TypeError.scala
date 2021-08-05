package typings.minappEnv.global

import typings.minappEnv.TypeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TypeError")
@js.native
class TypeError ()
  extends StObject
     with typings.std.Error {
  def this(message: java.lang.String) = this()
  
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object TypeError {
  
  inline def apply: TypeErrorConstructor = js.Dynamic.global.selectDynamic("TypeError").asInstanceOf[TypeErrorConstructor]
}
