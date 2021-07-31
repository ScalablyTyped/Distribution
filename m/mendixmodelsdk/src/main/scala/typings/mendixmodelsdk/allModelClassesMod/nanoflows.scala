package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nanoflows {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
    */
  /**
    * In version 8.4.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nanoflows.NanoflowParameterValue")
  @js.native
  class NanoflowParameterValue protected ()
    extends typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NanoflowParameterValue {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nanoflows.NanoflowParameterValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue]
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    /* static member */
    @scala.inline
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue]
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    /* static member */
    @scala.inline
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaScriptActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nanoflows.NanoflowParameterValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nanoflows.NanoflowParameterValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nanoflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nanoflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
