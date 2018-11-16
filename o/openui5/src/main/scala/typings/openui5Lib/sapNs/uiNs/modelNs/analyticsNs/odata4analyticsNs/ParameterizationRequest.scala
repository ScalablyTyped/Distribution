package typings
package openui5Lib.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.ParameterizationRequest")
@js.native
class ParameterizationRequest protected () extends js.Object {
  /**
               * Create a request object for interaction with a query parameterization.
               * @param oParameterization Description of a query parameterization
              */
  def this(oParameterization: Parameterization) = this()
  /**
               * Get the description of the parameterization on which this requestoperates on
               * @returns Description of a         query parameterization
              */
  def getParameterization(): Parameterization = js.native
  /**
               * Get the URI to locate the entity set for the query parameterization.
               * @param sServiceRootURI (optional) Identifies the root of the OData           service
              */
  def getURIToParameterizationEntitySet(sServiceRootURI: java.lang.String): scala.Unit = js.native
  /**
               * Get the URI to locate the parameterization entity for the values assignedto all parameters
               * beforehand. Notice that a value must be supplied forevery parameter including those marked as
               * optional. For optionalparameters, assign the special value that the service provider uses as
               * an"omitted" value. For example, for services based on BW Easy Queries, thiswould be an empty string.
               * @param sServiceRootURI (optional) Identifies the root of the OData           service
              */
  def getURIToParameterizationEntry(sServiceRootURI: java.lang.String): scala.Unit = js.native
  /**
               * Assign a value to a parameter
               * @param sParameterName Name of the parameter. In case of a range           value, provide the name of
               * the lower boundary parameter.
               * @param sValue Assigned value. Pass null to remove a value assignment.
               * @param sToValue Omit it or set it to null for single values. If set,           it will be assigned
               * to the upper boundary parameter
              */
  def setParameterValue(sParameterName: java.lang.String, sValue: java.lang.String, sToValue: java.lang.String): scala.Unit = js.native
}

