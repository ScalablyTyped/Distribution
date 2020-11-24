package typings.nodemailer.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.nodemailerStrings.trace
  - typings.nodemailer.nodemailerStrings.debug
  - typings.nodemailer.nodemailerStrings.info
  - typings.nodemailer.nodemailerStrings.warn
  - typings.nodemailer.nodemailerStrings.error
  - typings.nodemailer.nodemailerStrings.fatal
*/
trait LoggerLevel extends js.Object
object LoggerLevel {
  
  @scala.inline
  def debug: typings.nodemailer.nodemailerStrings.debug = "debug".asInstanceOf[typings.nodemailer.nodemailerStrings.debug]
  
  @scala.inline
  def error: typings.nodemailer.nodemailerStrings.error = "error".asInstanceOf[typings.nodemailer.nodemailerStrings.error]
  
  @scala.inline
  def fatal: typings.nodemailer.nodemailerStrings.fatal = "fatal".asInstanceOf[typings.nodemailer.nodemailerStrings.fatal]
  
  @scala.inline
  def info: typings.nodemailer.nodemailerStrings.info = "info".asInstanceOf[typings.nodemailer.nodemailerStrings.info]
  
  @scala.inline
  def trace: typings.nodemailer.nodemailerStrings.trace = "trace".asInstanceOf[typings.nodemailer.nodemailerStrings.trace]
  
  @scala.inline
  def warn: typings.nodemailer.nodemailerStrings.warn = "warn".asInstanceOf[typings.nodemailer.nodemailerStrings.warn]
}
