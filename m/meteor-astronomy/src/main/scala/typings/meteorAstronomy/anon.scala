package typings.meteorAstronomy

import typings.meteorAstronomy.MeteorAstronomy.Model
import typings.meteorAstronomy.MeteorAstronomy.RemoveCallback
import typings.meteorAstronomy.MeteorAstronomy.SaveAndValidateCallback
import typings.meteorAstronomy.MeteorAstronomy.SaveAndValidateOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cast extends StObject {
    
    var cast: js.UndefOr[Boolean] = js.undefined
    
    @JSName("clone")
    var clone_FCast: js.UndefOr[Boolean] = js.undefined
    
    var merge: js.UndefOr[Boolean] = js.undefined
  }
  object Cast {
    
    inline def apply(): Cast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cast] (val x: Self) extends AnyVal {
      
      inline def setCast(value: Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  @js.native
  trait Copy[T] extends StObject {
    
    def copy(): Model[T] = js.native
    def copy(save: Boolean): Model[T] = js.native
    
    def get(field: String): Any = js.native
    def get(fields: js.Array[String]): Partial[T] = js.native
    
    def getModified(): Any = js.native
    
    def getModifiedValues(): Partial[T] = js.native
    def getModifiedValues(options: Old): Partial[T] = js.native
    
    def getModifier(): Any = js.native
    
    def isModified(): Boolean = js.native
    def isModified(field: String): Boolean = js.native
    
    def raw(): T = js.native
    def raw(field: String): Any = js.native
    def raw(fields: js.Array[String]): Partial[T] = js.native
    
    def remove(): Unit = js.native
    def remove(callback: RemoveCallback): Unit = js.native
    
    def save(): Unit = js.native
    def save(optionsOrCallback: SaveAndValidateCallback): Unit = js.native
    def save(optionsOrCallback: SaveAndValidateOptions[/* keyof T */ String]): Unit = js.native
    def save(options: SaveAndValidateOptions[/* keyof T */ String], callback: SaveAndValidateCallback): Unit = js.native
    
    def set(field: String, value: Any): Unit = js.native
    def set(fields: Partial[T]): Unit = js.native
    def set(fields: Partial[T], options: Cast): Unit = js.native
    
    def validate(): Unit = js.native
    def validate(optionsOrCallback: SaveAndValidateCallback): Unit = js.native
    def validate(optionsOrCallback: SaveAndValidateOptions[/* keyof T */ String]): Unit = js.native
    def validate(options: SaveAndValidateOptions[/* keyof T */ String], callback: SaveAndValidateCallback): Unit = js.native
  }
  
  trait GetIdentifier extends StObject {
    
    def getIdentifier(identifier: Any): String
    
    def getValues(): js.Array[Any]
  }
  object GetIdentifier {
    
    inline def apply(getIdentifier: Any => String, getValues: () => js.Array[Any]): GetIdentifier = {
      val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
      __obj.asInstanceOf[GetIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetIdentifier] (val x: Self) extends AnyVal {
      
      inline def setGetIdentifier(value: Any => String): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction1(value))
      
      inline def setGetValues(value: () => js.Array[Any]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    }
  }
  
  trait Insert extends StObject {
    
    var insert: Boolean
    
    var remove: Boolean
    
    var update: Boolean
  }
  object Insert {
    
    inline def apply(insert: Boolean, remove: Boolean, update: Boolean): Insert = {
      val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insert]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
      
      inline def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  trait Old extends StObject {
    
    var old: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object Old {
    
    inline def apply(): Old = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Old]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Old] (val x: Self) extends AnyVal {
      
      inline def setOld(value: Boolean): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
      
      inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
}
