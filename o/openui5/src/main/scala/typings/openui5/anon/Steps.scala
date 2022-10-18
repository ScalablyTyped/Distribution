package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Steps extends StObject {
  
  /**
    * the path to the Gherkin feature file to parse, as an SAPUI5 module path. The ".feature" extension is
    * assumed and should not be included. See {@link jQuery.sap.registerModulePath}
    */
  var featurePath: String
  
  /**
    * the constructor function of type {@link sap.ui.test.gherkin.StepDefinitions}
    */
  var steps: js.Function
}
object Steps {
  
  inline def apply(featurePath: String, steps: js.Function): Steps = {
    val __obj = js.Dynamic.literal(featurePath = featurePath.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
  
  extension [Self <: Steps](x: Self) {
    
    inline def setFeaturePath(value: String): Self = StObject.set(x, "featurePath", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Function): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
  }
}
