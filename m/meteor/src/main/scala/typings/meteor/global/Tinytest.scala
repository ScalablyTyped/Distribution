package typings.meteor.global

import typings.meteor.ITinytestAssertions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tinytest {
  
  @JSGlobal("Tinytest")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addAsync(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAsync")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
