package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenameOptions extends js.Object {
  /**
           * if true, does not delete the old key name, keeping both the new and old keys in place. Defaults to false.
           */
  var alias: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * if true, skip renaming of a key if it's undefined. Defaults to false.
           */
  var ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * if true, allows renaming multiple keys to the same destination where the last rename wins. Defaults to false.
           */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * if true, allows renaming a key over an existing key. Defaults to false.
           */
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
}

