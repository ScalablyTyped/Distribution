package typings.pixiJs.mod

import typings.pixiCore.mod.Buffer2
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "UniformGroup")
@js.native
open class UniformGroup[LAYOUT] protected ()
  extends typings.pixiCore.mod.UniformGroup[LAYOUT] {
  /**
    * @param {object | Buffer} [uniforms] - Custom uniforms to use to augment the built-in ones. Or a pixi buffer.
    * @param isStatic - Uniforms wont be changed after creation.
    * @param isUbo - If true, will treat this uniform group as a uniform buffer object.
    */
  def this(uniforms: LAYOUT) = this()
  def this(uniforms: Buffer2) = this()
  def this(uniforms: LAYOUT, isStatic: Boolean) = this()
  def this(uniforms: Buffer2, isStatic: Boolean) = this()
  def this(uniforms: LAYOUT, isStatic: Boolean, isUbo: Boolean) = this()
  def this(uniforms: LAYOUT, isStatic: Unit, isUbo: Boolean) = this()
  def this(uniforms: Buffer2, isStatic: Boolean, isUbo: Boolean) = this()
  def this(uniforms: Buffer2, isStatic: Unit, isUbo: Boolean) = this()
}
/* static members */
object UniformGroup {
  
  @JSImport("pixi.js", "UniformGroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(uniforms: Buffer2): typings.pixiCore.mod.UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Buffer2, _static: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Buffer2, _static: Boolean, _ubo: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Buffer2, _static: Unit, _ubo: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any]): typings.pixiCore.mod.UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any], _static: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any], _static: Boolean, _ubo: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any], _static: Unit, _ubo: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  
  inline def uboFrom(uniforms: Buffer2): typings.pixiCore.mod.UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def uboFrom(uniforms: Buffer2, _static: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  /**
    * A short hand function for creating a static UBO UniformGroup.
    * @param uniforms - the ubo item
    * @param _static - should this be updated each time it is used? defaults to true here!
    */
  inline def uboFrom(uniforms: Dict[Any]): typings.pixiCore.mod.UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
  inline def uboFrom(uniforms: Dict[Any], _static: Boolean): typings.pixiCore.mod.UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.UniformGroup[Dict[Any]]]
}
