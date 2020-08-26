package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait And extends js.Object {
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
    ]
  ] = js.native
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
    ]
  ] = js.native
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
    ]
  ] = js.native
}

object And {
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  @scala.inline
  implicit class AndOps[Self <: And] (val x: Self) extends AnyVal {
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
    def set$andVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = this.set("$and", js.Array(value :_*))
    @scala.inline
    def set$and(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = this.set("$and", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$and: Self = this.set("$and", js.undefined)
    @scala.inline
    def set$norVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = this.set("$nor", js.Array(value :_*))
    @scala.inline
    def set$nor(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = this.set("$nor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$nor: Self = this.set("$nor", js.undefined)
    @scala.inline
    def set$orVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = this.set("$or", js.Array(value :_*))
    @scala.inline
    def set$or(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = this.set("$or", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$or: Self = this.set("$or", js.undefined)
  }
  
}

