package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/document-templates relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplate because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DocumentTemplate")
@js.native
class DocumentTemplate protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def canvasWidth: Double = js.native
  def canvasWidth_=(newValue: Double): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MDocumentTemplate: FolderBase = js.native
  
  def footer: Footer | Null = js.native
  def footer_=(newValue: Footer | Null): Unit = js.native
  
  def header: Header | Null = js.native
  def header_=(newValue: Header | Null): Unit = js.native
  
  def marginBottomInInch: Double = js.native
  def marginBottomInInch_=(newValue: Double): Unit = js.native
  
  def marginLeftInInch: Double = js.native
  def marginLeftInInch_=(newValue: Double): Unit = js.native
  
  def marginRightInInch: Double = js.native
  def marginRightInInch_=(newValue: Double): Unit = js.native
  
  def marginTopInInch: Double = js.native
  def marginTopInInch_=(newValue: Double): Unit = js.native
  
  def pageHeight: String = js.native
  def pageHeight_=(newValue: String): Unit = js.native
  
  def pageWidth: String = js.native
  def pageWidth_=(newValue: String): Unit = js.native
  
  def ppi: Double = js.native
  def ppi_=(newValue: Double): Unit = js.native
  
  def showHeaderAndFooterOnFirstPage: Boolean = js.native
  def showHeaderAndFooterOnFirstPage_=(newValue: Boolean): Unit = js.native
  
  def style: Style = js.native
  def style_=(newValue: Style): Unit = js.native
  
  def toplevels: IList[Widget] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DocumentTemplate")
@js.native
object DocumentTemplate extends js.Object {
  
  /**
    * Creates a new DocumentTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): DocumentTemplate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
