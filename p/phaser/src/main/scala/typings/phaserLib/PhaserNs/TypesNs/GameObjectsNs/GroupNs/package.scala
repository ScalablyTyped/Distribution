package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GroupNs {
  type GroupCallback = js.Function1[/* item */ phaserLib.PhaserNs.GameObjectsNs.GameObject, scala.Unit]
  /**
    * A constructor function (class) that can be assigned to `classType`.
    */
  type GroupClassTypeConstructor = js.Function5[
    /* scene */ phaserLib.PhaserNs.Scene, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* texture */ java.lang.String, 
    /* frame */ js.UndefOr[java.lang.String | phaserLib.integer], 
    scala.Unit
  ]
  type GroupMultipleCreateCallback = js.Function1[/* items */ js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], scala.Unit]
}
