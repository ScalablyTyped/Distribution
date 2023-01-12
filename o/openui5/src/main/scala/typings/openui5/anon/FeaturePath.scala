package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturePath extends StObject {
  
  /**
    * the path to the Gherkin feature file to parse, as an SAPUI5 module path. The ".feature" extension is
    * assumed and should not be included. See {@link jQuery.sap.registerModulePath}
    */
  var featurePath: String
  
  /**
    * When true: if a Gherkin step cannot be matched to a step definition then it will be assumed that the
    * user wants to convert the step into an Opa Page Object call.
    */
  var generateMissingSteps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the constructor function of type {@link sap.ui.test.gherkin.StepDefinitions}. If this parameter is ommitted
    * then args.generateMissingSteps must be explicitly set to true.
    */
  var steps: js.UndefOr[js.Function] = js.undefined
}
object FeaturePath {
  
  inline def apply(featurePath: String): FeaturePath = {
    val __obj = js.Dynamic.literal(featurePath = featurePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturePath] (val x: Self) extends AnyVal {
    
    inline def setFeaturePath(value: String): Self = StObject.set(x, "featurePath", value.asInstanceOf[js.Any])
    
    inline def setGenerateMissingSteps(value: Boolean): Self = StObject.set(x, "generateMissingSteps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMissingStepsUndefined: Self = StObject.set(x, "generateMissingSteps", js.undefined)
    
    inline def setSteps(value: js.Function): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
