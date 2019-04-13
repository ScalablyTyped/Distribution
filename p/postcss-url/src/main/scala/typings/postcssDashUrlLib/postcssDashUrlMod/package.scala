package typings
package postcssDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashUrlMod {
  type CustomFilterFunction = js.Function1[/* file */ java.lang.String, scala.Boolean]
  type CustomHashFunction = js.Function1[/* file */ nodeLib.Buffer, java.lang.String]
  type CustomTransformFunction = js.Function2[
    /* asset */ postcssDashUrlLib.Anon_AbsolutePath, 
    /* dir */ postcssDashUrlLib.Anon_File, 
    java.lang.String
  ]
  type Url = postcssLib.postcssMod.Plugin[Options | js.Array[Options]]
}
