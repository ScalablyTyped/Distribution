package typings.plotlyJs

import typings.plotlyJs.anon.PartialPieDataTitle
import typings.plotlyJs.anon.PartialPieDomain
import typings.plotlyJs.anon.PartialPieFont
import typings.plotlyJs.anon.PartialPieHoverLabel
import typings.plotlyJs.anon.PartialPieLine
import typings.plotlyJs.anon.PartialPieMarker
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.`bottom center`
import typings.plotlyJs.plotlyJsStrings.`bottom left`
import typings.plotlyJs.plotlyJsStrings.`bottom right`
import typings.plotlyJs.plotlyJsStrings.`middle center`
import typings.plotlyJs.plotlyJsStrings.`top center`
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.`top right`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.clockwise
import typings.plotlyJs.plotlyJsStrings.counterclockwise
import typings.plotlyJs.plotlyJsStrings.label
import typings.plotlyJs.plotlyJsStrings.labelPlussignpercent
import typings.plotlyJs.plotlyJsStrings.labelPlussigntext
import typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercent
import typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvalue
import typings.plotlyJs.plotlyJsStrings.labelPlussignvalue
import typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercent
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.legendonly
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.percent
import typings.plotlyJs.plotlyJsStrings.pie
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.text
import typings.plotlyJs.plotlyJsStrings.textPlussignpercent
import typings.plotlyJs.plotlyJsStrings.textPlussignvalue
import typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercent
import typings.plotlyJs.plotlyJsStrings.value
import typings.plotlyJs.plotlyJsStrings.valuePlussignpercent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracesPieMod {
  
  type PieColor = String | Double
  
  type PieColors = js.Array[js.UndefOr[PieColor | Null]]
  
  /* Inlined parent std.Pick<plotly.js.plotly.js.PlotData, 'name' | 'visible' | 'showlegend' | 'legendgroup' | 'opacity' | 'ids' | 'labels' | 'hovertext' | 'automargin' | 'textinfo' | 'direction' | 'hole' | 'rotation'> */
  trait PieData extends StObject {
    
    var automargin: Boolean
    
    var customdata: js.Array[Datum]
    
    var direction: clockwise | counterclockwise
    
    var dlabel: Double
    
    var domain: PartialPieDomain
    
    var hole: Double
    
    var hoverinfo: PieHoverInfo
    
    var hoverlabel: PartialPieHoverLabel
    
    var hovertemplate: String | js.Array[String]
    
    var hovertext: String | js.Array[String]
    
    var ids: js.Array[String]
    
    var insidetextfont: PieFont
    
    var insidetextorientation: PieInsideTextOrientation
    
    var label0: Double
    
    var labels: js.Array[Datum]
    
    var legendgroup: String
    
    var marker: PartialPieMarker
    
    var meta: Double | String
    
    var name: String
    
    var opacity: Double
    
    var outsidetextfont: PieFont
    
    var pull: Double | js.Array[Double]
    
    var rotation: Double
    
    var scalegroup: String
    
    var showlegend: Boolean
    
    var sort: Boolean
    
    var text: Datum | js.Array[Datum]
    
    var textfont: PieFont
    
    var textinfo: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
    
    var textposition: PieTextPosition | js.Array[PieTextPosition]
    
    var texttemplate: String | js.Array[String]
    
    var title: PartialPieDataTitle
    
    var `type`: pie
    
    var uirevision: Double | String
    
    var values: js.Array[Double | String]
    
    var visible: Boolean | legendonly
  }
  object PieData {
    
    inline def apply(
      automargin: Boolean,
      customdata: js.Array[Datum],
      direction: clockwise | counterclockwise,
      dlabel: Double,
      domain: PartialPieDomain,
      hole: Double,
      hoverinfo: PieHoverInfo,
      hoverlabel: PartialPieHoverLabel,
      hovertemplate: String | js.Array[String],
      hovertext: String | js.Array[String],
      ids: js.Array[String],
      insidetextfont: PieFont,
      insidetextorientation: PieInsideTextOrientation,
      label0: Double,
      labels: js.Array[Datum],
      legendgroup: String,
      marker: PartialPieMarker,
      meta: Double | String,
      name: String,
      opacity: Double,
      outsidetextfont: PieFont,
      pull: Double | js.Array[Double],
      rotation: Double,
      scalegroup: String,
      showlegend: Boolean,
      sort: Boolean,
      textfont: PieFont,
      textinfo: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none,
      textposition: PieTextPosition | js.Array[PieTextPosition],
      texttemplate: String | js.Array[String],
      title: PartialPieDataTitle,
      uirevision: Double | String,
      values: js.Array[Double | String],
      visible: Boolean | legendonly
    ): PieData = {
      val __obj = js.Dynamic.literal(automargin = automargin.asInstanceOf[js.Any], customdata = customdata.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dlabel = dlabel.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], hoverinfo = hoverinfo.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovertemplate = hovertemplate.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], insidetextfont = insidetextfont.asInstanceOf[js.Any], insidetextorientation = insidetextorientation.asInstanceOf[js.Any], label0 = label0.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], legendgroup = legendgroup.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outsidetextfont = outsidetextfont.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scalegroup = scalegroup.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any], textinfo = textinfo.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any], texttemplate = texttemplate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], text = null)
      __obj.updateDynamic("type")("pie")
      __obj.asInstanceOf[PieData]
    }
    
    extension [Self <: PieData](x: Self) {
      
      inline def setAutomargin(value: Boolean): Self = StObject.set(x, "automargin", value.asInstanceOf[js.Any])
      
      inline def setCustomdata(value: js.Array[Datum]): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
      
      inline def setCustomdataVarargs(value: Datum*): Self = StObject.set(x, "customdata", js.Array(value*))
      
      inline def setDirection(value: clockwise | counterclockwise): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDlabel(value: Double): Self = StObject.set(x, "dlabel", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: PartialPieDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
      
      inline def setHoverinfo(value: PieHoverInfo): Self = StObject.set(x, "hoverinfo", value.asInstanceOf[js.Any])
      
      inline def setHoverlabel(value: PartialPieHoverLabel): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
      
      inline def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
      
      inline def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value*))
      
      inline def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
      
      inline def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value*))
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setInsidetextfont(value: PieFont): Self = StObject.set(x, "insidetextfont", value.asInstanceOf[js.Any])
      
      inline def setInsidetextorientation(value: PieInsideTextOrientation): Self = StObject.set(x, "insidetextorientation", value.asInstanceOf[js.Any])
      
      inline def setLabel0(value: Double): Self = StObject.set(x, "label0", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[Datum]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: Datum*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLegendgroup(value: String): Self = StObject.set(x, "legendgroup", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: PartialPieMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Double | String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOutsidetextfont(value: PieFont): Self = StObject.set(x, "outsidetextfont", value.asInstanceOf[js.Any])
      
      inline def setPull(value: Double | js.Array[Double]): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullVarargs(value: Double*): Self = StObject.set(x, "pull", js.Array(value*))
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScalegroup(value: String): Self = StObject.set(x, "scalegroup", value.asInstanceOf[js.Any])
      
      inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setText(value: Datum | js.Array[Datum]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextVarargs(value: Datum*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextfont(value: PieFont): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
      
      inline def setTextinfo(
        value: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
      ): Self = StObject.set(x, "textinfo", value.asInstanceOf[js.Any])
      
      inline def setTextposition(value: PieTextPosition | js.Array[PieTextPosition]): Self = StObject.set(x, "textposition", value.asInstanceOf[js.Any])
      
      inline def setTextpositionVarargs(value: PieTextPosition*): Self = StObject.set(x, "textposition", js.Array(value*))
      
      inline def setTexttemplate(value: String | js.Array[String]): Self = StObject.set(x, "texttemplate", value.asInstanceOf[js.Any])
      
      inline def setTexttemplateVarargs(value: String*): Self = StObject.set(x, "texttemplate", js.Array(value*))
      
      inline def setTitle(value: PartialPieDataTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: pie): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<plotly.js.plotly.js.DataTitle, 'text' | 'position'> */
  trait PieDataTitle extends StObject {
    
    var font: PartialPieFont
    
    var position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    
    var text: String
  }
  object PieDataTitle {
    
    inline def apply(
      font: PartialPieFont,
      position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`),
      text: String
    ): PieDataTitle = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieDataTitle]
    }
    
    extension [Self <: PieDataTitle](x: Self) {
      
      inline def setFont(value: PartialPieFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setPosition(
        value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait PieDomain extends StObject {
    
    var column: Double
    
    var row: Double
    
    var x: js.Array[Double]
    
    var y: js.Array[Double]
  }
  object PieDomain {
    
    inline def apply(column: Double, row: Double, x: js.Array[Double], y: js.Array[Double]): PieDomain = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieDomain]
    }
    
    extension [Self <: PieDomain](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  trait PieFont extends StObject {
    
    var color: PieColor | PieColors
    
    var family: String | js.Array[String]
    
    var size: Double | js.Array[Double]
  }
  object PieFont {
    
    inline def apply(color: PieColor | PieColors, family: String | js.Array[String], size: Double | js.Array[Double]): PieFont = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieFont]
    }
    
    extension [Self <: PieFont](x: Self) {
      
      inline def setColor(value: PieColor | PieColors): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setFamily(value: String | js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value*))
      
      inline def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plotlyJs.plotlyJsStrings.all
    - typings.plotlyJs.plotlyJsStrings.none
    - typings.plotlyJs.plotlyJsStrings.skip
    - typings.plotlyJs.plotlyJsStrings.label
    - typings.plotlyJs.plotlyJsStrings.text
    - typings.plotlyJs.plotlyJsStrings.value
    - typings.plotlyJs.plotlyJsStrings.percent
    - typings.plotlyJs.plotlyJsStrings.name
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntext
    - typings.plotlyJs.plotlyJsStrings.labelPlussignvalue
    - typings.plotlyJs.plotlyJsStrings.labelPlussignpercent
    - typings.plotlyJs.plotlyJsStrings.labelPlussignname
    - typings.plotlyJs.plotlyJsStrings.textPlussignvalue
    - typings.plotlyJs.plotlyJsStrings.textPlussignpercent
    - typings.plotlyJs.plotlyJsStrings.textPlussignname
    - typings.plotlyJs.plotlyJsStrings.valuePlussignpercent
    - typings.plotlyJs.plotlyJsStrings.valuePlussignname
    - typings.plotlyJs.plotlyJsStrings.percentPlussignname
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvalue
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercent
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignname
    - typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercent
    - typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignname
    - typings.plotlyJs.plotlyJsStrings.labelPlussignpercentPlussignname
    - typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercent
    - typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignname
    - typings.plotlyJs.plotlyJsStrings.textPlussignpercentPlussignname
    - typings.plotlyJs.plotlyJsStrings.valuePlussignpercentPlussignname
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvaluePlussignpercent
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvaluePlussignname
    - typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercentPlussignname
    - typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercentPlussignname
    - typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercentPlussignname
  */
  trait PieHoverInfo extends StObject
  object PieHoverInfo {
    
    inline def all: typings.plotlyJs.plotlyJsStrings.all = "all".asInstanceOf[typings.plotlyJs.plotlyJsStrings.all]
    
    inline def label: typings.plotlyJs.plotlyJsStrings.label = "label".asInstanceOf[typings.plotlyJs.plotlyJsStrings.label]
    
    inline def labelPlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussignname = "label+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignname]
    
    inline def labelPlussignpercent: typings.plotlyJs.plotlyJsStrings.labelPlussignpercent = "label+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignpercent]
    
    inline def labelPlussignpercentPlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussignpercentPlussignname = "label+percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignpercentPlussignname]
    
    inline def labelPlussigntext: typings.plotlyJs.plotlyJsStrings.labelPlussigntext = "label+text".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntext]
    
    inline def labelPlussigntextPlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignname = "label+text+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignname]
    
    inline def labelPlussigntextPlussignpercent: typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercent = "label+text+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercent]
    
    inline def labelPlussigntextPlussignpercentPlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercentPlussignname = "label+text+percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercentPlussignname]
    
    inline def labelPlussigntextPlussignvalue: typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvalue = "label+text+value".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvalue]
    
    inline def labelPlussigntextPlussignvaluePlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvaluePlussignname = "label+text+value+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvaluePlussignname]
    
    inline def labelPlussigntextPlussignvaluePlussignpercent: typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvaluePlussignpercent = "label+text+value+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvaluePlussignpercent]
    
    inline def labelPlussignvalue: typings.plotlyJs.plotlyJsStrings.labelPlussignvalue = "label+value".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignvalue]
    
    inline def labelPlussignvaluePlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignname = "label+value+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignname]
    
    inline def labelPlussignvaluePlussignpercent: typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercent = "label+value+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercent]
    
    inline def labelPlussignvaluePlussignpercentPlussignname: typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercentPlussignname = "label+value+percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercentPlussignname]
    
    inline def name: typings.plotlyJs.plotlyJsStrings.name = "name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.name]
    
    inline def none: typings.plotlyJs.plotlyJsStrings.none = "none".asInstanceOf[typings.plotlyJs.plotlyJsStrings.none]
    
    inline def percent: typings.plotlyJs.plotlyJsStrings.percent = "percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.percent]
    
    inline def percentPlussignname: typings.plotlyJs.plotlyJsStrings.percentPlussignname = "percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.percentPlussignname]
    
    inline def skip: typings.plotlyJs.plotlyJsStrings.skip = "skip".asInstanceOf[typings.plotlyJs.plotlyJsStrings.skip]
    
    inline def text: typings.plotlyJs.plotlyJsStrings.text = "text".asInstanceOf[typings.plotlyJs.plotlyJsStrings.text]
    
    inline def textPlussignname: typings.plotlyJs.plotlyJsStrings.textPlussignname = "text+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignname]
    
    inline def textPlussignpercent: typings.plotlyJs.plotlyJsStrings.textPlussignpercent = "text+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignpercent]
    
    inline def textPlussignpercentPlussignname: typings.plotlyJs.plotlyJsStrings.textPlussignpercentPlussignname = "text+percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignpercentPlussignname]
    
    inline def textPlussignvalue: typings.plotlyJs.plotlyJsStrings.textPlussignvalue = "text+value".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignvalue]
    
    inline def textPlussignvaluePlussignname: typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignname = "text+value+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignname]
    
    inline def textPlussignvaluePlussignpercent: typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercent = "text+value+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercent]
    
    inline def textPlussignvaluePlussignpercentPlussignname: typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercentPlussignname = "text+value+percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercentPlussignname]
    
    inline def value: typings.plotlyJs.plotlyJsStrings.value = "value".asInstanceOf[typings.plotlyJs.plotlyJsStrings.value]
    
    inline def valuePlussignname: typings.plotlyJs.plotlyJsStrings.valuePlussignname = "value+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.valuePlussignname]
    
    inline def valuePlussignpercent: typings.plotlyJs.plotlyJsStrings.valuePlussignpercent = "value+percent".asInstanceOf[typings.plotlyJs.plotlyJsStrings.valuePlussignpercent]
    
    inline def valuePlussignpercentPlussignname: typings.plotlyJs.plotlyJsStrings.valuePlussignpercentPlussignname = "value+percent+name".asInstanceOf[typings.plotlyJs.plotlyJsStrings.valuePlussignpercentPlussignname]
  }
  
  trait PieHoverLabel extends StObject {
    
    var align: left | right | auto | (js.Array[left | right | auto])
    
    var bgcolor: PieColor | PieColors
    
    var bordercolor: PieColor | PieColors
    
    var font: PieFont
    
    var namelength: Double | js.Array[Double]
  }
  object PieHoverLabel {
    
    inline def apply(
      align: left | right | auto | (js.Array[left | right | auto]),
      bgcolor: PieColor | PieColors,
      bordercolor: PieColor | PieColors,
      font: PieFont,
      namelength: Double | js.Array[Double]
    ): PieHoverLabel = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], namelength = namelength.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieHoverLabel]
    }
    
    extension [Self <: PieHoverLabel](x: Self) {
      
      inline def setAlign(value: left | right | auto | (js.Array[left | right | auto])): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignVarargs(value: (left | right | auto)*): Self = StObject.set(x, "align", js.Array(value*))
      
      inline def setBgcolor(value: PieColor | PieColors): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
      
      inline def setBordercolor(value: PieColor | PieColors): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
      
      inline def setBordercolorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
      
      inline def setFont(value: PieFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setNamelength(value: Double | js.Array[Double]): Self = StObject.set(x, "namelength", value.asInstanceOf[js.Any])
      
      inline def setNamelengthVarargs(value: Double*): Self = StObject.set(x, "namelength", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plotlyJs.plotlyJsStrings.horizontal
    - typings.plotlyJs.plotlyJsStrings.radial
    - typings.plotlyJs.plotlyJsStrings.tangential
    - typings.plotlyJs.plotlyJsStrings.auto
  */
  trait PieInsideTextOrientation extends StObject
  object PieInsideTextOrientation {
    
    inline def auto: typings.plotlyJs.plotlyJsStrings.auto = "auto".asInstanceOf[typings.plotlyJs.plotlyJsStrings.auto]
    
    inline def horizontal: typings.plotlyJs.plotlyJsStrings.horizontal = "horizontal".asInstanceOf[typings.plotlyJs.plotlyJsStrings.horizontal]
    
    inline def radial: typings.plotlyJs.plotlyJsStrings.radial = "radial".asInstanceOf[typings.plotlyJs.plotlyJsStrings.radial]
    
    inline def tangential: typings.plotlyJs.plotlyJsStrings.tangential = "tangential".asInstanceOf[typings.plotlyJs.plotlyJsStrings.tangential]
  }
  
  trait PieLine extends StObject {
    
    var color: PieColor | PieColors
    
    var width: Double | js.Array[Double]
  }
  object PieLine {
    
    inline def apply(color: PieColor | PieColors, width: Double | js.Array[Double]): PieLine = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieLine]
    }
    
    extension [Self <: PieLine](x: Self) {
      
      inline def setColor(value: PieColor | PieColors): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value*))
    }
  }
  
  trait PieMarker extends StObject {
    
    var colors: PieColors
    
    var line: PartialPieLine
  }
  object PieMarker {
    
    inline def apply(colors: PieColors, line: PartialPieLine): PieMarker = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieMarker]
    }
    
    extension [Self <: PieMarker](x: Self) {
      
      inline def setColors(value: PieColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setLine(value: PartialPieLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plotlyJs.plotlyJsStrings.inside
    - typings.plotlyJs.plotlyJsStrings.outside
    - typings.plotlyJs.plotlyJsStrings.auto
    - typings.plotlyJs.plotlyJsStrings.none
  */
  trait PieTextPosition extends StObject
  object PieTextPosition {
    
    inline def auto: typings.plotlyJs.plotlyJsStrings.auto = "auto".asInstanceOf[typings.plotlyJs.plotlyJsStrings.auto]
    
    inline def inside: typings.plotlyJs.plotlyJsStrings.inside = "inside".asInstanceOf[typings.plotlyJs.plotlyJsStrings.inside]
    
    inline def none: typings.plotlyJs.plotlyJsStrings.none = "none".asInstanceOf[typings.plotlyJs.plotlyJsStrings.none]
    
    inline def outside: typings.plotlyJs.plotlyJsStrings.outside = "outside".asInstanceOf[typings.plotlyJs.plotlyJsStrings.outside]
  }
}
