package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * **arrowMarkerAbsolute** - This options controls whether or arrow markers in html code will be absolute paths or
    * an anchor, #. This matters if you are using base tag settings.
    * default: false
    */
  var arrowMarkerAbsolute: js.UndefOr[Boolean] = js.undefined
  var `class`: js.UndefOr[js.Any] = js.undefined
  /**
    * ### flowchart
    * *The object containing configurations specific for flowcharts*
    */
  var flowchart: js.UndefOr[FlowChartConfig] = js.undefined
  /**
    * ### gantt
    * The object containing configurations specific for gantt diagrams*
    */
  var gantt: js.UndefOr[GanttConfig] = js.undefined
  var git: js.UndefOr[js.Any] = js.undefined
  /**
    * logLevel , decides the amount of logging to be used.
    * default: LogLevel.Fatal
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * securityLevel: disallow/allow potentially dangerous cross-site scripting behavior
    *   the two documented values are "strict" and "loose", i.e. disallow and allow
    *   default: "strict"
    *   If the value is not present, the default behavior is "strict"
    *   Up through version mermaid@8.2.3, if any text value is present in a config but is not "strict", the behavior is "loose".
    *   This should be fixed after that version, i.e. any value other "loose" should be treated as "strict".
    */
  var securityLevel: js.UndefOr[String] = js.undefined
  /**
    * ###  sequenceDiagram
    * The object containing configurations specific for sequence diagrams
    */
  var sequence: js.UndefOr[SequenceDiagramConfig] = js.undefined
  /**
    * **startOnLoad** - This options controls whether or mermaid starts when the page loads
    * default: true
    */
  var startOnLoad: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    arrowMarkerAbsolute: js.UndefOr[Boolean] = js.undefined,
    `class`: js.Any = null,
    flowchart: FlowChartConfig = null,
    gantt: GanttConfig = null,
    git: js.Any = null,
    logLevel: LogLevel = null,
    securityLevel: String = null,
    sequence: SequenceDiagramConfig = null,
    startOnLoad: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowMarkerAbsolute)) __obj.updateDynamic("arrowMarkerAbsolute")(arrowMarkerAbsolute.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (flowchart != null) __obj.updateDynamic("flowchart")(flowchart.asInstanceOf[js.Any])
    if (gantt != null) __obj.updateDynamic("gantt")(gantt.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (securityLevel != null) __obj.updateDynamic("securityLevel")(securityLevel.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnLoad)) __obj.updateDynamic("startOnLoad")(startOnLoad.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

