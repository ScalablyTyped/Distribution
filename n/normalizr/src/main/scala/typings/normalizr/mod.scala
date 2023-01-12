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
  
  inline def denormalize(input: Any, schema: Schema_[Any], entities: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("denormalize")(input.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], entities.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def normalize[T, E, R](data: Any, schema: Schema_[T]): NormalizedSchema[E, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[NormalizedSchema[E, R]]
  
  trait NormalizedSchema[E, R] extends StObject {
    
    var entities: E
    
    var result: R
  }
  object NormalizedSchema {
    
    inline def apply[E, R](entities: E, result: R): NormalizedSchema[E, R] = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedSchema[E, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizedSchema[?, ?], E, R] (val x: Self & (NormalizedSchema[E, R])) extends AnyVal {
      
      inline def setEntities(value: E): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setResult(value: R): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SchemaArray = std.Array<normalizr.normalizr.Schema<T>>
  }}}
  to avoid circular code involving: 
  - normalizr.normalizr.Schema
  - normalizr.normalizr.SchemaArray
  */
  @js.native
  trait SchemaArray[T]
    extends StObject
       with Array[Schema_[T]]
       with Schema_[T]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SchemaObject = {[key: string] : normalizr.normalizr.SchemaValue<T>}
  }}}
  to avoid circular code involving: 
  - normalizr.normalizr.Schema
  - normalizr.normalizr.SchemaArray
  - normalizr.normalizr.SchemaObject
  - normalizr.normalizr.SchemaValue
  */
  trait SchemaObject[T]
    extends StObject
       with /* key */ StringDictionary[SchemaValue[T]]
       with Schema_[T]
  object SchemaObject {
    
    inline def apply[T](): SchemaObject[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaObject[T]]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SchemaValue = normalizr.normalizr.Schema<T> | normalizr.normalizr.SchemaValueFunction<T>
  }}}
  to avoid circular code involving: 
  - normalizr.normalizr.Schema
  - normalizr.normalizr.SchemaArray
  - normalizr.normalizr.SchemaValue
  */
  type SchemaValue[T] = Any | SchemaValueFunction[T]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SchemaValueFunction = (t : T): normalizr.normalizr.Schema<T>
  }}}
  to avoid circular code involving: 
  - normalizr.normalizr.Schema
  - normalizr.normalizr.SchemaArray
  - normalizr.normalizr.SchemaObject
  - normalizr.normalizr.SchemaValue
  - normalizr.normalizr.SchemaValueFunction
  */
  @js.native
  trait SchemaValueFunction[T] extends StObject {
    
    def apply(t: T): Schema_[T] = js.native
  }
  
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
      
      def define(definition: Schema_[Any]): Unit
    }
    object Array {
      
      inline def apply[T](define: Schema_[Any] => Unit): typings.normalizr.mod.schema.Array[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[typings.normalizr.mod.schema.Array[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.normalizr.mod.schema.Array[?], T] (val x: Self & typings.normalizr.mod.schema.Array[T]) extends AnyVal {
        
        inline def setDefine(value: Schema_[Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    trait Entity[T]
      extends StObject
         with Schema_[T] {
      
      def _processStrategy(value: Any, parent: Any, key: String): T
      @JSName("_processStrategy")
      var _processStrategy_Original: StrategyFunction[T]
      
      def define(definition: Schema_[Any]): Unit
      
      def getId(value: Any, parent: Any, key: String): String
      @JSName("getId")
      var getId_Original: SchemaFunction
      
      var key: String
    }
    object Entity {
      
      inline def apply[T](
        _processStrategy: (/* value */ Any, /* parent */ Any, /* key */ String) => T,
        define: Schema_[Any] => Unit,
        getId: (/* value */ Any, /* parent */ Any, /* key */ String) => String,
        key: String
      ): Entity[T] = {
        val __obj = js.Dynamic.literal(_processStrategy = js.Any.fromFunction3(_processStrategy), define = js.Any.fromFunction1(define), getId = js.Any.fromFunction3(getId), key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Entity[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Entity[?], T] (val x: Self & Entity[T]) extends AnyVal {
        
        inline def setDefine(value: Schema_[Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
        
        inline def setGetId(value: (/* value */ Any, /* parent */ Any, /* key */ String) => String): Self = StObject.set(x, "getId", js.Any.fromFunction3(value))
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def set_processStrategy(value: (/* value */ Any, /* parent */ Any, /* key */ String) => T): Self = StObject.set(x, "_processStrategy", js.Any.fromFunction3(value))
      }
    }
    
    trait EntityOptions[T] extends StObject {
      
      var fallbackStrategy: js.UndefOr[FallbackFunction[T]] = js.undefined
      
      var idAttribute: js.UndefOr[String | SchemaFunction] = js.undefined
      
      var mergeStrategy: js.UndefOr[MergeFunction] = js.undefined
      
      var processStrategy: js.UndefOr[StrategyFunction[T]] = js.undefined
    }
    object EntityOptions {
      
      inline def apply[T](): EntityOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EntityOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EntityOptions[?], T] (val x: Self & EntityOptions[T]) extends AnyVal {
        
        inline def setFallbackStrategy(value: (/* key */ String, /* schema */ Entity[T]) => T): Self = StObject.set(x, "fallbackStrategy", js.Any.fromFunction2(value))
        
        inline def setFallbackStrategyUndefined: Self = StObject.set(x, "fallbackStrategy", js.undefined)
        
        inline def setIdAttribute(value: String | SchemaFunction): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
        
        inline def setIdAttributeFunction3(value: (/* value */ Any, /* parent */ Any, /* key */ String) => String): Self = StObject.set(x, "idAttribute", js.Any.fromFunction3(value))
        
        inline def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
        
        inline def setMergeStrategy(value: (/* entityA */ Any, /* entityB */ Any) => Any): Self = StObject.set(x, "mergeStrategy", js.Any.fromFunction2(value))
        
        inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
        
        inline def setProcessStrategy(value: (/* value */ Any, /* parent */ Any, /* key */ String) => T): Self = StObject.set(x, "processStrategy", js.Any.fromFunction3(value))
        
        inline def setProcessStrategyUndefined: Self = StObject.set(x, "processStrategy", js.undefined)
      }
    }
    
    type FallbackFunction[T] = js.Function2[/* key */ String, /* schema */ Entity[T], T]
    
    type MergeFunction = js.Function2[/* entityA */ Any, /* entityB */ Any, Any]
    
    trait Object[T]
      extends StObject
         with Schema_[T] {
      
      def define(definition: Schema_[Any]): Unit
    }
    object Object {
      
      inline def apply[T](define: Schema_[Any] => Unit): Object[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Object[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Object[?], T] (val x: Self & Object[T]) extends AnyVal {
        
        inline def setDefine(value: Schema_[Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    type SchemaFunction = js.Function3[/* value */ Any, /* parent */ Any, /* key */ String, String]
    
    type StrategyFunction[T] = js.Function3[/* value */ Any, /* parent */ Any, /* key */ String, T]
    
    trait Union[T]
      extends StObject
         with Schema_[T] {
      
      def define(definition: Schema_[Any]): Unit
    }
    object Union {
      
      inline def apply[T](define: Schema_[Any] => Unit): Union[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Union[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Union[?], T] (val x: Self & Union[T]) extends AnyVal {
        
        inline def setDefine(value: Schema_[Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    trait Values[T]
      extends StObject
         with Schema_[T] {
      
      def define(definition: Schema_[Any]): Unit
    }
    object Values {
      
      inline def apply[T](define: Schema_[Any] => Unit): Values[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Values[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Values[?], T] (val x: Self & Values[T]) extends AnyVal {
        
        inline def setDefine(value: Schema_[Any] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
  }
}
