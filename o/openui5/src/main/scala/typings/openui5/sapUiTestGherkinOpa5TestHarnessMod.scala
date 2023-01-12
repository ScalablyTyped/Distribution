package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.FeaturePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestGherkinOpa5TestHarnessMod extends Shortcut {
  
  @JSImport("sap/ui/test/gherkin/opa5TestHarness", JSImport.Default)
  @js.native
  val default: opa5TestHarness = js.native
  
  type _To = opa5TestHarness
  
  /* This means you don't have to write `default`, but can instead just say `sapUiTestGherkinOpa5TestHarnessMod.foo` */
  override def _to: opa5TestHarness = default
  
  /**
    * @SINCE 1.40
    *
    * Dynamically generates and executes Opa5 tests based on a Gherkin feature file and step definitions.
    *
    * Logs activity to Opa5, and some debug information to the console with the prefix "[GHERKIN]"
    */
  trait opa5TestHarness extends StObject {
    
    /**
      * Dynamically generates Opa5 tests
      *
      * If a test step is missing and args.generateMissingSteps is true then the Gherkin step will be converted
      * into Opa Page Object code and executed. The text will be converted to camelCase and have any non-alphanumeric
      * character removed. Here are two pertinent examples:
      *
      * (1) The simple step "Given I start my app" will be converted into the call "Given.iStartMyApp();"
      *
      * (2) The step "Then on page 1: I should see the page 1 text" will become the call "Then.onPage1.iShouldSeeThePage1Text();"
      *
      * Chaining function calls, such as "Then.iStartMyApp().and.iCloseMyApp()" is not possible at this time.
      */
    def test(/**
      * the arguments to the function
      */
    args: FeaturePath): Unit
  }
  object opa5TestHarness {
    
    inline def apply(test: FeaturePath => Unit): opa5TestHarness = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[opa5TestHarness]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: opa5TestHarness] (val x: Self) extends AnyVal {
      
      inline def setTest(value: FeaturePath => Unit): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
