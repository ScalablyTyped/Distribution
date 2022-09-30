package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
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
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLMappingDocument")
  @js.native
  open class MLMappingDocument protected ()
    extends typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLMappingDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MLMappingDocument {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLMappingDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MLMappingDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLMappingDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLMappingDocument]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLMappingDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLMappingDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelEntityMappings")
  @js.native
  open class MLModelEntityMappings protected ()
    extends typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MLModelEntityMappings {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelEntityMappings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings]
    
    /**
      * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
      * The new MLModelEntityMappings will be automatically stored in the 'input' property
      * of the parent MLModelMappings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInMLModelMappingsUnderInput(container: typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings): typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelMappingsUnderInput")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings]
    
    /**
      * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
      * The new MLModelEntityMappings will be automatically stored in the 'output' property
      * of the parent MLModelMappings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInMLModelMappingsUnderOutput(container: typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings): typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelMappingsUnderOutput")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelEntityMappings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelEntityMappings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelMappings")
  @js.native
  open class MLModelMappings protected ()
    extends typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MLModelMappings {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelMappings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MLModelMappings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings]
    
    /**
      * Creates and returns a new MLModelMappings instance in the SDK and on the server.
      * The new MLModelMappings will be automatically stored in the 'mlModelMappings' property
      * of the parent MLMappingDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLMappingDocument): typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelMappings]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelMappings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.MLModelMappings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorDimension")
  @js.native
  open class TensorDimension protected ()
    extends typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object TensorDimension {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorDimension")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new TensorDimension instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension]
    
    /**
      * Creates and returns a new TensorDimension instance in the SDK and on the server.
      * The new TensorDimension will be automatically stored in the 'attributeShape' property
      * of the parent TensorMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInTensorMappingElementUnderAttributeShape(container: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement): typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderAttributeShape")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension]
    
    /**
      * Creates and returns a new TensorDimension instance in the SDK and on the server.
      * The new TensorDimension will be automatically stored in the 'tensorShape' property
      * of the parent TensorMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createInTensorMappingElementUnderTensorShape(container: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement): typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderTensorShape")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorDimension]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorDimension.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorDimension.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorMappingElement")
  @js.native
  open class TensorMappingElement protected ()
    extends typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object TensorMappingElement {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new TensorMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement]
    
    /**
      * Creates and returns a new TensorMappingElement instance in the SDK and on the server.
      * The new TensorMappingElement will be automatically stored in the 'mappings' property
      * of the parent MLModelEntityMappings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.17.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.mlmappingsMod.mlmappings.MLModelEntityMappings): typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.mlmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType")
  @js.native
  open class TensorType protected ()
    extends typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object TensorType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.BooleanTensor")
    @js.native
    def BooleanTensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def BooleanTensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanTensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Complex128Tensor")
    @js.native
    def Complex128Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Complex128Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Complex128Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Complex64Tensor")
    @js.native
    def Complex64Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Complex64Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Complex64Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Float16Tensor")
    @js.native
    def Float16Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Float16Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float16Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Float32Tensor")
    @js.native
    def Float32Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Float32Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float32Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Float64Tensor")
    @js.native
    def Float64Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Float64Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float64Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Integer16Tensor")
    @js.native
    def Integer16Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer16Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer16Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Integer32Tensor")
    @js.native
    def Integer32Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer32Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer32Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Integer64Tensor")
    @js.native
    def Integer64Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer64Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer64Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.Integer8Tensor")
    @js.native
    def Integer8Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def Integer8Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer8Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.StringTensor")
    @js.native
    def StringTensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def StringTensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringTensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.UnknownTensor")
    @js.native
    def UnknownTensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def UnknownTensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnknownTensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.UnsignedInteger16Tensor")
    @js.native
    def UnsignedInteger16Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def UnsignedInteger16Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsignedInteger16Tensor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "mlmappings.TensorType.UnsignedInteger8Tensor")
    @js.native
    def UnsignedInteger8Tensor: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType = js.native
    inline def UnsignedInteger8Tensor_=(x: typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsignedInteger8Tensor")(x.asInstanceOf[js.Any])
  }
}
