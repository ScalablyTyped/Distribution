package typings.mendixmodelsdk.srcGenAllModelClassesMod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.3.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.VoidType")
@js.native
open class VoidType protected ()
  extends typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object VoidType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.VoidType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType]
  
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.BasicParameterType): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType]
  
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderActionReturnType(container: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeAction): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.VoidType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.VoidType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "codeactions.VoidType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
