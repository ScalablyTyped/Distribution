package typings.meteor.mongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mongo {
  type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typings.meteor.meteorStrings.ArraysOrEach with org.scalablytyped.runtime.TopLevel[js.Any]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typings.meteor.meteorStrings.ElementsOf with org.scalablytyped.runtime.TopLevel[T]
  type FieldSpecifier = org.scalablytyped.runtime.StringDictionary[typings.std.Number]
  type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | typings.meteor.anon.AddToSet[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = typings.std.Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type OptionalId[TSchema] = (typings.meteor.mongoMod.UnionOmit[TSchema, typings.meteor.meteorStrings._id]) with typings.meteor.anon.Id
  type PartialMapTo[T, M] = typings.std.Partial[typings.std.Record[/* keyof T */ java.lang.String, M]]
  type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.meteor/mongo.Mongo.Dictionary<number>}}
    */ typings.meteor.meteorStrings.PushModifier with org.scalablytyped.runtime.TopLevel[js.Any]
  type Query[T] = typings.meteor.meteorStrings.Query with org.scalablytyped.runtime.TopLevel[js.Any] with typings.meteor.anon.And with typings.meteor.mongoMod.Mongo.Dictionary[_]
  type Selector[T] = typings.meteor.mongoMod.Mongo.Query[T] | typings.meteor.mongoMod.Mongo.QueryWithModifiers[T]
}
