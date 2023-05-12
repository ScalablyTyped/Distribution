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
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.23.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.StringWithParameters")
@js.native
open class StringWithParameters protected ()
  extends typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringWithParameters {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.StringWithParameters")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringWithParameters instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters]
  
  /**
    * Creates and returns a new StringWithParameters instance in the SDK and on the server.
    * The new StringWithParameters will be automatically stored in the 'value' property
    * of the parent HttpHeader element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.23.0 to 9.23.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenRestMod.rest.HttpHeader): typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters]
  
  /**
    * Creates and returns a new StringWithParameters instance in the SDK and on the server.
    * The new StringWithParameters will be automatically stored in the 'value' property
    * of the parent HttpHeader element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.23.0 and higher
    */
  /* static member */
  inline def createInHttpHeaderUnderValue(container: typings.mendixmodelsdk.srcGenRestMod.rest.HttpHeader): typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpHeaderUnderValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters]
  
  /**
    * Creates and returns a new StringWithParameters instance in the SDK and on the server.
    * The new StringWithParameters will be automatically stored in the 'path' property
    * of the parent InteractiveRestOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInInteractiveRestOperationUnderPath(container: typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation): typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInteractiveRestOperationUnderPath")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.StringWithParameters]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.StringWithParameters.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.StringWithParameters.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
