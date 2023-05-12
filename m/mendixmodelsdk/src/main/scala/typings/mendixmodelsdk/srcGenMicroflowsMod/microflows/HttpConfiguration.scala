package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService
import typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRest
import typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpConfiguration")
@js.native
open class HttpConfiguration protected () extends Element[IModel] {
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
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.18.0: introduced
    */
  def clientCertificate: String = js.native
  def clientCertificate_=(newValue: String): Unit = js.native
  
  def containerAsConsumedODataService: ConsumedODataService = js.native
  
  def containerAsInteractiveRest: InteractiveRest = js.native
  
  def containerAsInteractiveRestOperation: InteractiveRestOperation = js.native
  
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
    * In version 9.8.0: deleted
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
  def newHttpMethod: typings.mendixmodelsdk.srcGenServicesMod.services.HttpMethod = js.native
  def newHttpMethod_=(newValue: typings.mendixmodelsdk.srcGenServicesMod.services.HttpMethod): Unit = js.native
  
  def overrideLocation: Boolean = js.native
  def overrideLocation_=(newValue: Boolean): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.8.0: deleted
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
    * In version 9.8.0: deleted
    * In version 7.9.0: introduced
    */
  def username: Expression = js.native
  def username_=(newValue: Expression): Unit = js.native
}
object HttpConfiguration {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  /* static member */
  inline def createIn(container: WebServiceCallAction): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.InteractiveRestOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createInInteractiveRestOperationUnderHttpConfiguration(container: InteractiveRestOperation): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInteractiveRestOperationUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.InteractiveRest element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.18.0 to 9.22.0
    */
  /* static member */
  inline def createInInteractiveRestUnderHttpConfiguration(container: InteractiveRest): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInteractiveRestUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderHttpConfiguration(container: RestCallAction): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderHttpConfiguration(container: WebServiceCallAction): HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[HttpConfiguration]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpConfiguration.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpConfiguration.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
