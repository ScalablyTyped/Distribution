package typings.pouchdbLiveFind.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LiveFind {
  type PaginateOptions[Content /* <: js.Object */] = typings.std.Pick[
    typings.pouchdbFind.PouchDB.Find.FindRequest[Content], 
    typings.pouchdbLiveFind.pouchdbLiveFindStrings.sort | typings.pouchdbLiveFind.pouchdbLiveFindStrings.skip | typings.pouchdbLiveFind.pouchdbLiveFindStrings.limit
  ]
}
