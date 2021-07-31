package typings.mendixmodelsdk.allModelClassesMod.javaactions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaActionParameter")
@js.native
class JavaActionParameter protected ()
  extends typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object JavaActionParameter {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaActionParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter]
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
    * of the parent codeactions.CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @scala.inline
  def createInCodeActionUnderActionParameters(container: CodeAction): typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionParameters")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter]
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'parameters' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.20.0
    */
  /* static member */
  @scala.inline
  def createInJavaActionUnderParameters(container: typings.mendixmodelsdk.javaactionsMod.javaactions.JavaAction): typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaActionParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaActionParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
