package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InlinePicture object, for use in "inlinePicture.set({ ... })". */

trait InlinePictureUpdateData extends js.Object {
  /**
               *
               * Gets or sets a string that represents the alternative text associated with the inline image.
               *
               * [Api set: WordApi 1.1]
               */
  var altTextDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets a string that contains the title for the inline image.
               *
               * [Api set: WordApi 1.1]
               */
  var altTextTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets a number that describes the height of the inline image.
               *
               * [Api set: WordApi 1.1]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
               *
               * [Api set: WordApi 1.1]
               */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
               *
               * [Api set: WordApi 1.1]
               */
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a number that describes the width of the inline image.
               *
               * [Api set: WordApi 1.1]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

