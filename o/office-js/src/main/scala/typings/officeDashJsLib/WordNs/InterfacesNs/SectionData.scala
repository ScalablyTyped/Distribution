package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "section.toJSON()". */

trait SectionData extends js.Object {
  /**
              *
              * Gets the body object of the section. This does not include the header/footer and other section metadata. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var body: js.UndefOr[BodyData] = js.undefined
}

