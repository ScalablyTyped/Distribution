package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Steps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestGherkinQUnitTestHarnessMod extends Shortcut {
  
  @JSImport("sap/ui/test/gherkin/qUnitTestHarness", JSImport.Default)
  @js.native
  val default: qUnitTestHarness = js.native
  
  type _To = qUnitTestHarness
  
  /* This means you don't have to write `default`, but can instead just say `sapUiTestGherkinQUnitTestHarnessMod.foo` */
  override def _to: qUnitTestHarness = default
  
  /**
    * @SINCE 1.40
    *
    * Dynamically generates and executes QUnit tests based on a Gherkin feature file and step definitions
    *
    * Logs activity to QUnit, and some debug information to the console with the prefix "[GHERKIN]"
    */
  trait qUnitTestHarness extends StObject {
    
    /**
      * Dynamically generates and executes QUnit tests
      */
    def test(/**
      * the arguments to the function
      */
    args: Steps): Unit
  }
  object qUnitTestHarness {
    
    inline def apply(test: Steps => Unit): qUnitTestHarness = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[qUnitTestHarness]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: qUnitTestHarness] (val x: Self) extends AnyVal {
      
      inline def setTest(value: Steps => Unit): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
