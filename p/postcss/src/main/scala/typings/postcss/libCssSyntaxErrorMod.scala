package typings.postcss

import typings.postcss.libInputMod.FilePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCssSyntaxErrorMod {
  
  @JSImport("postcss/lib/css-syntax-error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CssSyntaxError {
    /**
      * Instantiates a CSS syntax error. Can be instantiated for a single position
      * or for a range.
      * @param message        Error message.
      * @param lineOrStartPos If for a single position, the line number, or if for
      *                       a range, the inclusive start position of the error.
      * @param columnOrEndPos If for a single position, the column number, or if for
      *                       a range, the exclusive end position of the error.
      * @param source         Source code of the broken file.
      * @param file           Absolute path to the broken file.
      * @param plugin         PostCSS plugin name, if error came from plugin.
      */
    def this(
      message: String,
      lineOrStartPos: js.UndefOr[Double | RangePosition],
      columnOrEndPos: js.UndefOr[Double | RangePosition],
      source: js.UndefOr[String],
      file: js.UndefOr[String],
      plugin: js.UndefOr[String]
    ) = this()
  }
  
  @js.native
  trait CssSyntaxError extends StObject {
    
    /**
      * Source column of the error.
      *
      * ```js
      * error.column       //=> 1
      * error.input.column //=> 4
      * ```
      *
      * PostCSS will use the input source map to detect the original location.
      * If you need the position in the PostCSS input, use `error.input.column`.
      */
    var column: js.UndefOr[Double] = js.native
    
    /**
      * Source column of the error's end, exclusive. Provided if the error pertains
      * to a range.
      *
      * ```js
      * error.endColumn       //=> 1
      * error.input.endColumn //=> 4
      * ```
      *
      * PostCSS will use the input source map to detect the original location.
      * If you need the position in the PostCSS input, use `error.input.endColumn`.
      */
    var endColumn: js.UndefOr[Double] = js.native
    
    /**
      * Source line of the error's end, exclusive. Provided if the error pertains
      * to a range.
      *
      * ```js
      * error.endLine       //=> 3
      * error.input.endLine //=> 4
      * ```
      *
      * PostCSS will use the input source map to detect the original location.
      * If you need the position in the PostCSS input, use `error.input.endLine`.
      */
    var endLine: js.UndefOr[Double] = js.native
    
    /**
      * Absolute path to the broken file.
      *
      * ```js
      * error.file       //=> 'a.sass'
      * error.input.file //=> 'a.css'
      * ```
      *
      * PostCSS will use the input source map to detect the original location.
      * If you need the position in the PostCSS input, use `error.input.file`.
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * Input object with PostCSS internal information
      * about input file. If input has source map
      * from previous tool, PostCSS will use origin
      * (for example, Sass) source. You can use this
      * object to get PostCSS input source.
      *
      * ```js
      * error.input.file //=> 'a.css'
      * error.file       //=> 'a.sass'
      * ```
      */
    var input: js.UndefOr[FilePosition] = js.native
    
    /**
      * Source line of the error.
      *
      * ```js
      * error.line       //=> 2
      * error.input.line //=> 4
      * ```
      *
      * PostCSS will use the input source map to detect the original location.
      * If you need the position in the PostCSS input, use `error.input.line`.
      */
    var line: js.UndefOr[Double] = js.native
    
    /**
      * Full error text in the GNU error format
      * with plugin, file, line and column.
      *
      * ```js
      * error.message //=> 'a.css:1:1: Unclosed block'
      * ```
      */
    var message: String = js.native
    
    /**
      * Always equal to `'CssSyntaxError'`. You should always check error type
      * by `error.name === 'CssSyntaxError'`
      * instead of `error instanceof CssSyntaxError`,
      * because npm could have several PostCSS versions.
      *
      * ```js
      * if (error.name === 'CssSyntaxError') {
      *   error //=> CssSyntaxError
      * }
      * ```
      */
    var name: typings.postcss.postcssStrings.CssSyntaxError = js.native
    
    /**
      * Plugin name, if error came from plugin.
      *
      * ```js
      * error.plugin //=> 'postcss-vars'
      * ```
      */
    var plugin: js.UndefOr[String] = js.native
    
    /**
      * Error message.
      *
      * ```js
      * error.message //=> 'Unclosed block'
      * ```
      */
    var reason: String = js.native
    
    /**
      * Returns a few lines of CSS source that caused the error.
      *
      * If the CSS has an input source map without `sourceContent`,
      * this method will return an empty string.
      *
      * ```js
      * error.showSourceCode() //=> "  4 | }
      *                        //      5 | a {
      *                        //    > 6 |   bad
      *                        //        |   ^
      *                        //      7 | }
      *                        //      8 | b {"
      * ```
      *
      * @param color Whether arrow will be colored red by terminal
      *              color codes. By default, PostCSS will detect
      *              color support by `process.stdout.isTTY`
      *              and `process.env.NODE_DISABLE_COLORS`.
      * @return Few lines of CSS source that caused the error.
      */
    def showSourceCode(): String = js.native
    def showSourceCode(color: Boolean): String = js.native
    
    /**
      * Source code of the broken file.
      *
      * ```js
      * error.source       //=> 'a { b {} }'
      * error.input.source //=> 'a b { }'
      * ```
      */
    var source: js.UndefOr[String] = js.native
    
    var stack: String = js.native
  }
  
  trait RangePosition extends StObject {
    
    /**
      * The column number in the input.
      */
    var column: Double
    
    /**
      * The line number in the input.
      */
    var line: Double
  }
  object RangePosition {
    
    inline def apply(column: Double, line: Double): RangePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePosition]
    }
    
    extension [Self <: RangePosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
