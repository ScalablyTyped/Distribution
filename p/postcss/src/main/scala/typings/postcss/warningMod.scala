package typings.postcss

import typings.postcss.cssSyntaxErrorMod.RangePosition
import typings.postcss.postcssStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  @JSImport("postcss/lib/warning", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Warning {
    /**
      * @param text Warning message.
      * @param opts Warning options.
      */
    def this(text: String) = this()
    def this(text: String, opts: WarningOptions) = this()
    
    /**
      * Column for inclusive start position in the input file with this warning’s source.
      *
      * ```js
      * warning.column //=> 6
      * ```
      */
    /* CompleteClass */
    var column: Double = js.native
    
    /**
      * Line for inclusive start position in the input file with this warning’s source.
      *
      * ```js
      * warning.line //=> 5
      * ```
      */
    /* CompleteClass */
    var line: Double = js.native
    
    /**
      * Contains the CSS node that caused the warning.
      *
      * ```js
      * warning.node.toString() //=> 'color: white !important'
      * ```
      */
    /* CompleteClass */
    var node: typings.postcss.nodeMod.default = js.native
    
    /**
      * The name of the plugin that created this warning.
      * When you call `Node#warn` it will fill this property automatically.
      *
      * ```js
      * warning.plugin //=> 'postcss-important'
      * ```
      */
    /* CompleteClass */
    var plugin: String = js.native
    
    /**
      * The warning message.
      *
      * ```js
      * warning.text //=> 'Try to avoid !important'
      * ```
      */
    /* CompleteClass */
    var text: String = js.native
    
    /**
      * Type to filter warnings from `Result#messages`.
      * Always equal to `"warning"`.
      */
    /* CompleteClass */
    var `type`: warning = js.native
  }
  
  trait Warning extends StObject {
    
    /**
      * Column for inclusive start position in the input file with this warning’s source.
      *
      * ```js
      * warning.column //=> 6
      * ```
      */
    var column: Double
    
    /**
      * Column for exclusive end position in the input file with this warning’s source.
      *
      * ```js
      * warning.endColumn //=> 4
      * ```
      */
    var endColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * Line for exclusive end position in the input file with this warning’s source.
      *
      * ```js
      * warning.endLine //=> 6
      * ```
      */
    var endLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Line for inclusive start position in the input file with this warning’s source.
      *
      * ```js
      * warning.line //=> 5
      * ```
      */
    var line: Double
    
    /**
      * Contains the CSS node that caused the warning.
      *
      * ```js
      * warning.node.toString() //=> 'color: white !important'
      * ```
      */
    var node: typings.postcss.nodeMod.default
    
    /**
      * The name of the plugin that created this warning.
      * When you call `Node#warn` it will fill this property automatically.
      *
      * ```js
      * warning.plugin //=> 'postcss-important'
      * ```
      */
    var plugin: String
    
    /**
      * The warning message.
      *
      * ```js
      * warning.text //=> 'Try to avoid !important'
      * ```
      */
    var text: String
    
    /**
      * Type to filter warnings from `Result#messages`.
      * Always equal to `"warning"`.
      */
    var `type`: warning
  }
  object Warning {
    
    inline def apply(column: Double, line: Double, node: typings.postcss.nodeMod.default, plugin: String, text: String): Warning = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("warning")
      __obj.asInstanceOf[Warning]
    }
    
    extension [Self <: Warning](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typings.postcss.nodeMod.default): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WarningOptions extends StObject {
    
    /**
      * End position, exclusive, in CSS node string that caused the warning.
      */
    var end: js.UndefOr[RangePosition] = js.undefined
    
    /**
      * End index, exclusive, in CSS node string that caused the warning.
      */
    var endIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Start index, inclusive, in CSS node string that caused the warning.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * CSS node that caused the warning.
      */
    var node: js.UndefOr[typings.postcss.nodeMod.default] = js.undefined
    
    /**
      * Name of the plugin that created this warning. `Result#warn` fills
      * this property automatically.
      */
    var plugin: js.UndefOr[String] = js.undefined
    
    /**
      * Start position, inclusive, in CSS node string that caused the warning.
      */
    var start: js.UndefOr[RangePosition] = js.undefined
    
    /**
      * Word in CSS source that caused the warning.
      */
    var word: js.UndefOr[String] = js.undefined
  }
  object WarningOptions {
    
    inline def apply(): WarningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningOptions]
    }
    
    extension [Self <: WarningOptions](x: Self) {
      
      inline def setEnd(value: RangePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setNode(value: typings.postcss.nodeMod.default): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setStart(value: RangePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
}
