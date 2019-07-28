package typings.atOracleOraclejet.ojattributegrouphandlerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojattributegrouphandler", "AttributeGroupHandler")
@js.native
class AttributeGroupHandler () extends js.Object {
  def this(matchRules: StringDictionary[js.Any]) = this()
  def addMatchRule(category: String, attributeValue: js.Any): Unit = js.native
  def getCategoryAssignments(): js.Array[StringDictionary[_]] = js.native
  def getValue(category: String): js.Any = js.native
  def getValueRamp(): js.Array[_] = js.native
}

