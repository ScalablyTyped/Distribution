package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
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
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenRestMod.rest.IInteractiveRestOperation because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsInteractiveRestCollection, name, parameters */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.InteractiveRestOperation")
@js.native
open class InteractiveRestOperation protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def authentication: IAuthentication | Null = js.native
  
  def authenticationQualifiedName: String | Null = js.native
  
  def authentication_=(newValue: IAuthentication | Null): Unit = js.native
  
  def containerAsInteractiveRestCollection: InteractiveRestCollection = js.native
  @JSName("containerAsInteractiveRestCollection")
  val containerAsInteractiveRestCollection_FInteractiveRestOperation: IInteractiveRestCollection = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.23.0: introduced
    */
  def headers: IList[HttpHeader] = js.native
  
  def httpBody: String = js.native
  def httpBody_=(newValue: String): Unit = js.native
  
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FInteractiveRestOperation: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  def parameters: IList[OperationParameter] = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSName("parameters")
  val parameters_FInteractiveRestOperation: IList[IOperationParameter] = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  def path: ParameterizedValue = js.native
  def path_=(newValue: ParameterizedValue): Unit = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MInteractiveRestOperation: String | Null = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.23.0: introduced
    */
  def requestHandling: RequestHandling | Null = js.native
  def requestHandling_=(newValue: RequestHandling | Null): Unit = js.native
  
  /**
    * In version 9.24.0: deleted
    */
  def url: String = js.native
  def url_=(newValue: String): Unit = js.native
}
object InteractiveRestOperation {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.InteractiveRestOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new InteractiveRestOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): InteractiveRestOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[InteractiveRestOperation]
  
  /**
    * Creates and returns a new InteractiveRestOperation instance in the SDK and on the server.
    * The new InteractiveRestOperation will be automatically stored in the 'interactiveRestOperations' property
    * of the parent InteractiveRestCollection element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createIn(container: InteractiveRestCollection): InteractiveRestOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[InteractiveRestOperation]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.InteractiveRestOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.InteractiveRestOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
