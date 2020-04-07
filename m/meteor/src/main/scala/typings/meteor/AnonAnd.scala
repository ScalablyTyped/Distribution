package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnd extends js.Object {
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
}

object AnonAnd {
  @scala.inline
  def apply(
    $and: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ] = null,
    $nor: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ] = null,
    $or: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ] = null
  ): AnonAnd = {
    val __obj = js.Dynamic.literal()
    if ($and != null) __obj.updateDynamic("$and")($and.asInstanceOf[js.Any])
    if ($nor != null) __obj.updateDynamic("$nor")($nor.asInstanceOf[js.Any])
    if ($or != null) __obj.updateDynamic("$or")($or.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnd]
  }
}

