package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
@js.native
abstract class DataMember protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsDataEntityBase: DataEntityBase = js.native
  
  def containerAsPublishedParameter: PublishedParameter = js.native
  
  def containerAsPublishedResource: PublishedResource = js.native
  
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  
  def isKey: Boolean = js.native
  def isKey_=(newValue: Boolean): Unit = js.native
  
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable: Boolean = js.native
  
  def isNillableByContract: Boolean = js.native
  def isNillableByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable_=(newValue: Boolean): Unit = js.native
  
  def isOptional: Boolean = js.native
  
  def isOptionalByContract: Boolean = js.native
  def isOptionalByContract_=(newValue: Boolean): Unit = js.native
  
  def isOptional_=(newValue: Boolean): Unit = js.native
}
object DataMember {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
