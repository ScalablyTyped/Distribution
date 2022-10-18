package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
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
@JSImport("mendixmodelsdk", "pages.NanoflowParameterMapping")
@js.native
open class NanoflowParameterMapping protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.NanoflowParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NanoflowParameterMapping {
  
  @JSImport("mendixmodelsdk", "pages.NanoflowParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping]
  
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * The new NanoflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  inline def createInCallNanoflowClientActionUnderParameterMappings(container: typings.mendixmodelsdk.srcGenPagesMod.pages.CallNanoflowClientAction): typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderParameterMappings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping]
  
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * The new NanoflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent NanoflowSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  inline def createInNanoflowSourceUnderParameterMappings(container: typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowSource): typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowSourceUnderParameterMappings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.NanoflowParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.NanoflowParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
