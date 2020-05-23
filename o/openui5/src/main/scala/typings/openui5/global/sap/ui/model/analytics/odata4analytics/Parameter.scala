package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Parameter")
@js.native
class Parameter protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter {
  /**
    * Create a representation of a single parameter contained in a parameterization. Do not create your
    * own instances.
    * @param oParameterization The parameterization containing this parameter
    * @param oProperty The DataJS object object representing the text property
    */
  def this(
    oParameterization: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization,
    oProperty: js.Any
  ) = this()
  /**
    * Get parameterization containing this parameter
    * @returns The parameterization        object
    */
  /* CompleteClass */
  override def getContainingParameterization(): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         parameter
    */
  /* CompleteClass */
  override def getLabelText(): String = js.native
  /**
    * Get the name of the parameter
    * @returns The name of the parameter, which is identical with the         name of the property
    * representing the parameter in the         parameterization entity type
    */
  /* CompleteClass */
  override def getName(): String = js.native
  /**
    * Get property for the parameter representing the peer boundary of the sameinterval
    * @returns The parameter representing         the peer boundary of the same interval. This means that
    * if         *this* parameter is a lower boundary, the returned object
    */
  /* CompleteClass */
  override def getPeerIntervalBoundaryParameter(): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter = js.native
  /**
    * Get property
    */
  /* CompleteClass */
  override def getProperty(): js.Any = js.native
  /**
    * Get text property related to this parameter
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  /* CompleteClass */
  override def getTextProperty(): js.Any = js.native
  /**
    * Get the URI to locate the entity set holding the value set, if it isavailable.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  /* CompleteClass */
  override def getURIToValueEntitySet(sServiceRootURI: String): Unit = js.native
  /**
    * Get indicator if the parameter represents an interval boundary
    * @returns True iff it represents an interval boundary, otherwise         false
    */
  /* CompleteClass */
  override def isIntervalBoundary(): Boolean = js.native
  /**
    * Get indicator if the parameter represents the lower boundary of aninterval
    * @returns True iff it represents the lower boundary of an         interval, otherwise false
    */
  /* CompleteClass */
  override def isLowerIntervalBoundary(): Boolean = js.native
  /**
    * Get indicator whether or not the parameter is optional
    * @returns True iff the parameter is optional
    */
  /* CompleteClass */
  override def isOptional(): Boolean = js.native
  /**
    * Get indicator if a set of values is available for this parameter.Typically, this is true for
    * parameters with a finite set of known valuessuch as products, business partners in different roles,
    * organizationunits, and false for integer or date parameters
    * @returns True iff a value set is available, otherwise false
    */
  /* CompleteClass */
  override def isValueSetAvailable(): Boolean = js.native
}

