package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesData
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var initialize: js.UndefOr[
    js.Function2[
      /* models */ js.Array[atOracleOraclejetLib.ojmodelMod.Model], 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var urlRoot: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[
    scala.Null | js.Object | java.lang.String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], scala.Double])
  ] = js.undefined
}

object Anon_AttributesData {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    initialize: js.Function2[
      /* models */ js.Array[atOracleOraclejetLib.ojmodelMod.Model], 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    parse: js.Function1[/* data */ js.Any, _] = null,
    parseSave: js.Function1[/* data */ js.Any, _] = null,
    urlRoot: java.lang.String = null,
    validate: js.Object | java.lang.String | (js.Function2[
      /* attributes */ js.Object, 
      /* options */ js.UndefOr[Anon_AttributesData], 
      scala.Double
    ]) = null
  ): Anon_AttributesData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (parseSave != null) __obj.updateDynamic("parseSave")(parseSave)
    if (urlRoot != null) __obj.updateDynamic("urlRoot")(urlRoot)
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributesData]
  }
}

