package typings
package parquetjsLib.libFieldDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInterface extends js.Object {
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var dLevelMax: scala.Double
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fieldCount: js.UndefOr[scala.Double] = js.undefined
  var fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[FieldInterface]] = js.undefined
  var isNested: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var originalType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var path: js.Array[java.lang.String]
  var primitiveType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var rLevelMax: scala.Double
  var repetitionType: java.lang.String
  var typeLength: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object FieldInterface {
  @scala.inline
  def apply(
    dLevelMax: scala.Double,
    name: java.lang.String,
    path: js.Array[java.lang.String],
    rLevelMax: scala.Double,
    repetitionType: java.lang.String,
    compression: java.lang.String = null,
    encoding: java.lang.String = null,
    fieldCount: scala.Int | scala.Double = null,
    fields: org.scalablytyped.runtime.StringDictionary[FieldInterface] = null,
    isNested: js.UndefOr[scala.Boolean] = js.undefined,
    originalType: java.lang.String = null,
    primitiveType: java.lang.String = null,
    typeLength: scala.Int | scala.Double = null
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

