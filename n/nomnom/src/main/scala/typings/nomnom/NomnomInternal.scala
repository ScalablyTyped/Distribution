package typings.nomnom

import org.scalablytyped.runtime.StringDictionary
import typings.nomnom.NomnomInternal.Parser.Command
import typings.nomnom.NomnomInternal.Parser.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NomnomInternal {
  
  @js.native
  trait Parser extends StObject {
    
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
    def nom(): Any = js.native
    def nom(argv: js.Array[String]): Any = js.native
    
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
    def parse(): Any = js.native
    def parse(argv: js.Array[String]): Any = js.native
    
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
  /**
    * The command-line parser.
    */
  object Parser {
    
    trait Command extends StObject {
      
      /**
        * Sets a callback for the command.
        * @param func The callback function.
        * @returns The command.
        */
      def callback(func: js.Function1[/* options */ Any, Unit]): Command
      
      /**
        * Sets the help string for the command.
        * @param help The help string.
        * @returns The command.
        */
      def help(help: String): Command
      
      /**
        * The name of the command.
        */
      var name: String
      
      /**
        * Sets an option of the command.
        * @param name The name of the option.
        * @param spec The specifiction of the option.
        * @returns The command.
        */
      def option(name: String, spec: Option): Command
      
      /**
        * Sets the options of the command.
        * @param specs The specifications of the options.
        * @returns The command.
        */
      def options(specs: StringDictionary[Option]): Command
      
      /**
        * Sets the usage string for the command.
        * @param usage The usage string.
        * @returns The command.
        */
      def usage(usage: String): Command
    }
    object Command {
      
      inline def apply(
        callback: js.Function1[/* options */ Any, Unit] => Command,
        help: String => Command,
        name: String,
        option: (String, Option) => Command,
        options: StringDictionary[Option] => Command,
        usage: String => Command
      ): Command = {
        val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), help = js.Any.fromFunction1(help), name = name.asInstanceOf[js.Any], option = js.Any.fromFunction2(option), options = js.Any.fromFunction1(options), usage = js.Any.fromFunction1(usage))
        __obj.asInstanceOf[Command]
      }
      
      extension [Self <: Command](x: Self) {
        
        inline def setCallback(value: js.Function1[/* options */ Any, Unit] => Command): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        inline def setHelp(value: String => Command): Self = StObject.set(x, "help", js.Any.fromFunction1(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOption(value: (String, Option) => Command): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
        
        inline def setOptions(value: StringDictionary[Option] => Command): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
        
        inline def setUsage(value: String => Command): Self = StObject.set(x, "usage", js.Any.fromFunction1(value))
      }
    }
    
    trait Option extends StObject {
      
      /**
        * The default value of the option.
        */
      var default: js.UndefOr[Any] = js.undefined
      
      /**
        * The abbreviated name of the option.
        */
      var abbr: js.UndefOr[String] = js.undefined
      
      /**
        * A callback for the option.
        */
      var callback: js.UndefOr[js.Function1[/* option */ Any, String]] = js.undefined
      
      /**
        * The choices for the option.
        */
      var choices: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Whether the option is a flag.
        */
      var flag: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The full name of the option.
        */
      var full: js.UndefOr[String] = js.undefined
      
      /**
        * A help string for the option.
        */
      var help: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the option is hidden.
        */
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether the option is a list.
        */
      var list: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A string to be used in the usage printout.
        */
      var metavar: js.UndefOr[String] = js.undefined
      
      /**
        * The position of the option if it's a positional argument.
        */
      var position: js.UndefOr[Double] = js.undefined
      
      /**
        * Whether the option is required.
        */
      var required: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A shorthand for abbr, full, and metavar.
        */
      var string: js.UndefOr[String] = js.undefined
      
      /**
        * If you don't want the option JSON-parsed, specify type "string".
        */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Option {
      
      inline def apply(): Option = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Option]
      }
      
      extension [Self <: Option](x: Self) {
        
        inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
        
        inline def setCallback(value: /* option */ Any => String): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
        
        inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
        
        inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
        
        inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setFlag(value: Boolean): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
        
        inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
        
        inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
        
        inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
        
        inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
        
        inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setList(value: Boolean): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        inline def setMetavar(value: String): Self = StObject.set(x, "metavar", value.asInstanceOf[js.Any])
        
        inline def setMetavarUndefined: Self = StObject.set(x, "metavar", js.undefined)
        
        inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
        
        inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
}
