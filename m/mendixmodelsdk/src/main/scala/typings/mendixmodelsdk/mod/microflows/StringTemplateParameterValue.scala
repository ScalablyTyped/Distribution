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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.5.0: removed experimental
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue")
@js.native
class StringTemplateParameterValue protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.StringTemplateParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringTemplateParameterValue {
  
  @JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue = js.native
  
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * The new StringTemplateParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue.createInJavaActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue = js.native
  
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * The new StringTemplateParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue.createInJavaScriptActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplateParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
