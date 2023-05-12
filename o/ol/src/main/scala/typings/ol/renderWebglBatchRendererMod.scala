package typings.ol

import typings.ol.geomGeometryMod.Type
import typings.ol.mapMod.FrameState
import typings.ol.renderWebglMixedGeometryBatchMod.GeometryBatch
import typings.ol.transformMod.Transform
import typings.ol.webglHelperMod.AttributeDescription
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglBatchRendererMod {
  
  /**
    * @classdesc Abstract class for batch renderers.
    * Batch renderers are meant to render the geometries contained in a {@link module:ol/render/webgl/GeometryBatch}
    * instance. They are responsible for generating render instructions and transforming them into WebGL buffers.
    */
  @JSImport("ol/render/webgl/BatchRenderer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AbstractBatchRenderer {
    /**
      * @param {import("../../webgl/Helper.js").default} helper WebGL helper instance
      * @param {Worker} worker WebGL worker instance
      * @param {string} vertexShader Vertex shader
      * @param {string} fragmentShader Fragment shader
      * @param {Array<CustomAttribute>} customAttributes List of custom attributes
      */
    def this(
      helper: typings.ol.webglHelperMod.default,
      worker: Worker,
      vertexShader: String,
      fragmentShader: String,
      customAttributes: js.Array[CustomAttribute]
    ) = this()
    
    /**
      * A list of attributes used by the renderer.
      * @type {Array<import('../../webgl/Helper.js').AttributeDescription>}
      * @protected
      */
    /* protected */ /* CompleteClass */
    var attributes: js.Array[AttributeDescription] = js.native
    
    /**
      * @type {Array<CustomAttribute>}
      * @protected
      */
    /* protected */ /* CompleteClass */
    var customAttributes: js.Array[CustomAttribute] = js.native
    
    /**
      * Rebuild internal webgl buffers for rendering based on the current rendering instructions;
      * This is asynchronous: webgl buffers wil _not_ be updated right away
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @param {import("../../geom/Geometry.js").Type} geometryType Geometry type
      * @param {function(): void} callback Function called once the render buffers are updated
      * @private
      */
    /* private */ /* CompleteClass */
    var generateBuffers_ : Any = js.native
    
    /**
      * Rebuild rendering instructions based on the provided frame state
      * This is specific to the geometry type and has to be implemented by subclasses.
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def generateRenderInstructions(batch: GeometryBatch): Unit = js.native
    
    /**
      * @type {import("../../webgl/Helper.js").default}
      * @private
      */
    /* private */ /* CompleteClass */
    var helper_ : Any = js.native
    
    /**
      * @type {WebGLProgram}
      * @private
      */
    /* private */ /* CompleteClass */
    var program_ : Any = js.native
    
    /**
      * Rebuild rendering instructions and webgl buffers based on the provided frame state
      * Note: this is a costly operation.
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @param {import("../../Map").FrameState} frameState Frame state.
      * @param {import("../../geom/Geometry.js").Type} geometryType Geometry type
      * @param {function(): void} callback Function called once the render buffers are updated
      */
    /* CompleteClass */
    override def rebuild(batch: GeometryBatch, frameState: FrameState, geometryType: Type, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Render the geometries in the batch. This will also update the current transform used for rendering according to
      * the invert transform of the webgl buffers
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @param {import("../../transform.js").Transform} currentTransform Transform
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {number} offsetX X offset
      */
    /* CompleteClass */
    override def render(batch: GeometryBatch, currentTransform: Transform, frameState: FrameState, offsetX: Double): Unit = js.native
    
    /**
      * @type {Worker}
      * @private
      */
    /* private */ /* CompleteClass */
    var worker_ : Any = js.native
  }
  
  /**
    * @classdesc Abstract class for batch renderers.
    * Batch renderers are meant to render the geometries contained in a {@link module:ol/render/webgl/GeometryBatch}
    * instance. They are responsible for generating render instructions and transforming them into WebGL buffers.
    */
  trait AbstractBatchRenderer extends StObject {
    
    /**
      * A list of attributes used by the renderer.
      * @type {Array<import('../../webgl/Helper.js').AttributeDescription>}
      * @protected
      */
    /* protected */ var attributes: js.Array[AttributeDescription]
    
    /**
      * @type {Array<CustomAttribute>}
      * @protected
      */
    /* protected */ var customAttributes: js.Array[CustomAttribute]
    
    /**
      * Rebuild internal webgl buffers for rendering based on the current rendering instructions;
      * This is asynchronous: webgl buffers wil _not_ be updated right away
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @param {import("../../geom/Geometry.js").Type} geometryType Geometry type
      * @param {function(): void} callback Function called once the render buffers are updated
      * @private
      */
    /* private */ var generateBuffers_ : Any
    
    /**
      * Rebuild rendering instructions based on the provided frame state
      * This is specific to the geometry type and has to be implemented by subclasses.
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @protected
      */
    /* protected */ def generateRenderInstructions(batch: GeometryBatch): Unit
    
    /**
      * @type {import("../../webgl/Helper.js").default}
      * @private
      */
    /* private */ var helper_ : Any
    
    /**
      * @type {WebGLProgram}
      * @private
      */
    /* private */ var program_ : Any
    
    /**
      * Rebuild rendering instructions and webgl buffers based on the provided frame state
      * Note: this is a costly operation.
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @param {import("../../Map").FrameState} frameState Frame state.
      * @param {import("../../geom/Geometry.js").Type} geometryType Geometry type
      * @param {function(): void} callback Function called once the render buffers are updated
      */
    def rebuild(batch: GeometryBatch, frameState: FrameState, geometryType: Type, callback: js.Function0[Unit]): Unit
    
    /**
      * Render the geometries in the batch. This will also update the current transform used for rendering according to
      * the invert transform of the webgl buffers
      * @param {import("./MixedGeometryBatch.js").GeometryBatch} batch Geometry batch
      * @param {import("../../transform.js").Transform} currentTransform Transform
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {number} offsetX X offset
      */
    def render(batch: GeometryBatch, currentTransform: Transform, frameState: FrameState, offsetX: Double): Unit
    
    /**
      * @type {Worker}
      * @private
      */
    /* private */ var worker_ : Any
  }
  object AbstractBatchRenderer {
    
    inline def apply(
      attributes: js.Array[AttributeDescription],
      customAttributes: js.Array[CustomAttribute],
      generateBuffers_ : Any,
      generateRenderInstructions: GeometryBatch => Unit,
      helper_ : Any,
      program_ : Any,
      rebuild: (GeometryBatch, FrameState, Type, js.Function0[Unit]) => Unit,
      render: (GeometryBatch, Transform, FrameState, Double) => Unit,
      worker_ : Any
    ): AbstractBatchRenderer = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], customAttributes = customAttributes.asInstanceOf[js.Any], generateBuffers_ = generateBuffers_.asInstanceOf[js.Any], generateRenderInstructions = js.Any.fromFunction1(generateRenderInstructions), helper_ = helper_.asInstanceOf[js.Any], program_ = program_.asInstanceOf[js.Any], rebuild = js.Any.fromFunction4(rebuild), render = js.Any.fromFunction4(render), worker_ = worker_.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractBatchRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractBatchRenderer] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[AttributeDescription]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: AttributeDescription*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setCustomAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
      
      inline def setGenerateBuffers_(value: Any): Self = StObject.set(x, "generateBuffers_", value.asInstanceOf[js.Any])
      
      inline def setGenerateRenderInstructions(value: GeometryBatch => Unit): Self = StObject.set(x, "generateRenderInstructions", js.Any.fromFunction1(value))
      
      inline def setHelper_(value: Any): Self = StObject.set(x, "helper_", value.asInstanceOf[js.Any])
      
      inline def setProgram_(value: Any): Self = StObject.set(x, "program_", value.asInstanceOf[js.Any])
      
      inline def setRebuild(value: (GeometryBatch, FrameState, Type, js.Function0[Unit]) => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction4(value))
      
      inline def setRender(value: (GeometryBatch, Transform, FrameState, Double) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
      
      inline def setWorker_(value: Any): Self = StObject.set(x, "worker_", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomAttribute extends StObject {
    
    /**
      * This callback computes the numerical value of the
      * attribute for a given feature.
      */
    def callback(arg0: typings.ol.renderFeatureMod.default): Double
    
    /**
      * Attribute name.
      */
    var name: String
  }
  object CustomAttribute {
    
    inline def apply(callback: typings.ol.renderFeatureMod.default => Double, name: String): CustomAttribute = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomAttribute] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: typings.ol.renderFeatureMod.default => Double): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
