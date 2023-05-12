package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.IEnumerationValue
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.21.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataEnumerationValue")
@js.native
open class PublishedODataEnumerationValue protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsPublishedODataEnumeration: PublishedODataEnumeration = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def enumerationValue: IEnumerationValue = js.native
  
  def enumerationValueQualifiedName: String = js.native
  
  def enumerationValue_=(newValue: IEnumerationValue): Unit = js.native
  
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
}
object PublishedODataEnumerationValue {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataEnumerationValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedODataEnumerationValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PublishedODataEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedODataEnumerationValue]
  
  /**
    * Creates and returns a new PublishedODataEnumerationValue instance in the SDK and on the server.
    * The new PublishedODataEnumerationValue will be automatically stored in the 'values' property
    * of the parent PublishedODataEnumeration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createIn(container: PublishedODataEnumeration): PublishedODataEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedODataEnumerationValue]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataEnumerationValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataEnumerationValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
