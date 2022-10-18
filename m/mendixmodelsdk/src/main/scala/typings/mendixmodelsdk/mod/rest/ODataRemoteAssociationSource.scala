package typings.mendixmodelsdk.mod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationBase
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
@JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource")
@js.native
open class ODataRemoteAssociationSource protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.rest.ODataRemoteAssociationSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ODataRemoteAssociationSource {
  
  @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenRestMod.rest.ODataRemoteAssociationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.ODataRemoteAssociationSource]
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * The new ODataRemoteAssociationSource will be automatically stored in the 'source' property
    * of the parent domainmodels.AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  /* static member */
  inline def createIn(container: AssociationBase): typings.mendixmodelsdk.srcGenRestMod.rest.ODataRemoteAssociationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.ODataRemoteAssociationSource]
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
