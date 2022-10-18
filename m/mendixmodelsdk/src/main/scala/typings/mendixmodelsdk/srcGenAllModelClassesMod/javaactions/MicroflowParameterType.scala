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
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.MicroflowParameterType")
@js.native
open class MicroflowParameterType protected ()
  extends typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.MicroflowParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowParameterType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.MicroflowParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.MicroflowParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.MicroflowParameterType]
  
  /**
    * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
    * The new MicroflowParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.20.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.JavaActionParameter): typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.MicroflowParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.MicroflowParameterType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.MicroflowParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.MicroflowParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
