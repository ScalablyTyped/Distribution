package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /**
    * Get parameterization containing this parameter
    * @returns The parameterization        object
    */
  def getContainingParameterization(): Parameterization
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         parameter
    */
  def getLabelText(): String
  /**
    * Get the name of the parameter
    * @returns The name of the parameter, which is identical with the         name of the property
    * representing the parameter in the         parameterization entity type
    */
  def getName(): String
  /**
    * Get property for the parameter representing the peer boundary of the sameinterval
    * @returns The parameter representing         the peer boundary of the same interval. This means that
    * if         *this* parameter is a lower boundary, the returned object
    */
  def getPeerIntervalBoundaryParameter(): Parameter
  /**
    * Get property
    */
  def getProperty(): js.Any
  /**
    * Get text property related to this parameter
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextProperty(): js.Any
  /**
    * Get the URI to locate the entity set holding the value set, if it isavailable.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  def getURIToValueEntitySet(sServiceRootURI: String): Unit
  /**
    * Get indicator if the parameter represents an interval boundary
    * @returns True iff it represents an interval boundary, otherwise         false
    */
  def isIntervalBoundary(): Boolean
  /**
    * Get indicator if the parameter represents the lower boundary of aninterval
    * @returns True iff it represents the lower boundary of an         interval, otherwise false
    */
  def isLowerIntervalBoundary(): Boolean
  /**
    * Get indicator whether or not the parameter is optional
    * @returns True iff the parameter is optional
    */
  def isOptional(): Boolean
  /**
    * Get indicator if a set of values is available for this parameter.Typically, this is true for
    * parameters with a finite set of known valuessuch as products, business partners in different roles,
    * organizationunits, and false for integer or date parameters
    * @returns True iff a value set is available, otherwise false
    */
  def isValueSetAvailable(): Boolean
}

object Parameter {
  @scala.inline
  def apply(
    getContainingParameterization: () => Parameterization,
    getLabelText: () => String,
    getName: () => String,
    getPeerIntervalBoundaryParameter: () => Parameter,
    getProperty: () => js.Any,
    getTextProperty: () => js.Any,
    getURIToValueEntitySet: String => Unit,
    isIntervalBoundary: () => Boolean,
    isLowerIntervalBoundary: () => Boolean,
    isOptional: () => Boolean,
    isValueSetAvailable: () => Boolean
  ): Parameter = {
    val __obj = js.Dynamic.literal(getContainingParameterization = js.Any.fromFunction0(getContainingParameterization), getLabelText = js.Any.fromFunction0(getLabelText), getName = js.Any.fromFunction0(getName), getPeerIntervalBoundaryParameter = js.Any.fromFunction0(getPeerIntervalBoundaryParameter), getProperty = js.Any.fromFunction0(getProperty), getTextProperty = js.Any.fromFunction0(getTextProperty), getURIToValueEntitySet = js.Any.fromFunction1(getURIToValueEntitySet), isIntervalBoundary = js.Any.fromFunction0(isIntervalBoundary), isLowerIntervalBoundary = js.Any.fromFunction0(isLowerIntervalBoundary), isOptional = js.Any.fromFunction0(isOptional), isValueSetAvailable = js.Any.fromFunction0(isValueSetAvailable))
    __obj.asInstanceOf[Parameter]
  }
}

