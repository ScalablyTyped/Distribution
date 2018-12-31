package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardOption extends js.Object {
  val Events: IEvents
  def GetExplanation(): java.lang.String
  def GetName(): java.lang.String
  def GetOptionValue(): js.Any
  def IsEnabled(): scala.Boolean
  def IsVisible(): scala.Boolean
  def SetOptionValue(value: js.Any): scala.Unit
}

