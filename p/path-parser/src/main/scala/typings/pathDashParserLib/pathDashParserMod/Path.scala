package typings
package pathDashParserLib.pathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-parser", "Path")
@js.native
class Path protected () extends js.Object {
  def this(path: js.Any) = this()
  var hasMatrixParams: scala.Boolean = js.native
  var hasQueryParams: scala.Boolean = js.native
  var hasSpatParam: scala.Boolean = js.native
  var hasUrlParams: scala.Boolean = js.native
  var params: js.Array[java.lang.String] = js.native
  var path: java.lang.String = js.native
  var queryParams: js.Array[java.lang.String] = js.native
  var source: java.lang.String = js.native
  var spatParams: js.Array[java.lang.String] = js.native
  var tokens: js.Array[pathDashParserLib.typingsTokeniserMod.IToken] = js.native
  var urlParams: js.Array[java.lang.String] = js.native
  def build(): java.lang.String = js.native
  def build(params: js.Object): java.lang.String = js.native
  def build(params: js.Object, opts: IBuildOptions): java.lang.String = js.native
  /* private */ def getParams(`type`: js.Any): js.Any = js.native
  def isQueryParam(name: java.lang.String): scala.Boolean = js.native
  def partialTest(path: java.lang.String): TestMatch = js.native
  def partialTest(path: java.lang.String, opts: IPartialTestOptions): TestMatch = js.native
  def test(path: java.lang.String): TestMatch = js.native
  def test(path: java.lang.String, opts: ITestOptions): TestMatch = js.native
  /* private */ def urlTest(path: js.Any, source: js.Any): js.Any = js.native
  /* private */ def urlTest(path: js.Any, source: js.Any, hasCaseSensitive: js.Any): js.Any = js.native
}

@JSImport("path-parser", "Path")
@js.native
object Path extends js.Object {
  def createPath(path: js.Any): pathDashParserLib.pathDashParserMod.Path = js.native
}

