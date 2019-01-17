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

