package typings.mendixmodelsdk.srcGenAllModelClassesMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/interactive-rest relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.22.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRestOperation")
@js.native
open class InteractiveRestOperation protected ()
  extends typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object InteractiveRestOperation {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRestOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new InteractiveRestOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation]
  
  /**
    * Creates and returns a new InteractiveRestOperation instance in the SDK and on the server.
    * The new InteractiveRestOperation will be automatically stored in the 'interactiveRestOperations' property
    * of the parent InteractiveRestCollection element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestCollection): typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRestOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRestOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
