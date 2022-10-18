package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.JavaActionParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.JavaScriptActionParameterMapping
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
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
  @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue")
  @js.native
  open class NanoflowParameterValue protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.nanoflows.NanoflowParameterValue {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NanoflowParameterValue {
    
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNanoflowsMod.nanoflows.NanoflowParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNanoflowsMod.nanoflows.NanoflowParameterValue]
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    /* static member */
    inline def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): typings.mendixmodelsdk.srcGenNanoflowsMod.nanoflows.NanoflowParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNanoflowsMod.nanoflows.NanoflowParameterValue]
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    /* static member */
    inline def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): typings.mendixmodelsdk.srcGenNanoflowsMod.nanoflows.NanoflowParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaScriptActionParameterMappingUnderParameterValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNanoflowsMod.nanoflows.NanoflowParameterValue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNanoflowsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNanoflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
