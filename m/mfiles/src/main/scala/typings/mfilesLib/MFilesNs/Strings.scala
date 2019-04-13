package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Strings")
@js.native
class Strings ()
  extends mfilesLib.IStrings {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, Item: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IStrings = js.native
  /* CompleteClass */
  override def CloneFrom(Strings: mfilesLib.IStrings): scala.Unit = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def Join(Separator: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.Strings")
@js.native
object Strings
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IStrings]

