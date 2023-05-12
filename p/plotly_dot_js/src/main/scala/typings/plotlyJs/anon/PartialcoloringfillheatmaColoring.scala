package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.Equalssign
import typings.plotlyJs.plotlyJsStrings.Greaterthansign
import typings.plotlyJs.plotlyJsStrings.GreaterthansignEqualssign
import typings.plotlyJs.plotlyJsStrings.Lessthansign
import typings.plotlyJs.plotlyJsStrings.LessthansignEqualssign
import typings.plotlyJs.plotlyJsStrings.`[]`
import typings.plotlyJs.plotlyJsStrings.`][`
import typings.plotlyJs.plotlyJsStrings.constraint
import typings.plotlyJs.plotlyJsStrings.fill
import typings.plotlyJs.plotlyJsStrings.heatmap
import typings.plotlyJs.plotlyJsStrings.levels
import typings.plotlyJs.plotlyJsStrings.lines
import typings.plotlyJs.plotlyJsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  coloring :'fill' | 'heatmap' | 'lines' | 'none',   end :number,   labelfont :std.Partial<plotly.js.plotly.js.Font>,   labelformat :string,   operation :'=' | '<' | '>=' | '>' | '<=' | '[]' | '()' | '[)' | '(]' | '][' | ')(' | '](' | ')[',   showlabels :boolean,   showlines :boolean,   size :number,   start :number,   type :'levels' | 'constraint',   value :number | [lowerBound: number, upperBound: number]}> */
trait PartialcoloringfillheatmaColoring extends StObject {
  
  var coloring: js.UndefOr[fill | heatmap | lines | none] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var labelfont: js.UndefOr[PartialFont] = js.undefined
  
  var labelformat: js.UndefOr[String] = js.undefined
  
  var operation: js.UndefOr[
    Equalssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign | LessthansignEqualssign | `[]` | (/* () */ String) | `][`
  ] = js.undefined
  
  var showlabels: js.UndefOr[Boolean] = js.undefined
  
  var showlines: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[levels | constraint] = js.undefined
  
  var value: js.UndefOr[Double | (js.Tuple2[/* lowerBound */ Double, /* upperBound */ Double])] = js.undefined
}
object PartialcoloringfillheatmaColoring {
  
  inline def apply(): PartialcoloringfillheatmaColoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcoloringfillheatmaColoring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialcoloringfillheatmaColoring] (val x: Self) extends AnyVal {
    
    inline def setColoring(value: fill | heatmap | lines | none): Self = StObject.set(x, "coloring", value.asInstanceOf[js.Any])
    
    inline def setColoringUndefined: Self = StObject.set(x, "coloring", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setLabelfont(value: PartialFont): Self = StObject.set(x, "labelfont", value.asInstanceOf[js.Any])
    
    inline def setLabelfontUndefined: Self = StObject.set(x, "labelfont", js.undefined)
    
    inline def setLabelformat(value: String): Self = StObject.set(x, "labelformat", value.asInstanceOf[js.Any])
    
    inline def setLabelformatUndefined: Self = StObject.set(x, "labelformat", js.undefined)
    
    inline def setOperation(
      value: Equalssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign | LessthansignEqualssign | `[]` | (/* () */ String) | `][`
    ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setShowlabels(value: Boolean): Self = StObject.set(x, "showlabels", value.asInstanceOf[js.Any])
    
    inline def setShowlabelsUndefined: Self = StObject.set(x, "showlabels", js.undefined)
    
    inline def setShowlines(value: Boolean): Self = StObject.set(x, "showlines", value.asInstanceOf[js.Any])
    
    inline def setShowlinesUndefined: Self = StObject.set(x, "showlines", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: levels | constraint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double | (js.Tuple2[/* lowerBound */ Double, /* upperBound */ Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
