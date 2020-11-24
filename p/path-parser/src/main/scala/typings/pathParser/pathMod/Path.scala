package typings.pathParser.pathMod

import typings.pathParser.tokeniserMod.Token
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path-parser/dist/Path", "Path")
@js.native
class Path[T /* <: Record[String, _] */] protected () extends js.Object {
  def this(path: String) = this()
  def this(path: String, options: PathOptions) = this()
  
  def build(): String = js.native
  def build(params: T): String = js.native
  def build(params: T, opts: PathBuildOptions): String = js.native
  def build(params: js.UndefOr[scala.Nothing], opts: PathBuildOptions): String = js.native
  
  var getParams: js.Any = js.native
  
  var hasMatrixParams: Boolean = js.native
  
  var hasQueryParams: Boolean = js.native
  
  var hasSpatParam: Boolean = js.native
  
  var hasUrlParams: Boolean = js.native
  
  def isQueryParam(name: String): Boolean = js.native
  
  def isSpatParam(name: String): Boolean = js.native
  
  var options: InternalPathOptions = js.native
  
  var params: js.Array[String] = js.native
  
  def partialTest(path: String): TestMatch[T] = js.native
  def partialTest(path: String, opts: PathPartialTestOptions): TestMatch[T] = js.native
  
  var path: String = js.native
  
  var queryParams: js.Array[String] = js.native
  
  var source: String = js.native
  
  var spatParams: js.Array[String] = js.native
  
  def test(path: String): TestMatch[T] = js.native
  def test(path: String, opts: PathTestOptions): TestMatch[T] = js.native
  
  var tokens: js.Array[Token] = js.native
  
  var urlParams: js.Array[String] = js.native
  
  var urlTest: js.Any = js.native
}
/* static members */
@JSImport("path-parser/dist/Path", "Path")
@js.native
object Path extends js.Object {
  
  def createPath[T /* <: Record[String, _] */](path: String): Path[T] = js.native
  def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): Path[T] = js.native
}
