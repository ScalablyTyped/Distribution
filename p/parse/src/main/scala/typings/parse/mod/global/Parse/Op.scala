package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Parse.Op is an atomic operation that can be applied to a field in a
  * Parse.Object. For example, calling <code>object.set("foo", "bar")</code>
  * is an example of a Parse.Op.Set. Calling <code>object.unset("foo")</code>
  * is a Parse.Op.Unset. These operations are stored in a Parse.Object and
  * sent to the server as part of <code>object.save()</code> operations.
  * Instances of Parse.Op should be immutable.
  *
  * You should not create subclasses of Parse.Op or instantiate Parse.Op
  * directly.
  */
object Op {
  
  trait Add
    extends StObject
       with BaseOperation {
    
    def toJSON(): js.Any
  }
  object Add {
    
    @scala.inline
    def apply(objects: () => js.Array[js.Any], toJSON: () => js.Any): Add = {
      val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Add]
    }
    
    @scala.inline
    implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait AddUnique
    extends StObject
       with BaseOperation {
    
    def toJSON(): js.Any
  }
  object AddUnique {
    
    @scala.inline
    def apply(objects: () => js.Array[js.Any], toJSON: () => js.Any): AddUnique = {
      val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AddUnique]
    }
    
    @scala.inline
    implicit class AddUniqueMutableBuilder[Self <: AddUnique] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait BaseOperation extends StObject {
    
    def objects(): js.Array[js.Any]
  }
  object BaseOperation {
    
    @scala.inline
    def apply(objects: () => js.Array[js.Any]): BaseOperation = {
      val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects))
      __obj.asInstanceOf[BaseOperation]
    }
    
    @scala.inline
    implicit class BaseOperationMutableBuilder[Self <: BaseOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjects(value: () => js.Array[js.Any]): Self = StObject.set(x, "objects", js.Any.fromFunction0(value))
    }
  }
  
  trait Increment extends StObject {
    
    var amount: Double
    
    def toJSON(): js.Any
  }
  object Increment {
    
    @scala.inline
    def apply(amount: Double, toJSON: () => js.Any): Increment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Increment]
    }
    
    @scala.inline
    implicit class IncrementMutableBuilder[Self <: Increment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait Relation extends StObject {
    
    def added(): js.Array[Object[Attributes]]
    
    var removed: js.Array[Object[Attributes]]
    
    def toJSON(): js.Any
  }
  object Relation {
    
    @scala.inline
    def apply(
      added: () => js.Array[Object[Attributes]],
      removed: js.Array[Object[Attributes]],
      toJSON: () => js.Any
    ): typings.parse.mod.global.Parse.Op.Relation = {
      val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[typings.parse.mod.global.Parse.Op.Relation]
    }
    
    @scala.inline
    implicit class RelationMutableBuilder[Self <: typings.parse.mod.global.Parse.Op.Relation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: () => js.Array[Object[Attributes]]): Self = StObject.set(x, "added", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoved(value: js.Array[Object[Attributes]]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedVarargs(value: Object[Attributes]*): Self = StObject.set(x, "removed", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait Set extends StObject {
    
    def toJSON(): js.Any
    
    def value(): js.Any
  }
  object Set {
    
    @scala.inline
    def apply(toJSON: () => js.Any, value: () => js.Any): Set = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[Set]
    }
    
    @scala.inline
    implicit class SetMutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: () => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  trait Unset extends StObject {
    
    def toJSON(): js.Any
  }
  object Unset {
    
    @scala.inline
    def apply(toJSON: () => js.Any): Unset = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Unset]
    }
    
    @scala.inline
    implicit class UnsetMutableBuilder[Self <: Unset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
