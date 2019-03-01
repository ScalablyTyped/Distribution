package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object powerbiNs {
  type DataViewPropertyValue = PrimitiveValue | StructuralObjectValue
  type EnumMemberValue = java.lang.String | scala.Double
  type FillRule = FillRuleGeneric[java.lang.String, scala.Double, java.lang.String]
  type FillSolidColorTypeDescriptor = scala.Boolean | FillSolidColorAdvancedTypeDescriptor
  type GeoJson = GeoJsonDefinitionGeneric[java.lang.String]
  type IDeferred[T] = IDeferred2[T, T]
  /**
    * Represents an operation, to be completed (resolve/rejected) in the future.
    */
  type IPromise[T] = IPromise2[T, T]
  type IResultCallback[T] = js.Function2[/* result */ T, /* done */ scala.Boolean, scala.Unit]
  type ImageValue = ImageDefinitionGeneric[java.lang.String]
  /** Defines the acceptable values of a number. */
  type NumberRange = ValueRange[scala.Double]
  type Paragraphs = js.Array[Paragraph]
  /** Describes instances of value type objects. */
  type PrimitiveValue = java.lang.String | scala.Double | scala.Boolean | stdLib.Date
  /** Defines the PrimitiveValue range. */
  type PrimitiveValueRange = ValueRange[PrimitiveValue]
  type RejectablePromise[T] = RejectablePromise2[T, T]
  /** Defines instances of structural types. */
  type StructuralObjectValue = _StructuralObjectValue | FillRule | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SemanticFilter */ js.Any) | ImageValue | Paragraphs | GeoJson
  type VisualObjectInstanceEnumeration = js.Array[VisualObjectInstance] | VisualObjectInstanceEnumerationObject
}
