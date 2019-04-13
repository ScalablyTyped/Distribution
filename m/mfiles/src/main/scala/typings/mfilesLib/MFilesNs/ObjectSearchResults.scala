package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectSearchResults")
@js.native
class ObjectSearchResults ()
  extends mfilesLib.IObjectSearchResults {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override val MoreResults: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IObjectSearchResults = js.native
  /* CompleteClass */
  override def GetAsObjectVersions(): mfilesLib.IObjectVersions = js.native
  /* CompleteClass */
  override def GetScoreOfObject(ObjVer: mfilesLib.IObjVer): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IObjectVersion = js.native
  /* CompleteClass */
  override def ScoreAt(Index: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def Sort(ObjectComparer: mfilesLib.IObjectComparer): scala.Unit = js.native
  /* CompleteClass */
  override def SortByScore(Ascending: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("MFiles.ObjectSearchResults")
@js.native
object ObjectSearchResults
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IObjectSearchResults]

