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
    val __obj = js.Dynamic.literal(dLevelMax = dLevelMax.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rLevelMax = rLevelMax.asInstanceOf[js.Any], repetitionType = repetitionType.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldCount != null) __obj.updateDynamic("fieldCount")(fieldCount.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(isNested)) __obj.updateDynamic("isNested")(isNested.asInstanceOf[js.Any])
    if (originalType != null) __obj.updateDynamic("originalType")(originalType.asInstanceOf[js.Any])
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType.asInstanceOf[js.Any])
    if (typeLength != null) __obj.updateDynamic("typeLength")(typeLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInterface]
  }
}

