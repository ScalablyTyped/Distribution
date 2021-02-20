package typings.mendixmodelsdk.allModelClassesMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument")
@js.native
class PrimitiveTypedTemplateArgument protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.PrimitiveTypedTemplateArgument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PrimitiveTypedTemplateArgument {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PrimitiveTypedTemplateArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.PrimitiveTypedTemplateArgument = js.native
  
  /**
    * Creates and returns a new PrimitiveTypedTemplateArgument instance in the SDK and on the server.
    * The new PrimitiveTypedTemplateArgument will be automatically stored in the 'arguments' property
    * of the parent TypedTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.TypedTemplate): typings.mendixmodelsdk.microflowsMod.microflows.PrimitiveTypedTemplateArgument = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
