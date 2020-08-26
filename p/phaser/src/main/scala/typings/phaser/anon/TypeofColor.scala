package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.phaser.spine.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofColor
  extends Instantiable0[Color]
     with Instantiable1[/* r */ Double, Color]
     with Instantiable2[js.UndefOr[/* r */ Double], /* g */ Double, Color]
     with Instantiable3[js.UndefOr[/* r */ Double], js.UndefOr[/* g */ Double], /* b */ Double, Color]
     with Instantiable4[
      js.UndefOr[/* r */ Double], 
      js.UndefOr[/* g */ Double], 
      js.UndefOr[/* b */ Double], 
      /* a */ Double, 
      Color
    ] {
  var BLUE: Color = js.native
  var GREEN: Color = js.native
  var MAGENTA: Color = js.native
  var RED: Color = js.native
  var WHITE: Color = js.native
  def rgb888ToColor(color: Color, value: Double): Unit = js.native
  def rgba8888ToColor(color: Color, value: Double): Unit = js.native
}

