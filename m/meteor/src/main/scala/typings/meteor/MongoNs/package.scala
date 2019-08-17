package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MongoNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.meteor.Anon_0
  import typings.meteor.Anon_And
  import typings.std.Number
  import typings.std.Partial
  import typings.std.Record

  type ArraysOrEach[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typings.meteor.meteorStrings.ArraysOrEach with js.Any
  type Dictionary[T] = StringDictionary[T]
  type ElementsOf[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typings.meteor.meteorStrings.ElementsOf with T
  type FieldSpecifier = StringDictionary[Number]
  type Flatten[T] = T | (/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | Anon_0[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
  type PartialMapTo[T, M] = Partial[Record[String, M]]
  type PushModifier[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.Mongo.Dictionary<number>}}
    */ typings.meteor.meteorStrings.PushModifier with js.Any
  type Query[T] = typings.meteor.meteorStrings.Query with js.Any with Anon_And with Dictionary[_]
  type Selector[T] = Query[T] | QueryWithModifiers[T]
}
