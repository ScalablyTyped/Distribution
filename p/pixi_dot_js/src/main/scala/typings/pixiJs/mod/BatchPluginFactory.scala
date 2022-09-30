package typings.pixiJs.mod

import typings.pixiCore.anon.TypeofAbstractBatchRender
import typings.pixiCore.mod.IBatchFactoryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BatchPluginFactory")
@js.native
open class BatchPluginFactory ()
  extends typings.pixiCore.mod.BatchPluginFactory
/* static members */
object BatchPluginFactory {
  
  @JSImport("pixi.js", "BatchPluginFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new BatchRenderer plugin for Renderer. this convenience can provide an easy way
    * to extend BatchRenderer with all the necessary pieces.
    * @example
    * const fragment = `
    * varying vec2 vTextureCoord;
    * varying vec4 vColor;
    * varying float vTextureId;
    * uniform sampler2D uSamplers[%count%];
    *
    * void main(void){
    *     vec4 color;
    *     %forloop%
    *     gl_FragColor = vColor * vec4(color.a - color.rgb, color.a);
    * }
    * `;
    * const InvertBatchRenderer = PIXI.BatchPluginFactory.create({ fragment });
    * PIXI.extensions.add({
    *  name: 'invert',
    *  ref: InvertBatchRenderer,
    *  type: PIXI.ExtensionType.RendererPlugin,
    * });
    * const sprite = new PIXI.Sprite();
    * sprite.pluginName = 'invert';
    * @param {object} [options]
    * @param {string} [options.vertex=PIXI.BatchPluginFactory.defaultVertexSrc] - Vertex shader source
    * @param {string} [options.fragment=PIXI.BatchPluginFactory.defaultFragmentTemplate] - Fragment shader template
    * @param {number} [options.vertexSize=6] - Vertex size
    * @param {object} [options.geometryClass=PIXI.BatchGeometry]
    * @returns {*} New batch renderer plugin
    */
  inline def create(): TypeofAbstractBatchRender = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TypeofAbstractBatchRender]
  inline def create(options: IBatchFactoryOptions): TypeofAbstractBatchRender = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofAbstractBatchRender]
}
