package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
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
  * In version 7.19.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowParameterBase because Already inherited
- typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.INanoflowParameter because var conflicts: containerAsMicroflow, containerAsRule, id, isLoaded, model, name, parameterType, qualifiedName, structureTypeName, `type`, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NanoflowParameter")
@js.native
open class NanoflowParameter protected () extends MicroflowParameterBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NanoflowParameter {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NanoflowParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NanoflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): NanoflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NanoflowParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NanoflowParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NanoflowParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
