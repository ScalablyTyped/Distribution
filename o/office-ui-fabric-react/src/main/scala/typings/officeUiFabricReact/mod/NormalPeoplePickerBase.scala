package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.CreateGenericItem
import typings.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "NormalPeoplePickerBase")
@js.native
open class NormalPeoplePickerBase protected ()
  extends typings.officeUiFabricReact.libPickersMod.NormalPeoplePickerBase {
  def this(basePickerProps: IPeoplePickerProps) = this()
}
/* static members */
object NormalPeoplePickerBase {
  
  @JSImport("office-ui-fabric-react", "NormalPeoplePickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default props for NormalPeoplePicker. */
  @JSImport("office-ui-fabric-react", "NormalPeoplePickerBase.defaultProps")
  @js.native
  def defaultProps: CreateGenericItem = js.native
  inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
