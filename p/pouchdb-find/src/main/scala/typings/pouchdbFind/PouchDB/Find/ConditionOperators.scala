package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.pouchdbFindStrings.`null`
import typings.pouchdbFind.pouchdbFindStrings.`object`
import typings.pouchdbFind.pouchdbFindStrings.array
import typings.pouchdbFind.pouchdbFindStrings.boolean
import typings.pouchdbFind.pouchdbFindStrings.number
import typings.pouchdbFind.pouchdbFindStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionOperators extends js.Object {
  /** Matches an array value if it contains all the elements of the argument array. */
  @JSName("$all")
  var $all: js.UndefOr[js.Array[_]] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[ConditionOperators] = js.native
  /** Match fields equal to this one. */
  @JSName("$eq")
  var $eq: js.UndefOr[js.Any] = js.native
  /** True if the field should exist, false otherwise. */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  /** Match fields "greater than" this one. */
  @JSName("$gt")
  var $gt: js.UndefOr[js.Any] = js.native
  /** Match fields "greater than or equal to" this one. */
  @JSName("$gte")
  var $gte: js.UndefOr[js.Any] = js.native
  /** The document field must exist in the list provided. */
  @JSName("$in")
  var $in: js.UndefOr[js.Array[_]] = js.native
  /** Match fields "less than" this one. */
  @JSName("$lt")
  var $lt: js.UndefOr[js.Any] = js.native
  /** Match fields "less than or equal to" this one. */
  @JSName("$lte")
  var $lte: js.UndefOr[js.Any] = js.native
  /**
    * Divisor and Remainder are both positive or negative integers.
    * Non-integer values result in a 404 status.
    * Matches documents where (field % Divisor == Remainder) is true, and only when the document field is an integer.
    * [divisor, remainder]
    */
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Match fields not equal to this one. */
  @JSName("$ne")
  var $ne: js.UndefOr[js.Any] = js.native
  /** The document field must not exist in the list provided. */
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[_]] = js.native
  /** A regular expression pattern to match against the document field. Only matches when the field is a string value and matches the supplied regular expression. */
  @JSName("$regex")
  var $regex: js.UndefOr[String] = js.native
  /** Special condition to match the length of an array field in a document. Non-array fields cannot match this condition. */
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.native
  /** One of: "null", "boolean", "number", "string", "array", or "object". */
  @JSName("$type")
  var $type: js.UndefOr[`null` | boolean | number | string | array | `object`] = js.native
}

