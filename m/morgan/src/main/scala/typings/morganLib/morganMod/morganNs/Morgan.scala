package typings
package morganLib.morganMod.morganNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Public interface of morgan logger.
  */
@js.native
trait Morgan extends js.Object {
  /***
    * Create a new morgan logger middleware function using the given format
    * and options. The format argument may be a string of a predefined name
    * (see below for the names), or a string of a format string containing
    * defined tokens.
    * @param format
    * @param options
    */
  def apply(format: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: java.lang.String, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /***
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    * @param format
    * @param options
    */
  def apply(format: morganLib.morganLibStrings.combined): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: morganLib.morganLibStrings.combined, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /***
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    * @param format
    * @param options
    */
  def apply(format: morganLib.morganLibStrings.common): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: morganLib.morganLibStrings.common, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Concise output colored by response status for development use. The
    * :status token will be colored red for server error codes, yellow for
    * client error codes, cyan for redirection codes, and uncolored for
    * all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    */
  def apply(format: morganLib.morganLibStrings.dev): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: morganLib.morganLibStrings.dev, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /***
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  def apply(format: morganLib.morganLibStrings.short): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: morganLib.morganLibStrings.short, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /***
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  def apply(format: morganLib.morganLibStrings.tiny): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: morganLib.morganLibStrings.tiny, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /***
    * Create a new morgan logger middleware function using the given format
    * and options. The format argument may be a custom format function
    * which adheres to the signature.
    * @param format
    * @param options
    */
  def apply(format: FormatFn): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(format: FormatFn, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Compile a format string in token notation into a format function.
    */
  def compile(format: java.lang.String): FormatFn = js.native
  /**
    * Define a named custom format by specifying a format string in token
    * notation.
    */
  def format(name: java.lang.String, fmt: java.lang.String): Morgan = js.native
  /**
    * Define a named custom format by specifying a format function.
    */
  def format(name: java.lang.String, fmt: FormatFn): Morgan = js.native
  /**
    * Define a custom token which can be used in custom morgan logging
    * formats.
    */
  def token(name: java.lang.String, callback: TokenCallbackFn): Morgan = js.native
}

