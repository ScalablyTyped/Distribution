package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IState extends js.Object {
  val ID: scala.Double
  var Name: java.lang.String
  var Selectable: scala.Boolean
  var SelectableFlagAffectedByPseudoUsers: scala.Boolean
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

