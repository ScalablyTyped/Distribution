package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Certificate")
@js.native
class Certificate protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsCertificateSettings: CertificateSettings = js.native
  
  def data: String | Null = js.native
  def data_=(newValue: String | Null): Unit = js.native
  
  def `type`: CertificateType = js.native
  def type_=(newValue: CertificateType): Unit = js.native
}
object Certificate {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Certificate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Certificate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Certificate]
  
  /**
    * Creates and returns a new Certificate instance in the SDK and on the server.
    * The new Certificate will be automatically stored in the 'certificates' property
    * of the parent CertificateSettings element passed as argument.
    */
  /* static member */
  inline def createIn(container: CertificateSettings): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Certificate]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Certificate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Certificate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
