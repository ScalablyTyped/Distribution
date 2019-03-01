package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comparator
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var comparator: js.UndefOr[
    scala.Null | java.lang.String | (js.Function2[
      /* model1 */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* model2 */ js.UndefOr[atOracleOraclejetLib.ojmodelMod.Model], 
      scala.Double
    ])
  ] = js.undefined
  var fetchSize: js.UndefOr[scala.Double] = js.undefined
  var initialize: js.UndefOr[
    js.Function2[
      /* models */ js.Array[atOracleOraclejetLib.ojmodelMod.Model], 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var model: js.UndefOr[atOracleOraclejetLib.ojmodelMod.Model] = js.undefined
  var modelLimit: js.UndefOr[scala.Double] = js.undefined
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Comparator {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    comparator: java.lang.String | (js.Function2[
      /* model1 */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* model2 */ js.UndefOr[atOracleOraclejetLib.ojmodelMod.Model], 
      scala.Double
    ]) = null,
    fetchSize: scala.Int | scala.Double = null,
    initialize: js.Function2[
      /* models */ js.Array[atOracleOraclejetLib.ojmodelMod.Model], 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    model: atOracleOraclejetLib.ojmodelMod.Model = null,
    modelLimit: scala.Int | scala.Double = null,
    parse: js.Function1[/* data */ js.Any, _] = null,
    url: java.lang.String = null
  ): Anon_Comparator = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (model != null) __obj.updateDynamic("model")(model)
    if (modelLimit != null) __obj.updateDynamic("modelLimit")(modelLimit.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Comparator]
  }
}

