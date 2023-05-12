package typings.pixiCore.mod

import typings.pixiColor.libColorMod.ColorSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Color")
@js.native
/**
  * @param {PIXI.ColorSource} value - Optional value to use, if not provided, white is used.
  */
open class Color ()
  extends typings.pixiColor.mod.Color {
  def this(value: ColorSource) = this()
}
/* static members */
object Color {
  
  /** Pattern for hex strings */
  @JSImport("@pixi/core", "Color.HEX_PATTERN")
  @js.native
  val HEX_PATTERN: Any = js.native
  
  /**
    * Default Color object for static uses
    * @example
    * import { Color } from 'pixi.js';
    * Color.shared.setValue(0xffffff).toHex(); // '#ffffff'
    */
  @JSImport("@pixi/core", "Color.shared")
  @js.native
  val shared: typings.pixiColor.libColorMod.Color = js.native
  
  /**
    * Temporary Color object for static uses internally.
    * As to not conflict with Color.shared.
    * @ignore
    */
  @JSImport("@pixi/core", "Color.temp")
  @js.native
  val temp: Any = js.native
}
