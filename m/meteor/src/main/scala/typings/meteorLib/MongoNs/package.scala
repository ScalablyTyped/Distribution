package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MongoNs {
  type ArraysOrEach[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyArrays<T[P]> | {  $each  :T[P]}}
    */ meteorLib.meteorLibStrings.ArraysOrEach with js.Any
  type ElementsOf[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]>}
    */ meteorLib.meteorLibStrings.ElementsOf with T
  type Flatten[T] = T | (/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | meteorLib.Anon_0[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
  type PartialMapTo[T, M] = stdLib.Partial[stdLib.Record[java.lang.String, M]]
  type PushModifier[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.Mongo.Dictionary<number>}}
    */ meteorLib.meteorLibStrings.PushModifier with js.Any
  type Query[T] = meteorLib.meteorLibStrings.Query with js.Any with meteorLib.Anon_And with Dictionary[_]
  type Selector[T] = Query[T] | QueryWithModifiers[T]
}
