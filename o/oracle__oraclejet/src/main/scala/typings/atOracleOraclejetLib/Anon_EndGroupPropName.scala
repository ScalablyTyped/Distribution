package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndGroupPropName
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var endGroup: java.lang.String
  var startGroup: java.lang.String
  var xMax: scala.Double
  var xMin: scala.Double
  var yMax: scala.Double
  var yMin: scala.Double
}

object Anon_EndGroupPropName {
  @scala.inline
  def apply(
    endGroup: java.lang.String,
    startGroup: java.lang.String,
    xMax: scala.Double,
    xMin: scala.Double,
    yMax: scala.Double,
    yMin: scala.Double,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_EndGroupPropName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endGroup")(endGroup)
    __obj.updateDynamic("startGroup")(startGroup)
    __obj.updateDynamic("xMax")(xMax)
    __obj.updateDynamic("xMin")(xMin)
    __obj.updateDynamic("yMax")(yMax)
    __obj.updateDynamic("yMin")(yMin)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_EndGroupPropName]
  }
}

