package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OCRPages")
@js.native
class OCRPages ()
  extends mfilesLib.IOCRPages {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, OCRPage: mfilesLib.IOCRPage): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IOCRPages = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IOCRPage = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.OCRPages")
@js.native
object OCRPages
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IOCRPages]

