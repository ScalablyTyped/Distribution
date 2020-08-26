package typings.poi.mod.Config

import org.scalablytyped.runtime.StringDictionary
import typings.poi.mod.Config.Babel.NamedImportsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Babel extends js.Object {
  var jsx: js.UndefOr[String] = js.native
  var namedImports: js.UndefOr[String | NamedImportsOptions] = js.native
  var transpileModules: js.UndefOr[String | js.Array[String]] = js.native
}

@JSImport("poi", "Config.Babel")
@js.native
object Babel extends js.Object {
  type NamedImportsOptions = StringDictionary[StringDictionary[String]]
}

