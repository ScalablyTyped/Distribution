package typings.parquetjs.libFieldDotInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInterface extends js.Object {
  var compression: js.UndefOr[String] = js.undefined
  var dLevelMax: Double
  var encoding: js.UndefOr[String] = js.undefined
  var fieldCount: js.UndefOr[Double] = js.undefined
  var fields: js.UndefOr[StringDictionary[FieldInterface]] = js.undefined
  var isNested: js.UndefOr[Boolean] = js.undefined
  var name: String
  var originalType: js.UndefOr[String | Null] = js.undefined
  var path: js.Array[String]
  var primitiveType: js.UndefOr[String | Null] = js.undefined
  var rLevelMax: Double
  var repetitionType: String
  var typeLength: js.UndefOr[Double | Null] = js.undefined
}

object FieldInterface {
  @scala.inline
  def apply(
    dLevelMax: Double,
    name: String,
    path: js.Array[String],
    rLevelMax: Double,
    repetitionType: String,
    compression: String = null,
    encoding: String = null,
    fieldCount: Int | Double = null,
    fields: StringDictionary[FieldInterface] = null,
    isNested: js.UndefOr[Boolean] = js.undefined,
    originalType: String = null,
    primitiveType: String = null,
    typeLength: Int | Double = null
  ): FieldInterface = {
    val __obj = js.Dynamic.literal(dLevelMax = dLevelMax, name = name, path = path, rLevelMax = rLevelMax, repetitionType = repetitionType)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fieldCount != null) __obj.updateDynamic("fieldCount")(fieldCount.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(isNested)) __obj.updateDynamic("isNested")(isNested)
    if (originalType != null) __obj.updateDynamic("originalType")(originalType)
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType)
    if (typeLength != null) __obj.updateDynamic("typeLength")(typeLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInterface]
  }
}

