package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.rest.ODataKeyPart
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 6.0.0: deprecated
  */
@JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType")
@js.native
class CurrencyAttributeType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.CurrencyAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object CurrencyAttributeType {
  
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.CurrencyAttributeType = js.native
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.domainmodelsMod.domainmodels.CurrencyAttributeType = js.native
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.createInAttributeUnderType")
  @js.native
  def createInAttributeUnderType(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.domainmodelsMod.domainmodels.CurrencyAttributeType = js.native
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.createInEntityKeyPartUnderType")
  @js.native
  def createInEntityKeyPartUnderType(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart): typings.mendixmodelsdk.domainmodelsMod.domainmodels.CurrencyAttributeType = js.native
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.createInODataKeyPartUnderType")
  @js.native
  def createInODataKeyPartUnderType(container: ODataKeyPart): typings.mendixmodelsdk.domainmodelsMod.domainmodels.CurrencyAttributeType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
