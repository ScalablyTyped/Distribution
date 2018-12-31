package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsSplitterContentElement
  extends stdLib.HTMLElement {
  /**
    * @description Page element loaded in the splitter content.
    */
  var page: java.lang.String = js.native
  var pageLoader: js.Any = js.native
  /**
    * @description Show the page specified in pageUrl in the right section. Returns: Resolves to the new page element
    * @param {*} page
    * @param {Object} [options]
    * @return {Promise}
    */
  def load(page: js.Any): js.Promise[stdLib.HTMLElement] = js.native
  def load(page: js.Any, options: onsenuiLib.onsenuiMod.SplitterContentOptions): js.Promise[stdLib.HTMLElement] = js.native
}

