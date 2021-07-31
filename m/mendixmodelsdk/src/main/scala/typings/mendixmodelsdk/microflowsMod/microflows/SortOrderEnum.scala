package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortOrderEnum")
@js.native
class SortOrderEnum protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SortOrderEnum {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortOrderEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortOrderEnum.Ascending")
  @js.native
  def Ascending: SortOrderEnum = js.native
  @scala.inline
  def Ascending_=(x: SortOrderEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortOrderEnum.Descending")
  @js.native
  def Descending: SortOrderEnum = js.native
  @scala.inline
  def Descending_=(x: SortOrderEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
}
