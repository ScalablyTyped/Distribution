package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MongoNs {
  type ArraysOrEach[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyArrays<T[P]> | {  $each  :T[P]}}
    */ meteorLib.meteorLibStrings.ArraysOrEach with js.Any
  type BsonType = meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibStrings.double | meteorLib.meteorLibNumbers.`2` | meteorLib.meteorLibStrings.string | meteorLib.meteorLibNumbers.`3` | meteorLib.meteorLibStrings.`object` | meteorLib.meteorLibNumbers.`4` | meteorLib.meteorLibStrings.array | meteorLib.meteorLibNumbers.`5` | meteorLib.meteorLibStrings.binData | meteorLib.meteorLibNumbers.`6` | meteorLib.meteorLibStrings.undefined | meteorLib.meteorLibNumbers.`7` | meteorLib.meteorLibStrings.objectId | meteorLib.meteorLibNumbers.`8` | meteorLib.meteorLibStrings.bool | meteorLib.meteorLibNumbers.`9` | meteorLib.meteorLibStrings.date | meteorLib.meteorLibNumbers.`10` | meteorLib.meteorLibStrings.`null` | meteorLib.meteorLibNumbers.`11` | meteorLib.meteorLibStrings.regex | meteorLib.meteorLibNumbers.`12` | meteorLib.meteorLibStrings.dbPointer | meteorLib.meteorLibNumbers.`13` | meteorLib.meteorLibStrings.javascript | meteorLib.meteorLibNumbers.`14` | meteorLib.meteorLibStrings.symbol | meteorLib.meteorLibNumbers.`15` | meteorLib.meteorLibStrings.javascriptWithScope | meteorLib.meteorLibNumbers.`16` | meteorLib.meteorLibStrings.int | meteorLib.meteorLibNumbers.`17` | meteorLib.meteorLibStrings.timestamp | meteorLib.meteorLibNumbers.`18` | meteorLib.meteorLibStrings.long | meteorLib.meteorLibNumbers.`19` | meteorLib.meteorLibStrings.decimal | meteorLib.meteorLibNumbers.`-1` | meteorLib.meteorLibStrings.minKey | meteorLib.meteorLibNumbers.`127` | meteorLib.meteorLibStrings.maxKey | meteorLib.meteorLibStrings.number
  type CurrentDateModifier = meteorLib.Anon_Date | meteorLib.meteorLibNumbers.`true`
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
