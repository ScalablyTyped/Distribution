package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.restMod.rest.ConsumedODataService
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration")
@js.native
class HttpConfiguration protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def authenticationPassword: String = js.native
  def authenticationPassword_=(newValue: String): Unit = js.native
  
  def containerAsConsumedODataService: ConsumedODataService = js.native
  
  def containerAsRestCallAction: RestCallAction = js.native
  
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def customLocation: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def customLocationModel: Expression = js.native
  def customLocationModel_=(newValue: Expression): Unit = js.native
  
  /**
    * In version 6.6.0: introduced
    */
  def customLocationTemplate: StringTemplate | Null = js.native
  def customLocationTemplate_=(newValue: StringTemplate | Null): Unit = js.native
  
  def customLocation_=(newValue: String): Unit = js.native
  
  def headerEntries: IList[HttpHeaderEntry] = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def httpAuthenticationUserName: String = js.native
  def httpAuthenticationUserName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.7.0: deleted
    * In version 6.6.0: introduced
    */
  def httpMethod: HttpMethod = js.native
  def httpMethod_=(newValue: HttpMethod): Unit = js.native
  
  /**
    * In version 7.7.0: introduced
    */
  def newHttpMethod: typings.mendixmodelsdk.servicesMod.services.HttpMethod = js.native
  def newHttpMethod_=(newValue: typings.mendixmodelsdk.servicesMod.services.HttpMethod): Unit = js.native
  
  def overrideLocation: Boolean = js.native
  def overrideLocation_=(newValue: Boolean): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def password: Expression = js.native
  def password_=(newValue: Expression): Unit = js.native
  
  def useAuthentication: Boolean = js.native
  def useAuthentication_=(newValue: Boolean): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def username: Expression = js.native
  def username_=(newValue: Expression): Unit = js.native
}
object HttpConfiguration {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  /* static member */
  @scala.inline
  def createIn(container: WebServiceCallAction): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRestCallActionUnderHttpConfiguration(container: RestCallAction): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInWebServiceCallActionUnderHttpConfiguration(container: WebServiceCallAction): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
