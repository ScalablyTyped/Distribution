package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Represents an object (name-value pairs) in a DataView. */
type DataViewObject = /** Map of property name to property value. */
StringDictionary[DataViewPropertyValue | DataViewObjectMap]

/** Represents evaluated, named, custom objects in a DataView. */
type DataViewObjects = StringDictionary[DataViewObject]

type DataViewPropertyValue = PrimitiveValue | StructuralObjectValue

type EnumMemberValue = String | Double

type FillRule = FillRuleGeneric[String, Double, String]

type FillSolidColorTypeDescriptor = Boolean | FillSolidColorAdvancedTypeDescriptor

type GeoJson = GeoJsonDefinitionGeneric[String]

type IDeferred[T] = IDeferred2[T, T]

/**
  * Represents an operation, to be completed (resolve/rejected) in the future.
  */
type IPromise[T] = IPromise2[T, T]

type IResultCallback[T] = js.Function2[/* result */ T, /* done */ Boolean, Unit]

type ImageValue = ImageDefinitionGeneric[String]

type JoinPredicateBehavior = `0`

/** Defines the acceptable values of a number. */
type NumberRange = ValueRange[Double]

type Paragraphs = js.Array[Paragraph]

/** Describes instances of value type objects. */
type PrimitiveValue = String | Double | Boolean | js.Date

/** Defines the PrimitiveValue range. */
type PrimitiveValueRange = ValueRange[PrimitiveValue]

type RejectablePromise[T] = RejectablePromise2[T, T]

/** Defines instances of structural types. */
/* Rewritten from type alias, can be one of: 
  - typings.powerbiVisualsTools.mod.Fill
  - typings.powerbiVisualsTools.mod.FillRule
  - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SemanticFilter * / scala.Any
  - typings.powerbiVisualsTools.mod.DefaultValueDefinition
  - typings.powerbiVisualsTools.mod.ImageValue
  - typings.powerbiVisualsTools.mod.Paragraphs
  - typings.powerbiVisualsTools.mod.GeoJson
  - typings.powerbiVisualsTools.mod.DataBars
*/
type StructuralObjectValue = _StructuralObjectValue | FillRule | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SemanticFilter */ Any) | ImageValue | Paragraphs | GeoJson

type VisualObjectInstanceEnumeration = js.Array[VisualObjectInstance] | VisualObjectInstanceEnumerationObject
