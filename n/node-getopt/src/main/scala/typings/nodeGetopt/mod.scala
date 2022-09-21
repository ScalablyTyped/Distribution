package typings.nodeGetopt

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-getopt", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Getopt {
    /**
      * options is a set of option. each option contains 3 fields.
      *    [short_name, long_name_with_definition, comment]
      *    Definition:
      *    * '=ARG':   has argument
      *    * '[=ARG]': has argument but optional
      *    * '+':      multiple option supported
      *
      *    ARG can be replaced by any word.
      * @param options
      */
    def this(options: js.Array[Any]) = this()
  }
  @JSImport("node-getopt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("node-getopt", "HAS_ARGUMENT")
  @js.native
  def HAS_ARGUMENT: Boolean = js.native
  inline def HAS_ARGUMENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HAS_ARGUMENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-getopt", "MULTI_SUPPORTED")
  @js.native
  def MULTI_SUPPORTED: Boolean = js.native
  inline def MULTI_SUPPORTED_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MULTI_SUPPORTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-getopt", "NO_ARGUMENT")
  @js.native
  def NO_ARGUMENT: Boolean = js.native
  inline def NO_ARGUMENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_ARGUMENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-getopt", "SINGLE_ONLY")
  @js.native
  def SINGLE_ONLY: Boolean = js.native
  inline def SINGLE_ONLY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINGLE_ONLY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-getopt", "VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * equals new Getopt(options)
    * @param options
    */
  /* static member */
  inline def create(options: js.Array[js.Array[String]]): Getopt = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Getopt]
  
  /* static member */
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  type ErrorFunc = js.Function1[/* exception */ js.Error, Unit]
  
  type EventCallback = js.Function2[/* args */ js.Array[String], /* options */ OptionMap, Unit]
  
  @js.native
  trait Getopt extends StObject {
    
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
  
  type OptionConfigurationArray = NumberDictionary[js.Array[String]]
  
  type OptionMap = StringDictionary[String | js.Array[String] | Boolean]
  
  /**
    * Parsed options.
    */
  trait ParsedOption extends StObject {
    
    var argv: js.Array[String]
    
    def empty(): Boolean
    
    var options: OptionMap
  }
  object ParsedOption {
    
    inline def apply(argv: js.Array[String], empty: () => Boolean, options: OptionMap): ParsedOption = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOption]
    }
    
    extension [Self <: ParsedOption](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setOptions(value: OptionMap): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
