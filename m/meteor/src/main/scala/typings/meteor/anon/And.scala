package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends StObject {
  
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
  implicit class AndMutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$and(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
    
    @scala.inline
    def set$andVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = StObject.set(x, "$and", js.Array(value :_*))
    
    @scala.inline
    def set$nor(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
    
    @scala.inline
    def set$norVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = StObject.set(x, "$nor", js.Array(value :_*))
    
    @scala.inline
    def set$or(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
    
    @scala.inline
    def set$orVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = StObject.set(x, "$or", js.Array(value :_*))
  }
}
