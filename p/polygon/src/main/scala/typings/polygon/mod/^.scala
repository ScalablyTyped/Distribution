package typings.polygon.mod

import typings.polygon.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new polygon:
  *
  * ```javascript
  * var p = new Polygon([
  * Vec2(0, 0),
  * Vec2(10, 0),
  * Vec2(0, 10)
  * ]);
  *
  * ```
  *
  * You can pass an array of `Vec2`s, arrays `[x, y]`, or objects `{ x: 10, y: 20 }`
  *
  * **Stuff to Note**: most of the Vec2's methods take a `returnNew` as the last parameter.
  * If passed a truthy value, a new vector will be returned to you.
  * Otherwise the operation will be applied to `this` and `this` will be returned.
  */
@JSImport("polygon", JSImport.Namespace)
@js.native
class ^ protected () extends Polygon {
  def this(points: js.Array[js.Array[Double] | X | typings.vec2.mod.^ ]) = this()
}
