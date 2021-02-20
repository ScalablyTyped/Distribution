package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/cors-settings relevant section in reference guide}
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration")
@js.native
class CorsConfiguration protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def allowAuthentication: Boolean = js.native
  def allowAuthentication_=(newValue: Boolean): Unit = js.native
  
  def allowedOrigins: IConstant | Null = js.native
  
  def allowedOriginsQualifiedName: String | Null = js.native
  
  def allowedOrigins_=(newValue: IConstant | Null): Unit = js.native
  
  def containerAsPublishedRestService: PublishedRestService = js.native
  
  def maxAge: IConstant | Null = js.native
  
  def maxAgeQualifiedName: String | Null = js.native
  
  def maxAge_=(newValue: IConstant | Null): Unit = js.native
}
object CorsConfiguration {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration.create")
  @js.native
  def create(model: IModel): CorsConfiguration = js.native
  
  /**
    * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
    * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration.createIn")
  @js.native
  def createIn(container: PublishedRestService): CorsConfiguration = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
