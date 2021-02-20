package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectCreationInfo extends StObject {
  
  var DisallowTemplateSelection: Boolean = js.native
  
  var ExplicitObjectID: Double = js.native
  
  def GetDisableObjectCreation(): Boolean = js.native
  
  def GetExtension(): String = js.native
  
  def GetMetadataCardTitle(): String = js.native
  
  def GetObjectType(): Double = js.native
  
  def GetSelectableFileClasses(): IFileClasses = js.native
  
  def GetSelectedFileClass(): IFileClass = js.native
  
  def GetSingleFileDocument(): Boolean = js.native
  
  def GetSourceFiles(): ISourceObjectFiles = js.native
  
  def GetTemplate(): IObjVer = js.native
  
  def GetTitle(): ITypedValue = js.native
  
  def GetTitleAsText(): String = js.native
  
  def GetUseAsDefaults(): Boolean = js.native
  
  var IsObjectShortcut: Boolean = js.native
  
  var ObjectGUID: String = js.native
  
  var OkToAllButtonVisible: Boolean = js.native
  
  def SetDisableObjectCreation(Disable: Boolean): Unit = js.native
  
  def SetExtension(Extension: String, Editable: Boolean): Unit = js.native
  
  def SetMetadataCardTitle(MetadataCardTitle: String): Unit = js.native
  
  def SetObjectType(ObjectType: Double, Editable: Boolean): Unit = js.native
  def SetObjectType(ObjectType: MFBuiltInObjectType, Editable: Boolean): Unit = js.native
  
  def SetSelectableFileClasses(FileClasses: IFileClasses): Unit = js.native
  
  def SetSelectedFileClass(FileClass: IFileClass, Editable: Boolean): Unit = js.native
  
  def SetSingleFileDocument(SingleFile: Boolean, Editable: Boolean): Unit = js.native
  
  def SetSourceFiles(SourceFiles: ISourceObjectFiles): Unit = js.native
  
  def SetTemplate(Template: IObjVer): Unit = js.native
  
  def SetTitle(Title: ITypedValue, Editable: Boolean): Unit = js.native
  
  def SetTitleAsDatatypeText(Title: String, Editable: Boolean): Unit = js.native
  
  def SetUseAsDefaults(UseAsDefaults: Boolean, Editable: Boolean): Unit = js.native
  
  var SkipThisButtonVisible: Boolean = js.native
}
