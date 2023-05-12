package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineConfig extends StObject {
  
  /**
    * Sets the `PipelineManager.frameInc` value to control the dimension increase in the Render Targets.
    */
  var frameInc: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the pipeline. Must be unique within the Pipeline Manager.
    */
  var name: String
  
  /**
    * The pipeline class. This should be a constructable object, **not** an instance of a class.
    */
  var pipeline: WebGLPipeline
}
object PipelineConfig {
  
  inline def apply(name: String, pipeline: WebGLPipeline): PipelineConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineConfig] (val x: Self) extends AnyVal {
    
    inline def setFrameInc(value: Double): Self = StObject.set(x, "frameInc", value.asInstanceOf[js.Any])
    
    inline def setFrameIncUndefined: Self = StObject.set(x, "frameInc", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: WebGLPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
