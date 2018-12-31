package typings
package mermaidLib.mermaidAPIMod.mermaidAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * **arrowMarkerAbsolute** - This options controls whether or arrow markers in html code will be absolute paths or
    * an anchor, #. This matters if you are using base tag settings.
    * default: false
    */
  var arrowMarkerAbsolute: js.UndefOr[scala.Boolean] = js.undefined
  var `class`: js.UndefOr[js.Any] = js.undefined
  /**
    * ### flowchart
    * *The object containing configurations specific for flowcharts*
    */
  var flowchart: js.UndefOr[FlowChartConfig] = js.undefined
  var git: js.UndefOr[js.Any] = js.undefined
  /**
    * ### gantt
    * The object containing configurations specific for gantt diagrams*
    */
  var gnatt: js.UndefOr[GnattConfig] = js.undefined
  /**
    * logLevel , decides the amount of logging to be used.
    * default: LogLevel.Fatal
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * ###  sequenceDiagram
    * The object containing configurations specific for sequence diagrams
    */
  var sequence: js.UndefOr[SequenceDiagramConfig] = js.undefined
  /**
    * **startOnLoad** - This options controls whether or mermaid starts when the page loads
    * default: true
    */
  var startOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
}

