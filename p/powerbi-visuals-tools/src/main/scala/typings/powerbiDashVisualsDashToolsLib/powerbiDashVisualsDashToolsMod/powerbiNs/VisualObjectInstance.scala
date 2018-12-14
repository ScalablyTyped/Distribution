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

