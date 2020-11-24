package typings.optimist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends js.Object {
  
  /** Pass in the process.argv yourself */
  def apply(args: js.Array[String]): js.Any = js.native
  
  /** Take an object that maps keys to aliases. */
  def alias(aliases: StringDictionary[String | js.Array[String]]): Parser = js.native
  // The types below follow the order and documentation of https://github.com/substack/node-optimist
  /** Set key names as equivalent such that updates to a key will propagate to aliases and vice-versa. */
  def alias(key: String, alias: String): Parser = js.native
  def alias(key: String, alias: js.Array[String]): Parser = js.native
  
  /** Implicitly use process.argv array to construct the argv object */
  var argv: js.Any = js.native
  
  /** Interpret key as a boolean. If a non-flag option follows key in process.argv,
    that string won't get set as the value of key. If key never shows up as a
    flag in process.arguments, argv[key] will be false. */
  def boolean(key: String): Parser = js.native
  /** Interpret all the elements as booleans. */
  def boolean(key: js.Array[String]): Parser = js.native
  
  /** Check that certain conditions are met in the provided arguments. If fn
    throws or returns false, show the thrown error, usage information, and exit.
    */
  def check(fn: js.Function1[/* argv */ js.Any, _]): Parser = js.native
  
  /** Take an object that maps keys to default values */
  def default(defaults: StringDictionary[js.Any]): Parser = js.native
  /** Set argv[key] to value if no option was specified on process.argv */
  def default(key: String, value: js.Any): Parser = js.native
  
  /** Show the usage information and exit if key wasn't specified in process.argv */
  def demand(key: String): Parser = js.native
  /** Demand each element in key */
  def demand(key: js.Array[String]): Parser = js.native
  /** Demand at least as many non-option arguments, which show up in argv._ */
  def demand(key: Double): Parser = js.native
  
  /** Take an object that maps keys to descriptions */
  def describe(descriptions: StringDictionary[String]): Parser = js.native
  /** Describe a key for the generated usage information */
  def describe(key: String, desc: String): Parser = js.native
  
  /** Return the generated usage string. */
  def help(): String = js.native
  
  /** Instead of chaining together, e.g. optimist.alias().demand().default()...,
    you can specify keys in opt for each of the chainable methods. */
  def options(key: String, opt: Opt): Parser = js.native
  /** Take an object that maps keys to opt parameters */
  def options(options: StringDictionary[Opt]): Parser = js.native
  
  /** Use .parse() to do the same thing as treating optimist as a function */
  def parse(args: js.Array[String]): js.Any = js.native
  
  /** Print the usage data using fn for printing (defaults to console.error). */
  def showHelp(): Unit = js.native
  def showHelp(fn: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  /** Tell the parser logic not to interpret key as a number or boolean. This can be useful if you need to preserve leading zeros in an input. */
  def string(key: String): Parser = js.native
  /** Interpret all the elements as strings */
  def string(key: js.Array[String]): Parser = js.native
  
  /** Set a usage message to show which commands to use. Inside message,
    the string $0 will get interpolated to the current script name or node
    command for the present script similar to how $0 works in bash or perl. */
  def usage(message: String): Parser = js.native
  
  /** Format usage output to wrap at columns many columns. */
  def wrap(columns: Double): Parser = js.native
}
