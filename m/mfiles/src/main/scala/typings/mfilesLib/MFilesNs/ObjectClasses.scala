package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectClasses")
@js.native
class ObjectClasses ()
  extends mfilesLib.IObjectClasses {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, ObjectClass: mfilesLib.IObjectClass): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IObjectClasses = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IObjectClass = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.ObjectClasses")
@js.native
object ObjectClasses
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IObjectClasses]

