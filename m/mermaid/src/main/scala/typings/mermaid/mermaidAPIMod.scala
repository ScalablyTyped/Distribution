package typings.mermaid

import typings.mermaid.mermaidAPIMod.mermaidAPI.Config
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mermaidAPIMod {
  
  object default {
    
    @JSImport("mermaid/mermaidAPI", "default.LogLevel")
    @js.native
    object LogLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel with Double] = js.native
      
      /* 1 */ val Debug: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Debug with Double = js.native
      
      /* 2 */ val Error: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Error with Double = js.native
      
      /* 3 */ val Fatal: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Fatal with Double = js.native
      
      /* 0 */ val Info: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Info with Double = js.native
      
      /* 1 */ val Warn: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Warn with Double = js.native
    }
    
    @JSImport("mermaid/mermaidAPI", "default.getConfig")
    @js.native
    def getConfig(): Config = js.native
    
    @JSImport("mermaid/mermaidAPI", "default.initialize")
    @js.native
    def initialize(options: Config): Unit = js.native
    
    @JSImport("mermaid/mermaidAPI", "default.parse")
    @js.native
    def parse(text: String): js.Any = js.native
    
    /**
      * ##render
      * Function that renders an svg with a graph from a chart definition. Usage example below.
      *
      * ```
      * mermaidAPI.initialize({
      *      startOnLoad:true
      *  });
      *  $(function(){
      *      const graphDefinition = 'graph TB\na-->b';
      *      const cb = function(svgGraph){
      *          console.log(svgGraph);
      *      };
      *      mermaidAPI.render('id1',graphDefinition,cb);
      *  });
      * ```
      * @param id the id of the element to be rendered
      * @param txt the graph definition
      * @param cb callback which is called after rendering is finished with the svg code as inparam.
      * @param container selector to element in which a div with the graph temporarily will be inserted. In one is
      * provided a hidden div will be inserted in the body of the page instead. The element will be removed when rendering is
      * completed.
      */
    @JSImport("mermaid/mermaidAPI", "default.render")
    @js.native
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ]
    ): String = js.native
    @JSImport("mermaid/mermaidAPI", "default.render")
    @js.native
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: String
    ): String = js.native
  }
  
  object mermaidAPI {
    
    @js.native
    sealed trait LogLevel extends StObject
    @JSImport("mermaid/mermaidAPI", "mermaidAPI.LogLevel")
    @js.native
    object LogLevel extends StObject {
      
      @js.native
      sealed trait Debug extends LogLevel
      
      @js.native
      sealed trait Error extends LogLevel
      
      @js.native
      sealed trait Fatal extends LogLevel
      
      @js.native
      sealed trait Info extends LogLevel
      
      @js.native
      sealed trait Warn extends LogLevel
    }
    
    @js.native
    trait Config extends StObject {
      
      /**
        * **arrowMarkerAbsolute** - This options controls whether or arrow markers in html code will be absolute paths or
        * an anchor, #. This matters if you are using base tag settings.
        * default: false
        */
      var arrowMarkerAbsolute: js.UndefOr[Boolean] = js.native
      
      var `class`: js.UndefOr[js.Any] = js.native
      
      /**
        * ### flowchart
        * *The object containing configurations specific for flowcharts*
        */
      var flowchart: js.UndefOr[FlowChartConfig] = js.native
      
      /**
        * ### gantt
        * The object containing configurations specific for gantt diagrams*
        */
      var gantt: js.UndefOr[GanttConfig] = js.native
      
      var git: js.UndefOr[js.Any] = js.native
      
      /**
        * logLevel , decides the amount of logging to be used.
        * default: LogLevel.Fatal
        */
      var logLevel: js.UndefOr[LogLevel] = js.native
      
      /**
        * securityLevel: disallow/allow potentially dangerous cross-site scripting behavior
        *   the two documented values are "strict" and "loose", i.e. disallow and allow
        *   default: "strict"
        *   If the value is not present, the default behavior is "strict"
        *   Up through version mermaid@8.2.3, if any text value is present in a config but is not "strict", the behavior is "loose".
        *   This should be fixed after that version, i.e. any value other "loose" should be treated as "strict".
        */
      var securityLevel: js.UndefOr[String] = js.native
      
      /**
        * ###  sequenceDiagram
        * The object containing configurations specific for sequence diagrams
        */
      var sequence: js.UndefOr[SequenceDiagramConfig] = js.native
      
      /**
        * **startOnLoad** - This options controls whether or mermaid starts when the page loads
        * default: true
        */
      var startOnLoad: js.UndefOr[Boolean] = js.native
      
      var theme: js.UndefOr[Theme] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArrowMarkerAbsolute(value: Boolean): Self = StObject.set(x, "arrowMarkerAbsolute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArrowMarkerAbsoluteUndefined: Self = StObject.set(x, "arrowMarkerAbsolute", js.undefined)
        
        @scala.inline
        def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        @scala.inline
        def setFlowchart(value: FlowChartConfig): Self = StObject.set(x, "flowchart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlowchartUndefined: Self = StObject.set(x, "flowchart", js.undefined)
        
        @scala.inline
        def setGantt(value: GanttConfig): Self = StObject.set(x, "gantt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGanttUndefined: Self = StObject.set(x, "gantt", js.undefined)
        
        @scala.inline
        def setGit(value: js.Any): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
        
        @scala.inline
        def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
        
        @scala.inline
        def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
        
        @scala.inline
        def setSequence(value: SequenceDiagramConfig): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
        
        @scala.inline
        def setStartOnLoad(value: Boolean): Self = StObject.set(x, "startOnLoad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartOnLoadUndefined: Self = StObject.set(x, "startOnLoad", js.undefined)
        
        @scala.inline
        def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      }
    }
    
    @js.native
    trait FlowChartConfig extends StObject {
      
      /**
        * default: 'linear'
        */
      var curve: js.UndefOr[String] = js.native
      
      /**
        * **htmlLabels** - Flag for setting whether or not a html tag should be used for rendering labels
        * on the edges
        * default: true
        */
      var htmlLabels: js.UndefOr[Boolean] = js.native
    }
    object FlowChartConfig {
      
      @scala.inline
      def apply(): FlowChartConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FlowChartConfig]
      }
      
      @scala.inline
      implicit class FlowChartConfigMutableBuilder[Self <: FlowChartConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
        
        @scala.inline
        def setHtmlLabels(value: Boolean): Self = StObject.set(x, "htmlLabels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlLabelsUndefined: Self = StObject.set(x, "htmlLabels", js.undefined)
      }
    }
    
    @js.native
    trait GanttConfig extends StObject {
      
      /**
        * **axisFormat** - datetime format of the axis, this might need adjustment to match your locale and preferences
        * default: '%Y-%m-%d'
        */
      var axisFormat: js.UndefOr[String] = js.native
      
      /**
        * **barGap** - the margin between the different activities in the gantt diagram
        * default: 4
        */
      var barGap: js.UndefOr[Double] = js.native
      
      /**
        * **barHeight** - the height of the bars in the graph
        * default: 20
        */
      var barHeight: js.UndefOr[Double] = js.native
      
      /**
        * **fontFamily** - font family ...
        * default:  '"Open-Sans", "sans-serif"'
        */
      var fontFamily: js.UndefOr[String] = js.native
      
      /**
        *  **fontSize** - font size ...
        * default: 11
        */
      var fontSize: js.UndefOr[Double] = js.native
      
      /**
        *  **gridLineStartPadding** - Vertical starting position of the grid lines
        * default: 35
        */
      var gridLineStartPadding: js.UndefOr[Double] = js.native
      
      /**
        *  **leftPadding** - the space allocated for the section name to the left of the activities.
        * default: 75
        */
      var leftPadding: js.UndefOr[Double] = js.native
      
      /**
        * **numberSectionStyles** - the number of alternating section styles
        * default: 4
        */
      var numberSectionStyles: js.UndefOr[Double] = js.native
      
      /**
        * **titleTopMargin** - margin top for the text over the gantt diagram
        * default: 25
        */
      var titleTopMargin: js.UndefOr[Double] = js.native
      
      /**
        *  **topPadding** - margin between title and gantt diagram and between axis and gantt diagram.
        * default: 50
        */
      var topPadding: js.UndefOr[Double] = js.native
    }
    object GanttConfig {
      
      @scala.inline
      def apply(): GanttConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GanttConfig]
      }
      
      @scala.inline
      implicit class GanttConfigMutableBuilder[Self <: GanttConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAxisFormat(value: String): Self = StObject.set(x, "axisFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisFormatUndefined: Self = StObject.set(x, "axisFormat", js.undefined)
        
        @scala.inline
        def setBarGap(value: Double): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
        
        @scala.inline
        def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
        
        @scala.inline
        def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        @scala.inline
        def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setGridLineStartPadding(value: Double): Self = StObject.set(x, "gridLineStartPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGridLineStartPaddingUndefined: Self = StObject.set(x, "gridLineStartPadding", js.undefined)
        
        @scala.inline
        def setLeftPadding(value: Double): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
        
        @scala.inline
        def setNumberSectionStyles(value: Double): Self = StObject.set(x, "numberSectionStyles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberSectionStylesUndefined: Self = StObject.set(x, "numberSectionStyles", js.undefined)
        
        @scala.inline
        def setTitleTopMargin(value: Double): Self = StObject.set(x, "titleTopMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTopMarginUndefined: Self = StObject.set(x, "titleTopMargin", js.undefined)
        
        @scala.inline
        def setTopPadding(value: Double): Self = StObject.set(x, "topPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopPaddingUndefined: Self = StObject.set(x, "topPadding", js.undefined)
      }
    }
    
    @js.native
    trait SequenceDiagramConfig extends StObject {
      
      /**
        * **actorMargin** - Margin between actors
        * default: 10
        */
      var actorMargin: js.UndefOr[Double] = js.native
      
      /**
        * **bottomMarginAdj** - Depending on css styling this might need adjustment.
        * Prolongs the edge of the diagram downwards
        * default: 1
        */
      var bottomMarginAdj: js.UndefOr[Double] = js.native
      
      /**
        * **boxMargin** - Margin around loop boxes
        * default: 10
        */
      var boxMargin: js.UndefOr[Double] = js.native
      
      /**
        * **boxTextMargin** - margin around the text in loop/alt/opt boxes
        * default: 5
        */
      var boxTextMargin: js.UndefOr[Double] = js.native
      
      /**
        * **diagramMarginX** - margin to the right and left of the sequence diagram
        * default: 50
        */
      var diagramMarginX: js.UndefOr[Double] = js.native
      
      /**
        * **diagramMarginY** - margin to the over and under the sequence diagram
        * default: 10
        */
      var diagramMarginY: js.UndefOr[Double] = js.native
      
      /**
        * **height** - Height of actor boxes
        * default: 65
        */
      var height: js.UndefOr[Double] = js.native
      
      /**
        * **messageMargin** - Space between messages
        * default: 35
        */
      var messageMargin: js.UndefOr[Double] = js.native
      
      /**
        * **mirrorActors** - mirror actors under diagram
        * default: true
        */
      var mirrorActors: js.UndefOr[Boolean] = js.native
      
      /**
        * **noteMargin** - margin around notes
        * default: 10
        */
      var noteMargin: js.UndefOr[Double] = js.native
      
      /**
        * **useMaxWidth** - when this flag is set the height and width is set to 100% and is then scaling with the
        * available space if not the absolute space required is used
        * default: true
        */
      var useMaxWidth: js.UndefOr[Boolean] = js.native
      
      /**
        * **width** - Width of actor boxes
        * default: 150
        */
      var width: js.UndefOr[Double] = js.native
    }
    object SequenceDiagramConfig {
      
      @scala.inline
      def apply(): SequenceDiagramConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SequenceDiagramConfig]
      }
      
      @scala.inline
      implicit class SequenceDiagramConfigMutableBuilder[Self <: SequenceDiagramConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActorMargin(value: Double): Self = StObject.set(x, "actorMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActorMarginUndefined: Self = StObject.set(x, "actorMargin", js.undefined)
        
        @scala.inline
        def setBottomMarginAdj(value: Double): Self = StObject.set(x, "bottomMarginAdj", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomMarginAdjUndefined: Self = StObject.set(x, "bottomMarginAdj", js.undefined)
        
        @scala.inline
        def setBoxMargin(value: Double): Self = StObject.set(x, "boxMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoxMarginUndefined: Self = StObject.set(x, "boxMargin", js.undefined)
        
        @scala.inline
        def setBoxTextMargin(value: Double): Self = StObject.set(x, "boxTextMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoxTextMarginUndefined: Self = StObject.set(x, "boxTextMargin", js.undefined)
        
        @scala.inline
        def setDiagramMarginX(value: Double): Self = StObject.set(x, "diagramMarginX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiagramMarginXUndefined: Self = StObject.set(x, "diagramMarginX", js.undefined)
        
        @scala.inline
        def setDiagramMarginY(value: Double): Self = StObject.set(x, "diagramMarginY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiagramMarginYUndefined: Self = StObject.set(x, "diagramMarginY", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setMessageMargin(value: Double): Self = StObject.set(x, "messageMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageMarginUndefined: Self = StObject.set(x, "messageMargin", js.undefined)
        
        @scala.inline
        def setMirrorActors(value: Boolean): Self = StObject.set(x, "mirrorActors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMirrorActorsUndefined: Self = StObject.set(x, "mirrorActors", js.undefined)
        
        @scala.inline
        def setNoteMargin(value: Double): Self = StObject.set(x, "noteMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteMarginUndefined: Self = StObject.set(x, "noteMargin", js.undefined)
        
        @scala.inline
        def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mermaid.mermaidStrings.default
      - typings.mermaid.mermaidStrings.forest
      - typings.mermaid.mermaidStrings.dark
      - typings.mermaid.mermaidStrings.neutral
    */
    trait Theme extends StObject
    object Theme {
      
      @scala.inline
      def default: typings.mermaid.mermaidStrings.default = "default".asInstanceOf[typings.mermaid.mermaidStrings.default]
      
      @scala.inline
      def dark: typings.mermaid.mermaidStrings.dark = "dark".asInstanceOf[typings.mermaid.mermaidStrings.dark]
      
      @scala.inline
      def forest: typings.mermaid.mermaidStrings.forest = "forest".asInstanceOf[typings.mermaid.mermaidStrings.forest]
      
      @scala.inline
      def neutral: typings.mermaid.mermaidStrings.neutral = "neutral".asInstanceOf[typings.mermaid.mermaidStrings.neutral]
    }
  }
}
