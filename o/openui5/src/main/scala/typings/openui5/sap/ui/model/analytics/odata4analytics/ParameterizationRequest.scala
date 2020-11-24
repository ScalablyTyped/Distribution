package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterizationRequest extends js.Object {
  
  /**
    * Get the description of the parameterization on which this requestoperates on
    * @returns Description of a         query parameterization
    */
  def getParameterization(): Parameterization = js.native
  
  /**
    * Get the URI to locate the entity set for the query parameterization.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  def getURIToParameterizationEntitySet(sServiceRootURI: String): Unit = js.native
  
  /**
    * Get the URI to locate the parameterization entity for the values assignedto all parameters
    * beforehand. Notice that a value must be supplied forevery parameter including those marked as
    * optional. For optionalparameters, assign the special value that the service provider uses as
    * an"omitted" value. For example, for services based on BW Easy Queries, thiswould be an empty string.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  def getURIToParameterizationEntry(sServiceRootURI: String): Unit = js.native
  
  /**
    * Assign a value to a parameter
    * @param sParameterName Name of the parameter. In case of a range           value, provide the name of
    * the lower boundary parameter.
    * @param sValue Assigned value. Pass null to remove a value assignment.
    * @param sToValue Omit it or set it to null for single values. If set,           it will be assigned
    * to the upper boundary parameter
    */
  def setParameterValue(sParameterName: String, sValue: String, sToValue: String): Unit = js.native
}
object ParameterizationRequest {
  
  @scala.inline
  def apply(
    getParameterization: () => Parameterization,
    getURIToParameterizationEntitySet: String => Unit,
    getURIToParameterizationEntry: String => Unit,
    setParameterValue: (String, String, String) => Unit
  ): ParameterizationRequest = {
    val __obj = js.Dynamic.literal(getParameterization = js.Any.fromFunction0(getParameterization), getURIToParameterizationEntitySet = js.Any.fromFunction1(getURIToParameterizationEntitySet), getURIToParameterizationEntry = js.Any.fromFunction1(getURIToParameterizationEntry), setParameterValue = js.Any.fromFunction3(setParameterValue))
    __obj.asInstanceOf[ParameterizationRequest]
  }
  
  @scala.inline
  implicit class ParameterizationRequestOps[Self <: ParameterizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetParameterization(value: () => Parameterization): Self = this.set("getParameterization", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURIToParameterizationEntitySet(value: String => Unit): Self = this.set("getURIToParameterizationEntitySet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetURIToParameterizationEntry(value: String => Unit): Self = this.set("getURIToParameterizationEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParameterValue(value: (String, String, String) => Unit): Self = this.set("setParameterValue", js.Any.fromFunction3(value))
  }
}
