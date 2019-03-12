package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeSpriteGeneratorNs {
  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ stdLib.Error, /* layout */ Layout, scala.Unit], 
    scala.Unit
  ]
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ java.lang.String, 
    /* spritePath */ java.lang.String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
    scala.Unit
  ]
}
