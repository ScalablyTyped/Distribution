package typings.parseGitignore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatLine = js.Function3[
    /* line */ java.lang.String, 
    /* section */ js.UndefOr[typings.parseGitignore.mod.Section], 
    /* state */ js.UndefOr[typings.parseGitignore.mod.State], 
    java.lang.String
  ]
}
