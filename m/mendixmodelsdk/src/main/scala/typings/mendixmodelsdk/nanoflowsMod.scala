package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.CodeActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/nanoflows", JSImport.Namespace)
@js.native
object nanoflowsMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object nanoflows extends js.Object {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
      */
    /**
      * In version 8.4.0: introduced
      */
    @js.native
    class NanoflowParameterValue protected () extends CodeActionParameterValue {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def nanoflow: INanoflow | Null = js.native
      
      def nanoflowQualifiedName: String | Null = js.native
      
      def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
    }
    /* static members */
    @js.native
    object NanoflowParameterValue extends js.Object {
      
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): NanoflowParameterValue = js.native
      
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
        * of the parent microflows.JavaActionParameterMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.4.0 and higher
        */
      def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): NanoflowParameterValue = js.native
      
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
        * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.4.0 and higher
        */
      def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): NanoflowParameterValue = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
  }
}
