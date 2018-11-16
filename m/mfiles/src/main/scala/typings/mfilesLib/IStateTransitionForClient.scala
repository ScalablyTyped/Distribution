package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStateTransitionForClient extends js.Object {
  var FromState: scala.Double
  val ID: scala.Double
  var Name: java.lang.String
  var Selectable: scala.Boolean
  var SelectableFlagAffectedByPseudoUsers: scala.Boolean
  var ToState: scala.Double
  def Clone(): IStateTransitionForClient
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

