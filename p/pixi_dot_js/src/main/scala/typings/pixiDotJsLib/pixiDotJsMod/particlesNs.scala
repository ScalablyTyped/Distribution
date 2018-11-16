package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////PARTICLES////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "particles")
@js.native
object particlesNs extends js.Object {
  @js.native
  class ParticleBuffer protected ()
    extends pixiDotJsLib.PIXINs.particlesNs.ParticleBuffer {
    def this(gl: stdLib.WebGLRenderingContext, properties: js.Any, dynamicPropertyFlags: js.Array[_], size: scala.Double) = this()
  }
  
  @js.native
  class ParticleContainer ()
    extends pixiDotJsLib.PIXINs.particlesNs.ParticleContainer {
    def this(maxSize: scala.Double) = this()
    def this(maxSize: scala.Double, properties: pixiDotJsLib.PIXINs.particlesNs.ParticleContainerProperties) = this()
    def this(maxSize: scala.Double, properties: pixiDotJsLib.PIXINs.particlesNs.ParticleContainerProperties, batchSize: scala.Double) = this()
    def this(maxSize: scala.Double, properties: pixiDotJsLib.PIXINs.particlesNs.ParticleContainerProperties, batchSize: scala.Double, autoResize: scala.Boolean) = this()
  }
  
  @js.native
  class ParticleRenderer protected ()
    extends pixiDotJsLib.PIXINs.particlesNs.ParticleRenderer {
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  }
  
}

