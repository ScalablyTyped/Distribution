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

