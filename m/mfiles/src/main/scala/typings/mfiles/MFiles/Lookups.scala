package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ILookup
import typings.mfiles.ILookups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Lookups")
@js.native
class Lookups () extends ILookups {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, Lookup: ILookup): Unit = js.native
  /* CompleteClass */
  override def Clone(): ILookups = js.native
  /* CompleteClass */
  override def CloneFrom(Lookups: ILookups): Unit = js.native
  /* CompleteClass */
  override def GetLookupByItem(Item: Double): ILookup = js.native
  /* CompleteClass */
  override def GetLookupIndexByItem(Item: Double): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): ILookup = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.Lookups")
@js.native
object Lookups extends Instantiable0[ILookups]

