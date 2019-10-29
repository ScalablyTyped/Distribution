package typings.mdnDashBrowserDashCompatDashData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<string, 'browsers'> ]: mdn-browser-compat-data.mdn-browser-compat-data/types.PrimaryIdentifier} */ trait CompatDataIdentifiers extends js.Object {
  /**
    * Contains data for each [Web API](https://developer.mozilla.org/docs/Web/API)
    * interface.
    */
  var api: PrimaryIdentifier
  /**
    * Contains data for [CSS](https://developer.mozilla.org/docs/Web/CSS)
    * properties, selectors, and at-rules.
    */
  var css: PrimaryIdentifier
  /**
    * Contains data for [HTML](https://developer.mozilla.org/docs/Web/HTML)
    * elements, attributes, and global attributes.
    */
  var html: PrimaryIdentifier
  /**
    * Contains data for [HTTP](https://developer.mozilla.org/docs/Web/HTTP)
    * headers, statuses, and methods.
    */
  var http: PrimaryIdentifier
  /**
    * Contains data for [JavaScript](https://developer.mozilla.org/docs/Web/JavaScript)
    * built-in Objects, statement, operators, and other ECMAScript language features.
    */
  var javascript: PrimaryIdentifier
  /**
    * Contains data for [MathML](https://developer.mozilla.org/docs/Web/MathML)
    * elements, attributes, and global attributes.
    */
  var mathml: PrimaryIdentifier
  /**
    * Contains data for [SVG](https://developer.mozilla.org/docs/Web/SVG)
    * elements, attributes, and global attributes.
    */
  var svg: PrimaryIdentifier
  /**
    * Contains data for [WebDriver](https://developer.mozilla.org/docs/Web/WebDriver)
    * commands.
    */
  var webdriver: PrimaryIdentifier
  /**
    * Contains data for [WebExtensions](https://developer.mozilla.org/Add-ons/WebExtensions)
    * JavaScript APIs and manifest keys.
    */
  var webextensions: PrimaryIdentifier
  /**
    * Contains data for [XPath](https://developer.mozilla.org/docs/Web/XPath)
    * axes, and functions.
    */
  var xpath: PrimaryIdentifier
  /**
    * Contains data for [XSLT](https://developer.mozilla.org/docs/Web/XSLT)
    * elements, attributes, and global attributes.
    */
  var xslt: PrimaryIdentifier
}

object CompatDataIdentifiers {
  @scala.inline
  def apply(
    api: PrimaryIdentifier,
    css: PrimaryIdentifier,
    html: PrimaryIdentifier,
    http: PrimaryIdentifier,
    javascript: PrimaryIdentifier,
    mathml: PrimaryIdentifier,
    svg: PrimaryIdentifier,
    webdriver: PrimaryIdentifier,
    webextensions: PrimaryIdentifier,
    xpath: PrimaryIdentifier,
    xslt: PrimaryIdentifier
  ): CompatDataIdentifiers = {
    val __obj = js.Dynamic.literal(api = api, css = css, html = html, http = http, javascript = javascript, mathml = mathml, svg = svg, webdriver = webdriver, webextensions = webextensions, xpath = xpath, xslt = xslt)
  
    __obj.asInstanceOf[CompatDataIdentifiers]
  }
}

