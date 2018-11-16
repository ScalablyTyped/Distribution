package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectTemplateSelector extends js.Object {
  val ClassSelector: IMetadataCardControl
  val Events: IEvents
  def GetObjectTypeIconURL(): java.lang.String
  def GetObjectTypeId(): scala.Double
  def GetObjectTypeName(): java.lang.String
  def GetTemplateItems(): js.Any
  def SelectItem(itemID: java.lang.String): scala.Unit
}

