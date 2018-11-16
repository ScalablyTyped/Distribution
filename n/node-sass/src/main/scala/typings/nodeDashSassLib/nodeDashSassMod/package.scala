package typings
package nodeDashSassLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashSassMod {
  type Importer = js.Function3[
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ nodeDashSassLib.ImporterReturnType, scala.Unit], 
    nodeDashSassLib.ImporterReturnType | scala.Unit
  ]
}
