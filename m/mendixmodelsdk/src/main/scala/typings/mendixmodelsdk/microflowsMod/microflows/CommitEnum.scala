package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitEnum")
@js.native
class CommitEnum protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object CommitEnum {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitEnum.No")
  @js.native
  def No: CommitEnum = js.native
  @scala.inline
  def No_=(x: CommitEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitEnum.Yes")
  @js.native
  def Yes: CommitEnum = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitEnum.YesWithoutEvents")
  @js.native
  def YesWithoutEvents: CommitEnum = js.native
  @scala.inline
  def YesWithoutEvents_=(x: CommitEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YesWithoutEvents")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Yes_=(x: CommitEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
}
