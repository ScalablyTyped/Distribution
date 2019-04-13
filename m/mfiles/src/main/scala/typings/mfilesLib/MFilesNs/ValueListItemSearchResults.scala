package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ValueListItemSearchResults")
@js.native
class ValueListItemSearchResults ()
  extends mfilesLib.IValueListItemSearchResults {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override var MoreResults: scala.Boolean = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, ValueListItem: mfilesLib.IValueListItem): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IValueListItemSearchResults = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IValueListItem = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.ValueListItemSearchResults")
@js.native
object ValueListItemSearchResults
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IValueListItemSearchResults]

