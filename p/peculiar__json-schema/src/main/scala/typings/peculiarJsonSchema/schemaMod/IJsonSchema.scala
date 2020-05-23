package typings.peculiarJsonSchema.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarJsonSchema.typesMod.IEmptyConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonSchema extends js.Object {
  var names: StringDictionary[StringDictionary[IJsonSchemaItem]]
  var target: IEmptyConstructor[_]
}

object IJsonSchema {
  @scala.inline
  def apply(names: StringDictionary[StringDictionary[IJsonSchemaItem]], target: IEmptyConstructor[_]): IJsonSchema = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonSchema]
  }
}

