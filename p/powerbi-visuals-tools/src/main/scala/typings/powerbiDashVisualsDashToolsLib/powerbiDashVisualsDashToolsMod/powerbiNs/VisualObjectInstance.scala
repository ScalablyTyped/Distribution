package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualObjectInstance extends js.Object {
  /** (Optional) VisualObjectInstanceEnumeration category index. */
  var containerIdx: js.UndefOr[scala.Double] = js.undefined
  /** A display name for the object instance. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the object (as defined in VisualCapabilities). */
  var objectName: java.lang.String
  /** The set of property values for this object.  Some of these properties may be defaults provided by the IVisual. */
  var properties: org.scalablytyped.runtime.StringDictionary[DataViewPropertyValue]
  /** (Optional) Set the required type for particular properties that support variant types. */
  var propertyTypes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ValueTypeDescriptor]] = js.undefined
  /** The selector that identifies this object. */
  var selector: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.Selector
  /** (Optional) Defines the constrained set of valid values for a property. */
  var validValues: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String] | ValidationOptions]
  ] = js.undefined
}

object VisualObjectInstance {
  @scala.inline
  def apply(
    objectName: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[DataViewPropertyValue],
    selector: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.Selector,
    containerIdx: scala.Int | scala.Double = null,
    displayName: java.lang.String = null,
    propertyTypes: org.scalablytyped.runtime.StringDictionary[ValueTypeDescriptor] = null,
    validValues: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String] | ValidationOptions] = null
  ): VisualObjectInstance = {
    val __obj = js.Dynamic.literal(objectName = objectName, properties = properties, selector = selector)
    if (containerIdx != null) __obj.updateDynamic("containerIdx")(containerIdx.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (propertyTypes != null) __obj.updateDynamic("propertyTypes")(propertyTypes)
    if (validValues != null) __obj.updateDynamic("validValues")(validValues)
    __obj.asInstanceOf[VisualObjectInstance]
  }
}

