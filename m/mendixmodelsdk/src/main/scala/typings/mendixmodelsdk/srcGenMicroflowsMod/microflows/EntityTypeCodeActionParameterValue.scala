package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.EntityTypeCodeActionParameterValue")
@js.native
open class EntityTypeCodeActionParameterValue protected () extends ExpressionBasedCodeActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
}
object EntityTypeCodeActionParameterValue {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.EntityTypeCodeActionParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): EntityTypeCodeActionParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EntityTypeCodeActionParameterValue]
  
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): EntityTypeCodeActionParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[EntityTypeCodeActionParameterValue]
  
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): EntityTypeCodeActionParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaScriptActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[EntityTypeCodeActionParameterValue]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.EntityTypeCodeActionParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.EntityTypeCodeActionParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
