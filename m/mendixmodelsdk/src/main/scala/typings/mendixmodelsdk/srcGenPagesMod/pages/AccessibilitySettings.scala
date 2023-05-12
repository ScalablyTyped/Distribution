package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Pages`.
  */
/**
  * In version 9.22.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.AccessibilitySettings")
@js.native
open class AccessibilitySettings protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.24.0: deleted
    */
  def accessible: Boolean = js.native
  def accessible_=(newValue: Boolean): Unit = js.native
  
  def containerAsActionButton: ActionButton = js.native
  
  def containerAsCheckBox: CheckBox = js.native
  
  def containerAsConditionallyVisibleWidget: ConditionallyVisibleWidget = js.native
  
  def containerAsDatePicker: DatePicker = js.native
  
  def containerAsDivContainer: DivContainer = js.native
  
  def containerAsDropDown: DropDown = js.native
  
  def containerAsDynamicImageViewer: DynamicImageViewer = js.native
  
  def containerAsDynamicText: DynamicText = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  def containerAsStaticImageViewer: StaticImageViewer = js.native
  
  def containerAsTextArea: TextArea = js.native
  
  def containerAsTextBox: TextBox = js.native
  
  def containerAsTitle: Title = js.native
  
  def screenReaderDescription: ClientTemplate = js.native
  def screenReaderDescription_=(newValue: ClientTemplate): Unit = js.native
  
  def screenReaderTitle: ClientTemplate = js.native
  def screenReaderTitle_=(newValue: ClientTemplate): Unit = js.native
}
object AccessibilitySettings {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.AccessibilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'accessibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 to 9.23.0
    */
  /* static member */
  inline def createIn(container: ConditionallyVisibleWidget): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInActionButtonUnderNativeAccessibilitySettings(container: ActionButton): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent CheckBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInCheckBoxUnderNativeAccessibilitySettings(container: CheckBox): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCheckBoxUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'accessibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 to 9.23.0
    */
  /* static member */
  inline def createInConditionallyVisibleWidgetUnderAccessibilitySettings(container: ConditionallyVisibleWidget): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionallyVisibleWidgetUnderAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent DatePicker element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInDatePickerUnderNativeAccessibilitySettings(container: DatePicker): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatePickerUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderNativeAccessibilitySettings(container: DivContainer): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent DropDown element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInDropDownUnderNativeAccessibilitySettings(container: DropDown): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderNativeAccessibilitySettings(container: DynamicImageViewer): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent DynamicText element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInDynamicTextUnderNativeAccessibilitySettings(container: DynamicText): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicTextUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent ReferenceSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInReferenceSelectorUnderNativeAccessibilitySettings(container: ReferenceSelector): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderNativeAccessibilitySettings(container: StaticImageViewer): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent TextArea element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInTextAreaUnderNativeAccessibilitySettings(container: TextArea): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInTextBoxUnderNativeAccessibilitySettings(container: TextBox): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /**
    * Creates and returns a new AccessibilitySettings instance in the SDK and on the server.
    * The new AccessibilitySettings will be automatically stored in the 'nativeAccessibilitySettings' property
    * of the parent Title element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInTitleUnderNativeAccessibilitySettings(container: Title): AccessibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTitleUnderNativeAccessibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[AccessibilitySettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.AccessibilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.AccessibilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
