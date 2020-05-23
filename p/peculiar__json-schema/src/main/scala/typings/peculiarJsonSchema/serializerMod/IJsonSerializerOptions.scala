package typings.peculiarJsonSchema.serializerMod

import typings.peculiarJsonSchema.typesMod.IEmptyConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonSerializerOptions extends js.Object {
  var schemaName: js.UndefOr[String] = js.undefined
  var targetSchema: js.UndefOr[IEmptyConstructor[_]] = js.undefined
}

object IJsonSerializerOptions {
  @scala.inline
  def apply(schemaName: String = null, targetSchema: IEmptyConstructor[_] = null): IJsonSerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    if (targetSchema != null) __obj.updateDynamic("targetSchema")(targetSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonSerializerOptions]
  }
}

