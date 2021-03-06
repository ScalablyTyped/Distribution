package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.codeactions.CodeActionParameter
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IParameterType because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IImportMappingJavaActionParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingJavaActionParameterType")
@js.native
class ImportMappingJavaActionParameterType protected ()
  extends typings.mendixmodelsdk.codeactionsMod.codeactions.ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsCodeActionParameter")
  def containerAsCodeActionParameter_MImportMappingJavaActionParameterType: CodeActionParameter = js.native
}
object ImportMappingJavaActionParameterType {
  
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingJavaActionParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ImportMappingJavaActionParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingJavaActionParameterType.create")
  @js.native
  def create(model: IModel): ImportMappingJavaActionParameterType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingJavaActionParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingJavaActionParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
