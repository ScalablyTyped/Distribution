package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.formattersMod.Formatter
import typings.plottable.interfacesMod.IEntity
import typings.plottable.interfacesMod.Point
import typings.plottable.scalesMod.Color
import typings.plottable.symbolFactoriesMod.SymbolFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("plottable/build/src/components/legend", "Legend")
  @js.native
  class Legend protected () extends Component {
    /**
      * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
      *
      * @constructor
      * @param {Scale.Color} scale
      */
    def this(colorScale: Color) = this()
    
    /* private */ def _buildLegendTable(width: js.Any, height: js.Any): js.Any = js.native
    
    var _colorScale: js.Any = js.native
    
    var _comparator: js.Any = js.native
    
    var _formatter: js.Any = js.native
    
    var _maxEntriesPerRow: js.Any = js.native
    
    var _maxLinesPerEntry: js.Any = js.native
    
    var _maxWidth: js.Any = js.native
    
    var _measurer: js.Any = js.native
    
    var _padding: js.Any = js.native
    
    var _redrawCallback: js.Any = js.native
    
    var _rowBottomPadding: js.Any = js.native
    
    var _symbolFactoryAccessor: js.Any = js.native
    
    var _symbolOpacityAccessor: js.Any = js.native
    
    var _wrapper: js.Any = js.native
    
    var _writer: js.Any = js.native
    
    /**
      * Gets the Color Scale.
      *
      * @returns {Scales.Color}
      */
    def colorScale(): Color = js.native
    /**
      * Sets the Color Scale.
      *
      * @param {Scales.Color} scale
      * @returns {Legend} The calling Legend.
      */
    def colorScale(colorScale: Color): this.type = js.native
    
    /**
      * Gets the current comparator for the Legend's entries.
      *
      * @returns {(a: string, b: string) => number}
      */
    def comparator(): js.Function2[/* a */ String, /* b */ String, Double] = js.native
    /**
      * Sets a new comparator for the Legend's entries.
      * The comparator is used to set the display order of the entries.
      *
      * @param {(a: string, b: string) => number} comparator
      * @returns {Legend} The calling Legend.
      */
    def comparator(comparator: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Gets the Entities (representing Legend entries) at a particular point.
      * Returns an empty array if no Entities are present at that location.
      *
      * @param {Point} p
      * @returns {Entity<Legend>[]}
      */
    def entitiesAt(p: Point): js.Array[IEntity[Legend]] = js.native
    
    /**
      * Gets the Formatter for the entry texts.
      */
    def formatter(): Formatter = js.native
    /**
      * Sets the Formatter for the entry texts. The name of each entry (as defined by the domain of this legend's
      * Color Scale) will be passed through this formatter before being displayed.
      *
      * @param {Formatter} formatter
      * @returns {Legend} The calling Legend.
      */
    def formatter(formatter: Formatter): this.type = js.native
    
    /**
      * Gets the maximum number of entries per row.
      *
      * @returns {number}
      */
    def maxEntriesPerRow(): Double = js.native
    /**
      * Sets the maximum number of entries per row.
      *
      * @param {number} maxEntriesPerRow
      * @returns {Legend} The calling Legend.
      */
    def maxEntriesPerRow(maxEntriesPerRow: Double): this.type = js.native
    
    /**
      * Gets the maximum lines per row.
      *
      * @returns {number}
      */
    def maxLinesPerEntry(): Double = js.native
    /**
      * Sets the maximum number of lines per entry. This is distinct from
      * maxEntriesPerRow in that, maxEntriesPerRow determines the maximum allowable
      * number of series labels that may be displayed per row whereas maxLinesPerEntry
      * specifies the maximum number of times a single entry may be broken into new
      * lines before being truncated.
      *
      * @param {number} maxLinesPerEntry
      * @returns {Legend} The calling Legend.
      */
    def maxLinesPerEntry(maxLinesPerEntry: Double): this.type = js.native
    
    /**
      * Gets the maximum width of the legend in pixels.
      * @returns {number}
      */
    def maxWidth(): Double = js.native
    /**
      * Sets the maximum width of the legend in pixels.
      * @param {number} maxWidth The maximum width in pixels.
      * @returns {Legend}
      */
    def maxWidth(maxWidth: Double): this.type = js.native
    
    /**
      * Gets the function determining the symbols of the Legend.
      *
      * @returns {(datum: any, index: number) => symbolFactory}
      */
    def symbol(): js.Function2[/* datum */ js.Any, /* index */ Double, SymbolFactory] = js.native
    /**
      * Sets the function determining the symbols of the Legend.
      *
      * @param {(datum: any, index: number) => SymbolFactory} symbol
      * @returns {Legend} The calling Legend
      */
    def symbol(symbol: js.Function2[/* datum */ js.Any, /* index */ Double, SymbolFactory]): this.type = js.native
    
    /**
      * Gets the opacity of the symbols of the Legend.
      *
      * @returns {(datum: any, index: number) => number}
      */
    def symbolOpacity(): js.Function2[/* datum */ js.Any, /* index */ Double, Double] = js.native
    def symbolOpacity(symbolOpacity: js.Function2[/* datum */ js.Any, /* index */ Double, Double]): this.type = js.native
    /**
      * Sets the opacity of the symbols of the Legend.
      *
      * @param {number | ((datum: any, index: number) => number)} symbolOpacity
      * @returns {Legend} The calling Legend
      */
    def symbolOpacity(symbolOpacity: Double): this.type = js.native
  }
  /* static members */
  object Legend {
    
    @JSImport("plottable/build/src/components/legend", "Legend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to each legend entry
      */
    @JSImport("plottable/build/src/components/legend", "Legend.LEGEND_ENTRY_CLASS")
    @js.native
    def LEGEND_ENTRY_CLASS: String = js.native
    @scala.inline
    def LEGEND_ENTRY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ENTRY_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend row
      */
    @JSImport("plottable/build/src/components/legend", "Legend.LEGEND_ROW_CLASS")
    @js.native
    def LEGEND_ROW_CLASS: String = js.native
    @scala.inline
    def LEGEND_ROW_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ROW_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend symbol
      */
    @JSImport("plottable/build/src/components/legend", "Legend.LEGEND_SYMBOL_CLASS")
    @js.native
    def LEGEND_SYMBOL_CLASS: String = js.native
    @scala.inline
    def LEGEND_SYMBOL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_SYMBOL_CLASS")(x.asInstanceOf[js.Any])
  }
}
