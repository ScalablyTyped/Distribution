package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedPageObject extends SharedFunctions {
  /**
    * A reference providing access to the full Nightwatch command API,
    * usually known as "client" or "browser" in test cases.
    * This is used to access those commands that are not part of the subset of commands within the page object API.
    */
  var api: NightwatchAPI = js.native
  /**
    * A map of Element objects (see [Enhanced Element Instances](https://github.com/nightwatchjs/nightwatch/wiki/Page-Object-API#enhanced-element-instances)) used by element selectors.
    */
  var elements: org.scalablytyped.runtime.StringDictionary[EnhancedElementInstance] = js.native
  /**
    * The name of the page object as defined by its module name (not including the extension).
    * This is the same name used to access the `page` object factory from the page reference in the command API.
    */
  var name: java.lang.String = js.native
}

