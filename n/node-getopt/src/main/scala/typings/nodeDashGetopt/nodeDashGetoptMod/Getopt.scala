package typings.nodeDashGetopt.nodeDashGetoptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Getopt extends js.Object {
  /**
    * set help template to HELP if HELP is not empty.
    * bind 'help' option to default action, show help and exit with 0.
    * @param help
    */
  def bindHelp(): Getopt = js.native
  def bindHelp(help: String): Getopt = js.native
  def emit(name: String, cb: EventCallback): Getopt = js.native
  /**
    * when parse failed callback will be trigger. default is display error message and exit with 1.
    * @param errorFunc
    */
  def error(errorFunc: ErrorFunc): Getopt = js.native
  /**
    * Get the help generated.
    */
  def getHelp(): String = js.native
  def getVersion(): String = js.native
  /**
    * after parsing, trigger the action if optionName is found.
    * the 'this' in action will be the instance of Getopt.
    * @param name
    * @param cb
    */
  def on(name: String, cb: EventCallback): Getopt = js.native
  /**
    * parse argv
    *
    * Returns: {argv: '...', options: {...}}
    *
    */
  def parse(argv: js.Array[String]): ParsedOption = js.native
  def parseSystem(): ParsedOption = js.native
  /**
    * alias of parse(process.argv.slice(2))
    */
  def parse_system(): ParsedOption = js.native
  /**
    * Set help template. the placeholders will be replaced by getopt.
    *
    * Placeholders:
    *    * [[OPTIONS]] - The options list
    *
    * Returns: String
    * @param help
    */
  def setHelp(help: String): Getopt = js.native
  /**
    * console.info(getopt.getHelp());
    */
  def showHelp(): Getopt = js.native
}

