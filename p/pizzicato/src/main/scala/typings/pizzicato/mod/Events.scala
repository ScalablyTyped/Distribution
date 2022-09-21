package typings.pizzicato.mod

import typings.pizzicato.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events[Name /* <: String */] extends StObject {
  
  def off(name: Name): Unit = js.native
  
  def on[Context](name: Name, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Unit]): Unit = js.native
  def on[Context](
    name: Name,
    callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Unit],
    context: Context
  ): Unit = js.native
}
object Events {
  
  inline def apply: Events[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("Events").asInstanceOf[Events[String]]
}
