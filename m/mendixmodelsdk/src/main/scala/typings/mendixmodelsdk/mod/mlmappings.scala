package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mlmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/ml-mapping-documents relevant section in reference guide}
    *
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk", "mlmappings.MLMappingDocument")
  @js.native
  open class MLMappingDocument protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mlmappings.MLMappingDocument {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MLMappingDocument {
    
    @JSImport("mendixmodelsdk", "mlmappings.MLMappingDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MLMappingDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLMappingDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLMappingDocument]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.MLMappingDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.MLMappingDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk", "mlmappings.MLModelEntityMappings")
  @js.native
  open class MLModelEntityMappings protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mlmappings.MLModelEntityMappings {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MLModelEntityMappings {
    
    @JSImport("mendixmodelsdk", "mlmappings.MLModelEntityMappings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings]
    
    /**
      * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
      * The new MLModelEntityMappings will be automatically stored in the 'input' property
      * of the parent MLModelMappings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInMLModelMappingsUnderInput(container: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelMappings): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelMappingsUnderInput")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings]
    
    /**
      * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
      * The new MLModelEntityMappings will be automatically stored in the 'output' property
      * of the parent MLModelMappings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInMLModelMappingsUnderOutput(container: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelMappings): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelMappingsUnderOutput")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.MLModelEntityMappings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.MLModelEntityMappings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk", "mlmappings.MLModelMappings")
  @js.native
  open class MLModelMappings protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mlmappings.MLModelMappings {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MLModelMappings {
    
    @JSImport("mendixmodelsdk", "mlmappings.MLModelMappings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MLModelMappings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelMappings]
    
    /**
      * Creates and returns a new MLModelMappings instance in the SDK and on the server.
      * The new MLModelMappings will be automatically stored in the 'mlModelMappings' property
      * of the parent MLMappingDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLMappingDocument): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelMappings]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.MLModelMappings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.MLModelMappings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk", "mlmappings.TensorDimension")
  @js.native
  open class TensorDimension protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mlmappings.TensorDimension {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object TensorDimension {
    
    @JSImport("mendixmodelsdk", "mlmappings.TensorDimension")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new TensorDimension instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorDimension]
    
    /**
      * Creates and returns a new TensorDimension instance in the SDK and on the server.
      * The new TensorDimension will be automatically stored in the 'attributeShape' property
      * of the parent TensorMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInTensorMappingElementUnderAttributeShape(container: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderAttributeShape")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorDimension]
    
    /**
      * Creates and returns a new TensorDimension instance in the SDK and on the server.
      * The new TensorDimension will be automatically stored in the 'tensorShape' property
      * of the parent TensorMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInTensorMappingElementUnderTensorShape(container: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderTensorShape")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorDimension]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorDimension.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorDimension.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk", "mlmappings.TensorMappingElement")
  @js.native
  open class TensorMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mlmappings.TensorMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object TensorMappingElement {
    
    @JSImport("mendixmodelsdk", "mlmappings.TensorMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new TensorMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement]
    
    /**
      * Creates and returns a new TensorMappingElement instance in the SDK and on the server.
      * The new TensorMappingElement will be automatically stored in the 'mappings' property
      * of the parent MLModelEntityMappings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.MLModelEntityMappings): typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mlmappings.TensorType")
  @js.native
  open class TensorType protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mlmappings.TensorType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object TensorType {
    
    @JSImport("mendixmodelsdk", "mlmappings.TensorType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.BooleanTensor")
    @js.native
    def BooleanTensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def BooleanTensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanTensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Complex128Tensor")
    @js.native
    def Complex128Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Complex128Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Complex128Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Complex64Tensor")
    @js.native
    def Complex64Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Complex64Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Complex64Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Float16Tensor")
    @js.native
    def Float16Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Float16Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float16Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Float32Tensor")
    @js.native
    def Float32Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Float32Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float32Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Float64Tensor")
    @js.native
    def Float64Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Float64Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float64Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Integer16Tensor")
    @js.native
    def Integer16Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer16Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer16Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Integer32Tensor")
    @js.native
    def Integer32Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer32Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer32Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Integer64Tensor")
    @js.native
    def Integer64Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer64Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer64Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.Integer8Tensor")
    @js.native
    def Integer8Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer8Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer8Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.StringTensor")
    @js.native
    def StringTensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def StringTensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringTensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.UnknownTensor")
    @js.native
    def UnknownTensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def UnknownTensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnknownTensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.UnsignedInteger16Tensor")
    @js.native
    def UnsignedInteger16Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def UnsignedInteger16Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsignedInteger16Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mlmappings.TensorType.UnsignedInteger8Tensor")
    @js.native
    def UnsignedInteger8Tensor: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType = js.native
    inline def UnsignedInteger8Tensor_=(x: typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsignedInteger8Tensor")(x.asInstanceOf[js.Any])
  }
}
