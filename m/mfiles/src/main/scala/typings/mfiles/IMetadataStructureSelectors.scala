package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataStructureSelectors extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, MetadataStructureSelector: IMetadataStructureSelector): Unit = js.native
  def Clone(): IMetadataStructureSelectors = js.native
  def Item(Index: Double): IMetadataStructureSelector = js.native
  def Item(Index: Double, value: IMetadataStructureSelector): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

