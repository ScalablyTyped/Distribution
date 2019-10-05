package typings.nomnom.NomnomInternal

import org.scalablytyped.runtime.StringDictionary
import typings.nomnom.NomnomInternal.Parser.Command
import typings.nomnom.NomnomInternal.Parser.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Parser")
@js.native
trait Parser_ extends js.Object {
  /**
    * Returns the parser.
    */
  def apply(): Parser = js.native
  /**
    * Creates a new command.
    * @param name The name of the command.
    * @returns The new command.
    */
  def command(name: String): Command = js.native
  /**
    * Sets the help string for the command-line.
    * @param help The help string.
    * @returns The command-line parser.
    */
  def help(help: String): Parser = js.native
  /**
    * Sets the command-line parser not to use colors.
    * @returns The command-line parser.
    */
  def nocolors(): Parser = js.native
  /**
    * Returns the commmand representing no command.
    * @returns The command representing no command.
    */
  def nocommand(): Command = js.native
  /**
    * Parses the command-line.
    * @param argv The command-line arguments.
    * @returns The parsed command-line.
    */
  def nom(): js.Any = js.native
  def nom(argv: js.Array[String]): js.Any = js.native
  /**
    * Sets an option of the command-line.
    * @param name The name of the option.
    * @param spec The specifiction of the option.
    * @returns The command-line parser.
    */
  def option(name: String, spec: Option): Parser = js.native
  /**
    * Sets the options of the command-line.
    * @param specs The specifications of the options.
    * @returns The command-line parser.
    */
  def options(specs: StringDictionary[Option]): Parser = js.native
  /**
    * Parses the command-line.
    * @param argv The command-line arguments.
    * @returns The parsed command-line.
    */
  def parse(): js.Any = js.native
  def parse(argv: js.Array[String]): js.Any = js.native
  /**
    * Provides a printer to the command-line processor.
    * @param print The print function to use.
    * @returns The command-line parser.
    */
  def printer(print: js.Function2[/* message */ String, /* code */ js.UndefOr[Double], Unit]): Parser = js.native
  /**
    * Sets the name of the script.
    * @param script The script name.
    * @returns The command-line parser.
    */
  def script(script: String): Parser = js.native
  /**
    * Sets the usage string for the command-line.
    * @param usage The usage string.
    * @returns The command-line parser.
    */
  def usage(usage: String): Parser = js.native
}

