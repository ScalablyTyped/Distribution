package typings.nodeSpriteGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LayoutFunc = js.Function3[
    /* images */ js.Array[typings.nodeSpriteGenerator.mod.Image], 
    /* options */ typings.nodeSpriteGenerator.mod.LayoutOption, 
    /* callback */ js.Function2[
      /* error */ typings.std.Error, 
      /* layout */ typings.nodeSpriteGenerator.mod.Layout, 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type StylesheetFunc = js.Function5[
    /* layout */ typings.nodeSpriteGenerator.mod.Layout, 
    /* stylesheetPath */ java.lang.String, 
    /* spritePath */ java.lang.String, 
    /* options */ typings.nodeSpriteGenerator.mod.StylesheetOption, 
    /* callback */ js.Function1[/* error */ typings.std.Error, scala.Unit], 
    scala.Unit
  ]
}
