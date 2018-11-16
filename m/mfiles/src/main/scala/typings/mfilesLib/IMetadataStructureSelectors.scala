package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataStructureSelectors extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, MetadataStructureSelector: IMetadataStructureSelector): scala.Unit = js.native
  def Clone(): IMetadataStructureSelectors = js.native
  def Item(Index: scala.Double): IMetadataStructureSelector = js.native
  def Item(Index: scala.Double, value: IMetadataStructureSelector): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

