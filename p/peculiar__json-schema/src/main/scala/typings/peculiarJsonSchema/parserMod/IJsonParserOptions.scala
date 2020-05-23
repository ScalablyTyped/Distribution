package typings.peculiarJsonSchema.parserMod

import typings.peculiarJsonSchema.typesMod.IEmptyConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonParserOptions[T] extends js.Object {
  var schemaName: js.UndefOr[String] = js.undefined
  /**
    * Checks all properties for object and throws KeyError with list of wrong keys
    */
  var strictAllKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable strict checking of properties. Throw exception if incoming JSON has odd fields
    */
  var strictProperty: js.UndefOr[Boolean] = js.undefined
  var targetSchema: IEmptyConstructor[T]
}

object IJsonParserOptions {
  @scala.inline
  def apply[T](
    targetSchema: IEmptyConstructor[T],
    schemaName: String = null,
    strictAllKeys: js.UndefOr[Boolean] = js.undefined,
    strictProperty: js.UndefOr[Boolean] = js.undefined
  ): IJsonParserOptions[T] = {
    val __obj = js.Dynamic.literal(targetSchema = targetSchema.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    if (!js.isUndefined(strictAllKeys)) __obj.updateDynamic("strictAllKeys")(strictAllKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictProperty)) __obj.updateDynamic("strictProperty")(strictProperty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonParserOptions[T]]
  }
}

