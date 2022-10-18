package typings.mendixmodelsdk.mod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.DateTimeType")
@js.native
open class DateTimeType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.codeactions.DateTimeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DateTimeType {
  
  @JSImport("mendixmodelsdk", "codeactions.DateTimeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DateTimeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.DateTimeType]
  
  /**
    * Creates and returns a new DateTimeType instance in the SDK and on the server.
    * The new DateTimeType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.BasicParameterType): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.DateTimeType]
  
  /**
    * Creates and returns a new DateTimeType instance in the SDK and on the server.
    * The new DateTimeType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderActionReturnType(container: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeAction): typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.DateTimeType]
  
  /* static member */
  @JSImport("mendixmodelsdk", "codeactions.DateTimeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "codeactions.DateTimeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
