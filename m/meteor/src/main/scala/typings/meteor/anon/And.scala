package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And extends StObject {
  
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
  
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
  
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
    ]
  ] = js.undefined
}
object And {
  
  inline def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  extension [Self <: And](x: Self) {
    
    inline def set$and(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
    
    inline def set$andVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = StObject.set(x, "$and", js.Array(value :_*))
    
    inline def set$nor(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
    
    inline def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
    
    inline def set$norVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = StObject.set(x, "$nor", js.Array(value :_*))
    
    inline def set$or(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object
        ]
    ): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
    
    inline def set$orVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Mongo.Query<T> */ js.Object)*
    ): Self = StObject.set(x, "$or", js.Array(value :_*))
  }
}
