package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeSpriteGeneratorNs {
  type BuiltinCompositors = nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.canvas | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.gm | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.jimp
  type BuiltinLayouts = nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.packed | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.vertical | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.horizontal | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.diagonal
  type BuiltinStylesheetFormats = nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.stylus | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.less | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.sass | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.scss | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.css | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.`prefixed-css` | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.javascript
  type CompositorFilters = nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.all | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.none | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.sub | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.up | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.average | nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorLibStrings.paeth
  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ nodeLib.Error, /* layout */ Layout, scala.Unit], 
    scala.Unit
  ]
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ java.lang.String, 
    /* spritePath */ java.lang.String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ nodeLib.Error, scala.Unit], 
    scala.Unit
  ]
}
