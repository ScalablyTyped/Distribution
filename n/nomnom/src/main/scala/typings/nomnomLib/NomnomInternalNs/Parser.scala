package typings
package nomnomLib.NomnomInternalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  /**
           * Returns the parser.
           */
  def apply(): Parser = js.native
  /**
           * Creates a new command.
           * @param name The name of the command.
           * @returns The new command.
           */
  def command(name: java.lang.String): nomnomLib.NomnomInternalNs.ParserNs.Command = js.native
  /**
           * Sets the help string for the command-line.
           * @param help The help string.
           * @returns The command-line parser.
           */
  def help(help: java.lang.String): Parser = js.native
  /**
           * Sets the command-line parser not to use colors.
           * @returns The command-line parser.
           */
  def nocolors(): Parser = js.native
  /**
           * Returns the commmand representing no command.
           * @returns The command representing no command.
           */
  def nocommand(): nomnomLib.NomnomInternalNs.ParserNs.Command = js.native
  /**
           * Parses the command-line.
           * @param argv The command-line arguments.
           * @returns The parsed command-line.
           */
  def nom(): js.Any = js.native
  /**
           * Parses the command-line.
           * @param argv The command-line arguments.
           * @returns The parsed command-line.
           */
  def nom(argv: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Sets an option of the command-line.
           * @param name The name of the option.
           * @param spec The specifiction of the option.
           * @returns The command-line parser.
           */
  def option(name: java.lang.String, spec: nomnomLib.NomnomInternalNs.ParserNs.Option): Parser = js.native
  /**
           * Sets the options of the command-line.
           * @param specs The specifications of the options.
           * @returns The command-line parser.
           */
  def options(specs: ScalablyTyped.runtime.StringDictionary[nomnomLib.NomnomInternalNs.ParserNs.Option]): Parser = js.native
  /**
           * Parses the command-line.
           * @param argv The command-line arguments.
           * @returns The parsed command-line.
           */
  def parse(): js.Any = js.native
  /**
           * Parses the command-line.
           * @param argv The command-line arguments.
           * @returns The parsed command-line.
           */
  def parse(argv: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Provides a printer to the command-line processor.
           * @param print The print function to use.
           * @returns The command-line parser.
           */
  def printer(
    print: js.Function2[/* message */ java.lang.String, /* code */ js.UndefOr[scala.Double], scala.Unit]
  ): Parser = js.native
  /**
           * Sets the name of the script.
           * @param script The script name.
           * @returns The command-line parser.
           */
  def script(script: java.lang.String): Parser = js.native
  /**
           * Sets the usage string for the command-line.
           * @param usage The usage string.
           * @returns The command-line parser.
           */
  def usage(usage: java.lang.String): Parser = js.native
}

