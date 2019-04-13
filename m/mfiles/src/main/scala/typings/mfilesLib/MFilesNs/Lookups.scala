package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Lookups")
@js.native
class Lookups ()
  extends mfilesLib.ILookups {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, Lookup: mfilesLib.ILookup): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ILookups = js.native
  /* CompleteClass */
  override def CloneFrom(Lookups: mfilesLib.ILookups): scala.Unit = js.native
  /* CompleteClass */
  override def GetLookupByItem(Item: scala.Double): mfilesLib.ILookup = js.native
  /* CompleteClass */
  override def GetLookupIndexByItem(Item: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.ILookup = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.Lookups")
@js.native
object Lookups
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ILookups]

