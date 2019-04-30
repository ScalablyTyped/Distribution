package typings
package pouchdbDashLiveDashFindLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LiveFindNs {
  type PaginateOptions[Content /* <: js.Object */] = stdLib.Pick[
    pouchdbDashFindLib.PouchDBNs.FindNs.FindRequest[Content], 
    pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.sort | pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.skip | pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.limit
  ]
}
