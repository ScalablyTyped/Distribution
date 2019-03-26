package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjVers")
@js.native
class ObjVers ()
  extends mfilesLib.IObjVers {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, ObjVer: mfilesLib.IObjVer): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IObjVers = js.native
  /* CompleteClass */
  override def GetAllDistinctObjIDs(): mfilesLib.IObjIDs = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IObjVer = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def ToJSON(): java.lang.String = js.native
}

