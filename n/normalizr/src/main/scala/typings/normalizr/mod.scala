package typings.normalizr

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalizr", "denormalize")
  @js.native
  def denormalize(input: js.Any, schema: Schema_[_], entities: js.Any): js.Any = js.native
  
  @JSImport("normalizr", "normalize")
  @js.native
  def normalize[T, E, R](data: js.Any, schema: Schema_[T]): NormalizedSchema[E, R] = js.native
  
  @js.native
  trait NormalizedSchema[E, R] extends StObject {
    
    var entities: E = js.native
    
    var result: R = js.native
  }
  object NormalizedSchema {
    
    @scala.inline
    def apply[E, R](entities: E, result: R): NormalizedSchema[E, R] = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedSchema[E, R]]
    }
    
    @scala.inline
    implicit class NormalizedSchemaMutableBuilder[Self <: NormalizedSchema[_, _], E, R] (val x: Self with (NormalizedSchema[E, R])) extends AnyVal {
      
      @scala.inline
      def setEntities(value: E): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: R): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SchemaArray[T]
    extends Array[Schema_[T]]
       with Schema_[T]
  
  @js.native
  trait SchemaObject[T]
    extends /* key */ StringDictionary[SchemaValue[T]]
       with Schema_[T]
  object SchemaObject {
    
    @scala.inline
    def apply[T](): SchemaObject[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaObject[T]]
    }
  }
  
  type SchemaValue[T] = Schema_[T] | SchemaValueFunction[T]
  
  type SchemaValueFunction[T] = js.Function1[/* t */ T, Schema_[T]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.normalizr.mod.schema.Entity[T]
    - typings.normalizr.mod.schema.Object[T]
    - typings.normalizr.mod.schema.Union[T]
    - typings.normalizr.mod.schema.Values[T]
    - typings.normalizr.mod.SchemaObject[T]
    - typings.normalizr.mod.SchemaArray[T]
  */
  trait Schema_[T] extends StObject
  
  object schema {
    
    @js.native
    trait Array[T] extends StObject {
      
      def define(definition: Schema_[_]): Unit = js.native
    }
    object Array {
      
      @scala.inline
      def apply[T](define: Schema_[_] => Unit): typings.normalizr.mod.schema.Array[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[typings.normalizr.mod.schema.Array[T]]
      }
      
      @scala.inline
      implicit class ArrayMutableBuilder[Self <: typings.normalizr.mod.schema.Array[_], T] (val x: Self with typings.normalizr.mod.schema.Array[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[_] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Entity[T] extends Schema_[T] {
      
      def _processStrategy(value: js.Any, parent: js.Any, key: String): T = js.native
      @JSName("_processStrategy")
      var _processStrategy_Original: StrategyFunction[T] = js.native
      
      def define(definition: Schema_[_]): Unit = js.native
      
      def getId(value: js.Any, parent: js.Any, key: String): String = js.native
      @JSName("getId")
      var getId_Original: SchemaFunction = js.native
      
      var key: String = js.native
    }
    
    @js.native
    trait EntityOptions[T] extends StObject {
      
      var fallbackStrategy: js.UndefOr[FallbackFunction[T]] = js.native
      
      var idAttribute: js.UndefOr[String | SchemaFunction] = js.native
      
      var mergeStrategy: js.UndefOr[MergeFunction] = js.native
      
      var processStrategy: js.UndefOr[StrategyFunction[T]] = js.native
    }
    object EntityOptions {
      
      @scala.inline
      def apply[T](): EntityOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EntityOptions[T]]
      }
      
      @scala.inline
      implicit class EntityOptionsMutableBuilder[Self <: EntityOptions[_], T] (val x: Self with EntityOptions[T]) extends AnyVal {
        
        @scala.inline
        def setFallbackStrategy(value: (/* key */ String, /* schema */ Entity[T]) => T): Self = StObject.set(x, "fallbackStrategy", js.Any.fromFunction2(value))
        
        @scala.inline
        def setFallbackStrategyUndefined: Self = StObject.set(x, "fallbackStrategy", js.undefined)
        
        @scala.inline
        def setIdAttribute(value: String | SchemaFunction): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdAttributeFunction3(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => String): Self = StObject.set(x, "idAttribute", js.Any.fromFunction3(value))
        
        @scala.inline
        def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
        
        @scala.inline
        def setMergeStrategy(value: (/* entityA */ js.Any, /* entityB */ js.Any) => js.Any): Self = StObject.set(x, "mergeStrategy", js.Any.fromFunction2(value))
        
        @scala.inline
        def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
        
        @scala.inline
        def setProcessStrategy(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => T): Self = StObject.set(x, "processStrategy", js.Any.fromFunction3(value))
        
        @scala.inline
        def setProcessStrategyUndefined: Self = StObject.set(x, "processStrategy", js.undefined)
      }
    }
    
    type FallbackFunction[T] = js.Function2[/* key */ String, /* schema */ Entity[T], T]
    
    type MergeFunction = js.Function2[/* entityA */ js.Any, /* entityB */ js.Any, js.Any]
    
    @js.native
    trait Object[T] extends Schema_[T] {
      
      def define(definition: Schema_[_]): Unit = js.native
    }
    object Object {
      
      @scala.inline
      def apply[T](define: Schema_[_] => Unit): Object[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Object[T]]
      }
      
      @scala.inline
      implicit class ObjectMutableBuilder[Self <: Object[_], T] (val x: Self with Object[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[_] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    type SchemaFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, String]
    
    type StrategyFunction[T] = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, T]
    
    @js.native
    trait Union[T] extends Schema_[T] {
      
      def define(definition: Schema_[_]): Unit = js.native
    }
    object Union {
      
      @scala.inline
      def apply[T](define: Schema_[_] => Unit): Union[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Union[T]]
      }
      
      @scala.inline
      implicit class UnionMutableBuilder[Self <: Union[_], T] (val x: Self with Union[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[_] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Values[T] extends Schema_[T] {
      
      def define(definition: Schema_[_]): Unit = js.native
    }
    object Values {
      
      @scala.inline
      def apply[T](define: Schema_[_] => Unit): Values[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Values[T]]
      }
      
      @scala.inline
      implicit class ValuesMutableBuilder[Self <: Values[_], T] (val x: Self with Values[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[_] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
  }
}
