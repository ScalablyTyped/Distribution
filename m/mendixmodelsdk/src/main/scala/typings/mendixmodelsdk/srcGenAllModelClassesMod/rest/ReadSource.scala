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
  * In version 9.14.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ReadSource")
@js.native
open class ReadSource protected ()
  extends typings.mendixmodelsdk.srcGenRestMod.rest.ReadSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ReadSource {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ReadSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ReadSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenRestMod.rest.ReadSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.ReadSource]
  
  /**
    * Creates and returns a new ReadSource instance in the SDK and on the server.
    * The new ReadSource will be automatically stored in the 'readMode' property
    * of the parent PublishedRestResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.14.0 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenRestMod.rest.PublishedRestResource): typings.mendixmodelsdk.srcGenRestMod.rest.ReadSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.ReadSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ReadSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ReadSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
