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

/**
  * Public interface of morgan logger.
  */
@js.native
trait Morgan[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] extends js.Object {
  
  /***
    * Create a new morgan logger middleware function using the given format
    * and options. The format argument may be a string of a predefined name
    * (see below for the names), or a string of a format string containing
    * defined tokens.
    * @param format
    * @param options
    */
  def apply(format: String): Handler[Request, Response] = js.native
  def apply(format: String, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Create a new morgan logger middleware function using the given format
    * and options. The format argument may be a custom format function
    * which adheres to the signature.
    * @param format
    * @param options
    */
  def apply(format: FormatFn[Request, Response]): Handler[Request, Response] = js.native
  def apply(format: FormatFn[Request, Response], options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    * @param format
    * @param options
    */
  def apply(format: combined): Handler[Request, Response] = js.native
  def apply(format: combined, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    * @param format
    * @param options
    */
  def apply(format: common): Handler[Request, Response] = js.native
  def apply(format: common, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /**
    * Concise output colored by response status for development use. The
    * :status token will be colored red for server error codes, yellow for
    * client error codes, cyan for redirection codes, and uncolored for
    * all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    */
  def apply(format: dev): Handler[Request, Response] = js.native
  def apply(format: dev, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  def apply(format: short): Handler[Request, Response] = js.native
  def apply(format: short, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  def apply(format: tiny): Handler[Request, Response] = js.native
  def apply(format: tiny, options: Options[Request, Response]): Handler[Request, Response] = js.native
  
  /**
    * Compile a format string in token notation into a format function.
    */
  def compile(format: String): FormatFn[Request, Response] = js.native
  
  /**
    * Define a named custom format by specifying a format string in token
    * notation.
    */
  def format(name: String, fmt: String): Morgan[Request, Response] = js.native
  /**
    * Define a named custom format by specifying a format function.
    */
  def format(name: String, fmt: FormatFn[Request, Response]): Morgan[Request, Response] = js.native
  
  /**
    * Define a custom token which can be used in custom morgan logging
    * formats.
    */
  def token(name: String, callback: TokenCallbackFn[Request, Response]): Morgan[Request, Response] = js.native
}
