package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EmailOptions extends js.Object {
  /**
           * Numerical threshold at which an email address is considered invalid
           */
  var errorLevel: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
           * Number of atoms required for the domain. Be careful since some domains, such as io, directly allow email.
           */
  var minDomainAtoms: js.UndefOr[scala.Double] = js.undefined
  /**
           * Specifies a list of acceptable TLDs.
           */
  var tldWhitelist: js.UndefOr[js.Array[java.lang.String] | js.Object] = js.undefined
}

