package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Contains the collection of {@link Word.CustomProperty} objects.
         *
         * [Api set: WordApi 1.3]
         */

trait CustomPropertyCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the key of the custom property. Read only.
               *
               * [Api set: WordApi 1.3]
               */
  var key: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean. Read only.
               *
               * [Api set: WordApi 1.3]
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the value of the custom property. Note that even though Word Online and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
               *
               * [Api set: WordApi 1.3]
               */
  var value: js.UndefOr[scala.Boolean] = js.undefined
}

