package typings.nodeHtmlParser.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/nodes/html", JSImport.Default)
@js.native
class default protected () extends HTMLElement {
  /**
    * Creates an instance of HTMLElement.
    * @param keyAttrs	id and class attribute
    * @param [rawAttrs]	attributes in string
    *
    * @memberof HTMLElement
    */
  def this(tagName: String, keyAttrs: KeyAttributes) = this()
  def this(tagName: String, keyAttrs: KeyAttributes, rawAttrs: String) = this()
  def this(
    tagName: String,
    keyAttrs: KeyAttributes,
    rawAttrs: js.UndefOr[scala.Nothing],
    parentNode: typings.nodeHtmlParser.nodeMod.default
  ) = this()
  def this(
    tagName: String,
    keyAttrs: KeyAttributes,
    rawAttrs: String,
    parentNode: typings.nodeHtmlParser.nodeMod.default
  ) = this()
}
