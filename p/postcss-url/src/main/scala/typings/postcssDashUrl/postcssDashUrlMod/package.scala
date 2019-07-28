package typings.postcssDashUrl

import typings.node.Buffer
import typings.postcss.postcssMod.Plugin
import typings.postcssDashUrl.Anon_AbsolutePath
import typings.postcssDashUrl.Anon_File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashUrlMod {
  type CustomFilterFunction = js.Function1[/* file */ String, Boolean]
  type CustomHashFunction = js.Function1[/* file */ Buffer, String]
  type CustomTransformFunction = js.Function2[/* asset */ Anon_AbsolutePath, /* dir */ Anon_File, String]
  type Url = Plugin[Options | js.Array[Options]]
}
