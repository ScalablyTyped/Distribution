package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * @interface
  * @name ContainerResource
  * @description Container for a list of animations, textures, materials, renders and a model.
  * @property {import('../asset/asset.js').Asset[]} renders An array of the Render assets.
  * @property {import('../asset/asset.js').Asset[]} materials An array of {@link Material} and/or {@link StandardMaterial} assets.
  * @property {import('../asset/asset.js').Asset[]} textures An array of the {@link Texture} assets.
  * @property {import('../asset/asset.js').Asset[]} animations An array of the {@link Animation} assets.
  */
@JSGlobal("pc.ContainerResource")
@js.native
open class ContainerResource ()
  extends typings.playcanvas.mod.ContainerResource
