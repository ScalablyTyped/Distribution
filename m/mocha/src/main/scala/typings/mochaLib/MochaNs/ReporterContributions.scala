package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third-party declarations that want to add new entries to the `Reporter` union can
  * contribute names here.
  */
trait ReporterContributions extends js.Object {
  var Base: scala.Nothing
  var Dot: scala.Nothing
  var HTML: scala.Nothing
  var JSON: scala.Nothing
  var JSONStream: scala.Nothing
  var Landing: scala.Nothing
  var List: scala.Nothing
  var Markdown: scala.Nothing
  var Min: scala.Nothing
  var Nyan: scala.Nothing
  var Progress: scala.Nothing
  var Spec: scala.Nothing
  var TAP: scala.Nothing
  var XUnit: scala.Nothing
  var base: scala.Nothing
  var dot: scala.Nothing
  var html: scala.Nothing
  var json: scala.Nothing
  var `json-stream`: scala.Nothing
  var landing: scala.Nothing
  var list: scala.Nothing
  var markdown: scala.Nothing
  var min: scala.Nothing
  var nyan: scala.Nothing
  var progress: scala.Nothing
  var spec: scala.Nothing
  var tap: scala.Nothing
  var xunit: scala.Nothing
}

object ReporterContributions {
  @scala.inline
  def apply(
    Base: scala.Nothing,
    Dot: scala.Nothing,
    HTML: scala.Nothing,
    JSON: scala.Nothing,
    JSONStream: scala.Nothing,
    Landing: scala.Nothing,
    List: scala.Nothing,
    Markdown: scala.Nothing,
    Min: scala.Nothing,
    Nyan: scala.Nothing,
    Progress: scala.Nothing,
    Spec: scala.Nothing,
    TAP: scala.Nothing,
    XUnit: scala.Nothing,
    base: scala.Nothing,
    dot: scala.Nothing,
    html: scala.Nothing,
    json: scala.Nothing,
    `json-stream`: scala.Nothing,
    landing: scala.Nothing,
    list: scala.Nothing,
    markdown: scala.Nothing,
    min: scala.Nothing,
    nyan: scala.Nothing,
    progress: scala.Nothing,
    spec: scala.Nothing,
    tap: scala.Nothing,
    xunit: scala.Nothing
  ): ReporterContributions = {
    val __obj = js.Dynamic.literal(Base = Base, Dot = Dot, HTML = HTML, JSON = JSON, JSONStream = JSONStream, Landing = Landing, List = List, Markdown = Markdown, Min = Min, Nyan = Nyan, Progress = Progress, Spec = Spec, TAP = TAP, XUnit = XUnit, base = base, dot = dot, html = html, json = json, landing = landing, list = list, markdown = markdown, min = min, nyan = nyan, progress = progress, spec = spec, tap = tap, xunit = xunit)
    __obj.updateDynamic("json-stream")(`json-stream`)
    __obj.asInstanceOf[ReporterContributions]
  }
}

