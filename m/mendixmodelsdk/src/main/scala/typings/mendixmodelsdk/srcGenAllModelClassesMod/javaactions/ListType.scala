package typings.mendixmodelsdk.srcGenAllModelClassesMod.javaactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ListType")
@js.native
open class ListType protected ()
  extends typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ListType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ListType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType]
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.BasicParameterType): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType]
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  /* static member */
  inline def createInJavaActionParameterUnderJavaType(container: typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.JavaActionParameter): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterUnderJavaType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType]
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  inline def createInJavaActionUnderJavaReturnType(container: typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.JavaAction): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionUnderJavaReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.ListType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ListType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.ListType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
