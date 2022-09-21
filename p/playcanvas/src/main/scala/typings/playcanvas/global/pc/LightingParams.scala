package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lighting parameters, allow configuration of the global lighting parameters.
  * For details see [Clustered Lighting](https://developer.playcanvas.com/en/user-manual/graphics/lighting/clustered-lighting/)
  *
  * @property {number} debugLayer Layer ID of a layer to contain the debug rendering
  * of clustered lighting. Defaults to undefined, which disables the debug rendering.
  * Debug rendering is only included in the debug version of the engine.
  *
  * @property {Array<number>|null} atlasSplit Atlas textures split description, which applies
  * to both the shadow and cookie texture atlas. Defaults to null, which enables to automatic
  * split mode. For details see [Configuring Atlas Split](https://developer.playcanvas.com/en/user-manual/graphics/lighting/clustered-lighting/#configuring-atlas)
  *
  * @hideconstructor
  */
@JSGlobal("pc.LightingParams")
@js.native
open class LightingParams protected ()
  extends typings.playcanvas.mod.LightingParams {
  def this(supportsAreaLights: Any, maxTextureSize: Any, dirtyLightsFnc: Any) = this()
}
