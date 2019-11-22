package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaActionParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaScriptActionParameterMapping
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nanoflows")
@js.native
object nanoflows extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
    */
  /**
    * In version 8.4.0: introduced
    */
  @js.native
  class NanoflowParameterValue protected ()
    extends typings.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object NanoflowParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNanoflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): typings.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): typings.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue = js.native
  }
  
}

