package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CreateGenericItem
import typings.officeUiFabricReact.anon.IGenericItemkeyKey
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerProps
import typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import typings.officeUiFabricReact.libComponentsPickersBasePickerMod.BasePicker
import typings.officeUiFabricReact.libComponentsPickersBasePickerMod.BasePickerListBelow
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPickersPeoplePickerPeoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "BasePeoplePicker")
  @js.native
  open class BasePeoplePicker protected () extends BasePicker[IPersonaProps, IPeoplePickerProps] {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePicker")
  @js.native
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePickerBase")
  @js.native
  open class CompactPeoplePickerBase protected () extends BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object CompactPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for CompactPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePicker")
  @js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePickerBase")
  @js.native
  open class ListPeoplePickerBase protected () extends MemberListPeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object ListPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for ListPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "MemberListPeoplePicker")
  @js.native
  open class MemberListPeoplePicker protected () extends BasePickerListBelow[IPersonaProps, IPeoplePickerProps] {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePicker")
  @js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePickerBase")
  @js.native
  open class NormalPeoplePickerBase protected () extends BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object NormalPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for NormalPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericItem")(name.asInstanceOf[js.Any], currentValidationState.asInstanceOf[js.Any])).asInstanceOf[IGenericItemkeyKey]
  
  trait IGenericItem extends StObject {
    
    var ValidationState: typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
    
    var imageInitials: String
    
    var primaryText: String
  }
  object IGenericItem {
    
    inline def apply(ValidationState: ValidationState, imageInitials: String, primaryText: String): IGenericItem = {
      val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGenericItem]
    }
    
    extension [Self <: IGenericItem](x: Self) {
      
      inline def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
      
      inline def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      inline def setValidationState(value: ValidationState): Self = StObject.set(x, "ValidationState", value.asInstanceOf[js.Any])
    }
  }
  
  type IPeoplePickerProps = IBasePickerProps[IPersonaProps]
}
