package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.restMod.rest.IODataKey because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsODataRemoteEntitySource, parts */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataKey")
@js.native
class ODataKey protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsODataRemoteEntitySource: ODataRemoteEntitySource = js.native
  @JSName("containerAsODataRemoteEntitySource")
  val containerAsODataRemoteEntitySource_FODataKey: IODataRemoteEntitySource = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def parts: IList[ODataKeyPart] = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  @JSName("parts")
  val parts_FODataKey: IList[IODataKeyPart] = js.native
}
object ODataKey {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataKey")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataKey instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): ODataKey = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ODataKey]
  
  /**
    * Creates and returns a new ODataKey instance in the SDK and on the server.
    * The new ODataKey will be automatically stored in the 'key' property
    * of the parent ODataRemoteEntitySource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: ODataRemoteEntitySource): ODataKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ODataKey]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataKey.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataKey.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
