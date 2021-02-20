package typings.pixiJs.mod

import typings.pixiJs.anon.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  * @memberof PIXI
  * @hideconstructor
  */
@JSImport("pixi.js", "BatchPluginFactory")
@js.native
class BatchPluginFactory ()
  extends typings.pixiJs.PIXI.BatchPluginFactory
object BatchPluginFactory {
  
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
    * PIXI.Renderer.registerPlugin('invert', InvertBatchRenderer);
    * const sprite = new PIXI.Sprite();
    * sprite.pluginName = 'invert';
    *
    * @static
    * @param {object} [options]
    * @param {string} [options.vertex=PIXI.BatchPluginFactory.defaultVertexSrc] - Vertex shader source
    * @param {string} [options.fragment=PIXI.BatchPluginFactory.defaultFragmentTemplate] - Fragment shader template
    * @param {number} [options.vertexSize=6] - Vertex size
    * @param {object} [options.geometryClass=PIXI.BatchGeometry]
    * @return {*} New batch renderer plugin
    */
  /* static member */
  @JSImport("pixi.js", "BatchPluginFactory.create")
  @js.native
  def create(): js.Any = js.native
  @JSImport("pixi.js", "BatchPluginFactory.create")
  @js.native
  def create(options: Fragment): js.Any = js.native
  
  /**
    * The default fragment shader source
    *
    * @static
    * @type {string}
    * @constant
    */
  /* static member */
  @JSImport("pixi.js", "BatchPluginFactory.defaultFragmentTemplate")
  @js.native
  val defaultFragmentTemplate: String = js.native
  
  /**
    * The default vertex shader source
    *
    * @static
    * @type {string}
    * @constant
    */
  /* static member */
  @JSImport("pixi.js", "BatchPluginFactory.defaultVertexSrc")
  @js.native
  val defaultVertexSrc: String = js.native
}
