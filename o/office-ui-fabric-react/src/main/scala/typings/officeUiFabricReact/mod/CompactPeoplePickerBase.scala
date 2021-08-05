package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.CreateGenericItem
import typings.officeUiFabricReact.peoplePickerMod.IPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "CompactPeoplePickerBase")
@js.native
class CompactPeoplePickerBase protected ()
  extends typings.officeUiFabricReact.libPickersMod.CompactPeoplePickerBase {
  def this(basePickerProps: IPeoplePickerProps) = this()
}
/* static members */
object CompactPeoplePickerBase {
  
  @JSImport("office-ui-fabric-react", "CompactPeoplePickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default props for CompactPeoplePicker. */
  @JSImport("office-ui-fabric-react", "CompactPeoplePickerBase.defaultProps")
  @js.native
  def defaultProps: CreateGenericItem = js.native
  inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
