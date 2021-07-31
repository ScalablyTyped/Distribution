package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling")
@js.native
class SimpleRequestHandling protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.SimpleRequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object SimpleRequestHandling {
  
  @JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRestCallActionUnderRequestHandling(container: typings.mendixmodelsdk.microflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderRequestHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typings.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestBodyHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typings.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestHeaderHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
