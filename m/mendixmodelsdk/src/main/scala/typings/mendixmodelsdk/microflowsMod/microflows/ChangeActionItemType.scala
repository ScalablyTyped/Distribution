package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ChangeActionItemType")
@js.native
open class ChangeActionItemType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ChangeActionItemType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ChangeActionItemType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ChangeActionItemType.Add")
  @js.native
  def Add: ChangeActionItemType = js.native
  inline def Add_=(x: ChangeActionItemType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Add")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ChangeActionItemType.Remove")
  @js.native
  def Remove: ChangeActionItemType = js.native
  inline def Remove_=(x: ChangeActionItemType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Remove")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ChangeActionItemType.Set")
  @js.native
  def Set: ChangeActionItemType = js.native
  inline def Set_=(x: ChangeActionItemType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Set")(x.asInstanceOf[js.Any])
}
