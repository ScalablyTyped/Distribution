package typings.mendixmodelsdk.mod.rest

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
  * In version 9.11.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.CallMicroflowToChange")
@js.native
open class CallMicroflowToChange protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.rest.CallMicroflowToChange {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object CallMicroflowToChange {
  
  @JSImport("mendixmodelsdk", "rest.CallMicroflowToChange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CallMicroflowToChange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange]
  
  /**
    * Creates and returns a new CallMicroflowToChange instance in the SDK and on the server.
    * The new CallMicroflowToChange will be automatically stored in the 'deleteMode' property
    * of the parent PublishedRestResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInPublishedRestResourceUnderDeleteMode(container: typings.mendixmodelsdk.srcGenRestMod.rest.PublishedRestResource): typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedRestResourceUnderDeleteMode")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange]
  
  /**
    * Creates and returns a new CallMicroflowToChange instance in the SDK and on the server.
    * The new CallMicroflowToChange will be automatically stored in the 'insertMode' property
    * of the parent PublishedRestResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInPublishedRestResourceUnderInsertMode(container: typings.mendixmodelsdk.srcGenRestMod.rest.PublishedRestResource): typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedRestResourceUnderInsertMode")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange]
  
  /**
    * Creates and returns a new CallMicroflowToChange instance in the SDK and on the server.
    * The new CallMicroflowToChange will be automatically stored in the 'updateMode' property
    * of the parent PublishedRestResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInPublishedRestResourceUnderUpdateMode(container: typings.mendixmodelsdk.srcGenRestMod.rest.PublishedRestResource): typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedRestResourceUnderUpdateMode")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.CallMicroflowToChange]
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.CallMicroflowToChange.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.CallMicroflowToChange.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
