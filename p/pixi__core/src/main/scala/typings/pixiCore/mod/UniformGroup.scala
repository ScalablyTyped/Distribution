package typings.pixiCore.mod

import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "UniformGroup")
@js.native
open class UniformGroup[LAYOUT] protected () extends StObject {
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
  
  def add(name: String, uniforms: Dict[Any]): Unit = js.native
  def add(name: String, uniforms: Dict[Any], _static: Boolean): Unit = js.native
  
  var autoManage: Boolean = js.native
  
  var buffer: js.UndefOr[Buffer2] = js.native
  
  /**
    * Dirty version
    * @protected
    */
  var dirtyId: Double = js.native
  
  /**
    * Its a group and not a single uniforms.
    * @default true
    */
  val group: Boolean = js.native
  
  /**
    * unique id
    * @protected
    */
  var id: Double = js.native
  
  /** Flag for if uniforms wont be changed after creation. */
  var static: Boolean = js.native
  
  var syncUniforms: Dict[UniformsSyncCallback2] = js.native
  
  /** Flags whether this group is treated like a uniform buffer object. */
  var ubo: Boolean = js.native
  
  /**
    * Uniform values
    * @member {object}
    */
  val uniforms: LAYOUT = js.native
  
  def update(): Unit = js.native
}
/* static members */
object UniformGroup {
  
  @JSImport("@pixi/core", "UniformGroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(uniforms: Buffer2): UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any]).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Buffer2, _static: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Buffer2, _static: Boolean, _ubo: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Buffer2, _static: Unit, _ubo: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any]): UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any]).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any], _static: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any], _static: Boolean, _ubo: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def from(uniforms: Dict[Any], _static: Unit, _ubo: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], _ubo.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  
  inline def uboFrom(uniforms: Buffer2): UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any]).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def uboFrom(uniforms: Buffer2, _static: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
  /**
    * A short hand function for creating a static UBO UniformGroup.
    * @param uniforms - the ubo item
    * @param _static - should this be updated each time it is used? defaults to true here!
    */
  inline def uboFrom(uniforms: Dict[Any]): UniformGroup[Dict[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any]).asInstanceOf[UniformGroup[Dict[Any]]]
  inline def uboFrom(uniforms: Dict[Any], _static: Boolean): UniformGroup[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uboFrom")(uniforms.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[UniformGroup[Dict[Any]]]
}
