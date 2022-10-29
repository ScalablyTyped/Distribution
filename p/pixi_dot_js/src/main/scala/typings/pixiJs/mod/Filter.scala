package typings.pixiJs.mod

import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Filter")
@js.native
/**
  * @param vertexSrc - The source of the vertex shader.
  * @param fragmentSrc - The source of the fragment shader.
  * @param uniforms - Custom uniforms to use to augment the built-in ones.
  */
open class Filter ()
  extends typings.pixiCore.mod.Filter {
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
  
  @JSImport("pixi.js", "Filter")
  @js.native
  val ^ : js.Any = js.native
  
  /** Used for caching shader IDs. */
  @JSImport("pixi.js", "Filter.SOURCE_KEY_MAP")
  @js.native
  def SOURCE_KEY_MAP: Dict[String] = js.native
  inline def SOURCE_KEY_MAP_=(x: Dict[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOURCE_KEY_MAP")(x.asInstanceOf[js.Any])
}
