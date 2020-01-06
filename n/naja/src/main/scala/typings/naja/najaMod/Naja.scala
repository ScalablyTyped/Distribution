package typings.naja.najaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Naja extends NajaEventTarget {
  val formsHandler: FormsHandler = js.native
  val historyHandler: HistoryHandler = js.native
  val snippetHandler: SnippetHandler = js.native
  val uiHandler: UIHandler = js.native
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, args: js.Any): Unit = js.native
  def initialize(): Unit = js.native
  def initialize(defaultOptions: NajaOptions): Unit = js.native
  def makeRequest(method: RequestMethod, url: String, data: RequestData): js.Promise[_] = js.native
  def makeRequest(method: RequestMethod, url: String, data: RequestData, options: RequestOptions): js.Promise[_] = js.native
  def registerExtension[T /* <: js.Array[_] */](
    extension: NajaExtension[T],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param optionalArguments because its type T is not an array type */ optionalArguments: T
  ): Unit = js.native
}

