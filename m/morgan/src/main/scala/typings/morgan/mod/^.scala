package typings.morgan.mod

import typings.morgan.morganStrings.combined
import typings.morgan.morganStrings.common
import typings.morgan.morganStrings.dev
import typings.morgan.morganStrings.short
import typings.morgan.morganStrings.tiny
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("morgan", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /***
    * Create a new morgan logger middleware function using the given format and
    * options. The format argument may be a string of a predefined name (see below
    * for the names), or a string of a format string containing defined tokens.
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: String): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: String, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Create a new morgan logger middleware function using the given format and
    * options. The format argument may be a custom format function which adheres to
    * the signature.
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: FormatFn[Request, Response]): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: FormatFn[Request, Response], options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: combined): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: combined, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: common): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: common, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Concise output colored by response status for development use. The :status
    * token will be colored red for server error codes, yellow for client error
    * codes, cyan for redirection codes, and uncolored for all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: dev): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: dev, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: short): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: short, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: tiny): Handler[Request, Response] = js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: tiny, options: Options[Request, Response]): Handler[Request, Response] = js.native
}
