package typings.pixiJs.mod

import typings.pixiJs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A BaseRenderTexture is a special texture that allows any PixiJS display object to be rendered to it.
  *
  * __Hint__: All DisplayObjects (i.e. Sprites) that render to a BaseRenderTexture should be preloaded
  * otherwise black rectangles will be drawn instead.
  *
  * A BaseRenderTexture takes a snapshot of any Display Object given to its render method. The position
  * and rotation of the given Display Objects is ignored. For example:
  *
  * ```js
  * let renderer = PIXI.autoDetectRenderer();
  * let baseRenderTexture = new PIXI.BaseRenderTexture({ width: 800, height: 600 });
  * let renderTexture = new PIXI.RenderTexture(baseRenderTexture);
  * let sprite = PIXI.Sprite.from("spinObj_01.png");
  *
  * sprite.position.x = 800/2;
  * sprite.position.y = 600/2;
  * sprite.anchor.x = 0.5;
  * sprite.anchor.y = 0.5;
  *
  * renderer.render(sprite, renderTexture);
  * ```
  *
  * The Sprite in this case will be rendered using its local transform. To render this sprite at 0,0
  * you can clear the transform
  *
  * ```js
  *
  * sprite.setTransform()
  *
  * let baseRenderTexture = new PIXI.BaseRenderTexture({ width: 100, height: 100 });
  * let renderTexture = new PIXI.RenderTexture(baseRenderTexture);
  *
  * renderer.render(sprite, renderTexture);  // Renders to center of RenderTexture
  * ```
  *
  * @class
  * @extends PIXI.BaseTexture
  * @memberof PIXI
  */
@JSImport("pixi.js", "BaseRenderTexture")
@js.native
class BaseRenderTexture ()
  extends typings.pixiJs.PIXI.BaseRenderTexture {
  def this(options: Height) = this()
}
