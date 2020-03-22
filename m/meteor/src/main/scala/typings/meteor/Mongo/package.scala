package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mongo {
  type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typings.meteor.meteorStrings.ArraysOrEach with js.Any
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typings.meteor.meteorStrings.ElementsOf with T
  type FieldSpecifier = org.scalablytyped.runtime.StringDictionary[typings.std.Number]
  type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | typings.meteor.AnonAddToSet[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = typings.std.Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type OptionalId[TSchema] = (typings.meteor.UnionOmit[TSchema, typings.meteor.meteorStrings._id]) with typings.meteor.AnonId
  type PartialMapTo[T, M] = typings.std.Partial[typings.std.Record[java.lang.String, M]]
  type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.Mongo.Dictionary<number>}}
    */ typings.meteor.meteorStrings.PushModifier with js.Any
  type Query[T] = typings.meteor.meteorStrings.Query with js.Any with typings.meteor.AnonAnd with typings.meteor.Mongo.Dictionary[_]
  type Selector[T] = typings.meteor.Mongo.Query[T] | typings.meteor.Mongo.QueryWithModifiers[T]
}
