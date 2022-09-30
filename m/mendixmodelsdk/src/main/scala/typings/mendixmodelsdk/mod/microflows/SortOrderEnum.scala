package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.SortOrderEnum")
@js.native
open class SortOrderEnum protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.SortOrderEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SortOrderEnum {
  
  @JSImport("mendixmodelsdk", "microflows.SortOrderEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortOrderEnum.Ascending")
  @js.native
  def Ascending: typings.mendixmodelsdk.microflowsMod.microflows.SortOrderEnum = js.native
  inline def Ascending_=(x: typings.mendixmodelsdk.microflowsMod.microflows.SortOrderEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortOrderEnum.Descending")
  @js.native
  def Descending: typings.mendixmodelsdk.microflowsMod.microflows.SortOrderEnum = js.native
  inline def Descending_=(x: typings.mendixmodelsdk.microflowsMod.microflows.SortOrderEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
}
