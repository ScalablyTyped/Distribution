package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQuery[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[stdLib.Partial[T] | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$bit")
  var $bit: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? true | {  $type  :'date' | 'timestamp'}}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | (org.scalablytyped.runtime.StringDictionary[mongodbLib.mongodbLibNumbers.`true` | mongodbLib.Anon_Date])
  ] = js.undefined
  @JSName("$each")
  var $each: js.UndefOr[stdLib.Partial[T] | org.scalablytyped.runtime.StringDictionary[js.Array[_]]] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | org.scalablytyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | org.scalablytyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | org.scalablytyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | org.scalablytyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? -1 | 1}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | (org.scalablytyped.runtime.StringDictionary[mongodbLib.mongodbLibNumbers.`-1` | mongodbLib.mongodbLibNumbers.`1`])
  ] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[
    stdLib.Partial[T] | (org.scalablytyped.runtime.StringDictionary[Condition[T, java.lang.String]])
  ] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[stdLib.Partial[T] | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$pushAll")
  var $pushAll: js.UndefOr[stdLib.Partial[T] | org.scalablytyped.runtime.StringDictionary[js.Array[_]]] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[stdLib.Partial[T] | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[stdLib.Partial[T] | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? ''}
    */ mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | org.scalablytyped.runtime.StringDictionary[mongodbLib.mongodbLibStrings.Empty]
  ] = js.undefined
}

