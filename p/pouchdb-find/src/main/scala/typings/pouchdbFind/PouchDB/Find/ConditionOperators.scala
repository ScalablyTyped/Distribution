package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.pouchdbFindStrings.`null`
import typings.pouchdbFind.pouchdbFindStrings.`object`
import typings.pouchdbFind.pouchdbFindStrings.array
import typings.pouchdbFind.pouchdbFindStrings.boolean
import typings.pouchdbFind.pouchdbFindStrings.number
import typings.pouchdbFind.pouchdbFindStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ConditionOperators {
  
  @scala.inline
  def apply(): ConditionOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionOperators]
  }
  
  @scala.inline
  implicit class ConditionOperatorsOps[Self <: ConditionOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$allVarargs(value: js.Any*): Self = this.set("$all", js.Array(value :_*))
    
    @scala.inline
    def set$all(value: js.Array[_]): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def set$elemMatch(value: ConditionOperators): Self = this.set("$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$elemMatch: Self = this.set("$elemMatch", js.undefined)
    
    @scala.inline
    def set$eq(value: js.Any): Self = this.set("$eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$eq: Self = this.set("$eq", js.undefined)
    
    @scala.inline
    def set$exists(value: Boolean): Self = this.set("$exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$exists: Self = this.set("$exists", js.undefined)
    
    @scala.inline
    def set$gt(value: js.Any): Self = this.set("$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: js.Any): Self = this.set("$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: js.Any*): Self = this.set("$in", js.Array(value :_*))
    
    @scala.inline
    def set$in(value: js.Array[_]): Self = this.set("$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    
    @scala.inline
    def set$lt(value: js.Any): Self = this.set("$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: js.Any): Self = this.set("$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    
    @scala.inline
    def set$mod(value: js.Tuple2[Double, Double]): Self = this.set("$mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$mod: Self = this.set("$mod", js.undefined)
    
    @scala.inline
    def set$ne(value: js.Any): Self = this.set("$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    
    @scala.inline
    def set$ninVarargs(value: js.Any*): Self = this.set("$nin", js.Array(value :_*))
    
    @scala.inline
    def set$nin(value: js.Array[_]): Self = this.set("$nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nin: Self = this.set("$nin", js.undefined)
    
    @scala.inline
    def set$regex(value: String): Self = this.set("$regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$regex: Self = this.set("$regex", js.undefined)
    
    @scala.inline
    def set$size(value: Double): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    
    @scala.inline
    def set$type(value: `null` | boolean | number | string | array | `object`): Self = this.set("$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
  }
}
