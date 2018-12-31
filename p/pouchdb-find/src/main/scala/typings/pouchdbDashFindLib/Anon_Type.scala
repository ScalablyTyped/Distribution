package typings
package pouchdbDashFindLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: js.UndefOr[java.lang.String] = js.undefined
  /** List of fields to index */
  var fields: js.Array[java.lang.String]
  /** Name of the index, auto-generated if you don't include it */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Only supports 'json', and it's also the default */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

