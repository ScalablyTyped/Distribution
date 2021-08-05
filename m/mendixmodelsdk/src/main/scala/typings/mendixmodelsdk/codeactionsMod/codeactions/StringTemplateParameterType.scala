package typings.mendixmodelsdk.codeactionsMod.codeactions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.5.0: removed experimental
  * In version 8.4.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IParameterType because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IStringTemplateParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined grammar */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType")
@js.native
class StringTemplateParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsCodeActionParameter")
  def containerAsCodeActionParameter_MStringTemplateParameterType: CodeActionParameter = js.native
  
  /**
    * In version 8.8.0: introduced
    */
  def grammar: StringTemplateParameterGrammar = js.native
  def grammar_=(newValue: StringTemplateParameterGrammar): Unit = js.native
  /**
    * In version 8.8.0: introduced
    */
  @JSName("grammar")
  val grammar_FStringTemplateParameterType: StringTemplateParameterGrammar = js.native
}
object StringTemplateParameterType {
  
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplateParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): StringTemplateParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[StringTemplateParameterType]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
