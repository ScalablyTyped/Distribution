package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMetadataCardAction extends js.Object {
  val Events: IEvents
  def Activate(): scala.Unit
  def GetExplanation(): java.lang.String
  def GetName(): java.lang.String
  def IsEnabled(): scala.Boolean
  def IsVisible(): scala.Boolean
}

