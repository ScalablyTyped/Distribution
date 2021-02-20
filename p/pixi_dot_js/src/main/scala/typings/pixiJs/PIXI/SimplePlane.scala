package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SimplePlane allows you to draw a texture across several points and then manipulate these points
  *
  *```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * let SimplePlane = new PIXI.SimplePlane(PIXI.Texture.from("snake.png"), points);
  *  ```
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  *
  */
@js.native
trait SimplePlane extends Mesh {
  
  /**
    * Method used for overrides, to do something in case texture frame was changed.
    * Meshes based on plane can override it and change more details based on texture.
    */
  def textureUpdated(): Unit = js.native
}
