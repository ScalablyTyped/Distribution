package typings.postcss

import typings.postcss.anon.Col
import typings.postcss.mod.ProcessOptions
import typings.postcss.postcssBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("postcss/lib/input", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Input {
    /**
      * @param css  Input CSS source.
      * @param opts Process options.
      */
    def this(css: String) = this()
    def this(css: String, opts: ProcessOptions) = this()
  }
  
  trait FilePosition extends StObject {
    
    /**
      * Column of inclusive start position in source file.
      */
    var column: Double
    
    /**
      * Column of exclusive end position in source file.
      */
    var endColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * Line of exclusive end position in source file.
      */
    var endLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Absolute path to the source file.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Line of inclusive start position in source file.
      */
    var line: Double
    
    /**
      * Source code.
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * URL for the source file.
      */
    var url: String
  }
  object FilePosition {
    
    inline def apply(column: Double, line: Double, url: String): FilePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePosition]
    }
    
    extension [Self <: FilePosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Input extends StObject {
    
    /**
      * Input CSS source.
      *
      * ```js
      * const input = postcss.parse('a{}', { from: file }).input
      * input.css //=> "a{}"
      * ```
      */
    var css: String = js.native
    
    /**
      * The absolute path to the CSS source file defined
      * with the `from` option.
      *
      * ```js
      * const root = postcss.parse(css, { from: 'a.css' })
      * root.source.input.file //=> '/home/ai/a.css'
      * ```
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * The CSS source identifier. Contains `Input#file` if the user
      * set the `from` option, or `Input#id` if they did not.
      *
      * ```js
      * const root = postcss.parse(css, { from: 'a.css' })
      * root.source.input.from //=> "/home/ai/a.css"
      *
      * const root = postcss.parse(css)
      * root.source.input.from //=> "<input css 1>"
      * ```
      */
    def from: String = js.native
    
    /**
      * Converts source offset to line and column.
      *
      * @param offset Source offset.
      */
    def fromOffset(offset: Double): Col | Null = js.native
    
    /**
      * The flag to indicate whether or not the source code has Unicode BOM.
      */
    var hasBOM: Boolean = js.native
    
    /**
      * The unique ID of the CSS source. It will be created if `from` option
      * is not provided (because PostCSS does not know the file path).
      *
      * ```js
      * const root = postcss.parse(css)
      * root.source.input.file //=> undefined
      * root.source.input.id   //=> "<input css 8LZeVF>"
      * ```
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * The input source map passed from a compilation step before PostCSS
      * (for example, from Sass compiler).
      *
      * ```js
      * root.source.input.map.consumer().sources //=> ['a.sass']
      * ```
      */
    var map: typings.postcss.previousMapMod.default = js.native
    
    /**
      * Reads the input source map and returns a symbol position
      * in the input source (e.g., in a Sass file that was compiled
      * to CSS before being passed to PostCSS). Optionally takes an
      * end position, exclusive.
      *
      * ```js
      * root.source.input.origin(1, 1) //=> { file: 'a.css', line: 3, column: 1 }
      * root.source.input.origin(1, 1, 1, 4)
      * //=> { file: 'a.css', line: 3, column: 1, endLine: 3, endColumn: 4 }
      * ```
      *
      * @param line      Line for inclusive start position in input CSS.
      * @param column    Column for inclusive start position in input CSS.
      * @param endLine   Line for exclusive end position in input CSS.
      * @param endColumn Column for exclusive end position in input CSS.
      *
      * @return Position in input source.
      */
    def origin(line: Double, column: Double): FilePosition | `false` = js.native
    def origin(line: Double, column: Double, endLine: Double): FilePosition | `false` = js.native
    def origin(line: Double, column: Double, endLine: Double, endColumn: Double): FilePosition | `false` = js.native
    def origin(line: Double, column: Double, endLine: Unit, endColumn: Double): FilePosition | `false` = js.native
  }
}
