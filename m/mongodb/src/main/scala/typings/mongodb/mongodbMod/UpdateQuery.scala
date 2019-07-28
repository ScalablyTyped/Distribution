package typings.mongodb.mongodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.Anon_Date
import typings.mongodb.mongodbNumbers.`-1`
import typings.mongodb.mongodbNumbers.`1`
import typings.mongodb.mongodbNumbers.`true`
import typings.mongodb.mongodbStrings.Empty
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQuery[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[js.Any]
  ] = js.undefined
  @JSName("$bit")
  var $bit: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[js.Any]
  ] = js.undefined
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? true | {  $type  :'date' | 'timestamp'}}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | (StringDictionary[`true` | Anon_Date])
  ] = js.undefined
  @JSName("$each")
  var $each: js.UndefOr[Partial[T] | StringDictionary[js.Array[_]]] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? -1 | 1}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | (StringDictionary[`-1` | `1`])
  ] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[js.Any]
  ] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  @JSName("$pushAll")
  var $pushAll: js.UndefOr[Partial[T] | StringDictionary[js.Array[_]]] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[StringDictionary[String]] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? ''}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[Empty]
  ] = js.undefined
}

object UpdateQuery {
  @scala.inline
  def apply[T](
    $addToSet: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[js.Any] = null,
    $bit: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[js.Any] = null,
    $currentDate: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? true | {  $type  :'date' | 'timestamp'}}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | (StringDictionary[`true` | Anon_Date]) = null,
    $each: Partial[T] | StringDictionary[js.Array[_]] = null,
    $inc: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double] = null,
    $max: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double] = null,
    $min: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double] = null,
    $mul: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[scala.Double] = null,
    $pop: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? -1 | 1}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | (StringDictionary[`-1` | `1`]) = null,
    $pull: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[js.Any] = null,
    $push: Partial[T] | StringDictionary[js.Any] = null,
    $pushAll: Partial[T] | StringDictionary[js.Array[_]] = null,
    $rename: StringDictionary[String] = null,
    $set: Partial[T] | StringDictionary[js.Any] = null,
    $setOnInsert: Partial[T] | StringDictionary[js.Any] = null,
    $unset: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? ''}
    */ typings.mongodb.mongodbStrings.UpdateQuery with js.Any) | StringDictionary[Empty] = null
  ): UpdateQuery[T] = {
    val __obj = js.Dynamic.literal()
    if ($addToSet != null) __obj.updateDynamic("$addToSet")($addToSet.asInstanceOf[js.Any])
    if ($bit != null) __obj.updateDynamic("$bit")($bit.asInstanceOf[js.Any])
    if ($currentDate != null) __obj.updateDynamic("$currentDate")($currentDate.asInstanceOf[js.Any])
    if ($each != null) __obj.updateDynamic("$each")($each.asInstanceOf[js.Any])
    if ($inc != null) __obj.updateDynamic("$inc")($inc.asInstanceOf[js.Any])
    if ($max != null) __obj.updateDynamic("$max")($max.asInstanceOf[js.Any])
    if ($min != null) __obj.updateDynamic("$min")($min.asInstanceOf[js.Any])
    if ($mul != null) __obj.updateDynamic("$mul")($mul.asInstanceOf[js.Any])
    if ($pop != null) __obj.updateDynamic("$pop")($pop.asInstanceOf[js.Any])
    if ($pull != null) __obj.updateDynamic("$pull")($pull.asInstanceOf[js.Any])
    if ($push != null) __obj.updateDynamic("$push")($push.asInstanceOf[js.Any])
    if ($pushAll != null) __obj.updateDynamic("$pushAll")($pushAll.asInstanceOf[js.Any])
    if ($rename != null) __obj.updateDynamic("$rename")($rename)
    if ($set != null) __obj.updateDynamic("$set")($set.asInstanceOf[js.Any])
    if ($setOnInsert != null) __obj.updateDynamic("$setOnInsert")($setOnInsert.asInstanceOf[js.Any])
    if ($unset != null) __obj.updateDynamic("$unset")($unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQuery[T]]
  }
}

