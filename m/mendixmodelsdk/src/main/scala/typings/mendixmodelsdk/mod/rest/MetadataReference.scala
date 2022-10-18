package typings.mendixmodelsdk.mod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenKafkaMod.kafka.ConsumedKafkaService
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
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.MetadataReference")
@js.native
open class MetadataReference protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.rest.MetadataReference {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MetadataReference {
  
  @JSImport("mendixmodelsdk", "rest.MetadataReference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 to 8.7.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService): typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent kafka.ConsumedKafkaService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  /* static member */
  inline def createInConsumedKafkaServiceUnderMetadataReferences(container: ConsumedKafkaService): typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedKafkaServiceUnderMetadataReferences")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInConsumedODataServiceUnderMetadataReferences(container: typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService): typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderMetadataReferences")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent MetadataReference element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInMetadataReferenceUnderMetadataReferences(container: typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference): typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMetadataReferenceUnderMetadataReferences")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference]
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.MetadataReference.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.MetadataReference.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
