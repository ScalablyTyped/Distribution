package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MSAA_QUALITY extends StObject
/**
  * Constants for multi-sampling antialiasing.
  *
  * @see PIXI.Framebuffer#multisample
  *
  * @name MSAA_QUALITY
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} NONE - No multisampling for this renderTexture
  * @property {number} LOW - Try 2 samples
  * @property {number} MEDIUM - Try 4 samples
  * @property {number} HIGH - Try 8 samples
  */
@JSGlobal("PIXI.MSAA_QUALITY")
@js.native
object MSAA_QUALITY extends StObject {
  
  @js.native
  sealed trait HIGH extends MSAA_QUALITY
  
  @js.native
  sealed trait LOW extends MSAA_QUALITY
  
  @js.native
  sealed trait MEDIUM extends MSAA_QUALITY
  
  @js.native
  sealed trait NONE extends MSAA_QUALITY
}
