package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_And extends js.Object {
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
}

object Anon_And {
  @scala.inline
  def apply(
    $and: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ] = null,
    $nor: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ] = null,
    $or: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ] = null
  ): Anon_And = {
    val __obj = js.Dynamic.literal()
    if ($and != null) __obj.updateDynamic("$and")($and)
    if ($nor != null) __obj.updateDynamic("$nor")($nor)
    if ($or != null) __obj.updateDynamic("$or")($or)
    __obj.asInstanceOf[Anon_And]
  }
}

