package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Standard 2D geometry used in PixiJS.
  *
  * Geometry can be defined without passing in a style or data if required.
  *
  * ```js
  * const geometry = new PIXI.Geometry();
  *
  * geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0, 100], 2);
  * geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1], 2);
  * geometry.addIndex([0,1,2,1,3,2]);
  *
  * ```
  * @class
  * @memberof PIXI
  * @extends PIXI.Geometry
  */
@js.native
trait MeshGeometry extends Geometry
