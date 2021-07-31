package typings.normalizr

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalizr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def denormalize(input: js.Any, schema: Schema_[js.Any], entities: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("denormalize")(input.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], entities.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def normalize[T, E, R](data: js.Any, schema: Schema_[T]): NormalizedSchema[E, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[NormalizedSchema[E, R]]
  
  trait NormalizedSchema[E, R] extends StObject {
    
    var entities: E
    
    var result: R
  }
  object NormalizedSchema {
    
    @scala.inline
    def apply[E, R](entities: E, result: R): NormalizedSchema[E, R] = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedSchema[E, R]]
    }
    
    @scala.inline
    implicit class NormalizedSchemaMutableBuilder[Self <: NormalizedSchema[?, ?], E, R] (val x: Self & (NormalizedSchema[E, R])) extends AnyVal {
      
      @scala.inline
      def setEntities(value: E): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: R): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SchemaArray[T]
    extends StObject
       with Array[Schema_[T]]
       with Schema_[T]
  
  trait SchemaObject[T]
    extends StObject
       with /* key */ StringDictionary[SchemaValue[T]]
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
    
    trait Array[T] extends StObject {
      
      def define(definition: Schema_[js.Any]): Unit
    }
    object Array {
      
      @scala.inline
      def apply[T](define: Schema_[js.Any] => Unit): typings.normalizr.mod.schema.Array[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[typings.normalizr.mod.schema.Array[T]]
      }
      
      @scala.inline
      implicit class ArrayMutableBuilder[Self <: typings.normalizr.mod.schema.Array[?], T] (val x: Self & typings.normalizr.mod.schema.Array[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[js.Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    trait Entity[T]
      extends StObject
         with Schema_[T] {
      
      def _processStrategy(value: js.Any, parent: js.Any, key: String): T
      @JSName("_processStrategy")
      var _processStrategy_Original: StrategyFunction[T]
      
      def define(definition: Schema_[js.Any]): Unit
      
      def getId(value: js.Any, parent: js.Any, key: String): String
      @JSName("getId")
      var getId_Original: SchemaFunction
      
      var key: String
    }
    object Entity {
      
      @scala.inline
      def apply[T](
        _processStrategy: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => T,
        define: Schema_[js.Any] => Unit,
        getId: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => String,
        key: String
      ): Entity[T] = {
        val __obj = js.Dynamic.literal(_processStrategy = js.Any.fromFunction3(_processStrategy), define = js.Any.fromFunction1(define), getId = js.Any.fromFunction3(getId), key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Entity[T]]
      }
      
      @scala.inline
      implicit class EntityMutableBuilder[Self <: Entity[?], T] (val x: Self & Entity[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[js.Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetId(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => String): Self = StObject.set(x, "getId", js.Any.fromFunction3(value))
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_processStrategy(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => T): Self = StObject.set(x, "_processStrategy", js.Any.fromFunction3(value))
      }
    }
    
    trait EntityOptions[T] extends StObject {
      
      var fallbackStrategy: js.UndefOr[FallbackFunction[T]] = js.undefined
      
      var idAttribute: js.UndefOr[String | SchemaFunction] = js.undefined
      
      var mergeStrategy: js.UndefOr[MergeFunction] = js.undefined
      
      var processStrategy: js.UndefOr[StrategyFunction[T]] = js.undefined
    }
    object EntityOptions {
      
      @scala.inline
      def apply[T](): EntityOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EntityOptions[T]]
      }
      
      @scala.inline
      implicit class EntityOptionsMutableBuilder[Self <: EntityOptions[?], T] (val x: Self & EntityOptions[T]) extends AnyVal {
        
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
    
    trait Object[T]
      extends StObject
         with Schema_[T] {
      
      def define(definition: Schema_[js.Any]): Unit
    }
    object Object {
      
      @scala.inline
      def apply[T](define: Schema_[js.Any] => Unit): Object[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Object[T]]
      }
      
      @scala.inline
      implicit class ObjectMutableBuilder[Self <: Object[?], T] (val x: Self & Object[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[js.Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    type SchemaFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, String]
    
    type StrategyFunction[T] = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, T]
    
    trait Union[T]
      extends StObject
         with Schema_[T] {
      
      def define(definition: Schema_[js.Any]): Unit
    }
    object Union {
      
      @scala.inline
      def apply[T](define: Schema_[js.Any] => Unit): Union[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Union[T]]
      }
      
      @scala.inline
      implicit class UnionMutableBuilder[Self <: Union[?], T] (val x: Self & Union[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[js.Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    trait Values[T]
      extends StObject
         with Schema_[T] {
      
      def define(definition: Schema_[js.Any]): Unit
    }
    object Values {
      
      @scala.inline
      def apply[T](define: Schema_[js.Any] => Unit): Values[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Values[T]]
      }
      
      @scala.inline
      implicit class ValuesMutableBuilder[Self <: Values[?], T] (val x: Self & Values[T]) extends AnyVal {
        
        @scala.inline
        def setDefine(value: Schema_[js.Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
  }
}
