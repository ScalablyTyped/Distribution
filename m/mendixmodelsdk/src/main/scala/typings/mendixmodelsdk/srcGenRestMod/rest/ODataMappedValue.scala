package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MappedValue
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
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IValueType because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMappedValue because Already inherited
- typings.mendixmodelsdk.srcGenRestMod.rest.IODataMappedValue because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined filterable, sortable, representsStream */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataMappedValue")
@js.native
open class ODataMappedValue protected () extends MappedValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MODataMappedValue: Attribute = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def creatable: Boolean = js.native
  def creatable_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.16.0: introduced
    */
  def filterable: Boolean = js.native
  def filterable_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.16.0: introduced
    */
  @JSName("filterable")
  val filterable_FODataMappedValue: Boolean = js.native
  
  def remoteName: String = js.native
  def remoteName_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.15.0: introduced
    */
  def remoteType: String = js.native
  def remoteType_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def representsStream: Boolean = js.native
  def representsStream_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.11.0: introduced
    */
  @JSName("representsStream")
  val representsStream_FODataMappedValue: Boolean = js.native
  
  /**
    * In version 8.16.0: introduced
    */
  def sortable: Boolean = js.native
  def sortable_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.16.0: introduced
    */
  @JSName("sortable")
  val sortable_FODataMappedValue: Boolean = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def updatable: Boolean = js.native
  def updatable_=(newValue: Boolean): Unit = js.native
}
object ODataMappedValue {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataMappedValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataMappedValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ODataMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ODataMappedValue]
  
  /**
    * Creates and returns a new ODataMappedValue instance in the SDK and on the server.
    * The new ODataMappedValue will be automatically stored in the 'value' property
    * of the parent domainmodels.Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  /* static member */
  inline def createIn(container: Attribute): ODataMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ODataMappedValue]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataMappedValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataMappedValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
