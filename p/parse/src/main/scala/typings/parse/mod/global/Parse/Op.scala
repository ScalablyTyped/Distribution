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
    
    def toJSON(): Any
  }
  object Add {
    
    inline def apply(objects: () => js.Array[Any], toJSON: () => Any): Add = {
      val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Add]
    }
    
    extension [Self <: Add](x: Self) {
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait AddUnique
    extends StObject
       with BaseOperation {
    
    def toJSON(): Any
  }
  object AddUnique {
    
    inline def apply(objects: () => js.Array[Any], toJSON: () => Any): AddUnique = {
      val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AddUnique]
    }
    
    extension [Self <: AddUnique](x: Self) {
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait BaseOperation extends StObject {
    
    def objects(): js.Array[Any]
  }
  object BaseOperation {
    
    inline def apply(objects: () => js.Array[Any]): BaseOperation = {
      val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects))
      __obj.asInstanceOf[BaseOperation]
    }
    
    extension [Self <: BaseOperation](x: Self) {
      
      inline def setObjects(value: () => js.Array[Any]): Self = StObject.set(x, "objects", js.Any.fromFunction0(value))
    }
  }
  
  trait Increment extends StObject {
    
    var amount: Double
    
    def toJSON(): Any
  }
  object Increment {
    
    inline def apply(amount: Double, toJSON: () => Any): Increment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Increment]
    }
    
    extension [Self <: Increment](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait Relation extends StObject {
    
    def added(): js.Array[Object[Attributes]]
    
    var removed: js.Array[Object[Attributes]]
    
    def toJSON(): Any
  }
  object Relation {
    
    inline def apply(
      added: () => js.Array[Object[Attributes]],
      removed: js.Array[Object[Attributes]],
      toJSON: () => Any
    ): typings.parse.mod.global.Parse.Op.Relation = {
      val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[typings.parse.mod.global.Parse.Op.Relation]
    }
    
    extension [Self <: typings.parse.mod.global.Parse.Op.Relation](x: Self) {
      
      inline def setAdded(value: () => js.Array[Object[Attributes]]): Self = StObject.set(x, "added", js.Any.fromFunction0(value))
      
      inline def setRemoved(value: js.Array[Object[Attributes]]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: Object[Attributes]*): Self = StObject.set(x, "removed", js.Array(value*))
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait Set extends StObject {
    
    def toJSON(): Any
    
    def value(): Any
  }
  object Set {
    
    inline def apply(toJSON: () => Any, value: () => Any): Set = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[Set]
    }
    
    extension [Self <: Set](x: Self) {
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  trait Unset extends StObject {
    
    def toJSON(): Any
  }
  object Unset {
    
    inline def apply(toJSON: () => Any): Unset = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Unset]
    }
    
    extension [Self <: Unset](x: Self) {
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
