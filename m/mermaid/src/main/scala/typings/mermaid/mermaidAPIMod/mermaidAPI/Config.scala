package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
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
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowMarkerAbsolute(value: Boolean): Self = this.set("arrowMarkerAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowMarkerAbsolute: Self = this.set("arrowMarkerAbsolute", js.undefined)
    
    @scala.inline
    def setClass(value: js.Any): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setFlowchart(value: FlowChartConfig): Self = this.set("flowchart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowchart: Self = this.set("flowchart", js.undefined)
    
    @scala.inline
    def setGantt(value: GanttConfig): Self = this.set("gantt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGantt: Self = this.set("gantt", js.undefined)
    
    @scala.inline
    def setGit(value: js.Any): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setSecurityLevel(value: String): Self = this.set("securityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityLevel: Self = this.set("securityLevel", js.undefined)
    
    @scala.inline
    def setSequence(value: SequenceDiagramConfig): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setStartOnLoad(value: Boolean): Self = this.set("startOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOnLoad: Self = this.set("startOnLoad", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
