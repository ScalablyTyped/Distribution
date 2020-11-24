package typings.meteor.mongoMod.Mongo

import typings.meteor.anon.CaseSensitive
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldExpression[T] extends js.Object {
  
  @JSName("$all")
  var $all: js.UndefOr[js.Array[T]] = js.native
  
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Any] = js.native
  
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Any] = js.native
  
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Any] = js.native
  
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Any] = js.native
  
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.native
  
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.native
  
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  
  @JSName("$expr")
  var $expr: js.UndefOr[FieldExpression[T]] = js.native
  
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Any] = js.native
  
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Any] = js.native
  
  @JSName("$gt")
  var $gt: js.UndefOr[T] = js.native
  
  @JSName("$gte")
  var $gte: js.UndefOr[T] = js.native
  
  @JSName("$in")
  var $in: js.UndefOr[js.Array[T]] = js.native
  
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.native
  
  @JSName("$lt")
  var $lt: js.UndefOr[T] = js.native
  
  @JSName("$lte")
  var $lte: js.UndefOr[T] = js.native
  
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.native
  
  @JSName("$near")
  var $near: js.UndefOr[js.Any] = js.native
  
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Any] = js.native
  
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.native
  
  @JSName("$not")
  var $not: js.UndefOr[FieldExpression[T]] = js.native
  
  @JSName("$options")
  var $options: js.UndefOr[String] = js.native
  
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp | String] = js.native
  
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.native
  
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.native
  
  @JSName("$type")
  var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.native
  
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.native
}
object FieldExpression {
  
  @scala.inline
  def apply[T](): FieldExpression[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldExpression[T]]
  }
  
  @scala.inline
  implicit class FieldExpressionOps[Self <: FieldExpression[_], T] (val x: Self with FieldExpression[T]) extends AnyVal {
    
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
    def set$allVarargs(value: T*): Self = this.set("$all", js.Array(value :_*))
    
    @scala.inline
    def set$all(value: js.Array[T]): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def set$bitsAllClear(value: js.Any): Self = this.set("$bitsAllClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAllClear: Self = this.set("$bitsAllClear", js.undefined)
    
    @scala.inline
    def set$bitsAllSet(value: js.Any): Self = this.set("$bitsAllSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAllSet: Self = this.set("$bitsAllSet", js.undefined)
    
    @scala.inline
    def set$bitsAnyClear(value: js.Any): Self = this.set("$bitsAnyClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAnyClear: Self = this.set("$bitsAnyClear", js.undefined)
    
    @scala.inline
    def set$bitsAnySet(value: js.Any): Self = this.set("$bitsAnySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAnySet: Self = this.set("$bitsAnySet", js.undefined)
    
    @scala.inline
    def set$comment(value: String): Self = this.set("$comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$comment: Self = this.set("$comment", js.undefined)
    
    @scala.inline
    def set$elemMatch(value: FieldExpression[T] | Query[T]): Self = this.set("$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$elemMatch: Self = this.set("$elemMatch", js.undefined)
    
    @scala.inline
    def set$eq(value: T): Self = this.set("$eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$eq: Self = this.set("$eq", js.undefined)
    
    @scala.inline
    def set$exists(value: Boolean): Self = this.set("$exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$exists: Self = this.set("$exists", js.undefined)
    
    @scala.inline
    def set$expr(value: FieldExpression[T]): Self = this.set("$expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$expr: Self = this.set("$expr", js.undefined)
    
    @scala.inline
    def set$geoIntersects(value: js.Any): Self = this.set("$geoIntersects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$geoIntersects: Self = this.set("$geoIntersects", js.undefined)
    
    @scala.inline
    def set$geoWithin(value: js.Any): Self = this.set("$geoWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$geoWithin: Self = this.set("$geoWithin", js.undefined)
    
    @scala.inline
    def set$gt(value: T): Self = this.set("$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: T): Self = this.set("$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: T*): Self = this.set("$in", js.Array(value :_*))
    
    @scala.inline
    def set$in(value: js.Array[T]): Self = this.set("$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    
    @scala.inline
    def set$jsonSchema(value: js.Any): Self = this.set("$jsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$jsonSchema: Self = this.set("$jsonSchema", js.undefined)
    
    @scala.inline
    def set$lt(value: T): Self = this.set("$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: T): Self = this.set("$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    
    @scala.inline
    def set$modVarargs(value: Double*): Self = this.set("$mod", js.Array(value :_*))
    
    @scala.inline
    def set$mod(value: js.Array[Double]): Self = this.set("$mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$mod: Self = this.set("$mod", js.undefined)
    
    @scala.inline
    def set$ne(value: T): Self = this.set("$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    
    @scala.inline
    def set$near(value: js.Any): Self = this.set("$near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$near: Self = this.set("$near", js.undefined)
    
    @scala.inline
    def set$nearSphere(value: js.Any): Self = this.set("$nearSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nearSphere: Self = this.set("$nearSphere", js.undefined)
    
    @scala.inline
    def set$ninVarargs(value: T*): Self = this.set("$nin", js.Array(value :_*))
    
    @scala.inline
    def set$nin(value: js.Array[T]): Self = this.set("$nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nin: Self = this.set("$nin", js.undefined)
    
    @scala.inline
    def set$not(value: FieldExpression[T]): Self = this.set("$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    
    @scala.inline
    def set$options(value: String): Self = this.set("$options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$options: Self = this.set("$options", js.undefined)
    
    @scala.inline
    def set$regex(value: RegExp | String): Self = this.set("$regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$regex: Self = this.set("$regex", js.undefined)
    
    @scala.inline
    def set$size(value: Double): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    
    @scala.inline
    def set$text(value: CaseSensitive): Self = this.set("$text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$text: Self = this.set("$text", js.undefined)
    
    @scala.inline
    def set$typeVarargs(value: BsonType*): Self = this.set("$type", js.Array(value :_*))
    
    @scala.inline
    def set$type(value: js.Array[BsonType] | BsonType): Self = this.set("$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
    
    @scala.inline
    def set$where(value: String | js.Function): Self = this.set("$where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$where: Self = this.set("$where", js.undefined)
  }
}
