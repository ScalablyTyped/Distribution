package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "sectionGroup.toJSON()". */
trait SectionGroupData extends js.Object {
  /**
    *
    * The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the ID of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
  /**
    *
    * The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
}

