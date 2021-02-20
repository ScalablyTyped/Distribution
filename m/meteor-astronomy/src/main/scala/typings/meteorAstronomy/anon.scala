package typings.meteorAstronomy

import typings.meteorAstronomy.MeteorAstronomy.RemoveCallback
import typings.meteorAstronomy.MeteorAstronomy.SaveAndValidateCallback
import typings.meteorAstronomy.MeteorAstronomy.SaveAndValidateOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cast extends StObject {
    
    var cast: js.UndefOr[Boolean] = js.native
    
    @JSName("clone")
    var clone_FCast: js.UndefOr[Boolean] = js.native
    
    var merge: js.UndefOr[Boolean] = js.native
  }
  object Cast {
    
    @scala.inline
    def apply(): Cast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cast]
    }
    
    @scala.inline
    implicit class CastMutableBuilder[Self <: Cast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCast(value: Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  @js.native
  trait Copy[T] extends StObject {
    
    def copy(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor-astronomy.MeteorAstronomy.Model<T> */ js.Object = js.native
    def copy(save: Boolean): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor-astronomy.MeteorAstronomy.Model<T> */ js.Object = js.native
    
    def get(field: String): js.Any = js.native
    def get(fields: js.Array[String]): Partial[T] = js.native
    
    def getModified(): js.Any = js.native
    
    def getModifiedValues(): Partial[T] = js.native
    def getModifiedValues(options: Old): Partial[T] = js.native
    
    def getModifier(): js.Any = js.native
    
    def isModified(): Boolean = js.native
    def isModified(field: String): Boolean = js.native
    
    def raw(): T = js.native
    def raw(field: String): js.Any = js.native
    def raw(fields: js.Array[String]): Partial[T] = js.native
    
    def remove(): Unit = js.native
    def remove(callback: RemoveCallback): Unit = js.native
    
    def save(): Unit = js.native
    def save(optionsOrCallback: SaveAndValidateCallback): Unit = js.native
    def save(optionsOrCallback: SaveAndValidateOptions[/* keyof T */ String]): Unit = js.native
    def save(options: SaveAndValidateOptions[/* keyof T */ String], callback: SaveAndValidateCallback): Unit = js.native
    
    def set(field: String, value: js.Any): Unit = js.native
    def set(fields: Partial[T]): Unit = js.native
    def set(fields: Partial[T], options: Cast): Unit = js.native
    
    def validate(): Unit = js.native
    def validate(optionsOrCallback: SaveAndValidateCallback): Unit = js.native
    def validate(optionsOrCallback: SaveAndValidateOptions[/* keyof T */ String]): Unit = js.native
    def validate(options: SaveAndValidateOptions[/* keyof T */ String], callback: SaveAndValidateCallback): Unit = js.native
  }
  
  @js.native
  trait GetIdentifier extends StObject {
    
    def getIdentifier(identifier: js.Any): String = js.native
    
    def getValues(): js.Array[_] = js.native
  }
  object GetIdentifier {
    
    @scala.inline
    def apply(getIdentifier: js.Any => String, getValues: () => js.Array[_]): GetIdentifier = {
      val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
      __obj.asInstanceOf[GetIdentifier]
    }
    
    @scala.inline
    implicit class GetIdentifierMutableBuilder[Self <: GetIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIdentifier(value: js.Any => String): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValues(value: () => js.Array[_]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Insert extends StObject {
    
    var insert: Boolean = js.native
    
    var remove: Boolean = js.native
    
    var update: Boolean = js.native
  }
  object Insert {
    
    @scala.inline
    def apply(insert: Boolean, remove: Boolean, update: Boolean): Insert = {
      val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insert]
    }
    
    @scala.inline
    implicit class InsertMutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Old extends StObject {
    
    var old: js.UndefOr[Boolean] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object Old {
    
    @scala.inline
    def apply(): Old = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Old]
    }
    
    @scala.inline
    implicit class OldMutableBuilder[Self <: Old] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOld(value: Boolean): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
}
