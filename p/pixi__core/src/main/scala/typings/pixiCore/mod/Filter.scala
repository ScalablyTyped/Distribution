package typings.pixiCore.mod

import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Filter")
@js.native
/**
  * @param vertexSrc - The source of the vertex shader.
  * @param fragmentSrc - The source of the fragment shader.
  * @param uniforms - Custom uniforms to use to augment the built-in ones.
  */
open class Filter ()
  extends typings.pixiCore.libFiltersFilterMod.Filter {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, uniforms: Dict[Any]) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, uniforms: Dict[Any]) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, uniforms: Dict[Any]) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, uniforms: Dict[Any]) = this()
}
/* static members */
object Filter {
  
  @JSImport("@pixi/core", "Filter")
  @js.native
  val ^ : js.Any = js.native
  
  /** Used for caching shader IDs. */
  @JSImport("@pixi/core", "Filter.SOURCE_KEY_MAP")
  @js.native
  def SOURCE_KEY_MAP: Dict[String] = js.native
  inline def SOURCE_KEY_MAP_=(x: Dict[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOURCE_KEY_MAP")(x.asInstanceOf[js.Any])
  
  /**
    * Default filter samples for any filter.
    * @static
    * @type {PIXI.MSAA_QUALITY}
    * @default PIXI.MSAA_QUALITY.NONE
    */
  @JSImport("@pixi/core", "Filter.defaultMultisample")
  @js.native
  def defaultMultisample: typings.pixiConstants.mod.MSAA_QUALITY = js.native
  inline def defaultMultisample_=(x: typings.pixiConstants.mod.MSAA_QUALITY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMultisample")(x.asInstanceOf[js.Any])
  
  /**
    * Default filter resolution for any filter.
    * @static
    */
  @JSImport("@pixi/core", "Filter.defaultResolution")
  @js.native
  def defaultResolution: Double = js.native
  inline def defaultResolution_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution")(x.asInstanceOf[js.Any])
}
