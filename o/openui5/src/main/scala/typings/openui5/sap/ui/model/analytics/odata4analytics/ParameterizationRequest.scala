package typings.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterizationRequest extends StObject {
  
  /**
    * Get the description of the parameterization on which this requestoperates on
    * @returns Description of a         query parameterization
    */
  def getParameterization(): Parameterization
  
  /**
    * Get the URI to locate the entity set for the query parameterization.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  def getURIToParameterizationEntitySet(sServiceRootURI: String): Unit
  
  /**
    * Get the URI to locate the parameterization entity for the values assignedto all parameters
    * beforehand. Notice that a value must be supplied forevery parameter including those marked as
    * optional. For optionalparameters, assign the special value that the service provider uses as
    * an"omitted" value. For example, for services based on BW Easy Queries, thiswould be an empty string.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  def getURIToParameterizationEntry(sServiceRootURI: String): Unit
  
  /**
    * Assign a value to a parameter
    * @param sParameterName Name of the parameter. In case of a range           value, provide the name of
    * the lower boundary parameter.
    * @param sValue Assigned value. Pass null to remove a value assignment.
    * @param sToValue Omit it or set it to null for single values. If set,           it will be assigned
    * to the upper boundary parameter
    */
  def setParameterValue(sParameterName: String, sValue: String, sToValue: String): Unit
}
object ParameterizationRequest {
  
  inline def apply(
    getParameterization: () => Parameterization,
    getURIToParameterizationEntitySet: String => Unit,
    getURIToParameterizationEntry: String => Unit,
    setParameterValue: (String, String, String) => Unit
  ): ParameterizationRequest = {
    val __obj = js.Dynamic.literal(getParameterization = js.Any.fromFunction0(getParameterization), getURIToParameterizationEntitySet = js.Any.fromFunction1(getURIToParameterizationEntitySet), getURIToParameterizationEntry = js.Any.fromFunction1(getURIToParameterizationEntry), setParameterValue = js.Any.fromFunction3(setParameterValue))
    __obj.asInstanceOf[ParameterizationRequest]
  }
  
  extension [Self <: ParameterizationRequest](x: Self) {
    
    inline def setGetParameterization(value: () => Parameterization): Self = StObject.set(x, "getParameterization", js.Any.fromFunction0(value))
    
    inline def setGetURIToParameterizationEntitySet(value: String => Unit): Self = StObject.set(x, "getURIToParameterizationEntitySet", js.Any.fromFunction1(value))
    
    inline def setGetURIToParameterizationEntry(value: String => Unit): Self = StObject.set(x, "getURIToParameterizationEntry", js.Any.fromFunction1(value))
    
    inline def setSetParameterValue(value: (String, String, String) => Unit): Self = StObject.set(x, "setParameterValue", js.Any.fromFunction3(value))
  }
}
