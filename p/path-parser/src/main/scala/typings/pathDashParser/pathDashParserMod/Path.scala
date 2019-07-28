package typings.pathDashParser.pathDashParserMod

import typings.pathDashParser.typingsTokeniserMod.IToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-parser", "Path")
@js.native
class Path protected () extends js.Object {
  def this(path: js.Any) = this()
  var hasMatrixParams: Boolean = js.native
  var hasQueryParams: Boolean = js.native
  var hasSpatParam: Boolean = js.native
  var hasUrlParams: Boolean = js.native
  var params: js.Array[String] = js.native
  var path: String = js.native
  var queryParams: js.Array[String] = js.native
  var source: String = js.native
  var spatParams: js.Array[String] = js.native
  var tokens: js.Array[IToken] = js.native
  var urlParams: js.Array[String] = js.native
  def build(): String = js.native
  def build(params: js.Object): String = js.native
  def build(params: js.Object, opts: IBuildOptions): String = js.native
  /* private */ def getParams(`type`: js.Any): js.Any = js.native
  def isQueryParam(name: String): Boolean = js.native
  def partialTest(path: String): TestMatch = js.native
  def partialTest(path: String, opts: IPartialTestOptions): TestMatch = js.native
  def test(path: String): TestMatch = js.native
  def test(path: String, opts: ITestOptions): TestMatch = js.native
  /* private */ def urlTest(path: js.Any, source: js.Any): js.Any = js.native
  /* private */ def urlTest(path: js.Any, source: js.Any, hasCaseSensitive: js.Any): js.Any = js.native
}

/* static members */
@JSImport("path-parser", "Path")
@js.native
object Path extends js.Object {
  def createPath(path: js.Any): Path = js.native
}

